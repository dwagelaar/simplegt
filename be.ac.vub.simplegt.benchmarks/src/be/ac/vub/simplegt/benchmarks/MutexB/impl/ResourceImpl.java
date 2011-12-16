/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.simplegt.benchmarks.MutexB.impl;

import be.ac.vub.simplegt.benchmarks.MutexB.MutexBPackage;
import be.ac.vub.simplegt.benchmarks.MutexB.Resource;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.ac.vub.simplegt.benchmarks.MutexB.impl.ResourceImpl#getBlocked <em>Blocked</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.benchmarks.MutexB.impl.ResourceImpl#getHeld_by <em>Held by</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.benchmarks.MutexB.impl.ResourceImpl#getToken <em>Token</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.benchmarks.MutexB.impl.ResourceImpl#getRelease <em>Release</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceImpl extends EObjectImpl implements Resource {
	/**
	 * The cached value of the '{@link #getBlocked() <em>Blocked</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocked()
	 * @generated
	 * @ordered
	 */
	protected EList<be.ac.vub.simplegt.benchmarks.MutexB.Process> blocked;

	/**
	 * The cached value of the '{@link #getHeld_by() <em>Held by</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeld_by()
	 * @generated
	 * @ordered
	 */
	protected be.ac.vub.simplegt.benchmarks.MutexB.Process held_by;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected be.ac.vub.simplegt.benchmarks.MutexB.Process token;

	/**
	 * The cached value of the '{@link #getRelease() <em>Release</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelease()
	 * @generated
	 * @ordered
	 */
	protected be.ac.vub.simplegt.benchmarks.MutexB.Process release;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MutexBPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<be.ac.vub.simplegt.benchmarks.MutexB.Process> getBlocked() {
		if (blocked == null) {
			blocked = new EObjectResolvingEList<be.ac.vub.simplegt.benchmarks.MutexB.Process>(be.ac.vub.simplegt.benchmarks.MutexB.Process.class, this, MutexBPackage.RESOURCE__BLOCKED);
		}
		return blocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public be.ac.vub.simplegt.benchmarks.MutexB.Process getHeld_by() {
		if (held_by != null && held_by.eIsProxy()) {
			InternalEObject oldHeld_by = (InternalEObject)held_by;
			held_by = (be.ac.vub.simplegt.benchmarks.MutexB.Process)eResolveProxy(oldHeld_by);
			if (held_by != oldHeld_by) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MutexBPackage.RESOURCE__HELD_BY, oldHeld_by, held_by));
			}
		}
		return held_by;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public be.ac.vub.simplegt.benchmarks.MutexB.Process basicGetHeld_by() {
		return held_by;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeld_by(be.ac.vub.simplegt.benchmarks.MutexB.Process newHeld_by) {
		be.ac.vub.simplegt.benchmarks.MutexB.Process oldHeld_by = held_by;
		held_by = newHeld_by;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MutexBPackage.RESOURCE__HELD_BY, oldHeld_by, held_by));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public be.ac.vub.simplegt.benchmarks.MutexB.Process getToken() {
		if (token != null && token.eIsProxy()) {
			InternalEObject oldToken = (InternalEObject)token;
			token = (be.ac.vub.simplegt.benchmarks.MutexB.Process)eResolveProxy(oldToken);
			if (token != oldToken) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MutexBPackage.RESOURCE__TOKEN, oldToken, token));
			}
		}
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public be.ac.vub.simplegt.benchmarks.MutexB.Process basicGetToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToken(be.ac.vub.simplegt.benchmarks.MutexB.Process newToken) {
		be.ac.vub.simplegt.benchmarks.MutexB.Process oldToken = token;
		token = newToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MutexBPackage.RESOURCE__TOKEN, oldToken, token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public be.ac.vub.simplegt.benchmarks.MutexB.Process getRelease() {
		if (release != null && release.eIsProxy()) {
			InternalEObject oldRelease = (InternalEObject)release;
			release = (be.ac.vub.simplegt.benchmarks.MutexB.Process)eResolveProxy(oldRelease);
			if (release != oldRelease) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MutexBPackage.RESOURCE__RELEASE, oldRelease, release));
			}
		}
		return release;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public be.ac.vub.simplegt.benchmarks.MutexB.Process basicGetRelease() {
		return release;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelease(be.ac.vub.simplegt.benchmarks.MutexB.Process newRelease) {
		be.ac.vub.simplegt.benchmarks.MutexB.Process oldRelease = release;
		release = newRelease;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MutexBPackage.RESOURCE__RELEASE, oldRelease, release));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MutexBPackage.RESOURCE__BLOCKED:
				return getBlocked();
			case MutexBPackage.RESOURCE__HELD_BY:
				if (resolve) return getHeld_by();
				return basicGetHeld_by();
			case MutexBPackage.RESOURCE__TOKEN:
				if (resolve) return getToken();
				return basicGetToken();
			case MutexBPackage.RESOURCE__RELEASE:
				if (resolve) return getRelease();
				return basicGetRelease();
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
			case MutexBPackage.RESOURCE__BLOCKED:
				getBlocked().clear();
				getBlocked().addAll((Collection<? extends be.ac.vub.simplegt.benchmarks.MutexB.Process>)newValue);
				return;
			case MutexBPackage.RESOURCE__HELD_BY:
				setHeld_by((be.ac.vub.simplegt.benchmarks.MutexB.Process)newValue);
				return;
			case MutexBPackage.RESOURCE__TOKEN:
				setToken((be.ac.vub.simplegt.benchmarks.MutexB.Process)newValue);
				return;
			case MutexBPackage.RESOURCE__RELEASE:
				setRelease((be.ac.vub.simplegt.benchmarks.MutexB.Process)newValue);
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
			case MutexBPackage.RESOURCE__BLOCKED:
				getBlocked().clear();
				return;
			case MutexBPackage.RESOURCE__HELD_BY:
				setHeld_by((be.ac.vub.simplegt.benchmarks.MutexB.Process)null);
				return;
			case MutexBPackage.RESOURCE__TOKEN:
				setToken((be.ac.vub.simplegt.benchmarks.MutexB.Process)null);
				return;
			case MutexBPackage.RESOURCE__RELEASE:
				setRelease((be.ac.vub.simplegt.benchmarks.MutexB.Process)null);
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
			case MutexBPackage.RESOURCE__BLOCKED:
				return blocked != null && !blocked.isEmpty();
			case MutexBPackage.RESOURCE__HELD_BY:
				return held_by != null;
			case MutexBPackage.RESOURCE__TOKEN:
				return token != null;
			case MutexBPackage.RESOURCE__RELEASE:
				return release != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceImpl
