/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package be.ac.vub.simplegt;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see be.ac.vub.simplegt.SimplegtPackage
 * @generated
 */
public interface SimplegtFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplegtFactory eINSTANCE = be.ac.vub.simplegt.impl.SimplegtFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module</em>'.
	 * @generated
	 */
	Module createModule();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns a new object of class '<em>In Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Pattern</em>'.
	 * @generated
	 */
	InPattern createInPattern();

	/**
	 * Returns a new object of class '<em>Nac Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nac Pattern</em>'.
	 * @generated
	 */
	NacPattern createNacPattern();

	/**
	 * Returns a new object of class '<em>Out Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Out Pattern</em>'.
	 * @generated
	 */
	OutPattern createOutPattern();

	/**
	 * Returns a new object of class '<em>Input Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Element</em>'.
	 * @generated
	 */
	InputElement createInputElement();

	/**
	 * Returns a new object of class '<em>Output Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Element</em>'.
	 * @generated
	 */
	OutputElement createOutputElement();

	/**
	 * Returns a new object of class '<em>Input Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Binding</em>'.
	 * @generated
	 */
	InputBinding createInputBinding();

	/**
	 * Returns a new object of class '<em>Output Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Binding</em>'.
	 * @generated
	 */
	OutputBinding createOutputBinding();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimplegtPackage getSimplegtPackage();

} //SimplegtFactory
