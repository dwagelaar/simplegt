/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package be.ac.vub.simplegt.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>simplegt</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplegtTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new SimplegtTests("simplegt Tests");
		suite.addTestSuite(TypeTest.class);
		suite.addTestSuite(ModuleTest.class);
		suite.addTestSuite(RuleTest.class);
		suite.addTestSuite(InPatternTest.class);
		suite.addTestSuite(NacPatternTest.class);
		suite.addTestSuite(OutPatternTest.class);
		suite.addTestSuite(InputElementTest.class);
		suite.addTestSuite(OutputElementTest.class);
		suite.addTestSuite(InputBindingTest.class);
		suite.addTestSuite(OutputBindingTest.class);
		suite.addTestSuite(ElementExpTest.class);
		suite.addTestSuite(StringLiteralExpTest.class);
		suite.addTestSuite(IntegerLiteralExpTest.class);
		suite.addTestSuite(DoubleLiteralExpTest.class);
		suite.addTestSuite(BooleanLiteralExpTest.class);
		suite.addTestSuite(EnumLiteralExpTest.class);
		suite.addTestSuite(MetamodelTest.class);
		suite.addTestSuite(InstanceModelTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplegtTests(String name) {
		super(name);
	}

} //SimplegtTests
