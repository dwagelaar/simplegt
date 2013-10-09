/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package org.eclipselabs.simplegt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.simplegt.DoubleLiteralExp#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.simplegt.SimplegtPackage#getDoubleLiteralExp()
 * @model
 * @generated
 */
public interface DoubleLiteralExp extends LiteralExp {
	/**
	 * Returns the value of the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' attribute.
	 * @see #setLiteral(double)
	 * @see org.eclipselabs.simplegt.SimplegtPackage#getDoubleLiteralExp_Literal()
	 * @model required="true"
	 * @generated
	 */
	double getLiteral();

	/**
	 * Sets the value of the '{@link org.eclipselabs.simplegt.DoubleLiteralExp#getLiteral <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' attribute.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(double value);

} // DoubleLiteralExp
