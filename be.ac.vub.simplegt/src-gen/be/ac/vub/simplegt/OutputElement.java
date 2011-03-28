/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package be.ac.vub.simplegt;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.ac.vub.simplegt.OutputElement#getPattern <em>Pattern</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.OutputElement#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.ac.vub.simplegt.SimplegtPackage#getOutputElement()
 * @model
 * @generated
 */
public interface OutputElement extends RuleElement {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.simplegt.OutPattern#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' container reference.
	 * @see #setPattern(OutPattern)
	 * @see be.ac.vub.simplegt.SimplegtPackage#getOutputElement_Pattern()
	 * @see be.ac.vub.simplegt.OutPattern#getElements
	 * @model opposite="elements" transient="false"
	 * @generated
	 */
	OutPattern getPattern();

	/**
	 * Sets the value of the '{@link be.ac.vub.simplegt.OutputElement#getPattern <em>Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' container reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(OutPattern value);

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link be.ac.vub.simplegt.OutputBinding}.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.simplegt.OutputBinding#getBindingFor <em>Binding For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see be.ac.vub.simplegt.SimplegtPackage#getOutputElement_Bindings()
	 * @see be.ac.vub.simplegt.OutputBinding#getBindingFor
	 * @model opposite="bindingFor" containment="true"
	 * @generated
	 */
	EList<OutputBinding> getBindings();

} // OutputElement
