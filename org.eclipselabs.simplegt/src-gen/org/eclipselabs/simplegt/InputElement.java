/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package org.eclipselabs.simplegt;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.simplegt.InputElement#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.eclipselabs.simplegt.InputElement#getPattern <em>Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.simplegt.SimplegtPackage#getInputElement()
 * @model
 * @generated
 */
public interface InputElement extends RuleElement {
	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.simplegt.InputBinding}.
	 * It is bidirectional and its opposite is '{@link org.eclipselabs.simplegt.InputBinding#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see org.eclipselabs.simplegt.SimplegtPackage#getInputElement_Bindings()
	 * @see org.eclipselabs.simplegt.InputBinding#getElement
	 * @model opposite="element" containment="true"
	 * @generated
	 */
	EList<InputBinding> getBindings();

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipselabs.simplegt.InputElementPattern#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' container reference.
	 * @see #setPattern(InputElementPattern)
	 * @see org.eclipselabs.simplegt.SimplegtPackage#getInputElement_Pattern()
	 * @see org.eclipselabs.simplegt.InputElementPattern#getElements
	 * @model opposite="elements" transient="false"
	 * @generated
	 */
	InputElementPattern getPattern();

	/**
	 * Sets the value of the '{@link org.eclipselabs.simplegt.InputElement#getPattern <em>Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' container reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(InputElementPattern value);

} // InputElement
