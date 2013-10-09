/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package org.eclipselabs.simplegt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.simplegt.InstanceModel#getMetaModel <em>Meta Model</em>}</li>
 *   <li>{@link org.eclipselabs.simplegt.InstanceModel#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.simplegt.SimplegtPackage#getInstanceModel()
 * @model
 * @generated
 */
public interface InstanceModel extends Model {
	/**
	 * Returns the value of the '<em><b>Meta Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Model</em>' containment reference.
	 * @see #setMetaModel(Metamodel)
	 * @see org.eclipselabs.simplegt.SimplegtPackage#getInstanceModel_MetaModel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Metamodel getMetaModel();

	/**
	 * Sets the value of the '{@link org.eclipselabs.simplegt.InstanceModel#getMetaModel <em>Meta Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Model</em>' containment reference.
	 * @see #getMetaModel()
	 * @generated
	 */
	void setMetaModel(Metamodel value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipselabs.simplegt.Module#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(Module)
	 * @see org.eclipselabs.simplegt.SimplegtPackage#getInstanceModel_Module()
	 * @see org.eclipselabs.simplegt.Module#getModels
	 * @model opposite="models" transient="false"
	 * @generated
	 */
	Module getModule();

	/**
	 * Sets the value of the '{@link org.eclipselabs.simplegt.InstanceModel#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(Module value);

} // InstanceModel
