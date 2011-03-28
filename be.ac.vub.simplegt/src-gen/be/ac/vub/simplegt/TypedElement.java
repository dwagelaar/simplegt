/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package be.ac.vub.simplegt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.ac.vub.simplegt.TypedElement#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.ac.vub.simplegt.SimplegtPackage#getTypedElement()
 * @model abstract="true"
 * @generated
 */
public interface TypedElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.simplegt.Type#getTypeOf <em>Type Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Type)
	 * @see be.ac.vub.simplegt.SimplegtPackage#getTypedElement_Type()
	 * @see be.ac.vub.simplegt.Type#getTypeOf
	 * @model opposite="typeOf" containment="true" required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link be.ac.vub.simplegt.TypedElement#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // TypedElement
