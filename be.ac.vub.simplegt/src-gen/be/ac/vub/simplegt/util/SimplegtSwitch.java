/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package be.ac.vub.simplegt.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import be.ac.vub.simplegt.Binding;
import be.ac.vub.simplegt.BooleanLiteralExp;
import be.ac.vub.simplegt.DoubleLiteralExp;
import be.ac.vub.simplegt.ElementExp;
import be.ac.vub.simplegt.EnumLiteralExp;
import be.ac.vub.simplegt.Expression;
import be.ac.vub.simplegt.InPattern;
import be.ac.vub.simplegt.InputBinding;
import be.ac.vub.simplegt.InputElement;
import be.ac.vub.simplegt.InputElementPattern;
import be.ac.vub.simplegt.InstanceModel;
import be.ac.vub.simplegt.IntegerLiteralExp;
import be.ac.vub.simplegt.LiteralExp;
import be.ac.vub.simplegt.LocatedElement;
import be.ac.vub.simplegt.Metamodel;
import be.ac.vub.simplegt.Model;
import be.ac.vub.simplegt.Module;
import be.ac.vub.simplegt.NacPattern;
import be.ac.vub.simplegt.NamedElement;
import be.ac.vub.simplegt.OutPattern;
import be.ac.vub.simplegt.OutputBinding;
import be.ac.vub.simplegt.OutputElement;
import be.ac.vub.simplegt.Rule;
import be.ac.vub.simplegt.RuleElement;
import be.ac.vub.simplegt.SimplegtPackage;
import be.ac.vub.simplegt.StringLiteralExp;
import be.ac.vub.simplegt.Type;
import be.ac.vub.simplegt.TypedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see be.ac.vub.simplegt.SimplegtPackage
 * @generated
 */
