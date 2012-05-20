/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.simplegt.benchmarks.MutexB.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import be.ac.vub.simplegt.benchmarks.MutexB.MutexBPackage;
import be.ac.vub.simplegt.benchmarks.MutexB.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.ac.vub.simplegt.benchmarks.MutexB.impl.ProcessImpl#getNext <em>Next</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.benchmarks.MutexB.impl.ProcessImpl#getRequest <em>Request</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessImpl extends EObjectImpl implements be.ac.vub.simplegt.benchmarks.MutexB.Process {
	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected be.ac.vub.simplegt.benchmarks.MutexB.Process next;

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
		return MutexBPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public be.ac.vub.simplegt.benchmarks.MutexB.Process getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (be.ac.vub.simplegt.benchmarks.MutexB.Process)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MutexBPackage.PROCESS__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public be.ac.vub.simplegt.benchmarks.MutexB.Process basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(be.ac.vub.simplegt.benchmarks.MutexB.Process newNext) {
		be.ac.vub.simplegt.benchmarks.MutexB.Process oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MutexBPackage.PROCESS__NEXT, oldNext, next));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getRequest() {
		if (request == null) {
			request = new EObjectResolvingEList<Resource>(Resource.class, this, MutexBPackage.PROCESS__REQUEST);
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
			case MutexBPackage.PROCESS__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case MutexBPackage.PROCESS__REQUEST:
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
			case MutexBPackage.PROCESS__NEXT:
				setNext((be.ac.vub.simplegt.benchmarks.MutexB.Process)newValue);
				return;
			case MutexBPackage.PROCESS__REQUEST:
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
			case MutexBPackage.PROCESS__NEXT:
				setNext((be.ac.vub.simplegt.benchmarks.MutexB.Process)null);
				return;
			case MutexBPackage.PROCESS__REQUEST:
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
			case MutexBPackage.PROCESS__NEXT:
				return next != null;
			case MutexBPackage.PROCESS__REQUEST:
				return request != null && !request.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessImpl
