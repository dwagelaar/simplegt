/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package be.ac.vub.simplegt.impl;

import be.ac.vub.simplegt.AddBinding;
import be.ac.vub.simplegt.RuleElement;
import be.ac.vub.simplegt.SimplegtPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.ac.vub.simplegt.impl.AddBindingImpl#getBeforeElement <em>Before Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddBindingImpl extends OutputBindingImpl implements AddBinding {
	/**
	 * The cached value of the '{@link #getBeforeElement() <em>Before Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeElement()
	 * @generated
	 * @ordered
	 */
	protected RuleElement beforeElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplegtPackage.Literals.ADD_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleElement getBeforeElement() {
		if (beforeElement != null && beforeElement.eIsProxy()) {
			InternalEObject oldBeforeElement = (InternalEObject)beforeElement;
			beforeElement = (RuleElement)eResolveProxy(oldBeforeElement);
			if (beforeElement != oldBeforeElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplegtPackage.ADD_BINDING__BEFORE_ELEMENT, oldBeforeElement, beforeElement));
			}
		}
		return beforeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleElement basicGetBeforeElement() {
		return beforeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeElement(RuleElement newBeforeElement) {
		RuleElement oldBeforeElement = beforeElement;
		beforeElement = newBeforeElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplegtPackage.ADD_BINDING__BEFORE_ELEMENT, oldBeforeElement, beforeElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplegtPackage.ADD_BINDING__BEFORE_ELEMENT:
				if (resolve) return getBeforeElement();
				return basicGetBeforeElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimplegtPackage.ADD_BINDING__BEFORE_ELEMENT:
				setBeforeElement((RuleElement)newValue);
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
			case SimplegtPackage.ADD_BINDING__BEFORE_ELEMENT:
				setBeforeElement((RuleElement)null);
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
			case SimplegtPackage.ADD_BINDING__BEFORE_ELEMENT:
				return beforeElement != null;
		}
		return super.eIsSet(featureID);
	}

} //AddBindingImpl
