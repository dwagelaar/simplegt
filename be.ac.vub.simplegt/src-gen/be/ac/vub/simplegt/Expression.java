/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package be.ac.vub.simplegt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.ac.vub.simplegt.Expression#getBinding <em>Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.ac.vub.simplegt.SimplegtPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Binding</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.simplegt.Binding#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' container reference.
	 * @see #setBinding(Binding)
	 * @see be.ac.vub.simplegt.SimplegtPackage#getExpression_Binding()
	 * @see be.ac.vub.simplegt.Binding#getExpr
	 * @model opposite="expr" transient="false"
	 * @generated
	 */
	Binding getBinding();

	/**
	 * Sets the value of the '{@link be.ac.vub.simplegt.Expression#getBinding <em>Binding</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' container reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(Binding value);

} // Expression
