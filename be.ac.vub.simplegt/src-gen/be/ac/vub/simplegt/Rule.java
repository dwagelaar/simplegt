/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package be.ac.vub.simplegt;

import org.eclipse.emf.common.util.EList;

import be.ac.vub.simpleocl.ModuleElement;
import be.ac.vub.simpleocl.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.ac.vub.simplegt.Rule#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.Rule#getInput <em>Input</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.Rule#getNac <em>Nac</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.Rule#getOutput <em>Output</em>}</li>
 *   <li>{@link be.ac.vub.simplegt.Rule#getExtends <em>Extends</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.ac.vub.simplegt.SimplegtPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends NamedElement, ModuleElement {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see be.ac.vub.simplegt.SimplegtPackage#getRule_Abstract()
	 * @model required="true"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link be.ac.vub.simplegt.Rule#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.simplegt.InPattern#getInputFor <em>Input For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(InPattern)
	 * @see be.ac.vub.simplegt.SimplegtPackage#getRule_Input()
	 * @see be.ac.vub.simplegt.InPattern#getInputFor
	 * @model opposite="inputFor" containment="true"
	 * @generated
	 */
	InPattern getInput();

	/**
	 * Sets the value of the '{@link be.ac.vub.simplegt.Rule#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(InPattern value);

	/**
	 * Returns the value of the '<em><b>Nac</b></em>' containment reference list.
	 * The list contents are of type {@link be.ac.vub.simplegt.NacPattern}.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.simplegt.NacPattern#getNacFor <em>Nac For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nac</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nac</em>' containment reference list.
	 * @see be.ac.vub.simplegt.SimplegtPackage#getRule_Nac()
	 * @see be.ac.vub.simplegt.NacPattern#getNacFor
	 * @model opposite="nacFor" containment="true"
	 * @generated
	 */
	EList<NacPattern> getNac();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.simplegt.OutPattern#getOutputFor <em>Output For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(OutPattern)
	 * @see be.ac.vub.simplegt.SimplegtPackage#getRule_Output()
	 * @see be.ac.vub.simplegt.OutPattern#getOutputFor
	 * @model opposite="outputFor" containment="true"
	 * @generated
	 */
	OutPattern getOutput();

	/**
	 * Sets the value of the '{@link be.ac.vub.simplegt.Rule#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(OutPattern value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' attribute list.
	 * @see be.ac.vub.simplegt.SimplegtPackage#getRule_Extends()
	 * @model
	 * @generated
	 */
	EList<String> getExtends();

} // Rule
