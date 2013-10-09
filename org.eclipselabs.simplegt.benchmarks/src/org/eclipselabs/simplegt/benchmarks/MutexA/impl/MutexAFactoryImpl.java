/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 */
package org.eclipselabs.simplegt.benchmarks.MutexA.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipselabs.simplegt.benchmarks.MutexA.MutexAFactory;
import org.eclipselabs.simplegt.benchmarks.MutexA.MutexAPackage;
import org.eclipselabs.simplegt.benchmarks.MutexA.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MutexAFactoryImpl extends EFactoryImpl implements MutexAFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MutexAFactory init() {
		try {
			MutexAFactory theMutexAFactory = (MutexAFactory)EPackage.Registry.INSTANCE.getEFactory("http://soft.vub.ac.be/simplegt/2011/MutexA"); 
			if (theMutexAFactory != null) {
				return theMutexAFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MutexAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutexAFactoryImpl() {
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
			case MutexAPackage.PROCESS: return createProcess();
			case MutexAPackage.RESOURCE: return createResource();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipselabs.simplegt.benchmarks.MutexA.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutexAPackage getMutexAPackage() {
		return (MutexAPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MutexAPackage getPackage() {
		return MutexAPackage.eINSTANCE;
	}

} //MutexAFactoryImpl
