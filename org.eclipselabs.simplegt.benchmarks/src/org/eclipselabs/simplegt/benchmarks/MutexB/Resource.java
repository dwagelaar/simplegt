/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.simplegt.benchmarks.MutexB;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.simplegt.benchmarks.MutexB.Resource#getBlocked <em>Blocked</em>}</li>
 *   <li>{@link org.eclipselabs.simplegt.benchmarks.MutexB.Resource#getHeld_by <em>Held by</em>}</li>
 *   <li>{@link org.eclipselabs.simplegt.benchmarks.MutexB.Resource#getToken <em>Token</em>}</li>
 *   <li>{@link org.eclipselabs.simplegt.benchmarks.MutexB.Resource#getRelease <em>Release</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.simplegt.benchmarks.MutexB.MutexBPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Blocked</b></em>' reference list.
	 * The list contents are of type {@link org.eclipselabs.simplegt.benchmarks.MutexB.Process}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocked</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocked</em>' reference list.
	 * @see org.eclipselabs.simplegt.benchmarks.MutexB.MutexBPackage#getResource_Blocked()
	 * @model
	 * @generated
	 */
	EList<org.eclipselabs.simplegt.benchmarks.MutexB.Process> getBlocked();

	/**
	 * Returns the value of the '<em><b>Held by</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Held by</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Held by</em>' reference.
	 * @see #setHeld_by(org.eclipselabs.simplegt.benchmarks.MutexB.Process)
	 * @see org.eclipselabs.simplegt.benchmarks.MutexB.MutexBPackage#getResource_Held_by()
	 * @model
	 * @generated
	 */
	org.eclipselabs.simplegt.benchmarks.MutexB.Process getHeld_by();

	/**
	 * Sets the value of the '{@link org.eclipselabs.simplegt.benchmarks.MutexB.Resource#getHeld_by <em>Held by</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Held by</em>' reference.
	 * @see #getHeld_by()
	 * @generated
	 */
	void setHeld_by(org.eclipselabs.simplegt.benchmarks.MutexB.Process value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' reference.
	 * @see #setToken(org.eclipselabs.simplegt.benchmarks.MutexB.Process)
	 * @see org.eclipselabs.simplegt.benchmarks.MutexB.MutexBPackage#getResource_Token()
	 * @model
	 * @generated
	 */
	org.eclipselabs.simplegt.benchmarks.MutexB.Process getToken();

	/**
	 * Sets the value of the '{@link org.eclipselabs.simplegt.benchmarks.MutexB.Resource#getToken <em>Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' reference.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(org.eclipselabs.simplegt.benchmarks.MutexB.Process value);

	/**
	 * Returns the value of the '<em><b>Release</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release</em>' reference.
	 * @see #setRelease(org.eclipselabs.simplegt.benchmarks.MutexB.Process)
	 * @see org.eclipselabs.simplegt.benchmarks.MutexB.MutexBPackage#getResource_Release()
	 * @model
	 * @generated
	 */
	org.eclipselabs.simplegt.benchmarks.MutexB.Process getRelease();

	/**
	 * Sets the value of the '{@link org.eclipselabs.simplegt.benchmarks.MutexB.Resource#getRelease <em>Release</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release</em>' reference.
	 * @see #getRelease()
	 * @generated
	 */
	void setRelease(org.eclipselabs.simplegt.benchmarks.MutexB.Process value);

} // Resource
