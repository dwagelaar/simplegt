/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package org.eclipselabs.simplegt.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipselabs.simplegt.Module;
import org.eclipselabs.simplegt.SimplegtPackage;
import org.eclipselabs.simpleocl.OclInstanceModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.simplegt.impl.ModuleImpl#getModels <em>Models</em>}</li>
 *   <li>{@link org.eclipselabs.simplegt.impl.ModuleImpl#isDebug <em>Debug</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends org.eclipselabs.simpleocl.impl.ModuleImpl implements Module {
	/**
   * The cached value of the '{@link #getModels() <em>Models</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getModels()
   * @generated
   * @ordered
   */
	protected EList<OclInstanceModel> models;

	/**
   * The default value of the '{@link #isDebug() <em>Debug</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isDebug()
   * @generated
   * @ordered
   */
	protected static final boolean DEBUG_EDEFAULT = false;

	/**
   * The cached value of the '{@link #isDebug() <em>Debug</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isDebug()
   * @generated
   * @ordered
   */
	protected boolean debug = DEBUG_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ModuleImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SimplegtPackage.Literals.MODULE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<OclInstanceModel> getModels() {
    if (models == null)
    {
      models = new EObjectContainmentEList<OclInstanceModel>(OclInstanceModel.class, this, SimplegtPackage.MODULE__MODELS);
    }
    return models;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isDebug() {
    return debug;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDebug(boolean newDebug) {
    boolean oldDebug = debug;
    debug = newDebug;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimplegtPackage.MODULE__DEBUG, oldDebug, debug));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID)
    {
      case SimplegtPackage.MODULE__MODELS:
        return ((InternalEList<?>)getModels()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID)
    {
      case SimplegtPackage.MODULE__MODELS:
        return getModels();
      case SimplegtPackage.MODULE__DEBUG:
        return isDebug();
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
    switch (featureID)
    {
      case SimplegtPackage.MODULE__MODELS:
        getModels().clear();
        getModels().addAll((Collection<? extends OclInstanceModel>)newValue);
        return;
      case SimplegtPackage.MODULE__DEBUG:
        setDebug((Boolean)newValue);
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
    switch (featureID)
    {
      case SimplegtPackage.MODULE__MODELS:
        getModels().clear();
        return;
      case SimplegtPackage.MODULE__DEBUG:
        setDebug(DEBUG_EDEFAULT);
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
    switch (featureID)
    {
      case SimplegtPackage.MODULE__MODELS:
        return models != null && !models.isEmpty();
      case SimplegtPackage.MODULE__DEBUG:
        return debug != DEBUG_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (debug: ");
    result.append(debug);
    result.append(')');
    return result.toString();
  }

} //ModuleImpl
