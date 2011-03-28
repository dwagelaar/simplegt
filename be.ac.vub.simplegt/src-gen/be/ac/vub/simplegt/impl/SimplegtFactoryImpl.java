/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package be.ac.vub.simplegt.impl;

import be.ac.vub.simplegt.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplegtFactoryImpl extends EFactoryImpl implements SimplegtFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimplegtFactory init() {
		try {
			SimplegtFactory theSimplegtFactory = (SimplegtFactory)EPackage.Registry.INSTANCE.getEFactory("http://soft.vub.ac.be/simplegt/2011/SimpleGT"); 
			if (theSimplegtFactory != null) {
				return theSimplegtFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimplegtFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplegtFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SimplegtPackage.TYPE: return createType();
			case SimplegtPackage.MODULE: return createModule();
			case SimplegtPackage.RULE: return createRule();
			case SimplegtPackage.IN_PATTERN: return createInPattern();
			case SimplegtPackage.NAC_PATTERN: return createNacPattern();
			case SimplegtPackage.OUT_PATTERN: return createOutPattern();
			case SimplegtPackage.INPUT_ELEMENT: return createInputElement();
			case SimplegtPackage.OUTPUT_ELEMENT: return createOutputElement();
			case SimplegtPackage.INPUT_BINDING: return createInputBinding();
			case SimplegtPackage.OUTPUT_BINDING: return createOutputBinding();
			case SimplegtPackage.METAMODEL: return createMetamodel();
			case SimplegtPackage.INSTANCE_MODEL: return createInstanceModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPattern createInPattern() {
		InPatternImpl inPattern = new InPatternImpl();
		return inPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NacPattern createNacPattern() {
		NacPatternImpl nacPattern = new NacPatternImpl();
		return nacPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPattern createOutPattern() {
		OutPatternImpl outPattern = new OutPatternImpl();
		return outPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputElement createInputElement() {
		InputElementImpl inputElement = new InputElementImpl();
		return inputElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputElement createOutputElement() {
		OutputElementImpl outputElement = new OutputElementImpl();
		return outputElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputBinding createInputBinding() {
		InputBindingImpl inputBinding = new InputBindingImpl();
		return inputBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputBinding createOutputBinding() {
		OutputBindingImpl outputBinding = new OutputBindingImpl();
		return outputBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel createMetamodel() {
		MetamodelImpl metamodel = new MetamodelImpl();
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceModel createInstanceModel() {
		InstanceModelImpl instanceModel = new InstanceModelImpl();
		return instanceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplegtPackage getSimplegtPackage() {
		return (SimplegtPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimplegtPackage getPackage() {
		return SimplegtPackage.eINSTANCE;
	}

} //SimplegtFactoryImpl
