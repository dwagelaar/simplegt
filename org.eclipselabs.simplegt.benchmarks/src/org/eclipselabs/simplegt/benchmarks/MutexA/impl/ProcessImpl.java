/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 */
package org.eclipselabs.simplegt.benchmarks.MutexA.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipselabs.simplegt.benchmarks.MutexA.MutexAPackage;
import org.eclipselabs.simplegt.benchmarks.MutexA.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.simplegt.benchmarks.MutexA.impl.ProcessImpl#getNext <em>Next</em>}</li>
 *   <li>{@link org.eclipselabs.simplegt.benchmarks.MutexA.impl.ProcessImpl#getRequest <em>Request</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessImpl extends EObjectImpl implements org.eclipselabs.simplegt.benchmarks.MutexA.Process {
	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipselabs.simplegt.benchmarks.MutexA.Process> next;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> request;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MutexAPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipselabs.simplegt.benchmarks.MutexA.Process> getNext() {
		if (next == null) {
			next = new EObjectResolvingEList<org.eclipselabs.simplegt.benchmarks.MutexA.Process>(org.eclipselabs.simplegt.benchmarks.MutexA.Process.class, this, MutexAPackage.PROCESS__NEXT);
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getRequest() {
		if (request == null) {
			request = new EObjectResolvingEList<Resource>(Resource.class, this, MutexAPackage.PROCESS__REQUEST);
		}
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MutexAPackage.PROCESS__NEXT:
				return getNext();
			case MutexAPackage.PROCESS__REQUEST:
				return getRequest();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MutexAPackage.PROCESS__NEXT:
				getNext().clear();
				getNext().addAll((Collection<? extends org.eclipselabs.simplegt.benchmarks.MutexA.Process>)newValue);
				return;
			case MutexAPackage.PROCESS__REQUEST:
				getRequest().clear();
				getRequest().addAll((Collection<? extends Resource>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MutexAPackage.PROCESS__NEXT:
				getNext().clear();
				return;
			case MutexAPackage.PROCESS__REQUEST:
				getRequest().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MutexAPackage.PROCESS__NEXT:
				return next != null && !next.isEmpty();
			case MutexAPackage.PROCESS__REQUEST:
				return request != null && !request.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessImpl
