/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package be.ac.vub.simplegt.impl;

import be.ac.vub.simplegt.Binding;
import be.ac.vub.simplegt.InPattern;
import be.ac.vub.simplegt.InputBinding;
import be.ac.vub.simplegt.InputElement;
import be.ac.vub.simplegt.NacPattern;
import be.ac.vub.simplegt.SimplegtPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.ac.vub.simplegt.impl.InputElementImpl#getInPattern <em>In Pattern</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.impl.InputElementImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.impl.InputElementImpl#getNacPattern <em>Nac Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputElementImpl extends RuleElementImpl implements InputElement {
	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected InputBinding binding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplegtPackage.Literals.INPUT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPattern getInPattern() {
		if (eContainerFeatureID() != SimplegtPackage.INPUT_ELEMENT__IN_PATTERN) return null;
		return (InPattern)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInPattern(InPattern newInPattern, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInPattern, SimplegtPackage.INPUT_ELEMENT__IN_PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInPattern(InPattern newInPattern) {
		if (newInPattern != eInternalContainer() || (eContainerFeatureID() != SimplegtPackage.INPUT_ELEMENT__IN_PATTERN && newInPattern != null)) {
			if (EcoreUtil.isAncestor(this, newInPattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInPattern != null)
				msgs = ((InternalEObject)newInPattern).eInverseAdd(this, SimplegtPackage.IN_PATTERN__ELEMENTS, InPattern.class, msgs);
			msgs = basicSetInPattern(newInPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplegtPackage.INPUT_ELEMENT__IN_PATTERN, newInPattern, newInPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputBinding getBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinding(InputBinding newBinding, NotificationChain msgs) {
		InputBinding oldBinding = binding;
		binding = newBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimplegtPackage.INPUT_ELEMENT__BINDING, oldBinding, newBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding(InputBinding newBinding) {
		if (newBinding != binding) {
			NotificationChain msgs = null;
			if (binding != null)
				msgs = ((InternalEObject)binding).eInverseRemove(this, SimplegtPackage.INPUT_BINDING__BINDING_FOR, InputBinding.class, msgs);
			if (newBinding != null)
				msgs = ((InternalEObject)newBinding).eInverseAdd(this, SimplegtPackage.INPUT_BINDING__BINDING_FOR, InputBinding.class, msgs);
			msgs = basicSetBinding(newBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplegtPackage.INPUT_ELEMENT__BINDING, newBinding, newBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NacPattern getNacPattern() {
		if (eContainerFeatureID() != SimplegtPackage.INPUT_ELEMENT__NAC_PATTERN) return null;
		return (NacPattern)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNacPattern(NacPattern newNacPattern, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNacPattern, SimplegtPackage.INPUT_ELEMENT__NAC_PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNacPattern(NacPattern newNacPattern) {
		if (newNacPattern != eInternalContainer() || (eContainerFeatureID() != SimplegtPackage.INPUT_ELEMENT__NAC_PATTERN && newNacPattern != null)) {
			if (EcoreUtil.isAncestor(this, newNacPattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNacPattern != null)
				msgs = ((InternalEObject)newNacPattern).eInverseAdd(this, SimplegtPackage.NAC_PATTERN__ELEMENTS, NacPattern.class, msgs);
			msgs = basicSetNacPattern(newNacPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplegtPackage.INPUT_ELEMENT__NAC_PATTERN, newNacPattern, newNacPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplegtPackage.INPUT_ELEMENT__IN_PATTERN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInPattern((InPattern)otherEnd, msgs);
			case SimplegtPackage.INPUT_ELEMENT__BINDING:
				if (binding != null)
					msgs = ((InternalEObject)binding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimplegtPackage.INPUT_ELEMENT__BINDING, null, msgs);
				return basicSetBinding((InputBinding)otherEnd, msgs);
			case SimplegtPackage.INPUT_ELEMENT__NAC_PATTERN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNacPattern((NacPattern)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplegtPackage.INPUT_ELEMENT__IN_PATTERN:
				return basicSetInPattern(null, msgs);
			case SimplegtPackage.INPUT_ELEMENT__BINDING:
				return basicSetBinding(null, msgs);
			case SimplegtPackage.INPUT_ELEMENT__NAC_PATTERN:
				return basicSetNacPattern(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SimplegtPackage.INPUT_ELEMENT__IN_PATTERN:
				return eInternalContainer().eInverseRemove(this, SimplegtPackage.IN_PATTERN__ELEMENTS, InPattern.class, msgs);
			case SimplegtPackage.INPUT_ELEMENT__NAC_PATTERN:
				return eInternalContainer().eInverseRemove(this, SimplegtPackage.NAC_PATTERN__ELEMENTS, NacPattern.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplegtPackage.INPUT_ELEMENT__IN_PATTERN:
				return getInPattern();
			case SimplegtPackage.INPUT_ELEMENT__BINDING:
				return getBinding();
			case SimplegtPackage.INPUT_ELEMENT__NAC_PATTERN:
				return getNacPattern();
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
			case SimplegtPackage.INPUT_ELEMENT__IN_PATTERN:
				setInPattern((InPattern)newValue);
				return;
			case SimplegtPackage.INPUT_ELEMENT__BINDING:
				setBinding((InputBinding)newValue);
				return;
			case SimplegtPackage.INPUT_ELEMENT__NAC_PATTERN:
				setNacPattern((NacPattern)newValue);
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
			case SimplegtPackage.INPUT_ELEMENT__IN_PATTERN:
				setInPattern((InPattern)null);
				return;
			case SimplegtPackage.INPUT_ELEMENT__BINDING:
				setBinding((InputBinding)null);
				return;
			case SimplegtPackage.INPUT_ELEMENT__NAC_PATTERN:
				setNacPattern((NacPattern)null);
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
			case SimplegtPackage.INPUT_ELEMENT__IN_PATTERN:
				return getInPattern() != null;
			case SimplegtPackage.INPUT_ELEMENT__BINDING:
				return binding != null;
			case SimplegtPackage.INPUT_ELEMENT__NAC_PATTERN:
				return getNacPattern() != null;
		}
		return super.eIsSet(featureID);
	}

} //InputElementImpl
