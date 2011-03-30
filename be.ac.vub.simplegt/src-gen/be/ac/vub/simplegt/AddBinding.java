/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package be.ac.vub.simplegt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.ac.vub.simplegt.AddBinding#getBeforeElement <em>Before Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.ac.vub.simplegt.SimplegtPackage#getAddBinding()
 * @model
 * @generated
 */
public interface AddBinding extends OutputBinding {

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
	 * @see be.ac.vub.simplegt.SimplegtPackage#getAddBinding_BeforeElement()
	 * @model
	 * @generated
	 */
	RuleElement getBeforeElement();

	/**
	 * Sets the value of the '{@link be.ac.vub.simplegt.AddBinding#getBeforeElement <em>Before Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Element</em>' reference.
	 * @see #getBeforeElement()
	 * @generated
	 */
	void setBeforeElement(RuleElement value);
} // AddBinding
