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

import be.ac.vub.simplegt.RuleElement;
import be.ac.vub.simplegt.SimplegtPackage;
import be.ac.vub.simpleocl.OclInstanceModel;
import be.ac.vub.simpleocl.impl.VariableDeclarationImpl;

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
public abstract class RuleElementImpl extends VariableDeclarationImpl implements RuleElement {
	/**
	 * The cached value of the '{@link #getInModel() <em>In Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInModel()
	 * @generated
	 * @ordered
	 */
	protected OclInstanceModel inModel;

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
	public OclInstanceModel getInModel() {
		if (inModel != null && inModel.eIsProxy()) {
			InternalEObject oldInModel = (InternalEObject)inModel;
			inModel = (OclInstanceModel)eResolveProxy(oldInModel);
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
	public OclInstanceModel basicGetInModel() {
		return inModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInModel(OclInstanceModel newInModel) {
		OclInstanceModel oldInModel = inModel;
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
				setInModel((OclInstanceModel)newValue);
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
				setInModel((OclInstanceModel)null);
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
