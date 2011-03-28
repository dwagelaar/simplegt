/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package be.ac.vub.simplegt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.ac.vub.simplegt.OutputBinding#getTargetFeature <em>Target Feature</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.OutputBinding#getBindingFor <em>Binding For</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.ac.vub.simplegt.SimplegtPackage#getOutputBinding()
 * @model
 * @generated
 */
public interface OutputBinding extends Binding {
	/**
	 * Returns the value of the '<em><b>Target Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Feature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Feature</em>' attribute.
	 * @see #setTargetFeature(String)
	 * @see be.ac.vub.simplegt.SimplegtPackage#getOutputBinding_TargetFeature()
	 * @model required="true"
	 * @generated
	 */
	String getTargetFeature();

	/**
	 * Sets the value of the '{@link be.ac.vub.simplegt.OutputBinding#getTargetFeature <em>Target Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Feature</em>' attribute.
	 * @see #getTargetFeature()
	 * @generated
	 */
	void setTargetFeature(String value);

	/**
	 * Returns the value of the '<em><b>Binding For</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.simplegt.OutputElement#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding For</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding For</em>' container reference.
	 * @see #setBindingFor(OutputElement)
	 * @see be.ac.vub.simplegt.SimplegtPackage#getOutputBinding_BindingFor()
	 * @see be.ac.vub.simplegt.OutputElement#getBindings
	 * @model opposite="bindings" transient="false"
	 * @generated
	 */
	OutputElement getBindingFor();

	/**
	 * Sets the value of the '{@link be.ac.vub.simplegt.OutputBinding#getBindingFor <em>Binding For</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding For</em>' container reference.
	 * @see #getBindingFor()
	 * @generated
	 */
	void setBindingFor(OutputElement value);

} // OutputBinding
