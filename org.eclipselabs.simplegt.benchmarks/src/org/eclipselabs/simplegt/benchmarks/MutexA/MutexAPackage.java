/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 */
package org.eclipselabs.simplegt.benchmarks.MutexA;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipselabs.simplegt.benchmarks.MutexA.MutexAFactory
 * @model kind="package"
 * @generated
 */
public interface MutexAPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MutexA";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://soft.vub.ac.be/simplegt/2011/MutexA";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MutexA";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MutexAPackage eINSTANCE = org.eclipselabs.simplegt.benchmarks.MutexA.impl.MutexAPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipselabs.simplegt.benchmarks.MutexA.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.simplegt.benchmarks.MutexA.impl.ProcessImpl
	 * @see org.eclipselabs.simplegt.benchmarks.MutexA.impl.MutexAPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NEXT = 0;

	/**
	 * The feature id for the '<em><b>Request</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__REQUEST = 1;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.simplegt.benchmarks.MutexA.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.simplegt.benchmarks.MutexA.impl.ResourceImpl
	 * @see org.eclipselabs.simplegt.benchmarks.MutexA.impl.MutexAPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__BLOCKED = 0;

	/**
	 * The feature id for the '<em><b>Held by</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__HELD_BY = 1;

	/**
	 * The feature id for the '<em><b>Token</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__TOKEN = 2;

	/**
	 * The feature id for the '<em><b>Release</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RELEASE = 3;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link org.eclipselabs.simplegt.benchmarks.MutexA.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see org.eclipselabs.simplegt.benchmarks.MutexA.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipselabs.simplegt.benchmarks.MutexA.Process#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next</em>'.
	 * @see org.eclipselabs.simplegt.benchmarks.MutexA.Process#getNext()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Next();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipselabs.simplegt.benchmarks.MutexA.Process#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Request</em>'.
	 * @see org.eclipselabs.simplegt.benchmarks.MutexA.Process#getRequest()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Request();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.simplegt.benchmarks.MutexA.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.eclipselabs.simplegt.benchmarks.MutexA.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipselabs.simplegt.benchmarks.MutexA.Resource#getBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Blocked</em>'.
	 * @see org.eclipselabs.simplegt.benchmarks.MutexA.Resource#getBlocked()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Blocked();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipselabs.simplegt.benchmarks.MutexA.Resource#getHeld_by <em>Held by</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Held by</em>'.
	 * @see org.eclipselabs.simplegt.benchmarks.MutexA.Resource#getHeld_by()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Held_by();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipselabs.simplegt.benchmarks.MutexA.Resource#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Token</em>'.
	 * @see org.eclipselabs.simplegt.benchmarks.MutexA.Resource#getToken()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Token();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipselabs.simplegt.benchmarks.MutexA.Resource#getRelease <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Release</em>'.
	 * @see org.eclipselabs.simplegt.benchmarks.MutexA.Resource#getRelease()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Release();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MutexAFactory getMutexAFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipselabs.simplegt.benchmarks.MutexA.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.simplegt.benchmarks.MutexA.impl.ProcessImpl
		 * @see org.eclipselabs.simplegt.benchmarks.MutexA.impl.MutexAPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__NEXT = eINSTANCE.getProcess_Next();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__REQUEST = eINSTANCE.getProcess_Request();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.simplegt.benchmarks.MutexA.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.simplegt.benchmarks.MutexA.impl.ResourceImpl
		 * @see org.eclipselabs.simplegt.benchmarks.MutexA.impl.MutexAPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Blocked</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__BLOCKED = eINSTANCE.getResource_Blocked();

		/**
		 * The meta object literal for the '<em><b>Held by</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__HELD_BY = eINSTANCE.getResource_Held_by();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__TOKEN = eINSTANCE.getResource_Token();

		/**
		 * The meta object literal for the '<em><b>Release</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__RELEASE = eINSTANCE.getResource_Release();

	}

} //MutexAPackage
