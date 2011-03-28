/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package be.ac.vub.simplegt.impl;

import be.ac.vub.simplegt.InputElement;
import be.ac.vub.simplegt.NacPattern;
import be.ac.vub.simplegt.Rule;
import be.ac.vub.simplegt.SimplegtPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nac Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.ac.vub.simplegt.impl.NacPatternImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.impl.NacPatternImpl#getNacFor <em>Nac For</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NacPatternImpl extends EObjectImpl implements NacPattern {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<InputElement> elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NacPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplegtPackage.Literals.NAC_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentWithInverseEList<InputElement>(InputElement.class, this, SimplegtPackage.NAC_PATTERN__ELEMENTS, SimplegtPackage.INPUT_ELEMENT__NAC_PATTERN);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getNacFor() {
		if (eContainerFeatureID() != SimplegtPackage.NAC_PATTERN__NAC_FOR) return null;
		return (Rule)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNacFor(Rule newNacFor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNacFor, SimplegtPackage.NAC_PATTERN__NAC_FOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNacFor(Rule newNacFor) {
		if (newNacFor != eInternalContainer() || (eContainerFeatureID() != SimplegtPackage.NAC_PATTERN__NAC_FOR && newNacFor != null)) {
			if (EcoreUtil.isAncestor(this, newNacFor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNacFor != null)
				msgs = ((InternalEObject)newNacFor).eInverseAdd(this, SimplegtPackage.RULE__NAC, Rule.class, msgs);
			msgs = basicSetNacFor(newNacFor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplegtPackage.NAC_PATTERN__NAC_FOR, newNacFor, newNacFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplegtPackage.NAC_PATTERN__ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElements()).basicAdd(otherEnd, msgs);
			case SimplegtPackage.NAC_PATTERN__NAC_FOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNacFor((Rule)otherEnd, msgs);
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
			case SimplegtPackage.NAC_PATTERN__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case SimplegtPackage.NAC_PATTERN__NAC_FOR:
				return basicSetNacFor(null, msgs);
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
			case SimplegtPackage.NAC_PATTERN__NAC_FOR:
				return eInternalContainer().eInverseRemove(this, SimplegtPackage.RULE__NAC, Rule.class, msgs);
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
			case SimplegtPackage.NAC_PATTERN__ELEMENTS:
				return getElements();
			case SimplegtPackage.NAC_PATTERN__NAC_FOR:
				return getNacFor();
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
			case SimplegtPackage.NAC_PATTERN__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends InputElement>)newValue);
				return;
			case SimplegtPackage.NAC_PATTERN__NAC_FOR:
				setNacFor((Rule)newValue);
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
			case SimplegtPackage.NAC_PATTERN__ELEMENTS:
				getElements().clear();
				return;
			case SimplegtPackage.NAC_PATTERN__NAC_FOR:
				setNacFor((Rule)null);
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
			case SimplegtPackage.NAC_PATTERN__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case SimplegtPackage.NAC_PATTERN__NAC_FOR:
				return getNacFor() != null;
		}
		return super.eIsSet(featureID);
	}

} //NacPatternImpl
