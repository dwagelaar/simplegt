/*******************************************************************************
 * Copyright (c) 2011 Dennis Wagelaar, Vrije Universiteit Brussel.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dennis Wagelaar, Vrije Universiteit Brussel
 *******************************************************************************/
package be.ac.vub.simplegt.benchmarks;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;
import org.eclipse.m2m.atl.emftvm.Model;
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.ModuleResolver;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.osgi.framework.Bundle;

import be.ac.vub.simplegt.benchmarks.MutexA.MutexAPackage;
import be.ac.vub.simplegt.benchmarks.MutexB.MutexBPackage;

/**
 * STS Benchmark for SimpleGT.
 * @see http://www.cs.bme.hu/~gervarro/benchmark/2.0/
 * @author <a href="mailto:dennis.wagelaar@vub.ac.be">Dennis Wagelaar</a>
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class STSBenchmark extends TestCase {

	protected final Bundle bundle = Activator.getInstance().getBundleContext().getBundle();
	protected final String uriPrefix = "platform:/plugin/" + bundle.getSymbolicName();
	protected final EmftvmFactory factory = EmftvmFactory.eINSTANCE;
	protected final ResourceSet rs = new ResourceSetImpl();
	protected final Metamodel mutexA = factory.createMetamodel();
	protected final Metamodel mutexB = factory.createMetamodel();
	protected final ModuleResolver mr = new DefaultModuleResolver(uriPrefix + "/transformations/", rs);

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		mutexA.setResource(MutexAPackage.eINSTANCE.eResource());
		mutexB.setResource(MutexBPackage.eINSTANCE.eResource());
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Runs the STS benchmark.
	 * @param label the printed result label to use (e.g. "STSmany10 average (ms)")
	 * @param module the STS module to load
	 * @param mm the Mutex metamodel to use
	 * @param mUri the M model URI
	 * @param tUri the T model URI
	 * @param count the amount of times to run the benchmark
	 */
	protected void runBenchmark(final String label, final String module, final Metamodel mm, final URI mUri, final URI tUri, final int count) {
		final long[] times = new long[count];
		final ExecEnv env = factory.createExecEnv();
		env.registerMetaModel("Mutex", mm);
		env.loadModule(mr, module);

		// 2 EMFTVM JIT warmup rounds
		for (int i = 0; i < 2; i++) {
			ResourceSet rs = new ResourceSetImpl();

			Model m = factory.createModel();
			m.setResource(rs.getResource(mUri, true));
			env.registerInOutModel("M", m);

			Model t = factory.createModel();
			t.setResource(rs.createResource(tUri));
			env.registerInOutModel("T", t);

			env.run(null);
		}

		// Start benchmark
		for (int i = 0; i < count; i++) {
			ResourceSet rs = new ResourceSetImpl();

			Model m = factory.createModel();
			m.setResource(rs.getResource(mUri, true));
			env.registerInOutModel("M", m);

			Model t = factory.createModel();
			t.setResource(rs.createResource(tUri));
			env.registerInOutModel("T", t);

			long start = System.nanoTime();
			env.run(null);
			times[i] = System.nanoTime() - start;
		}

		System.out.println(String.format(label + ":%f:%f:%d", average(times), stdDeviation(times), count));
	}

	/**
	 * Returns average time in ms.
	 * @param times the times in ns
	 * @return average time in ms.
	 */
	protected double average(final long[] times) {
		double average = 0;
		for (int i = 0; i < times.length; i++) {
			average += times[i] / 1E6;
		}
		average = average / times.length;
		return average;
	}

	/**
	 * Returns standard deviation time in ms.
	 * @param times the times in ns
	 * @return standard deviation time in ms.
	 */
	protected double stdDeviation(final long[] times) {
		double average2 = 0;
		for (int i = 0; i < times.length; i++) {
			double ms = times[i] / 1E6;
			average2 += ms * ms;
		}
		average2 = average2 / times.length;
		double average = average(times);
		average = average * average;
		return Math.sqrt(average2 - average);
	}

	/**
	 * JIT warmup.
	 */
	@Test
	public void test00Warmup() {
		System.out.println("JIT warmup");
		for (int i = 0; i < 2; i++) {
			runBenchmark(
					"STSmany10 warmup average (ms), std. dev. (ms), iterations", 
					"STS", 
					mutexA, 
					URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"), 
					URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 
					1000);
		}
		System.out.println("JIT warmup finished");
	}

	/**
	 * Runs the STSmany10 benchmark.
	 */
	@Test
	public void test01STSmany10() {
		runBenchmark(
				"STSmany10 average (ms), std. dev. (ms), iterations", 
				"STS", 
				mutexA, 
				URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"), 
				URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 
				5000);
	}

	/**
	 * Runs the STSmany50 benchmark.
	 */
	@Test
	public void test02STSmany50() {
		runBenchmark(
				"STSmany50 average (ms), std. dev. (ms), iterations", 
				"STS50", 
				mutexA, 
				URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"), 
				URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 
				5000);
	}

	/**
	 * Runs the STSmany100 benchmark.
	 */
	@Test
	public void test03STSmany100() {
		runBenchmark(
				"STSmany100 average (ms), std. dev. (ms), iterations", 
				"STS100", 
				mutexA, 
				URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"), 
				URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 
				1000);
	}

	/**
	 * Runs the STSmany250 benchmark.
	 */
	@Test
	public void test04STSmany250() {
		runBenchmark(
				"STSmany250 average (ms), std. dev. (ms), iterations", 
				"STS250", 
				mutexA, 
				URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"), 
				URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 
				1000);
	}

	/**
	 * Runs the STSmany500 benchmark.
	 */
	@Test
	public void test05STSmany500() {
		runBenchmark(
				"STSmany500 average (ms), std. dev. (ms), iterations", 
				"STS500", 
				mutexA, 
				URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"), 
				URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 
				500);
	}

	/**
	 * Runs the STSmany750 benchmark.
	 */
	@Test
	public void test06STSmany750() {
		runBenchmark(
				"STSmany750 average (ms), std. dev. (ms), iterations", 
				"STS750", 
				mutexA, 
				URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"), 
				URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 
				500);
	}

	/**
	 * Runs the STSmany1000 benchmark.
	 */
	@Test
	public void test07STSmany1000() {
		runBenchmark(
				"STSmany1000 average (ms), std. dev. (ms), iterations", 
				"STS1000", 
				mutexA, 
				URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"), 
				URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 
				500);
	}

	/**
	 * Runs the STSmany2500 benchmark.
	 */
	@Test
	public void test08STSmany2500() {
		runBenchmark(
				"STSmany2500 average (ms), std. dev. (ms), iterations", 
				"STS2500", 
				mutexA, 
				URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"), 
				URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 
				50);
	}

	/**
	 * Runs the STSmany5000 benchmark.
	 */
	@Test
	public void test09STSmany5000() {
		runBenchmark(
				"STSmany5000 average (ms), std. dev. (ms), iterations", 
				"STS5000", 
				mutexA, 
				URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"), 
				URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 
				10);
	}

	/**
	 * Runs the STSmany7500 benchmark.
	 */
	@Test
	public void test10STSmany7500() {
		runBenchmark(
				"STSmany7500 average (ms), std. dev. (ms), iterations", 
				"STS7500", 
				mutexA, 
				URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"), 
				URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 
				5);
	}

	/**
	 * Runs the STSmany10000 benchmark.
	 */
	@Test
	public void test11STSmany10000() {
		runBenchmark(
				"STSmany10000 average (ms), std. dev. (ms), iterations", 
				"STS10000", 
				mutexA, 
				URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"), 
				URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 
				5);
	}

	/**
	 * Runs the STSone10 benchmark.
	 */
	@Test
	public void test12STSone10() {
		runBenchmark(
				"STSone10 average (ms), std. dev. (ms), iterations", 
				"STS", 
				mutexB, 
				URI.createURI(uriPrefix + "/models/STSMutexBstart.xmi"), 
				URI.createURI(uriPrefix + "/models/STSMutexB-trace.xmi"), 
				5000);
	}

	/**
	 * Runs the STSone50 benchmark.
	 */
	@Test
	public void test13STSone50() {
		runBenchmark(
				"STSone50 average (ms), std. dev. (ms), iterations", 
				"STS50", 
				mutexB, 
				URI.createURI(uriPrefix + "/models/STSMutexBstart.xmi"), 
				URI.createURI(uriPrefix + "/models/STSMutexB-trace.xmi"), 
				5000);
	}

	/**
	 * Runs the STSone100 benchmark.
	 */
	@Test
	public void test14STSone100() {
		runBenchmark(
				"STSone100 average (ms), std. dev. (ms), iterations", 
				"STS100", 
				mutexB, 
				URI.createURI(uriPrefix + "/models/STSMutexBstart.xmi"), 
				URI.createURI(uriPrefix + "/models/STSMutexB-trace.xmi"), 
				1000);
	}

	/**
	 * Runs the STSone250 benchmark.
	 */
	@Test
	public void test15STSone250() {
		runBenchmark(
				"STSone250 average (ms), std. dev. (ms), iterations", 
				"STS250", 
				mutexB, 
				URI.createURI(uriPrefix + "/models/STSMutexBstart.xmi"), 
				URI.createURI(uriPrefix + "/models/STSMutexB-trace.xmi"), 
				1000);
	}

	/**
	 * Runs the STSone500 benchmark.
	 */
	@Test
	public void test16STSone500() {
		runBenchmark(
				"STSone500 average (ms), std. dev. (ms), iterations", 
				"STS500", 
				mutexB, 
				URI.createURI(uriPrefix + "/models/STSMutexBstart.xmi"), 
				URI.createURI(uriPrefix + "/models/STSMutexB-trace.xmi"), 
				500);
	}

	/**
	 * Runs the STSone750 benchmark.
	 */
	@Test
	public void test17STSone750() {
		runBenchmark(
				"STSone750 average (ms), std. dev. (ms), iterations", 
				"STS750", 
				mutexB, 
				URI.createURI(uriPrefix + "/models/STSMutexBstart.xmi"), 
				URI.createURI(uriPrefix + "/models/STSMutexB-trace.xmi"), 
				500);
	}

	/**
	 * Runs the STSone1000 benchmark.
	 */
	@Test
	public void test18STSone1000() {
		runBenchmark(
				"STSone1000 average (ms), std. dev. (ms), iterations", 
				"STS1000", 
				mutexB, 
				URI.createURI(uriPrefix + "/models/STSMutexBstart.xmi"), 
				URI.createURI(uriPrefix + "/models/STSMutexB-trace.xmi"), 
				1000);
	}

	/**
	 * Runs the STSone2500 benchmark.
	 */
	@Test
	public void test19STSone2500() {
		runBenchmark(
				"STSone2500 average (ms), std. dev. (ms), iterations", 
				"STS2500", 
				mutexB, 
				URI.createURI(uriPrefix + "/models/STSMutexBstart.xmi"), 
				URI.createURI(uriPrefix + "/models/STSMutexB-trace.xmi"), 
				50);
	}

	/**
	 * Runs the STSone5000 benchmark.
	 */
	@Test
	public void test20STSone5000() {
		runBenchmark(
				"STSone5000 average (ms), std. dev. (ms), iterations", 
				"STS5000", 
				mutexB, 
				URI.createURI(uriPrefix + "/models/STSMutexBstart.xmi"), 
				URI.createURI(uriPrefix + "/models/STSMutexB-trace.xmi"), 
				10);
	}

	/**
	 * Runs the STSone7500 benchmark.
	 */
	@Test
	public void test21STSone7500() {
		runBenchmark(
				"STSone7500 average (ms), std. dev. (ms), iterations", 
				"STS7500", 
				mutexB, 
				URI.createURI(uriPrefix + "/models/STSMutexBstart.xmi"), 
				URI.createURI(uriPrefix + "/models/STSMutexB-trace.xmi"), 
				5);
	}

	/**
	 * Runs the STSone10000 benchmark.
	 */
	@Test
	public void test22STSone10000() {
		runBenchmark(
				"STSone10000 average (ms), std. dev. (ms), iterations", 
				"STS10000", 
				mutexB, 
				URI.createURI(uriPrefix + "/models/STSMutexBstart.xmi"), 
				URI.createURI(uriPrefix + "/models/STSMutexB-trace.xmi"), 
				5);
	}

}
