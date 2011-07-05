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

import be.ac.vub.simplegt.Metamodel;
import be.ac.vub.simplegt.SimplegtPackage;
import be.ac.vub.simplegt.Type;
import be.ac.vub.simplegt.TypedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.ac.vub.simplegt.impl.TypeImpl#getTypeOf <em>Type Of</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.impl.TypeImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeImpl extends NamedElementImpl implements Type {
	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Metamodel model;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplegtPackage.Literals.TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedElement getTypeOf() {
		if (eContainerFeatureID() != SimplegtPackage.TYPE__TYPE_OF) return null;
		return (TypedElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeOf(TypedElement newTypeOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTypeOf, SimplegtPackage.TYPE__TYPE_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeOf(TypedElement newTypeOf) {
		if (newTypeOf != eInternalContainer() || (eContainerFeatureID() != SimplegtPackage.TYPE__TYPE_OF && newTypeOf != null)) {
			if (EcoreUtil.isAncestor(this, newTypeOf))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTypeOf != null)
				msgs = ((InternalEObject)newTypeOf).eInverseAdd(this, SimplegtPackage.TYPED_ELEMENT__TYPE, TypedElement.class, msgs);
			msgs = basicSetTypeOf(newTypeOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplegtPackage.TYPE__TYPE_OF, newTypeOf, newTypeOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (Metamodel)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplegtPackage.TYPE__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Metamodel newModel) {
		Metamodel oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplegtPackage.TYPE__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplegtPackage.TYPE__TYPE_OF:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTypeOf((TypedElement)otherEnd, msgs);
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
			case SimplegtPackage.TYPE__TYPE_OF:
				return basicSetTypeOf(null, msgs);
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
			case SimplegtPackage.TYPE__TYPE_OF:
				return eInternalContainer().eInverseRemove(this, SimplegtPackage.TYPED_ELEMENT__TYPE, TypedElement.class, msgs);
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
			case SimplegtPackage.TYPE__TYPE_OF:
				return getTypeOf();
			case SimplegtPackage.TYPE__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
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
			case SimplegtPackage.TYPE__TYPE_OF:
				setTypeOf((TypedElement)newValue);
				return;
			case SimplegtPackage.TYPE__MODEL:
				setModel((Metamodel)newValue);
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
			case SimplegtPackage.TYPE__TYPE_OF:
				setTypeOf((TypedElement)null);
				return;
			case SimplegtPackage.TYPE__MODEL:
				setModel((Metamodel)null);
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
			case SimplegtPackage.TYPE__TYPE_OF:
				return getTypeOf() != null;
			case SimplegtPackage.TYPE__MODEL:
				return model != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeImpl
