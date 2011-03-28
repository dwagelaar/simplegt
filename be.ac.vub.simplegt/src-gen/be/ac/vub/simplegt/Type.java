/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package be.ac.vub.simplegt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.ac.vub.simplegt.Type#getTypeOf <em>Type Of</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.Type#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.ac.vub.simplegt.SimplegtPackage#getType()
 * @model
 * @generated
 */
public interface Type extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.simplegt.TypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Of</em>' container reference.
	 * @see #setTypeOf(TypedElement)
	 * @see be.ac.vub.simplegt.SimplegtPackage#getType_TypeOf()
	 * @see be.ac.vub.simplegt.TypedElement#getType
	 * @model opposite="type" required="true" transient="false"
	 * @generated
	 */
	TypedElement getTypeOf();

	/**
	 * Sets the value of the '{@link be.ac.vub.simplegt.Type#getTypeOf <em>Type Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of</em>' container reference.
	 * @see #getTypeOf()
	 * @generated
	 */
	void setTypeOf(TypedElement value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Metamodel)
	 * @see be.ac.vub.simplegt.SimplegtPackage#getType_Model()
	 * @model
	 * @generated
	 */
	Metamodel getModel();

	/**
	 * Sets the value of the '{@link be.ac.vub.simplegt.Type#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Metamodel value);

} // Type
