/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package be.ac.vub.simplegt.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import be.ac.vub.simplegt.OutPattern;
import be.ac.vub.simplegt.OutputBinding;
import be.ac.vub.simplegt.OutputElement;
import be.ac.vub.simplegt.SimplegtPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.ac.vub.simplegt.impl.OutputElementImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.impl.OutputElementImpl#getPattern <em>Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputElementImpl extends RuleElementImpl implements OutputElement {
	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputBinding> bindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplegtPackage.Literals.OUTPUT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPattern getPattern() {
		if (eContainerFeatureID() != SimplegtPackage.OUTPUT_ELEMENT__PATTERN) return null;
		return (OutPattern)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(OutPattern newPattern, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPattern, SimplegtPackage.OUTPUT_ELEMENT__PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(OutPattern newPattern) {
		if (newPattern != eInternalContainer() || (eContainerFeatureID() != SimplegtPackage.OUTPUT_ELEMENT__PATTERN && newPattern != null)) {
			if (EcoreUtil.isAncestor(this, newPattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPattern != null)
				msgs = ((InternalEObject)newPattern).eInverseAdd(this, SimplegtPackage.OUT_PATTERN__ELEMENTS, OutPattern.class, msgs);
			msgs = basicSetPattern(newPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplegtPackage.OUTPUT_ELEMENT__PATTERN, newPattern, newPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputBinding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentWithInverseEList<OutputBinding>(OutputBinding.class, this, SimplegtPackage.OUTPUT_ELEMENT__BINDINGS, SimplegtPackage.OUTPUT_BINDING__ELEMENT);
		}
		return bindings;
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
			case SimplegtPackage.OUTPUT_ELEMENT__BINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBindings()).basicAdd(otherEnd, msgs);
			case SimplegtPackage.OUTPUT_ELEMENT__PATTERN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPattern((OutPattern)otherEnd, msgs);
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
			case SimplegtPackage.OUTPUT_ELEMENT__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
			case SimplegtPackage.OUTPUT_ELEMENT__PATTERN:
				return basicSetPattern(null, msgs);
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
			case SimplegtPackage.OUTPUT_ELEMENT__PATTERN:
				return eInternalContainer().eInverseRemove(this, SimplegtPackage.OUT_PATTERN__ELEMENTS, OutPattern.class, msgs);
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
			case SimplegtPackage.OUTPUT_ELEMENT__BINDINGS:
				return getBindings();
			case SimplegtPackage.OUTPUT_ELEMENT__PATTERN:
				return getPattern();
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
			case SimplegtPackage.OUTPUT_ELEMENT__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends OutputBinding>)newValue);
				return;
			case SimplegtPackage.OUTPUT_ELEMENT__PATTERN:
				setPattern((OutPattern)newValue);
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
			case SimplegtPackage.OUTPUT_ELEMENT__BINDINGS:
				getBindings().clear();
				return;
			case SimplegtPackage.OUTPUT_ELEMENT__PATTERN:
				setPattern((OutPattern)null);
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
			case SimplegtPackage.OUTPUT_ELEMENT__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case SimplegtPackage.OUTPUT_ELEMENT__PATTERN:
				return getPattern() != null;
		}
		return super.eIsSet(featureID);
	}

} //OutputElementImpl
