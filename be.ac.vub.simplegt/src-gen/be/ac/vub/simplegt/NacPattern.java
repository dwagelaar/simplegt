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
 * A representation of the model object '<em><b>Nac Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.ac.vub.simplegt.NacPattern#getElements <em>Elements</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.NacPattern#getNacFor <em>Nac For</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.ac.vub.simplegt.SimplegtPackage#getNacPattern()
 * @model
 * @generated
 */
public interface NacPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link be.ac.vub.simplegt.InputElement}.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.simplegt.InputElement#getNacPattern <em>Nac Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see be.ac.vub.simplegt.SimplegtPackage#getNacPattern_Elements()
	 * @see be.ac.vub.simplegt.InputElement#getNacPattern
	 * @model opposite="nacPattern" containment="true" required="true"
	 * @generated
	 */
	EList<InputElement> getElements();

	/**
	 * Returns the value of the '<em><b>Nac For</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.simplegt.Rule#getNac <em>Nac</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nac For</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nac For</em>' container reference.
	 * @see #setNacFor(Rule)
	 * @see be.ac.vub.simplegt.SimplegtPackage#getNacPattern_NacFor()
	 * @see be.ac.vub.simplegt.Rule#getNac
	 * @model opposite="nac" transient="false"
	 * @generated
	 */
	Rule getNacFor();

	/**
	 * Sets the value of the '{@link be.ac.vub.simplegt.NacPattern#getNacFor <em>Nac For</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nac For</em>' container reference.
	 * @see #getNacFor()
	 * @generated
	 */
	void setNacFor(Rule value);

} // NacPattern
