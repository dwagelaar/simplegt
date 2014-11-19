/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package org.eclipselabs.simplegt;

import org.eclipse.emf.common.util.EList;
import org.eclipselabs.simpleocl.OclInstanceModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.simplegt.Module#getModels <em>Models</em>}</li>
 *   <li>{@link org.eclipselabs.simplegt.Module#isDebug <em>Debug</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.simplegt.SimplegtPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends org.eclipselabs.simpleocl.Module {
	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.simpleocl.OclInstanceModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see org.eclipselabs.simplegt.SimplegtPackage#getModule_Models()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<OclInstanceModel> getModels();

	/**
	 * Returns the value of the '<em><b>Debug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debug</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debug</em>' attribute.
	 * @see #setDebug(boolean)
	 * @see org.eclipselabs.simplegt.SimplegtPackage#getModule_Debug()
	 * @model required="true"
	 * @generated
	 */
	boolean isDebug();

	/**
	 * Sets the value of the '{@link org.eclipselabs.simplegt.Module#isDebug <em>Debug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debug</em>' attribute.
	 * @see #isDebug()
	 * @generated
	 */
	void setDebug(boolean value);

} // Module
