/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package org.eclipselabs.simplegt;

import org.eclipselabs.simpleocl.OclInstanceModel;
import org.eclipselabs.simpleocl.VariableDeclaration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.simplegt.RuleElement#getInModel <em>In Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.simplegt.SimplegtPackage#getRuleElement()
 * @model abstract="true"
 * @generated
 */
public interface RuleElement extends VariableDeclaration {

	/**
   * Returns the value of the '<em><b>In Model</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>In Model</em>' reference.
   * @see #setInModel(OclInstanceModel)
   * @see org.eclipselabs.simplegt.SimplegtPackage#getRuleElement_InModel()
   * @model
   * @generated
   */
	OclInstanceModel getInModel();

	/**
   * Sets the value of the '{@link org.eclipselabs.simplegt.RuleElement#getInModel <em>In Model</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>In Model</em>' reference.
   * @see #getInModel()
   * @generated
   */
	void setInModel(OclInstanceModel value);
} // RuleElement
