/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package be.ac.vub.simplegt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.ac.vub.simplegt.InputElement#getInPattern <em>In Pattern</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.InputElement#getBinding <em>Binding</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.InputElement#getNacPattern <em>Nac Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.ac.vub.simplegt.SimplegtPackage#getInputElement()
 * @model
 * @generated
 */
public interface InputElement extends RuleElement {
	/**
	 * Returns the value of the '<em><b>In Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.simplegt.InPattern#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Pattern</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Pattern</em>' container reference.
	 * @see #setInPattern(InPattern)
	 * @see be.ac.vub.simplegt.SimplegtPackage#getInputElement_InPattern()
	 * @see be.ac.vub.simplegt.InPattern#getElements
	 * @model opposite="elements" transient="false"
	 * @generated
	 */
	InPattern getInPattern();

	/**
	 * Sets the value of the '{@link be.ac.vub.simplegt.InputElement#getInPattern <em>In Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Pattern</em>' container reference.
	 * @see #getInPattern()
	 * @generated
	 */
	void setInPattern(InPattern value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.simplegt.InputBinding#getBindingFor <em>Binding For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference.
	 * @see #setBinding(InputBinding)
	 * @see be.ac.vub.simplegt.SimplegtPackage#getInputElement_Binding()
	 * @see be.ac.vub.simplegt.InputBinding#getBindingFor
	 * @model opposite="bindingFor" containment="true"
	 * @generated
	 */
	InputBinding getBinding();

	/**
	 * Sets the value of the '{@link be.ac.vub.simplegt.InputElement#getBinding <em>Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' containment reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(InputBinding value);

	/**
	 * Returns the value of the '<em><b>Nac Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.simplegt.NacPattern#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nac Pattern</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nac Pattern</em>' container reference.
	 * @see #setNacPattern(NacPattern)
	 * @see be.ac.vub.simplegt.SimplegtPackage#getInputElement_NacPattern()
	 * @see be.ac.vub.simplegt.NacPattern#getElements
	 * @model opposite="elements" transient="false"
	 * @generated
	 */
	NacPattern getNacPattern();

	/**
	 * Sets the value of the '{@link be.ac.vub.simplegt.InputElement#getNacPattern <em>Nac Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nac Pattern</em>' container reference.
	 * @see #getNacPattern()
	 * @generated
	 */
	void setNacPattern(NacPattern value);

} // InputElement
