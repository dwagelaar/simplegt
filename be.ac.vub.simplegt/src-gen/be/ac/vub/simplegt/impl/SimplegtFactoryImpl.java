/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package be.ac.vub.simplegt.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import be.ac.vub.simplegt.BooleanLiteralExp;
import be.ac.vub.simplegt.DoubleLiteralExp;
import be.ac.vub.simplegt.ElementExp;
import be.ac.vub.simplegt.EnumLiteralExp;
import be.ac.vub.simplegt.InPattern;
import be.ac.vub.simplegt.InputBinding;
import be.ac.vub.simplegt.InputElement;
import be.ac.vub.simplegt.InstanceModel;
import be.ac.vub.simplegt.IntegerLiteralExp;
import be.ac.vub.simplegt.Metamodel;
import be.ac.vub.simplegt.Module;
import be.ac.vub.simplegt.NacPattern;
import be.ac.vub.simplegt.OutPattern;
import be.ac.vub.simplegt.OutputBinding;
import be.ac.vub.simplegt.OutputElement;
import be.ac.vub.simplegt.Rule;
import be.ac.vub.simplegt.SimplegtFactory;
import be.ac.vub.simplegt.SimplegtPackage;
import be.ac.vub.simplegt.StringLiteralExp;
import be.ac.vub.simplegt.Type;

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
			case SimplegtPackage.ELEMENT_EXP: return createElementExp();
			case SimplegtPackage.STRING_LITERAL_EXP: return createStringLiteralExp();
			case SimplegtPackage.INTEGER_LITERAL_EXP: return createIntegerLiteralExp();
			case SimplegtPackage.DOUBLE_LITERAL_EXP: return createDoubleLiteralExp();
			case SimplegtPackage.BOOLEAN_LITERAL_EXP: return createBooleanLiteralExp();
			case SimplegtPackage.ENUM_LITERAL_EXP: return createEnumLiteralExp();
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
	public ElementExp createElementExp() {
		ElementExpImpl elementExp = new ElementExpImpl();
		return elementExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLiteralExp createStringLiteralExp() {
		StringLiteralExpImpl stringLiteralExp = new StringLiteralExpImpl();
		return stringLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerLiteralExp createIntegerLiteralExp() {
		IntegerLiteralExpImpl integerLiteralExp = new IntegerLiteralExpImpl();
		return integerLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleLiteralExp createDoubleLiteralExp() {
		DoubleLiteralExpImpl doubleLiteralExp = new DoubleLiteralExpImpl();
		return doubleLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLiteralExp createBooleanLiteralExp() {
		BooleanLiteralExpImpl booleanLiteralExp = new BooleanLiteralExpImpl();
		return booleanLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteralExp createEnumLiteralExp() {
		EnumLiteralExpImpl enumLiteralExp = new EnumLiteralExpImpl();
		return enumLiteralExp;
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
