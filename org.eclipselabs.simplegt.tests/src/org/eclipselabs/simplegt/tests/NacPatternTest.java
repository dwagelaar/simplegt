/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package org.eclipselabs.simplegt.tests;

import junit.textui.TestRunner;

import org.eclipselabs.simplegt.NacPattern;
import org.eclipselabs.simplegt.SimplegtFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Nac Pattern</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NacPatternTest extends InputElementPatternTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NacPatternTest.class);
	}

	/**
	 * Constructs a new Nac Pattern test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NacPatternTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Nac Pattern test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NacPattern getFixture() {
		return (NacPattern)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimplegtFactory.eINSTANCE.createNacPattern());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //NacPatternTest
