/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package be.ac.vub.simplegt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.ac.vub.simplegt.InPattern#getInputFor <em>Input For</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.InPattern#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.ac.vub.simplegt.SimplegtPackage#getInPattern()
 * @model
 * @generated
 */
public interface InPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Input For</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.simplegt.Rule#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input For</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input For</em>' container reference.
	 * @see #setInputFor(Rule)
	 * @see be.ac.vub.simplegt.SimplegtPackage#getInPattern_InputFor()
	 * @see be.ac.vub.simplegt.Rule#getInput
	 * @model opposite="input" transient="false"
	 * @generated
	 */
	Rule getInputFor();

	/**
	 * Sets the value of the '{@link be.ac.vub.simplegt.InPattern#getInputFor <em>Input For</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input For</em>' container reference.
	 * @see #getInputFor()
	 * @generated
	 */
	void setInputFor(Rule value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link be.ac.vub.simplegt.InputElement}.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.simplegt.InputElement#getInPattern <em>In Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see be.ac.vub.simplegt.SimplegtPackage#getInPattern_Elements()
	 * @see be.ac.vub.simplegt.InputElement#getInPattern
	 * @model opposite="inPattern" containment="true" required="true"
	 * @generated
	 */
	EList<InputElement> getElements();

} // InPattern
