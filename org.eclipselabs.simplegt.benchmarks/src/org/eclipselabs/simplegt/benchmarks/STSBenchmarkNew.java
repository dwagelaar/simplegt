/*******************************************************************************
 * Copyright (c) 2013 Dennis Wagelaar.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dennis Wagelaar - initial API and
 *         implementation and/or initial documentation
 *******************************************************************************/
package org.eclipselabs.simplegt.benchmarks;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;
import org.eclipse.m2m.atl.emftvm.Model;
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.ModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.TimingData;
import org.eclipselabs.simplegt.benchmarks.MutexA.MutexAPackage;
import org.eclipselabs.simplegt.benchmarks.MutexB.MutexBPackage;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.osgi.framework.Bundle;

/**
 * @author <a href="dwagelaar@gmail.com">Dennis Wagelaar</a>
 * 
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class STSBenchmarkNew {

	private static final Logger LOG = Logger.getLogger(STSBenchmarkNew.class.getName());

	/**
	 * Processes and logs timing statistics.
	 * 
	 * @param prefix
	 *            the log message prefix string
	 * @param timings
	 *            the timings to process
	 * @param pureTimings
	 *            the pure runtime timings (without loading time)
	 * @param threadCount
	 *            the number of threads used for testing
	 */
	public static void processTimings(final String prefix, final SortedSet<Long> timings, final SortedSet<Long> pureTimings,
			final int threadCount) {
		long median = -1L;
		long firstQuartile = -1L;
		long thirdQuartile = -1L;
		long max = 0L;
		long min = Long.MAX_VALUE;
		int i = 0;
		for (long timing : timings) {
			max = Math.max(max, timing);
			min = Math.min(min, timing);
			i++;
			if (firstQuartile < 0L && i >= timings.size() / 4) {
				firstQuartile = timing;
			}
			if (median < 0L && i >= timings.size() / 2) {
				median = timing;
			}
			if (thirdQuartile < 0L && i >= timings.size() * 3 / 4) {
				thirdQuartile = timing;
			}
		}
		long pureMedian = -1L;
		long pureFirstQuartile = -1L;
		long pureThirdQuartile = -1L;
		long pureMax = 0L;
		long pureMin = Long.MAX_VALUE;
		i = 0;
		for (long timing : pureTimings) {
			pureMax = Math.max(pureMax, timing);
			pureMin = Math.min(pureMin, timing);
			i++;
			if (pureFirstQuartile < 0L && i >= pureTimings.size() / 4) {
				pureFirstQuartile = timing;
			}
			if (pureMedian < 0L && i >= pureTimings.size() / 2) {
				pureMedian = timing;
			}
			if (pureThirdQuartile < 0L && i >= pureTimings.size() * 3 / 4) {
				pureThirdQuartile = timing;
			}
		}
		final Runtime runtime = Runtime.getRuntime();
		LOG.info(String.format(
				new StringBuilder("%s\n\tDuration (msec)\tOverall runtime\tPure runtime (without loading)\n")
						.append("\tMinimum time:\t%f\t%f\n").append("\tFirst quartile:\t%f\t%f\n").append("\tMedian time:\t%f\t%f\n")
						.append("\tThird quartile:\t%f\t%f\n").append("\tMaximum time:\t%f\t%f\n")
						.append("\tTransactions per second (median):\t%f\ton\t%d\tthread(s)\n").append("\tNumber of runs:\t%d")
						.append("\tHeap space used:\t%d\tMB").toString(), prefix, min / 1E6, pureMin / 1E6, firstQuartile / 1E6,
				pureFirstQuartile / 1E6, median / 1E6, pureMedian / 1E6, thirdQuartile / 1E6, pureThirdQuartile / 1E6, max / 1E6,
				pureMax / 1E6, 1E9 * threadCount / median, threadCount, timings.size(), (runtime.totalMemory() - runtime.freeMemory())
						/ (1024 * 1024)));
	}

	protected final Bundle bundle = Activator.getInstance().getBundleContext().getBundle();
	protected final String uriPrefix = "platform:/plugin/" + bundle.getSymbolicName();
	protected final EmftvmFactory factory = EmftvmFactory.eINSTANCE;
	protected final ResourceSet rs = new ResourceSetImpl();
	protected final Metamodel mutexA = factory.createMetamodel();
	protected final Metamodel mutexB = factory.createMetamodel();
	protected final ModuleResolver mr = new DefaultModuleResolver(uriPrefix + "/transformations/", rs);

	/**
	 * Test setup.
	 */
	@Before
	public void setUp() {
		mutexA.setResource(MutexAPackage.eINSTANCE.eResource());
		mutexB.setResource(MutexBPackage.eINSTANCE.eResource());
	}

	/**
	 * Runs the STS benchmark.
	 * 
	 * @param label
	 *            the printed result label to use (e.g. "STSmany10 average (ms)")
	 * @param module
	 *            the STS module to load
	 * @param mm
	 *            the Mutex metamodel to use
	 * @param mUri
	 *            the M model URI
	 * @param tUri
	 *            the T model URI
	 * @param count
	 *            the amount of times to run the benchmark
	 */
	protected void runBenchmark(final String label, final String module, final Metamodel mm, final URI mUri, final URI tUri, final int count) {
		final ExecEnv env = factory.createExecEnv();
		env.registerMetaModel("Mutex", mm);
		env.loadModule(mr, module);

		// JIT warmup
		for (int i = 0; i < count / 10; i++) {
			final ResourceSet rs = new ResourceSetImpl();

			final Model m = factory.createModel();
			m.setResource(rs.getResource(mUri, true));
			env.registerInOutModel("M", m);

			final Model t = factory.createModel();
			t.setResource(rs.createResource(tUri));
			env.registerInOutModel("T", t);

			env.run(null);
		}

		final SortedSet<Long> timings = new TreeSet<Long>();
		final SortedSet<Long> pureTimings = new TreeSet<Long>();

		for (int i = 0; i < count; i++) {
			final TimingData td = new TimingData();
			final ResourceSet rs = new ResourceSetImpl();

			final Model m = factory.createModel();
			m.setResource(rs.getResource(mUri, true));
			env.registerInOutModel("M", m);

			final Model t = factory.createModel();
			t.setResource(rs.createResource(tUri));
			env.registerInOutModel("T", t);

			td.finishLoading();
			env.run(td);
			td.finish();
			LOG.fine(String.format("%s test %d %s", label, i, td));
			timings.add(td.getFinished());
			pureTimings.add(td.getFinished() - td.getFinishedLoading());
		}

		processTimings(label, timings, pureTimings, 1);
	}

	/**
	 * JIT warmup.
	 */
	@Test
	public void test00Warmup() {
		LOG.info("JIT warmup");
		for (int i = 0; i < 2; i++) {
			runBenchmark("STSmany10 warmup", "STS", mutexA, URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"),
					URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 100);
		}
		LOG.info("JIT warmup finished");
	}

	/**
	 * Runs the STSmany10 benchmark.
	 */
	@Test
	public void test01STSmany10() {
		runBenchmark("STSmany10", "STS", mutexA, URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"),
				URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 500);
	}

	/**
	 * Runs the STSmany50 benchmark.
	 */
	@Test
	public void test02STSmany50() {
		runBenchmark("STSmany50", "STS50", mutexA, URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"),
				URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 500);
	}

	/**
	 * Runs the STSmany100 benchmark.
	 */
	@Test
	public void test03STSmany100() {
		runBenchmark("STSmany100", "STS100", mutexA, URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"),
				URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 250);
	}

	/**
	 * Runs the STSmany250 benchmark.
	 */
	@Test
	public void test04STSmany250() {
		runBenchmark("STSmany250", "STS250", mutexA, URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"),
				URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 100);
	}

	/**
	 * Runs the STSmany500 benchmark.
	 */
	@Test
	public void test05STSmany500() {
		runBenchmark("STSmany500", "STS500", mutexA, URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"),
				URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 25);
	}

	/**
	 * Runs the STSmany750 benchmark.
	 */
	@Test
	public void test06STSmany750() {
		runBenchmark("STSmany750 average", "STS750", mutexA, URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"),
				URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 10);
	}

	/**
	 * Runs the STSmany1000 benchmark.
	 */
	@Test
	public void test07STSmany1000() {
		runBenchmark("STSmany1000", "STS1000", mutexA, URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"),
				URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 5);
	}

	/**
	 * Runs the STSmany2500 benchmark.
	 */
	@Test
	@Ignore
	public void test08STSmany2500() {
		runBenchmark("STSmany2500", "STS2500", mutexA, URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"),
				URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 5);
	}

	/**
	 * Runs the STSmany5000 benchmark.
	 */
	@Test
	@Ignore
	public void test09STSmany5000() {
		runBenchmark("STSmany5000", "STS5000", mutexA, URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"),
				URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 5);
	}

	/**
	 * Runs the STSmany7500 benchmark.
	 */
	@Test
	@Ignore
	public void test10STSmany7500() {
		runBenchmark("STSmany7500", "STS7500", mutexA, URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"),
				URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 2);
	}

	/**
	 * Runs the STSmany10000 benchmark.
	 */
	@Test
	@Ignore
	public void test11STSmany10000() {
		runBenchmark("STSmany10000", "STS10000", mutexA, URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"),
				URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 2);
	}

	/**
	 * Runs the STSone10 benchmark.
	 */
	@Test
	public void test12STSone10() {
		runBenchmark("STSone10", "STS", mutexB, URI.createURI(uriPrefix + "/models/STSMutexBstart.xmi"),
				URI.createURI(uriPrefix + "/models/STSMutexB-trace.xmi"), 500);
	}

	/**
	 * Runs the STSone50 benchmark.
	 */
	@Test
	public void test13STSone50() {
		runBenchmark("STSone50", "STS50", mutexB, URI.createURI(uriPrefix + "/models/STSMutexBstart.xmi"),
				URI.createURI(uriPrefix + "/models/STSMutexB-trace.xmi"), 500);
	}

	/**
	 * Runs the STSone100 benchmark.
	 */
	@Test
	public void test14STSone100() {
		runBenchmark("STSone100", "STS100", mutexB, URI.createURI(uriPrefix + "/models/STSMutexBstart.xmi"),
				URI.createURI(uriPrefix + "/models/STSMutexB-trace.xmi"), 250);
	}

	/**
	 * Runs the STSone250 benchmark.
	 */
	@Test
	public void test15STSone250() {
		runBenchmark("STSone250", "STS250", mutexB, URI.createURI(uriPrefix + "/models/STSMutexBstart.xmi"),
				URI.createURI(uriPrefix + "/models/STSMutexB-trace.xmi"), 100);
	}

	/**
	 * Runs the STSone500 benchmark.
	 */
	@Test
	public void test16STSone500() {
		runBenchmark("STSone500", "STS500", mutexB, URI.createURI(uriPrefix + "/models/STSMutexBstart.xmi"),
				URI.createURI(uriPrefix + "/models/STSMutexB-trace.xmi"), 25);
	}

	/**
	 * Runs the STSone750 benchmark.
	 */
	@Test
	public void test17STSone750() {
		runBenchmark("STSone750", "STS750", mutexB, URI.createURI(uriPrefix + "/models/STSMutexBstart.xmi"),
				URI.createURI(uriPrefix + "/models/STSMutexB-trace.xmi"), 10);
	}

	/**
	 * Runs the STSone1000 benchmark.
	 */
	@Test
	public void test18STSone1000() {
		runBenchmark("STSone1000", "STS1000", mutexB, URI.createURI(uriPrefix + "/models/STSMutexBstart.xmi"),
				URI.createURI(uriPrefix + "/models/STSMutexB-trace.xmi"), 5);
	}

	/**
	 * Runs the STSone2500 benchmark.
	 */
	@Test
	@Ignore
	public void test19STSone2500() {
		runBenchmark("STSone2500", "STS2500", mutexB, URI.createURI(uriPrefix + "/models/STSMutexBstart.xmi"),
				URI.createURI(uriPrefix + "/models/STSMutexB-trace.xmi"), 5);
	}

	/**
	 * Runs the STSone5000 benchmark.
	 */
	@Test
	@Ignore
	public void test20STSone5000() {
		runBenchmark("STSone5000", "STS5000", mutexB, URI.createURI(uriPrefix + "/models/STSMutexBstart.xmi"),
				URI.createURI(uriPrefix + "/models/STSMutexB-trace.xmi"), 5);
	}

	/**
	 * Runs the STSone7500 benchmark.
	 */
	@Test
	@Ignore
	public void test21STSone7500() {
		runBenchmark("STSone7500", "STS7500", mutexB, URI.createURI(uriPrefix + "/models/STSMutexBstart.xmi"),
				URI.createURI(uriPrefix + "/models/STSMutexB-trace.xmi"), 2);
	}

	/**
	 * Runs the STSone10000 benchmark.
	 */
	@Test
	@Ignore
	public void test22STSone10000() {
		runBenchmark("STSone10000", "STS10000", mutexB, URI.createURI(uriPrefix + "/models/STSMutexBstart.xmi"),
				URI.createURI(uriPrefix + "/models/STSMutexB-trace.xmi"), 2);
	}

}