public class SimplegtSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimplegtPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplegtSwitch() {
		if (modelPackage == null) {
			modelPackage = SimplegtPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SimplegtPackage.LOCATED_ELEMENT: {
				LocatedElement locatedElement = (LocatedElement)theEObject;
				T result = caseLocatedElement(locatedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplegtPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = caseLocatedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplegtPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseNamedElement(type);
				if (result == null) result = caseLocatedElement(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplegtPackage.TYPED_ELEMENT: {
				TypedElement typedElement = (TypedElement)theEObject;
				T result = caseTypedElement(typedElement);
				if (result == null) result = caseNamedElement(typedElement);
				if (result == null) result = caseLocatedElement(typedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplegtPackage.MODULE: {
				Module module = (Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = caseNamedElement(module);
				if (result == null) result = caseLocatedElement(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplegtPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = caseNamedElement(rule);
				if (result == null) result = caseLocatedElement(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplegtPackage.INPUT_ELEMENT_PATTERN: {
				InputElementPattern inputElementPattern = (InputElementPattern)theEObject;
				T result = caseInputElementPattern(inputElementPattern);
				if (result == null) result = caseLocatedElement(inputElementPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplegtPackage.IN_PATTERN: {
				InPattern inPattern = (InPattern)theEObject;
				T result = caseInPattern(inPattern);
				if (result == null) result = caseInputElementPattern(inPattern);
				if (result == null) result = caseLocatedElement(inPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplegtPackage.NAC_PATTERN: {
				NacPattern nacPattern = (NacPattern)theEObject;
				T result = caseNacPattern(nacPattern);
				if (result == null) result = caseInputElementPattern(nacPattern);
				if (result == null) result = caseLocatedElement(nacPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplegtPackage.OUT_PATTERN: {
				OutPattern outPattern = (OutPattern)theEObject;
				T result = caseOutPattern(outPattern);
				if (result == null) result = caseLocatedElement(outPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplegtPackage.RULE_ELEMENT: {
				RuleElement ruleElement = (RuleElement)theEObject;
				T result = caseRuleElement(ruleElement);
				if (result == null) result = caseTypedElement(ruleElement);
				if (result == null) result = caseNamedElement(ruleElement);
				if (result == null) result = caseLocatedElement(ruleElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplegtPackage.INPUT_ELEMENT: {
				InputElement inputElement = (InputElement)theEObject;
				T result = caseInputElement(inputElement);
				if (result == null) result = caseRuleElement(inputElement);
				if (result == null) result = caseTypedElement(inputElement);
				if (result == null) result = caseNamedElement(inputElement);
				if (result == null) result = caseLocatedElement(inputElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplegtPackage.OUTPUT_ELEMENT: {
				OutputElement outputElement = (OutputElement)theEObject;
				T result = caseOutputElement(outputElement);
				if (result == null) result = caseRuleElement(outputElement);
				if (result == null) result = caseTypedElement(outputElement);
				if (result == null) result = caseNamedElement(outputElement);
				if (result == null) result = caseLocatedElement(outputElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplegtPackage.BINDING: {
				Binding binding = (Binding)theEObject;
				T result = caseBinding(binding);
				if (result == null) result = caseLocatedElement(binding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplegtPackage.INPUT_BINDING: {
				InputBinding inputBinding = (InputBinding)theEObject;
				T result = caseInputBinding(inputBinding);
				if (result == null) result = caseBinding(inputBinding);
				if (result == null) result = caseLocatedElement(inputBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplegtPackage.OUTPUT_BINDING: {
				OutputBinding outputBinding = (OutputBinding)theEObject;
				T result = caseOutputBinding(outputBinding);
				if (result == null) result = caseBinding(outputBinding);
				if (result == null) result = caseLocatedElement(outputBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplegtPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseLocatedElement(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplegtPackage.ELEMENT_EXP: {
				ElementExp elementExp = (ElementExp)theEObject;
				T result = caseElementExp(elementExp);
				if (result == null) result = caseExpression(elementExp);
				if (result == null) result = caseLocatedElement(elementExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplegtPackage.LITERAL_EXP: {
				LiteralExp literalExp = (LiteralExp)theEObject;
				T result = caseLiteralExp(literalExp);
				if (result == null) result = caseExpression(literalExp);
				if (result == null) result = caseLocatedElement(literalExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplegtPackage.STRING_LITERAL_EXP: {
				StringLiteralExp stringLiteralExp = (StringLiteralExp)theEObject;
				T result = caseStringLiteralExp(stringLiteralExp);
				if (result == null) result = caseLiteralExp(stringLiteralExp);
				if (result == null) result = caseExpression(stringLiteralExp);
				if (result == null) result = caseLocatedElement(stringLiteralExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplegtPackage.INTEGER_LITERAL_EXP: {
				IntegerLiteralExp integerLiteralExp = (IntegerLiteralExp)theEObject;
				T result = caseIntegerLiteralExp(integerLiteralExp);
				if (result == null) result = caseLiteralExp(integerLiteralExp);
				if (result == null) result = caseExpression(integerLiteralExp);
				if (result == null) result = caseLocatedElement(integerLiteralExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplegtPackage.DOUBLE_LITERAL_EXP: {
				DoubleLiteralExp doubleLiteralExp = (DoubleLiteralExp)theEObject;
				T result = caseDoubleLiteralExp(doubleLiteralExp);
				if (result == null) result = caseLiteralExp(doubleLiteralExp);
				if (result == null) result = caseExpression(doubleLiteralExp);
				if (result == null) result = caseLocatedElement(doubleLiteralExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplegtPackage.BOOLEAN_LITERAL_EXP: {
				BooleanLiteralExp booleanLiteralExp = (BooleanLiteralExp)theEObject;
				T result = caseBooleanLiteralExp(booleanLiteralExp);
				if (result == null) result = caseLiteralExp(booleanLiteralExp);
				if (result == null) result = caseExpression(booleanLiteralExp);
				if (result == null) result = caseLocatedElement(booleanLiteralExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplegtPackage.ENUM_LITERAL_EXP: {
				EnumLiteralExp enumLiteralExp = (EnumLiteralExp)theEObject;
				T result = caseEnumLiteralExp(enumLiteralExp);
				if (result == null) result = caseLiteralExp(enumLiteralExp);
				if (result == null) result = caseExpression(enumLiteralExp);
				if (result == null) result = caseLocatedElement(enumLiteralExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplegtPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = caseNamedElement(model);
				if (result == null) result = caseLocatedElement(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplegtPackage.METAMODEL: {
				Metamodel metamodel = (Metamodel)theEObject;
				T result = caseMetamodel(metamodel);
				if (result == null) result = caseModel(metamodel);
				if (result == null) result = caseNamedElement(metamodel);
				if (result == null) result = caseLocatedElement(metamodel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplegtPackage.INSTANCE_MODEL: {
				InstanceModel instanceModel = (InstanceModel)theEObject;
				T result = caseInstanceModel(instanceModel);
				if (result == null) result = caseModel(instanceModel);
				if (result == null) result = caseNamedElement(instanceModel);
				if (result == null) result = caseLocatedElement(instanceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocatedElement(LocatedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Element Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Element Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputElementPattern(InputElementPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInPattern(InPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nac Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nac Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNacPattern(NacPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Out Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Out Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutPattern(OutPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleElement(RuleElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputElement(InputElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputElement(OutputElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinding(Binding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputBinding(InputBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputBinding(OutputBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementExp(ElementExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralExp(LiteralExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Literal Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringLiteralExp(StringLiteralExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Literal Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerLiteralExp(IntegerLiteralExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Literal Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleLiteralExp(DoubleLiteralExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanLiteralExp(BooleanLiteralExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Literal Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumLiteralExp(EnumLiteralExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metamodel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metamodel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetamodel(Metamodel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceModel(InstanceModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SimplegtSwitch
