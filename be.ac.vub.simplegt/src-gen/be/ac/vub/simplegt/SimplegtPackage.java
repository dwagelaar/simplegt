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
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.LocatedElementImpl <em>Located Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.LocatedElementImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getLocatedElement()
	 * @generated
	 */
	int LOCATED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT__LINE = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT__COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT__CHAR_START = 2;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT__CHAR_END = 3;

	/**
	 * The number of structural features of the '<em>Located Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.NamedElementImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__LINE = LOCATED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__CHAR_START = LOCATED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__CHAR_END = LOCATED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.TypeImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__LINE = NAMED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__COLUMN = NAMED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__CHAR_START = NAMED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__CHAR_END = NAMED_ELEMENT__CHAR_END;

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
	int TYPED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__LINE = NAMED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__COLUMN = NAMED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__CHAR_START = NAMED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__CHAR_END = NAMED_ELEMENT__CHAR_END;

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
	int MODULE = 4;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__LINE = NAMED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__COLUMN = NAMED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CHAR_START = NAMED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CHAR_END = NAMED_ELEMENT__CHAR_END;

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
	int RULE = 5;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__LINE = NAMED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__COLUMN = NAMED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CHAR_START = NAMED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CHAR_END = NAMED_ELEMENT__CHAR_END;

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
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.InputElementPatternImpl <em>Input Element Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.InputElementPatternImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getInputElementPattern()
	 * @generated
	 */
	int INPUT_ELEMENT_PATTERN = 6;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT_PATTERN__LINE = LOCATED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT_PATTERN__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT_PATTERN__CHAR_START = LOCATED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT_PATTERN__CHAR_END = LOCATED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT_PATTERN__ELEMENTS = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Element Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT_PATTERN_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.InPatternImpl <em>In Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.InPatternImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getInPattern()
	 * @generated
	 */
	int IN_PATTERN = 7;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN__LINE = INPUT_ELEMENT_PATTERN__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN__COLUMN = INPUT_ELEMENT_PATTERN__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN__CHAR_START = INPUT_ELEMENT_PATTERN__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN__CHAR_END = INPUT_ELEMENT_PATTERN__CHAR_END;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN__ELEMENTS = INPUT_ELEMENT_PATTERN__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Input For</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN__INPUT_FOR = INPUT_ELEMENT_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>In Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN_FEATURE_COUNT = INPUT_ELEMENT_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.NacPatternImpl <em>Nac Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.NacPatternImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getNacPattern()
	 * @generated
	 */
	int NAC_PATTERN = 8;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAC_PATTERN__LINE = INPUT_ELEMENT_PATTERN__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAC_PATTERN__COLUMN = INPUT_ELEMENT_PATTERN__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAC_PATTERN__CHAR_START = INPUT_ELEMENT_PATTERN__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAC_PATTERN__CHAR_END = INPUT_ELEMENT_PATTERN__CHAR_END;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAC_PATTERN__ELEMENTS = INPUT_ELEMENT_PATTERN__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Nac For</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAC_PATTERN__NAC_FOR = INPUT_ELEMENT_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nac Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAC_PATTERN_FEATURE_COUNT = INPUT_ELEMENT_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.OutPatternImpl <em>Out Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.OutPatternImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getOutPattern()
	 * @generated
	 */
	int OUT_PATTERN = 9;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN__LINE = LOCATED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN__CHAR_START = LOCATED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN__CHAR_END = LOCATED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Output For</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN__OUTPUT_FOR = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN__ELEMENTS = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Out Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.RuleElementImpl <em>Rule Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.RuleElementImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getRuleElement()
	 * @generated
	 */
	int RULE_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENT__LINE = TYPED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENT__COLUMN = TYPED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENT__CHAR_START = TYPED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENT__CHAR_END = TYPED_ELEMENT__CHAR_END;

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
	 * The feature id for the '<em><b>In Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENT__IN_MODEL = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rule Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENT_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.InputElementImpl <em>Input Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.InputElementImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getInputElement()
	 * @generated
	 */
	int INPUT_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__LINE = RULE_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__COLUMN = RULE_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__CHAR_START = RULE_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__CHAR_END = RULE_ELEMENT__CHAR_END;

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
	 * The feature id for the '<em><b>In Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__IN_MODEL = RULE_ELEMENT__IN_MODEL;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__BINDINGS = RULE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__PATTERN = RULE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT_FEATURE_COUNT = RULE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.OutputElementImpl <em>Output Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.OutputElementImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getOutputElement()
	 * @generated
	 */
	int OUTPUT_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ELEMENT__LINE = RULE_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ELEMENT__COLUMN = RULE_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ELEMENT__CHAR_START = RULE_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ELEMENT__CHAR_END = RULE_ELEMENT__CHAR_END;

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
	 * The feature id for the '<em><b>In Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ELEMENT__IN_MODEL = RULE_ELEMENT__IN_MODEL;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ELEMENT__BINDINGS = RULE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ELEMENT__PATTERN = RULE_ELEMENT_FEATURE_COUNT + 1;

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
	int BINDING = 13;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__LINE = LOCATED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__CHAR_START = LOCATED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__CHAR_END = LOCATED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__PROPERTY = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__EXPR = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.InputBindingImpl <em>Input Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.InputBindingImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getInputBinding()
	 * @generated
	 */
	int INPUT_BINDING = 14;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDING__LINE = BINDING__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDING__COLUMN = BINDING__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDING__CHAR_START = BINDING__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDING__CHAR_END = BINDING__CHAR_END;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDING__PROPERTY = BINDING__PROPERTY;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDING__EXPR = BINDING__EXPR;

	/**
	 * The feature id for the '<em><b>Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDING__ELEMENT = BINDING_FEATURE_COUNT + 0;

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
	int OUTPUT_BINDING = 15;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDING__LINE = BINDING__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDING__COLUMN = BINDING__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDING__CHAR_START = BINDING__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDING__CHAR_END = BINDING__CHAR_END;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDING__PROPERTY = BINDING__PROPERTY;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDING__EXPR = BINDING__EXPR;

	/**
	 * The feature id for the '<em><b>Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDING__ELEMENT = BINDING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDING_FEATURE_COUNT = BINDING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.SetBindingImpl <em>Set Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.SetBindingImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getSetBinding()
	 * @generated
	 */
	int SET_BINDING = 16;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BINDING__LINE = OUTPUT_BINDING__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BINDING__COLUMN = OUTPUT_BINDING__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BINDING__CHAR_START = OUTPUT_BINDING__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BINDING__CHAR_END = OUTPUT_BINDING__CHAR_END;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BINDING__PROPERTY = OUTPUT_BINDING__PROPERTY;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BINDING__EXPR = OUTPUT_BINDING__EXPR;

	/**
	 * The feature id for the '<em><b>Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BINDING__ELEMENT = OUTPUT_BINDING__ELEMENT;

	/**
	 * The number of structural features of the '<em>Set Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BINDING_FEATURE_COUNT = OUTPUT_BINDING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.AddBindingImpl <em>Add Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.AddBindingImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getAddBinding()
	 * @generated
	 */
	int ADD_BINDING = 17;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BINDING__LINE = OUTPUT_BINDING__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BINDING__COLUMN = OUTPUT_BINDING__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BINDING__CHAR_START = OUTPUT_BINDING__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BINDING__CHAR_END = OUTPUT_BINDING__CHAR_END;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BINDING__PROPERTY = OUTPUT_BINDING__PROPERTY;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BINDING__EXPR = OUTPUT_BINDING__EXPR;

	/**
	 * The feature id for the '<em><b>Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BINDING__ELEMENT = OUTPUT_BINDING__ELEMENT;

	/**
	 * The feature id for the '<em><b>Before Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BINDING__BEFORE_ELEMENT = OUTPUT_BINDING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BINDING_FEATURE_COUNT = OUTPUT_BINDING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.DelBindingImpl <em>Del Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.DelBindingImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getDelBinding()
	 * @generated
	 */
	int DEL_BINDING = 18;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_BINDING__LINE = OUTPUT_BINDING__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_BINDING__COLUMN = OUTPUT_BINDING__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_BINDING__CHAR_START = OUTPUT_BINDING__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_BINDING__CHAR_END = OUTPUT_BINDING__CHAR_END;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_BINDING__PROPERTY = OUTPUT_BINDING__PROPERTY;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_BINDING__EXPR = OUTPUT_BINDING__EXPR;

	/**
	 * The feature id for the '<em><b>Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_BINDING__ELEMENT = OUTPUT_BINDING__ELEMENT;

	/**
	 * The number of structural features of the '<em>Del Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_BINDING_FEATURE_COUNT = OUTPUT_BINDING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.ExpressionImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 19;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__LINE = LOCATED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__CHAR_START = LOCATED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__CHAR_END = LOCATED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__BINDING = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.ElementExpImpl <em>Element Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.ElementExpImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getElementExp()
	 * @generated
	 */
	int ELEMENT_EXP = 20;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_EXP__LINE = EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_EXP__COLUMN = EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_EXP__CHAR_START = EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_EXP__CHAR_END = EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_EXP__BINDING = EXPRESSION__BINDING;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_EXP__ELEMENT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_EXP__PROPERTY = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_EXP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.LiteralExpImpl <em>Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.LiteralExpImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getLiteralExp()
	 * @generated
	 */
	int LITERAL_EXP = 21;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXP__LINE = EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXP__COLUMN = EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXP__CHAR_START = EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXP__CHAR_END = EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXP__BINDING = EXPRESSION__BINDING;

	/**
	 * The number of structural features of the '<em>Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.StringLiteralExpImpl <em>String Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.StringLiteralExpImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getStringLiteralExp()
	 * @generated
	 */
	int STRING_LITERAL_EXP = 22;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_EXP__LINE = LITERAL_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_EXP__COLUMN = LITERAL_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_EXP__CHAR_START = LITERAL_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_EXP__CHAR_END = LITERAL_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_EXP__BINDING = LITERAL_EXP__BINDING;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_EXP__LITERAL = LITERAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_EXP_FEATURE_COUNT = LITERAL_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.IntegerLiteralExpImpl <em>Integer Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.IntegerLiteralExpImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getIntegerLiteralExp()
	 * @generated
	 */
	int INTEGER_LITERAL_EXP = 23;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXP__LINE = LITERAL_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXP__COLUMN = LITERAL_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXP__CHAR_START = LITERAL_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXP__CHAR_END = LITERAL_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXP__BINDING = LITERAL_EXP__BINDING;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXP__LITERAL = LITERAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXP_FEATURE_COUNT = LITERAL_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.DoubleLiteralExpImpl <em>Double Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.DoubleLiteralExpImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getDoubleLiteralExp()
	 * @generated
	 */
	int DOUBLE_LITERAL_EXP = 24;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LITERAL_EXP__LINE = LITERAL_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LITERAL_EXP__COLUMN = LITERAL_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LITERAL_EXP__CHAR_START = LITERAL_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LITERAL_EXP__CHAR_END = LITERAL_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LITERAL_EXP__BINDING = LITERAL_EXP__BINDING;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LITERAL_EXP__LITERAL = LITERAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LITERAL_EXP_FEATURE_COUNT = LITERAL_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.CharLiteralExpImpl <em>Char Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.CharLiteralExpImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getCharLiteralExp()
	 * @generated
	 */
	int CHAR_LITERAL_EXP = 25;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_LITERAL_EXP__LINE = LITERAL_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_LITERAL_EXP__COLUMN = LITERAL_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_LITERAL_EXP__CHAR_START = LITERAL_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_LITERAL_EXP__CHAR_END = LITERAL_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_LITERAL_EXP__BINDING = LITERAL_EXP__BINDING;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_LITERAL_EXP__LITERAL = LITERAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Char Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_LITERAL_EXP_FEATURE_COUNT = LITERAL_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.BooleanLiteralExpImpl <em>Boolean Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.BooleanLiteralExpImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getBooleanLiteralExp()
	 * @generated
	 */
	int BOOLEAN_LITERAL_EXP = 26;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXP__LINE = LITERAL_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXP__COLUMN = LITERAL_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXP__CHAR_START = LITERAL_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXP__CHAR_END = LITERAL_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXP__BINDING = LITERAL_EXP__BINDING;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXP__LITERAL = LITERAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXP_FEATURE_COUNT = LITERAL_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.EnumLiteralExpImpl <em>Enum Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.EnumLiteralExpImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getEnumLiteralExp()
	 * @generated
	 */
	int ENUM_LITERAL_EXP = 27;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__LINE = LITERAL_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__COLUMN = LITERAL_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__CHAR_START = LITERAL_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__CHAR_END = LITERAL_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__BINDING = LITERAL_EXP__BINDING;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__LITERAL = LITERAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP_FEATURE_COUNT = LITERAL_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link be.ac.vub.simplegt.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.simplegt.impl.ModelImpl
	 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 28;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__LINE = NAMED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__COLUMN = NAMED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CHAR_START = NAMED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CHAR_END = NAMED_ELEMENT__CHAR_END;

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
	int METAMODEL = 29;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__LINE = MODEL__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__COLUMN = MODEL__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__CHAR_START = MODEL__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__CHAR_END = MODEL__CHAR_END;

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
	int INSTANCE_MODEL = 30;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL__LINE = MODEL__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL__COLUMN = MODEL__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL__CHAR_START = MODEL__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL__CHAR_END = MODEL__CHAR_END;

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
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.LocatedElement <em>Located Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Located Element</em>'.
	 * @see be.ac.vub.simplegt.LocatedElement
	 * @generated
	 */
	EClass getLocatedElement();

	/**
	 * Returns the meta object for the attribute '{@link be.ac.vub.simplegt.LocatedElement#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see be.ac.vub.simplegt.LocatedElement#getLine()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_Line();

	/**
	 * Returns the meta object for the attribute '{@link be.ac.vub.simplegt.LocatedElement#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see be.ac.vub.simplegt.LocatedElement#getColumn()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_Column();

	/**
	 * Returns the meta object for the attribute '{@link be.ac.vub.simplegt.LocatedElement#getCharStart <em>Char Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char Start</em>'.
	 * @see be.ac.vub.simplegt.LocatedElement#getCharStart()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_CharStart();

	/**
	 * Returns the meta object for the attribute '{@link be.ac.vub.simplegt.LocatedElement#getCharEnd <em>Char End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char End</em>'.
	 * @see be.ac.vub.simplegt.LocatedElement#getCharEnd()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_CharEnd();

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
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.InputElementPattern <em>Input Element Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Element Pattern</em>'.
	 * @see be.ac.vub.simplegt.InputElementPattern
	 * @generated
	 */
	EClass getInputElementPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link be.ac.vub.simplegt.InputElementPattern#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see be.ac.vub.simplegt.InputElementPattern#getElements()
	 * @see #getInputElementPattern()
	 * @generated
	 */
	EReference getInputElementPattern_Elements();

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
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.NacPattern <em>Nac Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nac Pattern</em>'.
	 * @see be.ac.vub.simplegt.NacPattern
	 * @generated
	 */
	EClass getNacPattern();

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
	 * Returns the meta object for the reference '{@link be.ac.vub.simplegt.RuleElement#getInModel <em>In Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Model</em>'.
	 * @see be.ac.vub.simplegt.RuleElement#getInModel()
	 * @see #getRuleElement()
	 * @generated
	 */
	EReference getRuleElement_InModel();

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
	 * Returns the meta object for the containment reference list '{@link be.ac.vub.simplegt.InputElement#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see be.ac.vub.simplegt.InputElement#getBindings()
	 * @see #getInputElement()
	 * @generated
	 */
	EReference getInputElement_Bindings();

	/**
	 * Returns the meta object for the container reference '{@link be.ac.vub.simplegt.InputElement#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pattern</em>'.
	 * @see be.ac.vub.simplegt.InputElement#getPattern()
	 * @see #getInputElement()
	 * @generated
	 */
	EReference getInputElement_Pattern();

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
	 * Returns the meta object for the attribute '{@link be.ac.vub.simplegt.Binding#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see be.ac.vub.simplegt.Binding#getProperty()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Property();

	/**
	 * Returns the meta object for the containment reference '{@link be.ac.vub.simplegt.Binding#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see be.ac.vub.simplegt.Binding#getExpr()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Expr();

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
	 * Returns the meta object for the container reference '{@link be.ac.vub.simplegt.InputBinding#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Element</em>'.
	 * @see be.ac.vub.simplegt.InputBinding#getElement()
	 * @see #getInputBinding()
	 * @generated
	 */
	EReference getInputBinding_Element();

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
	 * Returns the meta object for the container reference '{@link be.ac.vub.simplegt.OutputBinding#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Element</em>'.
	 * @see be.ac.vub.simplegt.OutputBinding#getElement()
	 * @see #getOutputBinding()
	 * @generated
	 */
	EReference getOutputBinding_Element();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.SetBinding <em>Set Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Binding</em>'.
	 * @see be.ac.vub.simplegt.SetBinding
	 * @generated
	 */
	EClass getSetBinding();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.AddBinding <em>Add Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Binding</em>'.
	 * @see be.ac.vub.simplegt.AddBinding
	 * @generated
	 */
	EClass getAddBinding();

	/**
	 * Returns the meta object for the reference '{@link be.ac.vub.simplegt.AddBinding#getBeforeElement <em>Before Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Before Element</em>'.
	 * @see be.ac.vub.simplegt.AddBinding#getBeforeElement()
	 * @see #getAddBinding()
	 * @generated
	 */
	EReference getAddBinding_BeforeElement();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.DelBinding <em>Del Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Del Binding</em>'.
	 * @see be.ac.vub.simplegt.DelBinding
	 * @generated
	 */
	EClass getDelBinding();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see be.ac.vub.simplegt.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the container reference '{@link be.ac.vub.simplegt.Expression#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Binding</em>'.
	 * @see be.ac.vub.simplegt.Expression#getBinding()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Binding();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.ElementExp <em>Element Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Exp</em>'.
	 * @see be.ac.vub.simplegt.ElementExp
	 * @generated
	 */
	EClass getElementExp();

	/**
	 * Returns the meta object for the reference '{@link be.ac.vub.simplegt.ElementExp#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see be.ac.vub.simplegt.ElementExp#getElement()
	 * @see #getElementExp()
	 * @generated
	 */
	EReference getElementExp_Element();

	/**
	 * Returns the meta object for the attribute '{@link be.ac.vub.simplegt.ElementExp#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see be.ac.vub.simplegt.ElementExp#getProperty()
	 * @see #getElementExp()
	 * @generated
	 */
	EAttribute getElementExp_Property();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.LiteralExp <em>Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Exp</em>'.
	 * @see be.ac.vub.simplegt.LiteralExp
	 * @generated
	 */
	EClass getLiteralExp();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.StringLiteralExp <em>String Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal Exp</em>'.
	 * @see be.ac.vub.simplegt.StringLiteralExp
	 * @generated
	 */
	EClass getStringLiteralExp();

	/**
	 * Returns the meta object for the attribute '{@link be.ac.vub.simplegt.StringLiteralExp#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see be.ac.vub.simplegt.StringLiteralExp#getLiteral()
	 * @see #getStringLiteralExp()
	 * @generated
	 */
	EAttribute getStringLiteralExp_Literal();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.IntegerLiteralExp <em>Integer Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Literal Exp</em>'.
	 * @see be.ac.vub.simplegt.IntegerLiteralExp
	 * @generated
	 */
	EClass getIntegerLiteralExp();

	/**
	 * Returns the meta object for the attribute '{@link be.ac.vub.simplegt.IntegerLiteralExp#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see be.ac.vub.simplegt.IntegerLiteralExp#getLiteral()
	 * @see #getIntegerLiteralExp()
	 * @generated
	 */
	EAttribute getIntegerLiteralExp_Literal();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.DoubleLiteralExp <em>Double Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Literal Exp</em>'.
	 * @see be.ac.vub.simplegt.DoubleLiteralExp
	 * @generated
	 */
	EClass getDoubleLiteralExp();

	/**
	 * Returns the meta object for the attribute '{@link be.ac.vub.simplegt.DoubleLiteralExp#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see be.ac.vub.simplegt.DoubleLiteralExp#getLiteral()
	 * @see #getDoubleLiteralExp()
	 * @generated
	 */
	EAttribute getDoubleLiteralExp_Literal();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.CharLiteralExp <em>Char Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Literal Exp</em>'.
	 * @see be.ac.vub.simplegt.CharLiteralExp
	 * @generated
	 */
	EClass getCharLiteralExp();

	/**
	 * Returns the meta object for the attribute '{@link be.ac.vub.simplegt.CharLiteralExp#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see be.ac.vub.simplegt.CharLiteralExp#getLiteral()
	 * @see #getCharLiteralExp()
	 * @generated
	 */
	EAttribute getCharLiteralExp_Literal();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.BooleanLiteralExp <em>Boolean Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal Exp</em>'.
	 * @see be.ac.vub.simplegt.BooleanLiteralExp
	 * @generated
	 */
	EClass getBooleanLiteralExp();

	/**
	 * Returns the meta object for the attribute '{@link be.ac.vub.simplegt.BooleanLiteralExp#isLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see be.ac.vub.simplegt.BooleanLiteralExp#isLiteral()
	 * @see #getBooleanLiteralExp()
	 * @generated
	 */
	EAttribute getBooleanLiteralExp_Literal();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.simplegt.EnumLiteralExp <em>Enum Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Literal Exp</em>'.
	 * @see be.ac.vub.simplegt.EnumLiteralExp
	 * @generated
	 */
	EClass getEnumLiteralExp();

	/**
	 * Returns the meta object for the attribute '{@link be.ac.vub.simplegt.EnumLiteralExp#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see be.ac.vub.simplegt.EnumLiteralExp#getLiteral()
	 * @see #getEnumLiteralExp()
	 * @generated
	 */
	EAttribute getEnumLiteralExp_Literal();

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
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.LocatedElementImpl <em>Located Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.LocatedElementImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getLocatedElement()
		 * @generated
		 */
		EClass LOCATED_ELEMENT = eINSTANCE.getLocatedElement();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED_ELEMENT__LINE = eINSTANCE.getLocatedElement_Line();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED_ELEMENT__COLUMN = eINSTANCE.getLocatedElement_Column();

		/**
		 * The meta object literal for the '<em><b>Char Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED_ELEMENT__CHAR_START = eINSTANCE.getLocatedElement_CharStart();

		/**
		 * The meta object literal for the '<em><b>Char End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED_ELEMENT__CHAR_END = eINSTANCE.getLocatedElement_CharEnd();

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
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.InputElementPatternImpl <em>Input Element Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.InputElementPatternImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getInputElementPattern()
		 * @generated
		 */
		EClass INPUT_ELEMENT_PATTERN = eINSTANCE.getInputElementPattern();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_ELEMENT_PATTERN__ELEMENTS = eINSTANCE.getInputElementPattern_Elements();

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
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.NacPatternImpl <em>Nac Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.NacPatternImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getNacPattern()
		 * @generated
		 */
		EClass NAC_PATTERN = eINSTANCE.getNacPattern();

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
		 * The meta object literal for the '<em><b>In Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_ELEMENT__IN_MODEL = eINSTANCE.getRuleElement_InModel();

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
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_ELEMENT__BINDINGS = eINSTANCE.getInputElement_Bindings();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_ELEMENT__PATTERN = eINSTANCE.getInputElement_Pattern();

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
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__PROPERTY = eINSTANCE.getBinding_Property();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__EXPR = eINSTANCE.getBinding_Expr();

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
		 * The meta object literal for the '<em><b>Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_BINDING__ELEMENT = eINSTANCE.getInputBinding_Element();

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
		 * The meta object literal for the '<em><b>Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_BINDING__ELEMENT = eINSTANCE.getOutputBinding_Element();

		/**
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.SetBindingImpl <em>Set Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.SetBindingImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getSetBinding()
		 * @generated
		 */
		EClass SET_BINDING = eINSTANCE.getSetBinding();

		/**
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.AddBindingImpl <em>Add Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.AddBindingImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getAddBinding()
		 * @generated
		 */
		EClass ADD_BINDING = eINSTANCE.getAddBinding();

		/**
		 * The meta object literal for the '<em><b>Before Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_BINDING__BEFORE_ELEMENT = eINSTANCE.getAddBinding_BeforeElement();

		/**
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.DelBindingImpl <em>Del Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.DelBindingImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getDelBinding()
		 * @generated
		 */
		EClass DEL_BINDING = eINSTANCE.getDelBinding();

		/**
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.ExpressionImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__BINDING = eINSTANCE.getExpression_Binding();

		/**
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.ElementExpImpl <em>Element Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.ElementExpImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getElementExp()
		 * @generated
		 */
		EClass ELEMENT_EXP = eINSTANCE.getElementExp();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_EXP__ELEMENT = eINSTANCE.getElementExp_Element();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_EXP__PROPERTY = eINSTANCE.getElementExp_Property();

		/**
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.LiteralExpImpl <em>Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.LiteralExpImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getLiteralExp()
		 * @generated
		 */
		EClass LITERAL_EXP = eINSTANCE.getLiteralExp();

		/**
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.StringLiteralExpImpl <em>String Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.StringLiteralExpImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getStringLiteralExp()
		 * @generated
		 */
		EClass STRING_LITERAL_EXP = eINSTANCE.getStringLiteralExp();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL_EXP__LITERAL = eINSTANCE.getStringLiteralExp_Literal();

		/**
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.IntegerLiteralExpImpl <em>Integer Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.IntegerLiteralExpImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getIntegerLiteralExp()
		 * @generated
		 */
		EClass INTEGER_LITERAL_EXP = eINSTANCE.getIntegerLiteralExp();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_LITERAL_EXP__LITERAL = eINSTANCE.getIntegerLiteralExp_Literal();

		/**
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.DoubleLiteralExpImpl <em>Double Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.DoubleLiteralExpImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getDoubleLiteralExp()
		 * @generated
		 */
		EClass DOUBLE_LITERAL_EXP = eINSTANCE.getDoubleLiteralExp();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_LITERAL_EXP__LITERAL = eINSTANCE.getDoubleLiteralExp_Literal();

		/**
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.CharLiteralExpImpl <em>Char Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.CharLiteralExpImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getCharLiteralExp()
		 * @generated
		 */
		EClass CHAR_LITERAL_EXP = eINSTANCE.getCharLiteralExp();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR_LITERAL_EXP__LITERAL = eINSTANCE.getCharLiteralExp_Literal();

		/**
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.BooleanLiteralExpImpl <em>Boolean Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.BooleanLiteralExpImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getBooleanLiteralExp()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL_EXP = eINSTANCE.getBooleanLiteralExp();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL_EXP__LITERAL = eINSTANCE.getBooleanLiteralExp_Literal();

		/**
		 * The meta object literal for the '{@link be.ac.vub.simplegt.impl.EnumLiteralExpImpl <em>Enum Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.simplegt.impl.EnumLiteralExpImpl
		 * @see be.ac.vub.simplegt.impl.SimplegtPackageImpl#getEnumLiteralExp()
		 * @generated
		 */
		EClass ENUM_LITERAL_EXP = eINSTANCE.getEnumLiteralExp();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_LITERAL_EXP__LITERAL = eINSTANCE.getEnumLiteralExp_Literal();

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
