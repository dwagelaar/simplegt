/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package be.ac.vub.simplegt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.ac.vub.simplegt.InputBinding#getBindingFor <em>Binding For</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.ac.vub.simplegt.SimplegtPackage#getInputBinding()
 * @model
 * @generated
 */
public interface InputBinding extends Binding {
	/**
	 * Returns the value of the '<em><b>Binding For</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.simplegt.InputElement#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding For</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding For</em>' container reference.
	 * @see #setBindingFor(InputElement)
	 * @see be.ac.vub.simplegt.SimplegtPackage#getInputBinding_BindingFor()
	 * @see be.ac.vub.simplegt.InputElement#getBinding
	 * @model opposite="binding" transient="false"
	 * @generated
	 */
	InputElement getBindingFor();

	/**
	 * Sets the value of the '{@link be.ac.vub.simplegt.InputBinding#getBindingFor <em>Binding For</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding For</em>' container reference.
	 * @see #getBindingFor()
	 * @generated
	 */
	void setBindingFor(InputElement value);

} // InputBinding
