/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package be.ac.vub.simplegt.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import be.ac.vub.simplegt.InstanceModel;
import be.ac.vub.simplegt.RuleElement;
import be.ac.vub.simplegt.SimplegtPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.ac.vub.simplegt.impl.RuleElementImpl#getInModel <em>In Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RuleElementImpl extends TypedElementImpl implements RuleElement {
	/**
	 * The cached value of the '{@link #getInModel() <em>In Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInModel()
	 * @generated
	 * @ordered
	 */
	protected InstanceModel inModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplegtPackage.Literals.RULE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceModel getInModel() {
		if (inModel != null && inModel.eIsProxy()) {
			InternalEObject oldInModel = (InternalEObject)inModel;
			inModel = (InstanceModel)eResolveProxy(oldInModel);
			if (inModel != oldInModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplegtPackage.RULE_ELEMENT__IN_MODEL, oldInModel, inModel));
			}
		}
		return inModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceModel basicGetInModel() {
		return inModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInModel(InstanceModel newInModel) {
		InstanceModel oldInModel = inModel;
		inModel = newInModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplegtPackage.RULE_ELEMENT__IN_MODEL, oldInModel, inModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplegtPackage.RULE_ELEMENT__IN_MODEL:
				if (resolve) return getInModel();
				return basicGetInModel();
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
			case SimplegtPackage.RULE_ELEMENT__IN_MODEL:
				setInModel((InstanceModel)newValue);
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
			case SimplegtPackage.RULE_ELEMENT__IN_MODEL:
				setInModel((InstanceModel)null);
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
			case SimplegtPackage.RULE_ELEMENT__IN_MODEL:
				return inModel != null;
		}
		return super.eIsSet(featureID);
	}

} //RuleElementImpl
