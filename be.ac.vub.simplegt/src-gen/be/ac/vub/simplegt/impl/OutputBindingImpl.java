/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package be.ac.vub.simplegt.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import be.ac.vub.simplegt.OutputBinding;
import be.ac.vub.simplegt.OutputElement;
import be.ac.vub.simplegt.RuleElement;
import be.ac.vub.simplegt.SimplegtPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.ac.vub.simplegt.impl.OutputBindingImpl#getElement <em>Element</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.impl.OutputBindingImpl#getBeforeElement <em>Before Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputBindingImpl extends BindingImpl implements OutputBinding {
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
	protected OutputBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplegtPackage.Literals.OUTPUT_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputElement getElement() {
		if (eContainerFeatureID() != SimplegtPackage.OUTPUT_BINDING__ELEMENT) return null;
		return (OutputElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(OutputElement newElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newElement, SimplegtPackage.OUTPUT_BINDING__ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(OutputElement newElement) {
		if (newElement != eInternalContainer() || (eContainerFeatureID() != SimplegtPackage.OUTPUT_BINDING__ELEMENT && newElement != null)) {
			if (EcoreUtil.isAncestor(this, newElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, SimplegtPackage.OUTPUT_ELEMENT__BINDINGS, OutputElement.class, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplegtPackage.OUTPUT_BINDING__ELEMENT, newElement, newElement));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplegtPackage.OUTPUT_BINDING__BEFORE_ELEMENT, oldBeforeElement, beforeElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimplegtPackage.OUTPUT_BINDING__BEFORE_ELEMENT, oldBeforeElement, beforeElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplegtPackage.OUTPUT_BINDING__ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetElement((OutputElement)otherEnd, msgs);
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
			case SimplegtPackage.OUTPUT_BINDING__ELEMENT:
				return basicSetElement(null, msgs);
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
			case SimplegtPackage.OUTPUT_BINDING__ELEMENT:
				return eInternalContainer().eInverseRemove(this, SimplegtPackage.OUTPUT_ELEMENT__BINDINGS, OutputElement.class, msgs);
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
			case SimplegtPackage.OUTPUT_BINDING__ELEMENT:
				return getElement();
			case SimplegtPackage.OUTPUT_BINDING__BEFORE_ELEMENT:
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
			case SimplegtPackage.OUTPUT_BINDING__ELEMENT:
				setElement((OutputElement)newValue);
				return;
			case SimplegtPackage.OUTPUT_BINDING__BEFORE_ELEMENT:
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
			case SimplegtPackage.OUTPUT_BINDING__ELEMENT:
				setElement((OutputElement)null);
				return;
			case SimplegtPackage.OUTPUT_BINDING__BEFORE_ELEMENT:
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
			case SimplegtPackage.OUTPUT_BINDING__ELEMENT:
				return getElement() != null;
			case SimplegtPackage.OUTPUT_BINDING__BEFORE_ELEMENT:
				return beforeElement != null;
		}
		return super.eIsSet(featureID);
	}

} //OutputBindingImpl
