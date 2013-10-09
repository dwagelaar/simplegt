/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package org.eclipselabs.simplegt;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.simplegt.OutputBinding#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipselabs.simplegt.OutputBinding#getBeforeElement <em>Before Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.simplegt.SimplegtPackage#getOutputBinding()
 * @model
 * @generated
 */
public interface OutputBinding extends Binding {
	/**
   * Returns the value of the '<em><b>Element</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipselabs.simplegt.OutputElement#getBindings <em>Bindings</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' container reference.
   * @see #setElement(OutputElement)
   * @see org.eclipselabs.simplegt.SimplegtPackage#getOutputBinding_Element()
   * @see org.eclipselabs.simplegt.OutputElement#getBindings
   * @model opposite="bindings" transient="false"
   * @generated
   */
	OutputElement getElement();

	/**
   * Sets the value of the '{@link org.eclipselabs.simplegt.OutputBinding#getElement <em>Element</em>}' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' container reference.
   * @see #getElement()
   * @generated
   */
	void setElement(OutputElement value);

	/**
   * Returns the value of the '<em><b>Before Element</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Before Element</em>' reference.
   * @see #setBeforeElement(RuleElement)
   * @see org.eclipselabs.simplegt.SimplegtPackage#getOutputBinding_BeforeElement()
   * @model
   * @generated
   */
	RuleElement getBeforeElement();

	/**
   * Sets the value of the '{@link org.eclipselabs.simplegt.OutputBinding#getBeforeElement <em>Before Element</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Before Element</em>' reference.
   * @see #getBeforeElement()
   * @generated
   */
	void setBeforeElement(RuleElement value);

} // OutputBinding
