/**
 */
package be.ac.vub.simplegt.benchmarks.MutexB.impl;

import be.ac.vub.simplegt.benchmarks.MutexB.MutexBFactory;
import be.ac.vub.simplegt.benchmarks.MutexB.MutexBPackage;
import be.ac.vub.simplegt.benchmarks.MutexB.Resource;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MutexBFactoryImpl extends EFactoryImpl implements MutexBFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MutexBFactory init()
  {
    try
    {
      MutexBFactory theMutexBFactory = (MutexBFactory)EPackage.Registry.INSTANCE.getEFactory(MutexBPackage.eNS_URI);
      if (theMutexBFactory != null)
      {
        return theMutexBFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MutexBFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MutexBFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MutexBPackage.PROCESS: return createProcess();
      case MutexBPackage.RESOURCE: return createResource();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public be.ac.vub.simplegt.benchmarks.MutexB.Process createProcess()
  {
    ProcessImpl process = new ProcessImpl();
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resource createResource()
  {
    ResourceImpl resource = new ResourceImpl();
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MutexBPackage getMutexBPackage()
  {
    return (MutexBPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MutexBPackage getPackage()
  {
    return MutexBPackage.eINSTANCE;
  }

} //MutexBFactoryImpl
