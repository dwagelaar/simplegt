/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 */
package be.ac.vub.simplegt.benchmarks.MutexA;

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
 *   <li>{@link be.ac.vub.simplegt.benchmarks.MutexA.Resource#getBlocked <em>Blocked</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.benchmarks.MutexA.Resource#getHeld_by <em>Held by</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.benchmarks.MutexA.Resource#getToken <em>Token</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.benchmarks.MutexA.Resource#getRelease <em>Release</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.ac.vub.simplegt.benchmarks.MutexA.MutexAPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends EObject
{
  /**
   * Returns the value of the '<em><b>Blocked</b></em>' reference list.
   * The list contents are of type {@link be.ac.vub.simplegt.benchmarks.MutexA.Process}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Blocked</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Blocked</em>' reference list.
   * @see be.ac.vub.simplegt.benchmarks.MutexA.MutexAPackage#getResource_Blocked()
   * @model
   * @generated
   */
  EList<be.ac.vub.simplegt.benchmarks.MutexA.Process> getBlocked();

  /**
   * Returns the value of the '<em><b>Held by</b></em>' reference list.
   * The list contents are of type {@link be.ac.vub.simplegt.benchmarks.MutexA.Process}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Held by</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Held by</em>' reference list.
   * @see be.ac.vub.simplegt.benchmarks.MutexA.MutexAPackage#getResource_Held_by()
   * @model
   * @generated
   */
  EList<be.ac.vub.simplegt.benchmarks.MutexA.Process> getHeld_by();

  /**
   * Returns the value of the '<em><b>Token</b></em>' reference list.
   * The list contents are of type {@link be.ac.vub.simplegt.benchmarks.MutexA.Process}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Token</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Token</em>' reference list.
   * @see be.ac.vub.simplegt.benchmarks.MutexA.MutexAPackage#getResource_Token()
   * @model
   * @generated
   */
  EList<be.ac.vub.simplegt.benchmarks.MutexA.Process> getToken();

  /**
   * Returns the value of the '<em><b>Release</b></em>' reference list.
   * The list contents are of type {@link be.ac.vub.simplegt.benchmarks.MutexA.Process}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Release</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Release</em>' reference list.
   * @see be.ac.vub.simplegt.benchmarks.MutexA.MutexAPackage#getResource_Release()
   * @model
   * @generated
   */
  EList<be.ac.vub.simplegt.benchmarks.MutexA.Process> getRelease();

} // Resource
