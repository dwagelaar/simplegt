/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package org.eclipselabs.simplegt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.simplegt.InPattern#getInputFor <em>Input For</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.simplegt.SimplegtPackage#getInPattern()
 * @model
 * @generated
 */
public interface InPattern extends InputElementPattern {
	/**
   * Returns the value of the '<em><b>Input For</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipselabs.simplegt.Rule#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input For</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Input For</em>' container reference.
   * @see #setInputFor(Rule)
   * @see org.eclipselabs.simplegt.SimplegtPackage#getInPattern_InputFor()
   * @see org.eclipselabs.simplegt.Rule#getInput
   * @model opposite="input" transient="false"
   * @generated
   */
	Rule getInputFor();

	/**
   * Sets the value of the '{@link org.eclipselabs.simplegt.InPattern#getInputFor <em>Input For</em>}' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input For</em>' container reference.
   * @see #getInputFor()
   * @generated
   */
	void setInputFor(Rule value);

} // InPattern
