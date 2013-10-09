/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package org.eclipselabs.simplegt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Located Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.simplegt.LocatedElement#getLine <em>Line</em>}</li>
 *   <li>{@link org.eclipselabs.simplegt.LocatedElement#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipselabs.simplegt.LocatedElement#getCharStart <em>Char Start</em>}</li>
 *   <li>{@link org.eclipselabs.simplegt.LocatedElement#getCharEnd <em>Char End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.simplegt.SimplegtPackage#getLocatedElement()
 * @model abstract="true"
 * @generated
 */
public interface LocatedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see org.eclipselabs.simplegt.SimplegtPackage#getLocatedElement_Line()
	 * @model default="-1" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getLine();

	/**
	 * Returns the value of the '<em><b>Column</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' attribute.
	 * @see org.eclipselabs.simplegt.SimplegtPackage#getLocatedElement_Column()
	 * @model default="-1" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getColumn();

	/**
	 * Returns the value of the '<em><b>Char Start</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char Start</em>' attribute.
	 * @see org.eclipselabs.simplegt.SimplegtPackage#getLocatedElement_CharStart()
	 * @model default="-1" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getCharStart();

	/**
	 * Returns the value of the '<em><b>Char End</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char End</em>' attribute.
	 * @see org.eclipselabs.simplegt.SimplegtPackage#getLocatedElement_CharEnd()
	 * @model default="-1" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getCharEnd();

} // LocatedElement
