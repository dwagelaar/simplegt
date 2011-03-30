/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package be.ac.vub.simplegt;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.ac.vub.simplegt.OutputBinding#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.ac.vub.simplegt.SimplegtPackage#getOutputBinding()
 * @model abstract="true"
 * @generated
 */
public interface OutputBinding extends Binding {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.simplegt.OutputElement#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' container reference.
	 * @see #setElement(OutputElement)
	 * @see be.ac.vub.simplegt.SimplegtPackage#getOutputBinding_Element()
	 * @see be.ac.vub.simplegt.OutputElement#getBindings
	 * @model opposite="bindings" transient="false"
	 * @generated
	 */
	OutputElement getElement();

	/**
	 * Sets the value of the '{@link be.ac.vub.simplegt.OutputBinding#getElement <em>Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' container reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(OutputElement value);

} // OutputBinding
