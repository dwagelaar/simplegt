/**
 */
package be.ac.vub.simplegt.benchmarks.MutexB;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.ac.vub.simplegt.benchmarks.MutexB.Process#getNext <em>Next</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.benchmarks.MutexB.Process#getRequest <em>Request</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.ac.vub.simplegt.benchmarks.MutexB.MutexBPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject
{
  /**
   * Returns the value of the '<em><b>Next</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next</em>' reference.
   * @see #setNext(Process)
   * @see be.ac.vub.simplegt.benchmarks.MutexB.MutexBPackage#getProcess_Next()
   * @model
   * @generated
   */
  Process getNext();

  /**
   * Sets the value of the '{@link be.ac.vub.simplegt.benchmarks.MutexB.Process#getNext <em>Next</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next</em>' reference.
   * @see #getNext()
   * @generated
   */
  void setNext(Process value);

  /**
   * Returns the value of the '<em><b>Request</b></em>' reference list.
   * The list contents are of type {@link be.ac.vub.simplegt.benchmarks.MutexB.Resource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Request</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Request</em>' reference list.
   * @see be.ac.vub.simplegt.benchmarks.MutexB.MutexBPackage#getProcess_Request()
   * @model
   * @generated
   */
  EList<Resource> getRequest();

} // Process
