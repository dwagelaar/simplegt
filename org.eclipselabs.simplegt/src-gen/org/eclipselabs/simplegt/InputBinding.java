/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package org.eclipselabs.simplegt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.simplegt.InputBinding#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipselabs.simplegt.InputBinding#isLast <em>Last</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.simplegt.SimplegtPackage#getInputBinding()
 * @model
 * @generated
 */
public interface InputBinding extends Binding {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipselabs.simplegt.InputElement#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' container reference.
	 * @see #setElement(InputElement)
	 * @see org.eclipselabs.simplegt.SimplegtPackage#getInputBinding_Element()
	 * @see org.eclipselabs.simplegt.InputElement#getBindings
	 * @model opposite="bindings" transient="false"
	 * @generated
	 */
	InputElement getElement();

	/**
	 * Sets the value of the '{@link org.eclipselabs.simplegt.InputBinding#getElement <em>Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' container reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(InputElement value);

	/**
	 * Returns the value of the '<em><b>Last</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last</em>' attribute.
	 * @see #setLast(boolean)
	 * @see org.eclipselabs.simplegt.SimplegtPackage#getInputBinding_Last()
	 * @model required="true"
	 * @generated
	 */
	boolean isLast();

	/**
	 * Sets the value of the '{@link org.eclipselabs.simplegt.InputBinding#isLast <em>Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last</em>' attribute.
	 * @see #isLast()
	 * @generated
	 */
	void setLast(boolean value);

} // InputBinding
