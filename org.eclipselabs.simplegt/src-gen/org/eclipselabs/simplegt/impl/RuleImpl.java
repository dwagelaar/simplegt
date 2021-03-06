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
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipselabs.simplegt.InPattern;
import org.eclipselabs.simplegt.NacPattern;
import org.eclipselabs.simplegt.OutPattern;
import org.eclipselabs.simplegt.Rule;
import org.eclipselabs.simplegt.SimplegtPackage;
import org.eclipselabs.simpleocl.Module;
import org.eclipselabs.simpleocl.ModuleElement;
import org.eclipselabs.simpleocl.SimpleoclPackage;
import org.eclipselabs.simpleocl.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.simplegt.impl.RuleImpl#getModule <em>Module</em>}</li>
 *   <li>{@link org.eclipselabs.simplegt.impl.RuleImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.eclipselabs.simplegt.impl.RuleImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.eclipselabs.simplegt.impl.RuleImpl#getNac <em>Nac</em>}</li>
 *   <li>{@link org.eclipselabs.simplegt.impl.RuleImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.eclipselabs.simplegt.impl.RuleImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eclipselabs.simplegt.impl.RuleImpl#isDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipselabs.simplegt.impl.RuleImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.eclipselabs.simplegt.impl.RuleImpl#isLazy <em>Lazy</em>}</li>
 *   <li>{@link org.eclipselabs.simplegt.impl.RuleImpl#isSingle <em>Single</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends NamedElementImpl implements Rule {
	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected InPattern input;

	/**
	 * The cached value of the '{@link #getNac() <em>Nac</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNac()
	 * @generated
	 * @ordered
	 */
	protected EList<NacPattern> nac;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected OutPattern output;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<String> extends_;

	/**
	 * The default value of the '{@link #isDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean default_ = DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean unique = UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isLazy() <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLazy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LAZY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLazy() <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLazy()
	 * @generated
	 * @ordered
	 */
	protected boolean lazy = LAZY_EDEFAULT;

	/**
	 * The default value of the '{@link #isSingle() <em>Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SINGLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSingle() <em>Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingle()
	 * @generated
	 * @ordered
	 */
	protected boolean single = SINGLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplegtPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getModule() {
		if (eContainerFeatureID() != SimplegtPackage.RULE__MODULE) return null;
		return (Module)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(Module newModule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModule, SimplegtPackage.RULE__MODULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(Module newModule) {
		if (newModule != eInternalContainer() || (eContainerFeatureID() != SimplegtPackage.RULE__MODULE && newModule != null)) {
			if (EcoreUtil.isAncestor(this, newModule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModule != null)
				msgs = ((InternalEObject)newModule).eInverseAdd(this, SimpleoclPackage.MODULE__ELEMENTS, Module.class, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplegtPackage.RULE__MODULE, newModule, newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplegtPackage.RULE__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPattern getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput(InPattern newInput, NotificationChain msgs) {
		InPattern oldInput = input;
		input = newInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimplegtPackage.RULE__INPUT, oldInput, newInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(InPattern newInput) {
		if (newInput != input) {
			NotificationChain msgs = null;
			if (input != null)
				msgs = ((InternalEObject)input).eInverseRemove(this, SimplegtPackage.IN_PATTERN__INPUT_FOR, InPattern.class, msgs);
			if (newInput != null)
				msgs = ((InternalEObject)newInput).eInverseAdd(this, SimplegtPackage.IN_PATTERN__INPUT_FOR, InPattern.class, msgs);
			msgs = basicSetInput(newInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplegtPackage.RULE__INPUT, newInput, newInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NacPattern> getNac() {
		if (nac == null) {
			nac = new EObjectContainmentWithInverseEList<NacPattern>(NacPattern.class, this, SimplegtPackage.RULE__NAC, SimplegtPackage.NAC_PATTERN__NAC_FOR);
		}
		return nac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPattern getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(OutPattern newOutput, NotificationChain msgs) {
		OutPattern oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimplegtPackage.RULE__OUTPUT, oldOutput, newOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(OutPattern newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject)output).eInverseRemove(this, SimplegtPackage.OUT_PATTERN__OUTPUT_FOR, OutPattern.class, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject)newOutput).eInverseAdd(this, SimplegtPackage.OUT_PATTERN__OUTPUT_FOR, OutPattern.class, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplegtPackage.RULE__OUTPUT, newOutput, newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExtends() {
		if (extends_ == null) {
			extends_ = new EDataTypeUniqueEList<String>(String.class, this, SimplegtPackage.RULE__EXTENDS);
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(boolean newDefault) {
		boolean oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplegtPackage.RULE__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnique(boolean newUnique) {
		boolean oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplegtPackage.RULE__UNIQUE, oldUnique, unique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLazy() {
		return lazy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLazy(boolean newLazy) {
		boolean oldLazy = lazy;
		lazy = newLazy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplegtPackage.RULE__LAZY, oldLazy, lazy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSingle() {
		return single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingle(boolean newSingle) {
		boolean oldSingle = single;
		single = newSingle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplegtPackage.RULE__SINGLE, oldSingle, single));
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
			case SimplegtPackage.RULE__MODULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModule((Module)otherEnd, msgs);
			case SimplegtPackage.RULE__INPUT:
				if (input != null)
					msgs = ((InternalEObject)input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimplegtPackage.RULE__INPUT, null, msgs);
				return basicSetInput((InPattern)otherEnd, msgs);
			case SimplegtPackage.RULE__NAC:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNac()).basicAdd(otherEnd, msgs);
			case SimplegtPackage.RULE__OUTPUT:
				if (output != null)
					msgs = ((InternalEObject)output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimplegtPackage.RULE__OUTPUT, null, msgs);
				return basicSetOutput((OutPattern)otherEnd, msgs);
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
			case SimplegtPackage.RULE__MODULE:
				return basicSetModule(null, msgs);
			case SimplegtPackage.RULE__INPUT:
				return basicSetInput(null, msgs);
			case SimplegtPackage.RULE__NAC:
				return ((InternalEList<?>)getNac()).basicRemove(otherEnd, msgs);
			case SimplegtPackage.RULE__OUTPUT:
				return basicSetOutput(null, msgs);
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
			case SimplegtPackage.RULE__MODULE:
				return eInternalContainer().eInverseRemove(this, SimpleoclPackage.MODULE__ELEMENTS, Module.class, msgs);
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
			case SimplegtPackage.RULE__MODULE:
				return getModule();
			case SimplegtPackage.RULE__ABSTRACT:
				return isAbstract();
			case SimplegtPackage.RULE__INPUT:
				return getInput();
			case SimplegtPackage.RULE__NAC:
				return getNac();
			case SimplegtPackage.RULE__OUTPUT:
				return getOutput();
			case SimplegtPackage.RULE__EXTENDS:
				return getExtends();
			case SimplegtPackage.RULE__DEFAULT:
				return isDefault();
			case SimplegtPackage.RULE__UNIQUE:
				return isUnique();
			case SimplegtPackage.RULE__LAZY:
				return isLazy();
			case SimplegtPackage.RULE__SINGLE:
				return isSingle();
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
			case SimplegtPackage.RULE__MODULE:
				setModule((Module)newValue);
				return;
			case SimplegtPackage.RULE__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case SimplegtPackage.RULE__INPUT:
				setInput((InPattern)newValue);
				return;
			case SimplegtPackage.RULE__NAC:
				getNac().clear();
				getNac().addAll((Collection<? extends NacPattern>)newValue);
				return;
			case SimplegtPackage.RULE__OUTPUT:
				setOutput((OutPattern)newValue);
				return;
			case SimplegtPackage.RULE__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends String>)newValue);
				return;
			case SimplegtPackage.RULE__DEFAULT:
				setDefault((Boolean)newValue);
				return;
			case SimplegtPackage.RULE__UNIQUE:
				setUnique((Boolean)newValue);
				return;
			case SimplegtPackage.RULE__LAZY:
				setLazy((Boolean)newValue);
				return;
			case SimplegtPackage.RULE__SINGLE:
				setSingle((Boolean)newValue);
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
			case SimplegtPackage.RULE__MODULE:
				setModule((Module)null);
				return;
			case SimplegtPackage.RULE__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case SimplegtPackage.RULE__INPUT:
				setInput((InPattern)null);
				return;
			case SimplegtPackage.RULE__NAC:
				getNac().clear();
				return;
			case SimplegtPackage.RULE__OUTPUT:
				setOutput((OutPattern)null);
				return;
			case SimplegtPackage.RULE__EXTENDS:
				getExtends().clear();
				return;
			case SimplegtPackage.RULE__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case SimplegtPackage.RULE__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
				return;
			case SimplegtPackage.RULE__LAZY:
				setLazy(LAZY_EDEFAULT);
				return;
			case SimplegtPackage.RULE__SINGLE:
				setSingle(SINGLE_EDEFAULT);
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
			case SimplegtPackage.RULE__MODULE:
				return getModule() != null;
			case SimplegtPackage.RULE__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case SimplegtPackage.RULE__INPUT:
				return input != null;
			case SimplegtPackage.RULE__NAC:
				return nac != null && !nac.isEmpty();
			case SimplegtPackage.RULE__OUTPUT:
				return output != null;
			case SimplegtPackage.RULE__EXTENDS:
				return extends_ != null && !extends_.isEmpty();
			case SimplegtPackage.RULE__DEFAULT:
				return default_ != DEFAULT_EDEFAULT;
			case SimplegtPackage.RULE__UNIQUE:
				return unique != UNIQUE_EDEFAULT;
			case SimplegtPackage.RULE__LAZY:
				return lazy != LAZY_EDEFAULT;
			case SimplegtPackage.RULE__SINGLE:
				return single != SINGLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ModuleElement.class) {
			switch (derivedFeatureID) {
				case SimplegtPackage.RULE__MODULE: return SimpleoclPackage.MODULE_ELEMENT__MODULE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ModuleElement.class) {
			switch (baseFeatureID) {
				case SimpleoclPackage.MODULE_ELEMENT__MODULE: return SimplegtPackage.RULE__MODULE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(", extends: ");
		result.append(extends_);
		result.append(", default: ");
		result.append(default_);
		result.append(", unique: ");
		result.append(unique);
		result.append(", lazy: ");
		result.append(lazy);
		result.append(", single: ");
		result.append(single);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
