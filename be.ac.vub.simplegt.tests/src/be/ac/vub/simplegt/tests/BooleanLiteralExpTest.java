/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package be.ac.vub.simplegt.tests;

import junit.textui.TestRunner;
import be.ac.vub.simplegt.BooleanLiteralExp;
import be.ac.vub.simplegt.SimplegtFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Boolean Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BooleanLiteralExpTest extends LiteralExpTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BooleanLiteralExpTest.class);
	}

	/**
	 * Constructs a new Boolean Literal Exp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLiteralExpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Boolean Literal Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BooleanLiteralExp getFixture() {
		return (BooleanLiteralExp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimplegtFactory.eINSTANCE.createBooleanLiteralExp());
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

} //BooleanLiteralExpTest
