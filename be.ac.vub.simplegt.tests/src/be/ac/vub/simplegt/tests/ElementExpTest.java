/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package be.ac.vub.simplegt.tests;

import junit.textui.TestRunner;
import be.ac.vub.simplegt.ElementExp;
import be.ac.vub.simplegt.SimplegtFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Element Exp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ElementExpTest extends ExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ElementExpTest.class);
	}

	/**
	 * Constructs a new Element Exp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementExpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Element Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ElementExp getFixture() {
		return (ElementExp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimplegtFactory.eINSTANCE.createElementExp());
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

} //ElementExpTest
