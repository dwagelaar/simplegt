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
 * A representation of the model object '<em><b>Out Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.ac.vub.simplegt.OutPattern#getOutputFor <em>Output For</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.OutPattern#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.ac.vub.simplegt.SimplegtPackage#getOutPattern()
 * @model
 * @generated
 */
public interface OutPattern extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Output For</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.simplegt.Rule#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output For</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output For</em>' container reference.
	 * @see #setOutputFor(Rule)
	 * @see be.ac.vub.simplegt.SimplegtPackage#getOutPattern_OutputFor()
	 * @see be.ac.vub.simplegt.Rule#getOutput
	 * @model opposite="output" transient="false"
	 * @generated
	 */
	Rule getOutputFor();

	/**
	 * Sets the value of the '{@link be.ac.vub.simplegt.OutPattern#getOutputFor <em>Output For</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output For</em>' container reference.
	 * @see #getOutputFor()
	 * @generated
	 */
	void setOutputFor(Rule value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link be.ac.vub.simplegt.OutputElement}.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.simplegt.OutputElement#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see be.ac.vub.simplegt.SimplegtPackage#getOutPattern_Elements()
	 * @see be.ac.vub.simplegt.OutputElement#getPattern
	 * @model opposite="pattern" containment="true" required="true"
	 * @generated
	 */
	EList<OutputElement> getElements();

} // OutPattern
