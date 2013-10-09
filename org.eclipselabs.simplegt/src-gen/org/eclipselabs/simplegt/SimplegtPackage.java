/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package org.eclipselabs.simplegt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipselabs.simpleocl.SimpleoclPackage;

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
 * @see org.eclipselabs.simplegt.SimplegtFactory
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
	String eNS_URI = "http://eclipselabs.org/simplegt/2013/SimpleGT";

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
	SimplegtPackage eINSTANCE = org.eclipselabs.simplegt.impl.SimplegtPackageImpl.init();

	/**
   * The meta object id for the '{@link org.eclipselabs.simplegt.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipselabs.simplegt.impl.ModuleImpl
   * @see org.eclipselabs.simplegt.impl.SimplegtPackageImpl#getModule()
   * @generated
   */
	int MODULE = 0;

	/**
   * The feature id for the '<em><b>Line</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MODULE__LINE = SimpleoclPackage.MODULE__LINE;

	/**
   * The feature id for the '<em><b>Column</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MODULE__COLUMN = SimpleoclPackage.MODULE__COLUMN;

	/**
   * The feature id for the '<em><b>Char Start</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MODULE__CHAR_START = SimpleoclPackage.MODULE__CHAR_START;

	/**
   * The feature id for the '<em><b>Char End</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MODULE__CHAR_END = SimpleoclPackage.MODULE__CHAR_END;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MODULE__NAME = SimpleoclPackage.MODULE__NAME;

	/**
   * The feature id for the '<em><b>Metamodels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MODULE__METAMODELS = SimpleoclPackage.MODULE__METAMODELS;

	/**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MODULE__IMPORTS = SimpleoclPackage.MODULE__IMPORTS;

	/**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MODULE__ELEMENTS = SimpleoclPackage.MODULE__ELEMENTS;

	/**
   * The feature id for the '<em><b>Models</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MODULE__MODELS = SimpleoclPackage.MODULE_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Debug</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MODULE__DEBUG = SimpleoclPackage.MODULE_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MODULE_FEATURE_COUNT = SimpleoclPackage.MODULE_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link org.eclipselabs.simplegt.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipselabs.simplegt.impl.RuleImpl
   * @see org.eclipselabs.simplegt.impl.SimplegtPackageImpl#getRule()
   * @generated
   */
	int RULE = 1;

	/**
   * The feature id for the '<em><b>Line</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RULE__LINE = SimpleoclPackage.NAMED_ELEMENT__LINE;

	/**
   * The feature id for the '<em><b>Column</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RULE__COLUMN = SimpleoclPackage.NAMED_ELEMENT__COLUMN;

	/**
   * The feature id for the '<em><b>Char Start</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RULE__CHAR_START = SimpleoclPackage.NAMED_ELEMENT__CHAR_START;

	/**
   * The feature id for the '<em><b>Char End</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RULE__CHAR_END = SimpleoclPackage.NAMED_ELEMENT__CHAR_END;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RULE__NAME = SimpleoclPackage.NAMED_ELEMENT__NAME;

	/**
   * The feature id for the '<em><b>Module</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RULE__MODULE = SimpleoclPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RULE__ABSTRACT = SimpleoclPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RULE__INPUT = SimpleoclPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
   * The feature id for the '<em><b>Nac</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RULE__NAC = SimpleoclPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
   * The feature id for the '<em><b>Output</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RULE__OUTPUT = SimpleoclPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
   * The feature id for the '<em><b>Extends</b></em>' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RULE__EXTENDS = SimpleoclPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RULE__UNIQUE = SimpleoclPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RULE_FEATURE_COUNT = SimpleoclPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
   * The meta object id for the '{@link org.eclipselabs.simplegt.impl.InputElementPatternImpl <em>Input Element Pattern</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipselabs.simplegt.impl.InputElementPatternImpl
   * @see org.eclipselabs.simplegt.impl.SimplegtPackageImpl#getInputElementPattern()
   * @generated
   */
	int INPUT_ELEMENT_PATTERN = 2;

	/**
   * The feature id for the '<em><b>Line</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INPUT_ELEMENT_PATTERN__LINE = SimpleoclPackage.LOCATED_ELEMENT__LINE;

	/**
   * The feature id for the '<em><b>Column</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INPUT_ELEMENT_PATTERN__COLUMN = SimpleoclPackage.LOCATED_ELEMENT__COLUMN;

	/**
   * The feature id for the '<em><b>Char Start</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INPUT_ELEMENT_PATTERN__CHAR_START = SimpleoclPackage.LOCATED_ELEMENT__CHAR_START;

	/**
   * The feature id for the '<em><b>Char End</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INPUT_ELEMENT_PATTERN__CHAR_END = SimpleoclPackage.LOCATED_ELEMENT__CHAR_END;

	/**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INPUT_ELEMENT_PATTERN__ELEMENTS = SimpleoclPackage.LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Input Element Pattern</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INPUT_ELEMENT_PATTERN_FEATURE_COUNT = SimpleoclPackage.LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link org.eclipselabs.simplegt.impl.InPatternImpl <em>In Pattern</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipselabs.simplegt.impl.InPatternImpl
   * @see org.eclipselabs.simplegt.impl.SimplegtPackageImpl#getInPattern()
   * @generated
   */
	int IN_PATTERN = 3;

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
   * The meta object id for the '{@link org.eclipselabs.simplegt.impl.NacPatternImpl <em>Nac Pattern</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipselabs.simplegt.impl.NacPatternImpl
   * @see org.eclipselabs.simplegt.impl.SimplegtPackageImpl#getNacPattern()
   * @generated
   */
	int NAC_PATTERN = 4;

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
   * The meta object id for the '{@link org.eclipselabs.simplegt.impl.OutPatternImpl <em>Out Pattern</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipselabs.simplegt.impl.OutPatternImpl
   * @see org.eclipselabs.simplegt.impl.SimplegtPackageImpl#getOutPattern()
   * @generated
   */
	int OUT_PATTERN = 5;

	/**
   * The feature id for the '<em><b>Line</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OUT_PATTERN__LINE = SimpleoclPackage.LOCATED_ELEMENT__LINE;

	/**
   * The feature id for the '<em><b>Column</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OUT_PATTERN__COLUMN = SimpleoclPackage.LOCATED_ELEMENT__COLUMN;

	/**
   * The feature id for the '<em><b>Char Start</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OUT_PATTERN__CHAR_START = SimpleoclPackage.LOCATED_ELEMENT__CHAR_START;

	/**
   * The feature id for the '<em><b>Char End</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OUT_PATTERN__CHAR_END = SimpleoclPackage.LOCATED_ELEMENT__CHAR_END;

	/**
   * The feature id for the '<em><b>Output For</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OUT_PATTERN__OUTPUT_FOR = SimpleoclPackage.LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OUT_PATTERN__ELEMENTS = SimpleoclPackage.LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Out Pattern</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OUT_PATTERN_FEATURE_COUNT = SimpleoclPackage.LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link org.eclipselabs.simplegt.impl.RuleElementImpl <em>Rule Element</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipselabs.simplegt.impl.RuleElementImpl
   * @see org.eclipselabs.simplegt.impl.SimplegtPackageImpl#getRuleElement()
   * @generated
   */
	int RULE_ELEMENT = 6;

	/**
   * The feature id for the '<em><b>Line</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RULE_ELEMENT__LINE = SimpleoclPackage.VARIABLE_DECLARATION__LINE;

	/**
   * The feature id for the '<em><b>Column</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RULE_ELEMENT__COLUMN = SimpleoclPackage.VARIABLE_DECLARATION__COLUMN;

	/**
   * The feature id for the '<em><b>Char Start</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RULE_ELEMENT__CHAR_START = SimpleoclPackage.VARIABLE_DECLARATION__CHAR_START;

	/**
   * The feature id for the '<em><b>Char End</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RULE_ELEMENT__CHAR_END = SimpleoclPackage.VARIABLE_DECLARATION__CHAR_END;

	/**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RULE_ELEMENT__VAR_NAME = SimpleoclPackage.VARIABLE_DECLARATION__VAR_NAME;

	/**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RULE_ELEMENT__TYPE = SimpleoclPackage.VARIABLE_DECLARATION__TYPE;

	/**
   * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RULE_ELEMENT__VARIABLE_EXP = SimpleoclPackage.VARIABLE_DECLARATION__VARIABLE_EXP;

	/**
   * The feature id for the '<em><b>In Model</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RULE_ELEMENT__IN_MODEL = SimpleoclPackage.VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Rule Element</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RULE_ELEMENT_FEATURE_COUNT = SimpleoclPackage.VARIABLE_DECLARATION_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link org.eclipselabs.simplegt.impl.InputElementImpl <em>Input Element</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipselabs.simplegt.impl.InputElementImpl
   * @see org.eclipselabs.simplegt.impl.SimplegtPackageImpl#getInputElement()
   * @generated
   */
	int INPUT_ELEMENT = 7;

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
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INPUT_ELEMENT__VAR_NAME = RULE_ELEMENT__VAR_NAME;

	/**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INPUT_ELEMENT__TYPE = RULE_ELEMENT__TYPE;

	/**
   * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INPUT_ELEMENT__VARIABLE_EXP = RULE_ELEMENT__VARIABLE_EXP;

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
   * The meta object id for the '{@link org.eclipselabs.simplegt.impl.OutputElementImpl <em>Output Element</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipselabs.simplegt.impl.OutputElementImpl
   * @see org.eclipselabs.simplegt.impl.SimplegtPackageImpl#getOutputElement()
   * @generated
   */
	int OUTPUT_ELEMENT = 8;

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
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OUTPUT_ELEMENT__VAR_NAME = RULE_ELEMENT__VAR_NAME;

	/**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OUTPUT_ELEMENT__TYPE = RULE_ELEMENT__TYPE;

	/**
   * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OUTPUT_ELEMENT__VARIABLE_EXP = RULE_ELEMENT__VARIABLE_EXP;

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
   * The meta object id for the '{@link org.eclipselabs.simplegt.impl.BindingImpl <em>Binding</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipselabs.simplegt.impl.BindingImpl
   * @see org.eclipselabs.simplegt.impl.SimplegtPackageImpl#getBinding()
   * @generated
   */
	int BINDING = 9;

	/**
   * The feature id for the '<em><b>Line</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINDING__LINE = SimpleoclPackage.LOCATED_ELEMENT__LINE;

	/**
   * The feature id for the '<em><b>Column</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINDING__COLUMN = SimpleoclPackage.LOCATED_ELEMENT__COLUMN;

	/**
   * The feature id for the '<em><b>Char Start</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINDING__CHAR_START = SimpleoclPackage.LOCATED_ELEMENT__CHAR_START;

	/**
   * The feature id for the '<em><b>Char End</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINDING__CHAR_END = SimpleoclPackage.LOCATED_ELEMENT__CHAR_END;

	/**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINDING__PROPERTY = SimpleoclPackage.LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINDING__EXPR = SimpleoclPackage.LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Binding</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINDING_FEATURE_COUNT = SimpleoclPackage.LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link org.eclipselabs.simplegt.impl.InputBindingImpl <em>Input Binding</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipselabs.simplegt.impl.InputBindingImpl
   * @see org.eclipselabs.simplegt.impl.SimplegtPackageImpl#getInputBinding()
   * @generated
   */
	int INPUT_BINDING = 10;

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
   * The feature id for the '<em><b>Last</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INPUT_BINDING__LAST = BINDING_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Input Binding</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INPUT_BINDING_FEATURE_COUNT = BINDING_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link org.eclipselabs.simplegt.impl.OutputBindingImpl <em>Output Binding</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipselabs.simplegt.impl.OutputBindingImpl
   * @see org.eclipselabs.simplegt.impl.SimplegtPackageImpl#getOutputBinding()
   * @generated
   */
	int OUTPUT_BINDING = 11;

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
   * The feature id for the '<em><b>Before Element</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OUTPUT_BINDING__BEFORE_ELEMENT = BINDING_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Output Binding</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OUTPUT_BINDING_FEATURE_COUNT = BINDING_FEATURE_COUNT + 2;

	/**
   * Returns the meta object for class '{@link org.eclipselabs.simplegt.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see org.eclipselabs.simplegt.Module
   * @generated
   */
	EClass getModule();

	/**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.simplegt.Module#getModels <em>Models</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Models</em>'.
   * @see org.eclipselabs.simplegt.Module#getModels()
   * @see #getModule()
   * @generated
   */
	EReference getModule_Models();

	/**
   * Returns the meta object for the attribute '{@link org.eclipselabs.simplegt.Module#isDebug <em>Debug</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Debug</em>'.
   * @see org.eclipselabs.simplegt.Module#isDebug()
   * @see #getModule()
   * @generated
   */
	EAttribute getModule_Debug();

	/**
   * Returns the meta object for class '{@link org.eclipselabs.simplegt.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see org.eclipselabs.simplegt.Rule
   * @generated
   */
	EClass getRule();

	/**
   * Returns the meta object for the attribute '{@link org.eclipselabs.simplegt.Rule#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see org.eclipselabs.simplegt.Rule#isAbstract()
   * @see #getRule()
   * @generated
   */
	EAttribute getRule_Abstract();

	/**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.simplegt.Rule#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input</em>'.
   * @see org.eclipselabs.simplegt.Rule#getInput()
   * @see #getRule()
   * @generated
   */
	EReference getRule_Input();

	/**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.simplegt.Rule#getNac <em>Nac</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nac</em>'.
   * @see org.eclipselabs.simplegt.Rule#getNac()
   * @see #getRule()
   * @generated
   */
	EReference getRule_Nac();

	/**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.simplegt.Rule#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output</em>'.
   * @see org.eclipselabs.simplegt.Rule#getOutput()
   * @see #getRule()
   * @generated
   */
	EReference getRule_Output();

	/**
   * Returns the meta object for the attribute list '{@link org.eclipselabs.simplegt.Rule#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Extends</em>'.
   * @see org.eclipselabs.simplegt.Rule#getExtends()
   * @see #getRule()
   * @generated
   */
	EAttribute getRule_Extends();

	/**
   * Returns the meta object for the attribute '{@link org.eclipselabs.simplegt.Rule#isUnique <em>Unique</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique</em>'.
   * @see org.eclipselabs.simplegt.Rule#isUnique()
   * @see #getRule()
   * @generated
   */
	EAttribute getRule_Unique();

	/**
   * Returns the meta object for class '{@link org.eclipselabs.simplegt.InputElementPattern <em>Input Element Pattern</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Element Pattern</em>'.
   * @see org.eclipselabs.simplegt.InputElementPattern
   * @generated
   */
	EClass getInputElementPattern();

	/**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.simplegt.InputElementPattern#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.eclipselabs.simplegt.InputElementPattern#getElements()
   * @see #getInputElementPattern()
   * @generated
   */
	EReference getInputElementPattern_Elements();

	/**
   * Returns the meta object for class '{@link org.eclipselabs.simplegt.InPattern <em>In Pattern</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Pattern</em>'.
   * @see org.eclipselabs.simplegt.InPattern
   * @generated
   */
	EClass getInPattern();

	/**
   * Returns the meta object for the container reference '{@link org.eclipselabs.simplegt.InPattern#getInputFor <em>Input For</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Input For</em>'.
   * @see org.eclipselabs.simplegt.InPattern#getInputFor()
   * @see #getInPattern()
   * @generated
   */
	EReference getInPattern_InputFor();

	/**
   * Returns the meta object for class '{@link org.eclipselabs.simplegt.NacPattern <em>Nac Pattern</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nac Pattern</em>'.
   * @see org.eclipselabs.simplegt.NacPattern
   * @generated
   */
	EClass getNacPattern();

	/**
   * Returns the meta object for the container reference '{@link org.eclipselabs.simplegt.NacPattern#getNacFor <em>Nac For</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Nac For</em>'.
   * @see org.eclipselabs.simplegt.NacPattern#getNacFor()
   * @see #getNacPattern()
   * @generated
   */
	EReference getNacPattern_NacFor();

	/**
   * Returns the meta object for class '{@link org.eclipselabs.simplegt.OutPattern <em>Out Pattern</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Out Pattern</em>'.
   * @see org.eclipselabs.simplegt.OutPattern
   * @generated
   */
	EClass getOutPattern();

	/**
   * Returns the meta object for the container reference '{@link org.eclipselabs.simplegt.OutPattern#getOutputFor <em>Output For</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Output For</em>'.
   * @see org.eclipselabs.simplegt.OutPattern#getOutputFor()
   * @see #getOutPattern()
   * @generated
   */
	EReference getOutPattern_OutputFor();

	/**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.simplegt.OutPattern#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.eclipselabs.simplegt.OutPattern#getElements()
   * @see #getOutPattern()
   * @generated
   */
	EReference getOutPattern_Elements();

	/**
   * Returns the meta object for class '{@link org.eclipselabs.simplegt.RuleElement <em>Rule Element</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule Element</em>'.
   * @see org.eclipselabs.simplegt.RuleElement
   * @generated
   */
	EClass getRuleElement();

	/**
   * Returns the meta object for the reference '{@link org.eclipselabs.simplegt.RuleElement#getInModel <em>In Model</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>In Model</em>'.
   * @see org.eclipselabs.simplegt.RuleElement#getInModel()
   * @see #getRuleElement()
   * @generated
   */
	EReference getRuleElement_InModel();

	/**
   * Returns the meta object for class '{@link org.eclipselabs.simplegt.InputElement <em>Input Element</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Element</em>'.
   * @see org.eclipselabs.simplegt.InputElement
   * @generated
   */
	EClass getInputElement();

	/**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.simplegt.InputElement#getBindings <em>Bindings</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bindings</em>'.
   * @see org.eclipselabs.simplegt.InputElement#getBindings()
   * @see #getInputElement()
   * @generated
   */
	EReference getInputElement_Bindings();

	/**
   * Returns the meta object for the container reference '{@link org.eclipselabs.simplegt.InputElement#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Pattern</em>'.
   * @see org.eclipselabs.simplegt.InputElement#getPattern()
   * @see #getInputElement()
   * @generated
   */
	EReference getInputElement_Pattern();

	/**
   * Returns the meta object for class '{@link org.eclipselabs.simplegt.OutputElement <em>Output Element</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Element</em>'.
   * @see org.eclipselabs.simplegt.OutputElement
   * @generated
   */
	EClass getOutputElement();

	/**
   * Returns the meta object for the container reference '{@link org.eclipselabs.simplegt.OutputElement#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Pattern</em>'.
   * @see org.eclipselabs.simplegt.OutputElement#getPattern()
   * @see #getOutputElement()
   * @generated
   */
	EReference getOutputElement_Pattern();

	/**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.simplegt.OutputElement#getBindings <em>Bindings</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bindings</em>'.
   * @see org.eclipselabs.simplegt.OutputElement#getBindings()
   * @see #getOutputElement()
   * @generated
   */
	EReference getOutputElement_Bindings();

	/**
   * Returns the meta object for class '{@link org.eclipselabs.simplegt.Binding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding</em>'.
   * @see org.eclipselabs.simplegt.Binding
   * @generated
   */
	EClass getBinding();

	/**
   * Returns the meta object for the attribute '{@link org.eclipselabs.simplegt.Binding#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see org.eclipselabs.simplegt.Binding#getProperty()
   * @see #getBinding()
   * @generated
   */
	EAttribute getBinding_Property();

	/**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.simplegt.Binding#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.eclipselabs.simplegt.Binding#getExpr()
   * @see #getBinding()
   * @generated
   */
	EReference getBinding_Expr();

	/**
   * Returns the meta object for class '{@link org.eclipselabs.simplegt.InputBinding <em>Input Binding</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Binding</em>'.
   * @see org.eclipselabs.simplegt.InputBinding
   * @generated
   */
	EClass getInputBinding();

	/**
   * Returns the meta object for the container reference '{@link org.eclipselabs.simplegt.InputBinding#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Element</em>'.
   * @see org.eclipselabs.simplegt.InputBinding#getElement()
   * @see #getInputBinding()
   * @generated
   */
	EReference getInputBinding_Element();

	/**
   * Returns the meta object for the attribute '{@link org.eclipselabs.simplegt.InputBinding#isLast <em>Last</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last</em>'.
   * @see org.eclipselabs.simplegt.InputBinding#isLast()
   * @see #getInputBinding()
   * @generated
   */
	EAttribute getInputBinding_Last();

	/**
   * Returns the meta object for class '{@link org.eclipselabs.simplegt.OutputBinding <em>Output Binding</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Binding</em>'.
   * @see org.eclipselabs.simplegt.OutputBinding
   * @generated
   */
	EClass getOutputBinding();

	/**
   * Returns the meta object for the container reference '{@link org.eclipselabs.simplegt.OutputBinding#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Element</em>'.
   * @see org.eclipselabs.simplegt.OutputBinding#getElement()
   * @see #getOutputBinding()
   * @generated
   */
	EReference getOutputBinding_Element();

	/**
   * Returns the meta object for the reference '{@link org.eclipselabs.simplegt.OutputBinding#getBeforeElement <em>Before Element</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Before Element</em>'.
   * @see org.eclipselabs.simplegt.OutputBinding#getBeforeElement()
   * @see #getOutputBinding()
   * @generated
   */
	EReference getOutputBinding_BeforeElement();

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
     * The meta object literal for the '{@link org.eclipselabs.simplegt.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipselabs.simplegt.impl.ModuleImpl
     * @see org.eclipselabs.simplegt.impl.SimplegtPackageImpl#getModule()
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
     * The meta object literal for the '<em><b>Debug</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute MODULE__DEBUG = eINSTANCE.getModule_Debug();

		/**
     * The meta object literal for the '{@link org.eclipselabs.simplegt.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipselabs.simplegt.impl.RuleImpl
     * @see org.eclipselabs.simplegt.impl.SimplegtPackageImpl#getRule()
     * @generated
     */
		EClass RULE = eINSTANCE.getRule();

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
     * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute RULE__UNIQUE = eINSTANCE.getRule_Unique();

		/**
     * The meta object literal for the '{@link org.eclipselabs.simplegt.impl.InputElementPatternImpl <em>Input Element Pattern</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipselabs.simplegt.impl.InputElementPatternImpl
     * @see org.eclipselabs.simplegt.impl.SimplegtPackageImpl#getInputElementPattern()
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
     * The meta object literal for the '{@link org.eclipselabs.simplegt.impl.InPatternImpl <em>In Pattern</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipselabs.simplegt.impl.InPatternImpl
     * @see org.eclipselabs.simplegt.impl.SimplegtPackageImpl#getInPattern()
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
     * The meta object literal for the '{@link org.eclipselabs.simplegt.impl.NacPatternImpl <em>Nac Pattern</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipselabs.simplegt.impl.NacPatternImpl
     * @see org.eclipselabs.simplegt.impl.SimplegtPackageImpl#getNacPattern()
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
     * The meta object literal for the '{@link org.eclipselabs.simplegt.impl.OutPatternImpl <em>Out Pattern</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipselabs.simplegt.impl.OutPatternImpl
     * @see org.eclipselabs.simplegt.impl.SimplegtPackageImpl#getOutPattern()
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
     * The meta object literal for the '{@link org.eclipselabs.simplegt.impl.RuleElementImpl <em>Rule Element</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipselabs.simplegt.impl.RuleElementImpl
     * @see org.eclipselabs.simplegt.impl.SimplegtPackageImpl#getRuleElement()
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
     * The meta object literal for the '{@link org.eclipselabs.simplegt.impl.InputElementImpl <em>Input Element</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipselabs.simplegt.impl.InputElementImpl
     * @see org.eclipselabs.simplegt.impl.SimplegtPackageImpl#getInputElement()
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
     * The meta object literal for the '{@link org.eclipselabs.simplegt.impl.OutputElementImpl <em>Output Element</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipselabs.simplegt.impl.OutputElementImpl
     * @see org.eclipselabs.simplegt.impl.SimplegtPackageImpl#getOutputElement()
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
     * The meta object literal for the '{@link org.eclipselabs.simplegt.impl.BindingImpl <em>Binding</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipselabs.simplegt.impl.BindingImpl
     * @see org.eclipselabs.simplegt.impl.SimplegtPackageImpl#getBinding()
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
     * The meta object literal for the '{@link org.eclipselabs.simplegt.impl.InputBindingImpl <em>Input Binding</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipselabs.simplegt.impl.InputBindingImpl
     * @see org.eclipselabs.simplegt.impl.SimplegtPackageImpl#getInputBinding()
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
     * The meta object literal for the '<em><b>Last</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute INPUT_BINDING__LAST = eINSTANCE.getInputBinding_Last();

		/**
     * The meta object literal for the '{@link org.eclipselabs.simplegt.impl.OutputBindingImpl <em>Output Binding</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipselabs.simplegt.impl.OutputBindingImpl
     * @see org.eclipselabs.simplegt.impl.SimplegtPackageImpl#getOutputBinding()
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
     * The meta object literal for the '<em><b>Before Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference OUTPUT_BINDING__BEFORE_ELEMENT = eINSTANCE.getOutputBinding_BeforeElement();

	}

} //SimplegtPackage
