/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 */
package be.ac.vub.simplegt.benchmarks.MutexA.impl;

import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource.Internal;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import be.ac.vub.simplegt.benchmarks.MutexA.MutexAPackage;
import be.ac.vub.simplegt.benchmarks.MutexA.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.ac.vub.simplegt.benchmarks.MutexA.impl.ProcessImpl#getNext <em>Next</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.benchmarks.MutexA.impl.ProcessImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.benchmarks.MutexA.impl.ProcessImpl#getCount <em>Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessImpl extends EObjectImpl implements be.ac.vub.simplegt.benchmarks.MutexA.Process {
	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected EList<be.ac.vub.simplegt.benchmarks.MutexA.Process> next;

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
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_EDEFAULT = 0;
	
	private static Map<Internal, Integer> counts = new WeakHashMap<Internal, Integer>();

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
	public EList<be.ac.vub.simplegt.benchmarks.MutexA.Process> getNext() {
		if (next == null) {
			next = new EObjectResolvingEList<be.ac.vub.simplegt.benchmarks.MutexA.Process>(be.ac.vub.simplegt.benchmarks.MutexA.Process.class, this, MutexAPackage.PROCESS__NEXT);
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
	 * @generated NOT
	 */
	public int getCount() {
		final Internal resource = eInternalResource();
		return counts.containsKey(resource) ? counts.get(resource) : 0;
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
			case MutexAPackage.PROCESS__COUNT:
				return getCount();
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
				getNext().addAll((Collection<? extends be.ac.vub.simplegt.benchmarks.MutexA.Process>)newValue);
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
			case MutexAPackage.PROCESS__COUNT:
				return getCount() != COUNT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public NotificationChain eSetResource(Internal resource,
			NotificationChain notifications) {
		final Internal old = eInternalResource();
		if (old != null ) {
			int count = counts.containsKey(old) ? counts.get(old).intValue() : 0;
			if (count > 0) {
				counts.put(old, Integer.valueOf(count - 1));
			}
		}
		if (resource != null) {
			int count = counts.containsKey(resource) ? counts.get(resource).intValue() : 0;
			counts.put(resource, Integer.valueOf(count + 1));
		}
		return super.eSetResource(resource, notifications);
	}

} //ProcessImpl
