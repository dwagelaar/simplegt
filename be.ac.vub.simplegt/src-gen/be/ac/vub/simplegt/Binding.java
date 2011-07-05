/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package be.ac.vub.simplegt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.ac.vub.simplegt.Binding#getProperty <em>Property</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.Binding#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.ac.vub.simplegt.SimplegtPackage#getBinding()
 * @model abstract="true"
 * @generated
 */
public interface Binding extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see #setProperty(String)
	 * @see be.ac.vub.simplegt.SimplegtPackage#getBinding_Property()
	 * @model required="true"
	 * @generated
	 */
	String getProperty();

	/**
	 * Sets the value of the '{@link be.ac.vub.simplegt.Binding#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' attribute.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(String value);

	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.simplegt.Expression#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(Expression)
	 * @see be.ac.vub.simplegt.SimplegtPackage#getBinding_Expr()
	 * @see be.ac.vub.simplegt.Expression#getBinding
	 * @model opposite="binding" containment="true" required="true"
	 * @generated
	 */
	Expression getExpr();

	/**
	 * Sets the value of the '{@link be.ac.vub.simplegt.Binding#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expression value);

} // Binding
