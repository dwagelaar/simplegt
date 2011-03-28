/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package be.ac.vub.simplegt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see be.ac.vub.simplegt.SimplegtFactory
 * @model kind="package"
 * @generated
 */
public interface SimplegtPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simplegt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://soft.vub.ac.be/simplegt/2011/SimpleGT";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simplegt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplegtPackage eINSTANCE = be.ac.vub.simplegt.impl.SimplegtPackageImpl.init();

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.NamedElementImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.TypeImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TYPE_OF = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__MODEL = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.TypedElementImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.ModuleImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MODELS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__RULES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IMPORTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.RuleImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__MODULE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ABSTRACT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__INPUT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nac</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAC = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__OUTPUT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__EXTENDS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.InPatternImpl <em>In Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.InPatternImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getInPattern()
	 * @generated
	 */
	int IN_PATTERN = 5;

	/**
	 * The feature id for the '<em><b>Input For</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN__INPUT_FOR = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN__ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>In Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.NacPatternImpl <em>Nac Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.NacPatternImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getNacPattern()
	 * @generated
	 */
	int NAC_PATTERN = 6;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAC_PATTERN__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Nac For</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAC_PATTERN__NAC_FOR = 1;

	/**
	 * The number of structural features of the '<em>Nac Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAC_PATTERN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.OutPatternImpl <em>Out Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.OutPatternImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getOutPattern()
	 * @generated
	 */
	int OUT_PATTERN = 7;

	/**
	 * The feature id for the '<em><b>Output For</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN__OUTPUT_FOR = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN__ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Out Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.RuleElementImpl <em>Rule Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.RuleElementImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getRuleElement()
	 * @generated
	 */
	int RULE_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENT__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENT__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The number of structural features of the '<em>Rule Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENT_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.InputElementImpl <em>Input Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.InputElementImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getInputElement()
	 * @generated
	 */
	int INPUT_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__NAME = RULE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__TYPE = RULE_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>In Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__IN_PATTERN = RULE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__BINDING = RULE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nac Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__NAC_PATTERN = RULE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Input Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT_FEATURE_COUNT = RULE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.OutputElementImpl <em>Output Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.OutputElementImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getOutputElement()
	 * @generated
	 */
	int OUTPUT_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ELEMENT__NAME = RULE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ELEMENT__TYPE = RULE_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ELEMENT__PATTERN = RULE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ELEMENT__BINDINGS = RULE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Output Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ELEMENT_FEATURE_COUNT = RULE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.BindingImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 11;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.InputBindingImpl <em>Input Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.InputBindingImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getInputBinding()
	 * @generated
	 */
	int INPUT_BINDING = 12;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDING__FEATURE = BINDING__FEATURE;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDING__ELEMENT = BINDING__ELEMENT;

	/**
	 * The feature id for the '<em><b>Binding For</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDING__BINDING_FOR = BINDING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDING_FEATURE_COUNT = BINDING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.OutputBindingImpl <em>Output Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.OutputBindingImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getOutputBinding()
	 * @generated
	 */
	int OUTPUT_BINDING = 13;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDING__FEATURE = BINDING__FEATURE;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDING__ELEMENT = BINDING__ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDING__TARGET_FEATURE = BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding For</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDING__BINDING_FOR = BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Output Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDING_FEATURE_COUNT = BINDING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.ModelImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.MetamodelImpl <em>Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.MetamodelImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getMetamodel()
	 * @generated
	 */
	int METAMODEL = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__NAME = MODEL__NAME;

	/**
	 * The number of structural features of the '<em>Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_FEATURE_COUNT = MODEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.InstanceModelImpl <em>Instance Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.InstanceModelImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getInstanceModel()
	 * @generated
	 */
	int INSTANCE_MODEL = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL__NAME = MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Meta Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL__META_MODEL = MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL__MODULE = MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL_FEATURE_COUNT = MODEL_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see be.ac.vub.simplegt.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link be.ac.vub.simplegt.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see be.ac.vub.simplegt.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see be.ac.vub.simplegt.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the container reference '{@link be.ac.vub.simplegt.Type#getTypeOf <em>Type Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Type Of</em>'.
	 * @see be.ac.vub.simplegt.Type#getTypeOf()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_TypeOf();

	/**
	 * Returns the meta object for the reference '{@link be.ac.vub.simplegt.Type#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see be.ac.vub.simplegt.Type#getModel()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Model();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see be.ac.vub.simplegt.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for the containment reference '{@link be.ac.vub.simplegt.TypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see be.ac.vub.simplegt.TypedElement#getType()
	 * @see #getTypedElement()
	 * @generated
	 */
	EReference getTypedElement_Type();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see be.ac.vub.simplegt.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference list '{@link be.ac.vub.simplegt.Module#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Models</em>'.
	 * @see be.ac.vub.simplegt.Module#getModels()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Models();

	/**
	 * Returns the meta object for the containment reference list '{@link be.ac.vub.simplegt.Module#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see be.ac.vub.simplegt.Module#getRules()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Rules();

	/**
	 * Returns the meta object for the attribute list '{@link be.ac.vub.simplegt.Module#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Imports</em>'.
	 * @see be.ac.vub.simplegt.Module#getImports()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Imports();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see be.ac.vub.simplegt.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the container reference '{@link be.ac.vub.simplegt.Rule#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see be.ac.vub.simplegt.Rule#getModule()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Module();

	/**
	 * Returns the meta object for the attribute '{@link be.ac.vub.simplegt.Rule#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see be.ac.vub.simplegt.Rule#isAbstract()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Abstract();

	/**
	 * Returns the meta object for the containment reference '{@link be.ac.vub.simplegt.Rule#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see be.ac.vub.simplegt.Rule#getInput()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link be.ac.vub.simplegt.Rule#getNac <em>Nac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nac</em>'.
	 * @see be.ac.vub.simplegt.Rule#getNac()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Nac();

	/**
	 * Returns the meta object for the containment reference '{@link be.ac.vub.simplegt.Rule#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see be.ac.vub.simplegt.Rule#getOutput()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Output();

	/**
	 * Returns the meta object for the attribute list '{@link be.ac.vub.simplegt.Rule#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Extends</em>'.
	 * @see be.ac.vub.simplegt.Rule#getExtends()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Extends();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.InPattern <em>In Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Pattern</em>'.
	 * @see be.ac.vub.simplegt.InPattern
	 * @generated
	 */
	EClass getInPattern();

	/**
	 * Returns the meta object for the container reference '{@link be.ac.vub.simplegt.InPattern#getInputFor <em>Input For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Input For</em>'.
	 * @see be.ac.vub.simplegt.InPattern#getInputFor()
	 * @see #getInPattern()
	 * @generated
	 */
	EReference getInPattern_InputFor();

	/**
	 * Returns the meta object for the containment reference list '{@link be.ac.vub.simplegt.InPattern#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see be.ac.vub.simplegt.InPattern#getElements()
	 * @see #getInPattern()
	 * @generated
	 */
	EReference getInPattern_Elements();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.NacPattern <em>Nac Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nac Pattern</em>'.
	 * @see be.ac.vub.simplegt.NacPattern
	 * @generated
	 */
	EClass getNacPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link be.ac.vub.simplegt.NacPattern#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see be.ac.vub.simplegt.NacPattern#getElements()
	 * @see #getNacPattern()
	 * @generated
	 */
	EReference getNacPattern_Elements();

	/**
	 * Returns the meta object for the container reference '{@link be.ac.vub.simplegt.NacPattern#getNacFor <em>Nac For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Nac For</em>'.
	 * @see be.ac.vub.simplegt.NacPattern#getNacFor()
	 * @see #getNacPattern()
	 * @generated
	 */
	EReference getNacPattern_NacFor();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.OutPattern <em>Out Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Pattern</em>'.
	 * @see be.ac.vub.simplegt.OutPattern
	 * @generated
	 */
	EClass getOutPattern();

	/**
	 * Returns the meta object for the container reference '{@link be.ac.vub.simplegt.OutPattern#getOutputFor <em>Output For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Output For</em>'.
	 * @see be.ac.vub.simplegt.OutPattern#getOutputFor()
	 * @see #getOutPattern()
	 * @generated
	 */
	EReference getOutPattern_OutputFor();

	/**
	 * Returns the meta object for the containment reference list '{@link be.ac.vub.simplegt.OutPattern#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see be.ac.vub.simplegt.OutPattern#getElements()
	 * @see #getOutPattern()
	 * @generated
	 */
	EReference getOutPattern_Elements();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.RuleElement <em>Rule Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Element</em>'.
	 * @see be.ac.vub.simplegt.RuleElement
	 * @generated
	 */
	EClass getRuleElement();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.InputElement <em>Input Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Element</em>'.
	 * @see be.ac.vub.simplegt.InputElement
	 * @generated
	 */
	EClass getInputElement();

	/**
	 * Returns the meta object for the container reference '{@link be.ac.vub.simplegt.InputElement#getInPattern <em>In Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Pattern</em>'.
	 * @see be.ac.vub.simplegt.InputElement#getInPattern()
	 * @see #getInputElement()
	 * @generated
	 */
	EReference getInputElement_InPattern();

	/**
	 * Returns the meta object for the containment reference '{@link be.ac.vub.simplegt.InputElement#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding</em>'.
	 * @see be.ac.vub.simplegt.InputElement#getBinding()
	 * @see #getInputElement()
	 * @generated
	 */
	EReference getInputElement_Binding();

	/**
	 * Returns the meta object for the container reference '{@link be.ac.vub.simplegt.InputElement#getNacPattern <em>Nac Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Nac Pattern</em>'.
	 * @see be.ac.vub.simplegt.InputElement#getNacPattern()
	 * @see #getInputElement()
	 * @generated
	 */
	EReference getInputElement_NacPattern();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.OutputElement <em>Output Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Element</em>'.
	 * @see be.ac.vub.simplegt.OutputElement
	 * @generated
	 */
	EClass getOutputElement();

	/**
	 * Returns the meta object for the container reference '{@link be.ac.vub.simplegt.OutputElement#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pattern</em>'.
	 * @see be.ac.vub.simplegt.OutputElement#getPattern()
	 * @see #getOutputElement()
	 * @generated
	 */
	EReference getOutputElement_Pattern();

	/**
	 * Returns the meta object for the containment reference list '{@link be.ac.vub.simplegt.OutputElement#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see be.ac.vub.simplegt.OutputElement#getBindings()
	 * @see #getOutputElement()
	 * @generated
	 */
	EReference getOutputElement_Bindings();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see be.ac.vub.simplegt.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the attribute '{@link be.ac.vub.simplegt.Binding#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see be.ac.vub.simplegt.Binding#getFeature()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Feature();

	/**
	 * Returns the meta object for the reference '{@link be.ac.vub.simplegt.Binding#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see be.ac.vub.simplegt.Binding#getElement()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Element();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.InputBinding <em>Input Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Binding</em>'.
	 * @see be.ac.vub.simplegt.InputBinding
	 * @generated
	 */
	EClass getInputBinding();

	/**
	 * Returns the meta object for the container reference '{@link be.ac.vub.simplegt.InputBinding#getBindingFor <em>Binding For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Binding For</em>'.
	 * @see be.ac.vub.simplegt.InputBinding#getBindingFor()
	 * @see #getInputBinding()
	 * @generated
	 */
	EReference getInputBinding_BindingFor();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.OutputBinding <em>Output Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Binding</em>'.
	 * @see be.ac.vub.simplegt.OutputBinding
	 * @generated
	 */
	EClass getOutputBinding();

	/**
	 * Returns the meta object for the attribute '{@link be.ac.vub.simplegt.OutputBinding#getTargetFeature <em>Target Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Feature</em>'.
	 * @see be.ac.vub.simplegt.OutputBinding#getTargetFeature()
	 * @see #getOutputBinding()
	 * @generated
	 */
	EAttribute getOutputBinding_TargetFeature();

	/**
	 * Returns the meta object for the container reference '{@link be.ac.vub.simplegt.OutputBinding#getBindingFor <em>Binding For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Binding For</em>'.
	 * @see be.ac.vub.simplegt.OutputBinding#getBindingFor()
	 * @see #getOutputBinding()
	 * @generated
	 */
	EReference getOutputBinding_BindingFor();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see be.ac.vub.simplegt.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.Metamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel</em>'.
	 * @see be.ac.vub.simplegt.Metamodel
	 * @generated
	 */
	EClass getMetamodel();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.InstanceModel <em>Instance Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Model</em>'.
	 * @see be.ac.vub.simplegt.InstanceModel
	 * @generated
	 */
	EClass getInstanceModel();

	/**
	 * Returns the meta object for the containment reference '{@link be.ac.vub.simplegt.InstanceModel#getMetaModel <em>Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta Model</em>'.
	 * @see be.ac.vub.simplegt.InstanceModel#getMetaModel()
	 * @see #getInstanceModel()
	 * @generated
	 */
	EReference getInstanceModel_MetaModel();

	/**
	 * Returns the meta object for the container reference '{@link be.ac.vub.simplegt.InstanceModel#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see be.ac.vub.simplegt.InstanceModel#getModule()
	 * @see #getInstanceModel()
	 * @generated
	 */
	EReference getInstanceModel_Module();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimplegtFactory getSimplegtFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.NamedElementImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.TypeImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Type Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__TYPE_OF = eINSTANCE.getType_TypeOf();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__MODEL = eINSTANCE.getType_Model();

		/**
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.TypedElementImpl <em>Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.TypedElementImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

		/**
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.ModuleImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__MODELS = eINSTANCE.getModule_Models();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__RULES = eINSTANCE.getModule_Rules();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__IMPORTS = eINSTANCE.getModule_Imports();

		/**
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.RuleImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__MODULE = eINSTANCE.getRule_Module();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__ABSTRACT = eINSTANCE.getRule_Abstract();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__INPUT = eINSTANCE.getRule_Input();

		/**
		 * The meta object literal for the '<em><b>Nac</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__NAC = eINSTANCE.getRule_Nac();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__OUTPUT = eINSTANCE.getRule_Output();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__EXTENDS = eINSTANCE.getRule_Extends();

		/**
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.InPatternImpl <em>In Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.InPatternImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getInPattern()
		 * @generated
		 */
		EClass IN_PATTERN = eINSTANCE.getInPattern();

		/**
		 * The meta object literal for the '<em><b>Input For</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_PATTERN__INPUT_FOR = eINSTANCE.getInPattern_InputFor();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_PATTERN__ELEMENTS = eINSTANCE.getInPattern_Elements();

		/**
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.NacPatternImpl <em>Nac Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.NacPatternImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getNacPattern()
		 * @generated
		 */
		EClass NAC_PATTERN = eINSTANCE.getNacPattern();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAC_PATTERN__ELEMENTS = eINSTANCE.getNacPattern_Elements();

		/**
		 * The meta object literal for the '<em><b>Nac For</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAC_PATTERN__NAC_FOR = eINSTANCE.getNacPattern_NacFor();

		/**
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.OutPatternImpl <em>Out Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.OutPatternImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getOutPattern()
		 * @generated
		 */
		EClass OUT_PATTERN = eINSTANCE.getOutPattern();

		/**
		 * The meta object literal for the '<em><b>Output For</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_PATTERN__OUTPUT_FOR = eINSTANCE.getOutPattern_OutputFor();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_PATTERN__ELEMENTS = eINSTANCE.getOutPattern_Elements();

		/**
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.RuleElementImpl <em>Rule Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.RuleElementImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getRuleElement()
		 * @generated
		 */
		EClass RULE_ELEMENT = eINSTANCE.getRuleElement();

		/**
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.InputElementImpl <em>Input Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.InputElementImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getInputElement()
		 * @generated
		 */
		EClass INPUT_ELEMENT = eINSTANCE.getInputElement();

		/**
		 * The meta object literal for the '<em><b>In Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_ELEMENT__IN_PATTERN = eINSTANCE.getInputElement_InPattern();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_ELEMENT__BINDING = eINSTANCE.getInputElement_Binding();

		/**
		 * The meta object literal for the '<em><b>Nac Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_ELEMENT__NAC_PATTERN = eINSTANCE.getInputElement_NacPattern();

		/**
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.OutputElementImpl <em>Output Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.OutputElementImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getOutputElement()
		 * @generated
		 */
		EClass OUTPUT_ELEMENT = eINSTANCE.getOutputElement();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_ELEMENT__PATTERN = eINSTANCE.getOutputElement_Pattern();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_ELEMENT__BINDINGS = eINSTANCE.getOutputElement_Bindings();

		/**
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.BindingImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__FEATURE = eINSTANCE.getBinding_Feature();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__ELEMENT = eINSTANCE.getBinding_Element();

		/**
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.InputBindingImpl <em>Input Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.InputBindingImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getInputBinding()
		 * @generated
		 */
		EClass INPUT_BINDING = eINSTANCE.getInputBinding();

		/**
		 * The meta object literal for the '<em><b>Binding For</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_BINDING__BINDING_FOR = eINSTANCE.getInputBinding_BindingFor();

		/**
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.OutputBindingImpl <em>Output Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.OutputBindingImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getOutputBinding()
		 * @generated
		 */
		EClass OUTPUT_BINDING = eINSTANCE.getOutputBinding();

		/**
		 * The meta object literal for the '<em><b>Target Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_BINDING__TARGET_FEATURE = eINSTANCE.getOutputBinding_TargetFeature();

		/**
		 * The meta object literal for the '<em><b>Binding For</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_BINDING__BINDING_FOR = eINSTANCE.getOutputBinding_BindingFor();

		/**
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.ModelImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.MetamodelImpl <em>Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.MetamodelImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getMetamodel()
		 * @generated
		 */
		EClass METAMODEL = eINSTANCE.getMetamodel();

		/**
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.InstanceModelImpl <em>Instance Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.InstanceModelImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getInstanceModel()
		 * @generated
		 */
		EClass INSTANCE_MODEL = eINSTANCE.getInstanceModel();

		/**
		 * The meta object literal for the '<em><b>Meta Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_MODEL__META_MODEL = eINSTANCE.getInstanceModel_MetaModel();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_MODEL__MODULE = eINSTANCE.getInstanceModel_Module();

	}

} //SimplegtPackage
