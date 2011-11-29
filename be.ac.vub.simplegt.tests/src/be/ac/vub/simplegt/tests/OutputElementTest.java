/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package be.ac.vub.simplegt.tests;

import junit.textui.TestRunner;
import be.ac.vub.simplegt.OutputElement;
import be.ac.vub.simplegt.SimplegtFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Output Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutputElementTest extends RuleElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OutputElementTest.class);
	}

	/**
	 * Constructs a new Output Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Output Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OutputElement getFixture() {
		return (OutputElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimplegtFactory.eINSTANCE.createOutputElement());
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

} //OutputElementTest
