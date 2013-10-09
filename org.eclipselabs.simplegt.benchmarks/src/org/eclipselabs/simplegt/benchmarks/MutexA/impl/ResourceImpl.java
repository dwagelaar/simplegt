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
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.simplegt.benchmarks.MutexA.impl.ResourceImpl#getBlocked <em>Blocked</em>}</li>
 *   <li>{@link org.eclipselabs.simplegt.benchmarks.MutexA.impl.ResourceImpl#getHeld_by <em>Held by</em>}</li>
 *   <li>{@link org.eclipselabs.simplegt.benchmarks.MutexA.impl.ResourceImpl#getToken <em>Token</em>}</li>
 *   <li>{@link org.eclipselabs.simplegt.benchmarks.MutexA.impl.ResourceImpl#getRelease <em>Release</em>}</li>
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
	protected EList<org.eclipselabs.simplegt.benchmarks.MutexA.Process> blocked;

	/**
	 * The cached value of the '{@link #getHeld_by() <em>Held by</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeld_by()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipselabs.simplegt.benchmarks.MutexA.Process> held_by;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipselabs.simplegt.benchmarks.MutexA.Process> token;

	/**
	 * The cached value of the '{@link #getRelease() <em>Release</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelease()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipselabs.simplegt.benchmarks.MutexA.Process> release;

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
		return MutexAPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipselabs.simplegt.benchmarks.MutexA.Process> getBlocked() {
		if (blocked == null) {
			blocked = new EObjectResolvingEList<org.eclipselabs.simplegt.benchmarks.MutexA.Process>(org.eclipselabs.simplegt.benchmarks.MutexA.Process.class, this, MutexAPackage.RESOURCE__BLOCKED);
		}
		return blocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipselabs.simplegt.benchmarks.MutexA.Process> getHeld_by() {
		if (held_by == null) {
			held_by = new EObjectResolvingEList<org.eclipselabs.simplegt.benchmarks.MutexA.Process>(org.eclipselabs.simplegt.benchmarks.MutexA.Process.class, this, MutexAPackage.RESOURCE__HELD_BY);
		}
		return held_by;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipselabs.simplegt.benchmarks.MutexA.Process> getToken() {
		if (token == null) {
			token = new EObjectResolvingEList<org.eclipselabs.simplegt.benchmarks.MutexA.Process>(org.eclipselabs.simplegt.benchmarks.MutexA.Process.class, this, MutexAPackage.RESOURCE__TOKEN);
		}
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipselabs.simplegt.benchmarks.MutexA.Process> getRelease() {
		if (release == null) {
			release = new EObjectResolvingEList<org.eclipselabs.simplegt.benchmarks.MutexA.Process>(org.eclipselabs.simplegt.benchmarks.MutexA.Process.class, this, MutexAPackage.RESOURCE__RELEASE);
		}
		return release;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MutexAPackage.RESOURCE__BLOCKED:
				return getBlocked();
			case MutexAPackage.RESOURCE__HELD_BY:
				return getHeld_by();
			case MutexAPackage.RESOURCE__TOKEN:
				return getToken();
			case MutexAPackage.RESOURCE__RELEASE:
				return getRelease();
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
			case MutexAPackage.RESOURCE__BLOCKED:
				getBlocked().clear();
				getBlocked().addAll((Collection<? extends org.eclipselabs.simplegt.benchmarks.MutexA.Process>)newValue);
				return;
			case MutexAPackage.RESOURCE__HELD_BY:
				getHeld_by().clear();
				getHeld_by().addAll((Collection<? extends org.eclipselabs.simplegt.benchmarks.MutexA.Process>)newValue);
				return;
			case MutexAPackage.RESOURCE__TOKEN:
				getToken().clear();
				getToken().addAll((Collection<? extends org.eclipselabs.simplegt.benchmarks.MutexA.Process>)newValue);
				return;
			case MutexAPackage.RESOURCE__RELEASE:
				getRelease().clear();
				getRelease().addAll((Collection<? extends org.eclipselabs.simplegt.benchmarks.MutexA.Process>)newValue);
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
			case MutexAPackage.RESOURCE__BLOCKED:
				getBlocked().clear();
				return;
			case MutexAPackage.RESOURCE__HELD_BY:
				getHeld_by().clear();
				return;
			case MutexAPackage.RESOURCE__TOKEN:
				getToken().clear();
				return;
			case MutexAPackage.RESOURCE__RELEASE:
				getRelease().clear();
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
			case MutexAPackage.RESOURCE__BLOCKED:
				return blocked != null && !blocked.isEmpty();
			case MutexAPackage.RESOURCE__HELD_BY:
				return held_by != null && !held_by.isEmpty();
			case MutexAPackage.RESOURCE__TOKEN:
				return token != null && !token.isEmpty();
			case MutexAPackage.RESOURCE__RELEASE:
				return release != null && !release.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceImpl
