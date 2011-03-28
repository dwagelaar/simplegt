/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package be.ac.vub.simplegt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.ac.vub.simplegt.Module#getModels <em>Models</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.Module#getRules <em>Rules</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.Module#getImports <em>Imports</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.ac.vub.simplegt.SimplegtPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link be.ac.vub.simplegt.InstanceModel}.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.simplegt.InstanceModel#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see be.ac.vub.simplegt.SimplegtPackage#getModule_Models()
	 * @see be.ac.vub.simplegt.InstanceModel#getModule
	 * @model opposite="module" containment="true" required="true"
	 * @generated
	 */
	EList<InstanceModel> getModels();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link be.ac.vub.simplegt.Rule}.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.simplegt.Rule#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see be.ac.vub.simplegt.SimplegtPackage#getModule_Rules()
	 * @see be.ac.vub.simplegt.Rule#getModule
	 * @model opposite="module" containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' attribute list.
	 * @see be.ac.vub.simplegt.SimplegtPackage#getModule_Imports()
	 * @model
	 * @generated
	 */
	EList<String> getImports();

} // Module
