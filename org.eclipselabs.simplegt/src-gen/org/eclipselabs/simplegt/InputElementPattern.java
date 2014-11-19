/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package org.eclipselabs.simplegt;

import org.eclipse.emf.common.util.EList;
import org.eclipselabs.simpleocl.LocatedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Element Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.simplegt.InputElementPattern#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.simplegt.SimplegtPackage#getInputElementPattern()
 * @model abstract="true"
 * @generated
 */
public interface InputElementPattern extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.simplegt.InputElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipselabs.simplegt.InputElement#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.eclipselabs.simplegt.SimplegtPackage#getInputElementPattern_Elements()
	 * @see org.eclipselabs.simplegt.InputElement#getPattern
	 * @model opposite="pattern" containment="true" required="true"
	 * @generated
	 */
	EList<InputElement> getElements();

} // InputElementPattern
