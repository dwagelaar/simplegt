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

import java.util.Map;

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
import org.eclipse.m2m.atl.emftvm.util.TimingData;
import org.osgi.framework.Bundle;

import be.ac.vub.simplegt.benchmarks.MutexA.MutexAPackage;
import be.ac.vub.simplegt.benchmarks.MutexB.MutexBPackage;

/**
 * STS Benchmark for SimpleGT.
 * @see http://www.cs.bme.hu/~gervarro/benchmark/2.0/
 * @author <a href="mailto:dennis.wagelaar@vub.ac.be">Dennis Wagelaar</a>
 */
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

		for (int i = 0; i < count; i++) {
			ResourceSet rs = new ResourceSetImpl();
			ExecEnv env = factory.createExecEnv();
			env.getMetaModels().put("Mutex", mm);
			Map<String, Model> models = env.getInoutModels();
			{
				Model m = factory.createModel();
				m.setResource(rs.getResource(mUri, true));
				models.put("M", m);
			}
			{
				Model t = factory.createModel();
				t.setResource(rs.createResource(tUri));
				models.put("T", t);
			}
			TimingData td = new TimingData();
			env.loadModule(mr, module);
			td.finishLoading();
			env.run(td, null);
			td.finish();
			times[i] = td.getFinished();
		}

		System.out.println(String.format(label + ":%d:%d", average(times), count));
	}

	/**
	 * Returns average time in ms.
	 * @param times the times in ns
	 * @return average time in ms.
	 */
	protected long average(final long[] times) {
		long average = 0;
		for (int i = 0; i < times.length; i++) {
			average += times[i] / 1000;
		}
		average = average / times.length;
		return average;
	}

	/**
	 * Runs the STSmany10 benchmark.
	 */
	public void testSTSmany10() {
		for (int i = 0; i < 2; i++) {
			runBenchmark(
					"STSmany10 average (ms,iterations)", 
					"STS", 
					mutexA, 
					URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"), 
					URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 
					1000);
		}
	}

	/**
	 * Runs the STSmany50 benchmark.
	 */
	public void testSTSmany50() {
		for (int i = 0; i < 2; i++) {
			runBenchmark(
					"STSmany50 average (ms,iterations)", 
					"STS50", 
					mutexA, 
					URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"), 
					URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 
					500);
		}
	}

	/**
	 * Runs the STSmany100 benchmark.
	 */
	public void testSTSmany100() {
		for (int i = 0; i < 2; i++) {
			runBenchmark(
					"STSmany100 average (ms,iterations)", 
					"STS100", 
					mutexA, 
					URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"), 
					URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 
					100);
		}
	}

	/**
	 * Runs the STSmany250 benchmark.
	 */
	public void testSTSmany250() {
		for (int i = 0; i < 2; i++) {
			runBenchmark(
					"STSmany250 average (ms,iterations)", 
					"STS250", 
					mutexA, 
					URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"), 
					URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 
					100);
		}
	}

	/**
	 * Runs the STSmany500 benchmark.
	 */
	public void testSTSmany500() {
		for (int i = 0; i < 2; i++) {
			runBenchmark(
					"STSmany500 average (ms,iterations)", 
					"STS500", 
					mutexA, 
					URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"), 
					URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 
					50);
		}
	}

	/**
	 * Runs the STSmany750 benchmark.
	 */
	public void testSTSmany750() {
		for (int i = 0; i < 2; i++) {
			runBenchmark(
					"STSmany750 average (ms,iterations)", 
					"STS750", 
					mutexA, 
					URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"), 
					URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 
					10);
		}
	}

	/**
	 * Runs the STSmany1000 benchmark.
	 */
	public void testSTSmany1000() {
		for (int i = 0; i < 2; i++) {
			runBenchmark(
					"STSmany1000 average (ms,iterations)", 
					"STS1000", 
					mutexA, 
					URI.createURI(uriPrefix + "/models/STSMutexAstart.xmi"), 
					URI.createURI(uriPrefix + "/models/STSMutexA-trace.xmi"), 
					10);
		}
	}

	/**
	 * Runs the STSone10 benchmark.
	 */
	public void testSTSone10() {
		runBenchmark(
				"STSone10 average (ms,iterations)", 
				"STS", 
				mutexB, 
				URI.createURI(uriPrefix + "/models/STSMutexBstart.xmi"), 
				URI.createURI(uriPrefix + "/models/STSMutexB-trace.xmi"), 
				1000);
	}

	/**
	 * Runs the STSone100 benchmark.
	 */
	public void testSTSone100() {
		runBenchmark(
				"STSone100 average (ms,iterations)", 
				"STS100", 
				mutexB, 
				URI.createURI(uriPrefix + "/models/STSMutexBstart.xmi"), 
				URI.createURI(uriPrefix + "/models/STSMutexB-trace.xmi"), 
				100);
	}

	/**
	 * Runs the STSone1000 benchmark.
	 */
	public void testSTSone1000() {
		runBenchmark(
				"STSone1000 average (ms,iterations)", 
				"STS1000", 
				mutexB, 
				URI.createURI(uriPrefix + "/models/STSMutexBstart.xmi"), 
				URI.createURI(uriPrefix + "/models/STSMutexB-trace.xmi"), 
				10);
	}

}
