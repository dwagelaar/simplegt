/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package org.eclipselabs.simplegt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nac Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.simplegt.NacPattern#getNacFor <em>Nac For</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.simplegt.SimplegtPackage#getNacPattern()
 * @model
 * @generated
 */
public interface NacPattern extends InputElementPattern {
	/**
	 * Returns the value of the '<em><b>Nac For</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipselabs.simplegt.Rule#getNac <em>Nac</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nac For</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nac For</em>' container reference.
	 * @see #setNacFor(Rule)
	 * @see org.eclipselabs.simplegt.SimplegtPackage#getNacPattern_NacFor()
	 * @see org.eclipselabs.simplegt.Rule#getNac
	 * @model opposite="nac" transient="false"
	 * @generated
	 */
	Rule getNacFor();

	/**
	 * Sets the value of the '{@link org.eclipselabs.simplegt.NacPattern#getNacFor <em>Nac For</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nac For</em>' container reference.
	 * @see #getNacFor()
	 * @generated
	 */
	void setNacFor(Rule value);

} // NacPattern
