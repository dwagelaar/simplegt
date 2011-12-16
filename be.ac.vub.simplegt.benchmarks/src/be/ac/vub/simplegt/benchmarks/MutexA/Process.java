/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 */
package be.ac.vub.simplegt.benchmarks.MutexA;

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
 *   <li>{@link be.ac.vub.simplegt.benchmarks.MutexA.Process#getNext <em>Next</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.benchmarks.MutexA.Process#getRequest <em>Request</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.benchmarks.MutexA.Process#getCount <em>Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.ac.vub.simplegt.benchmarks.MutexA.MutexAPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference list.
	 * The list contents are of type {@link be.ac.vub.simplegt.benchmarks.MutexA.Process}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference list.
	 * @see be.ac.vub.simplegt.benchmarks.MutexA.MutexAPackage#getProcess_Next()
	 * @model
	 * @generated
	 */
	EList<Process> getNext();

	/**
	 * Returns the value of the '<em><b>Request</b></em>' reference list.
	 * The list contents are of type {@link be.ac.vub.simplegt.benchmarks.MutexA.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' reference list.
	 * @see be.ac.vub.simplegt.benchmarks.MutexA.MutexAPackage#getProcess_Request()
	 * @model
	 * @generated
	 */
	EList<Resource> getRequest();

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see be.ac.vub.simplegt.benchmarks.MutexA.MutexAPackage#getProcess_Count()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getCount();

} // Process