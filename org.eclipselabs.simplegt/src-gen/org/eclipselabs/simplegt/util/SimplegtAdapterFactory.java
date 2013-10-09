/**
 * (C) 2011, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package org.eclipselabs.simplegt.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.simplegt.*;
import org.eclipselabs.simplegt.Binding;
import org.eclipselabs.simplegt.InPattern;
import org.eclipselabs.simplegt.InputBinding;
import org.eclipselabs.simplegt.InputElement;
import org.eclipselabs.simplegt.InputElementPattern;
import org.eclipselabs.simplegt.Module;
import org.eclipselabs.simplegt.NacPattern;
import org.eclipselabs.simplegt.OutPattern;
import org.eclipselabs.simplegt.OutputBinding;
import org.eclipselabs.simplegt.OutputElement;
import org.eclipselabs.simplegt.Rule;
import org.eclipselabs.simplegt.RuleElement;
import org.eclipselabs.simplegt.SimplegtPackage;
import org.eclipselabs.simpleocl.LocatedElement;
import org.eclipselabs.simpleocl.ModuleElement;
import org.eclipselabs.simpleocl.NamedElement;
import org.eclipselabs.simpleocl.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.simplegt.SimplegtPackage
 * @generated
 */
public class SimplegtAdapterFactory extends AdapterFactoryImpl {
	/**
   * The cached model package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static SimplegtPackage modelPackage;

	/**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SimplegtAdapterFactory() {
    if (modelPackage == null)
    {
      modelPackage = SimplegtPackage.eINSTANCE;
    }
  }

	/**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
	@Override
	public boolean isFactoryForType(Object object) {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

	/**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SimplegtSwitch<Adapter> modelSwitch =
		new SimplegtSwitch<Adapter>()
    {
      @Override
      public Adapter caseModule(Module object)
      {
        return createModuleAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter caseInputElementPattern(InputElementPattern object)
      {
        return createInputElementPatternAdapter();
      }
      @Override
      public Adapter caseInPattern(InPattern object)
      {
        return createInPatternAdapter();
      }
      @Override
      public Adapter caseNacPattern(NacPattern object)
      {
        return createNacPatternAdapter();
      }
      @Override
      public Adapter caseOutPattern(OutPattern object)
      {
        return createOutPatternAdapter();
      }
      @Override
      public Adapter caseRuleElement(RuleElement object)
      {
        return createRuleElementAdapter();
      }
      @Override
      public Adapter caseInputElement(InputElement object)
      {
        return createInputElementAdapter();
      }
      @Override
      public Adapter caseOutputElement(OutputElement object)
      {
        return createOutputElementAdapter();
      }
      @Override
      public Adapter caseBinding(Binding object)
      {
        return createBindingAdapter();
      }
      @Override
      public Adapter caseInputBinding(InputBinding object)
      {
        return createInputBindingAdapter();
      }
      @Override
      public Adapter caseOutputBinding(OutputBinding object)
      {
        return createOutputBindingAdapter();
      }
      @Override
      public Adapter caseLocatedElement(LocatedElement object)
      {
        return createLocatedElementAdapter();
      }
      @Override
      public Adapter caseNamedElement(NamedElement object)
      {
        return createNamedElementAdapter();
      }
      @Override
      public Adapter caseSimpleocl_Module(org.eclipselabs.simpleocl.Module object)
      {
        return createSimpleocl_ModuleAdapter();
      }
      @Override
      public Adapter caseModuleElement(ModuleElement object)
      {
        return createModuleElementAdapter();
      }
      @Override
      public Adapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

	/**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
	@Override
	public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }


	/**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.simpleocl.LocatedElement <em>Located Element</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.simpleocl.LocatedElement
   * @generated
   */
	public Adapter createLocatedElementAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.simpleocl.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.simpleocl.NamedElement
   * @generated
   */
	public Adapter createNamedElementAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.simpleocl.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.simpleocl.Module
   * @generated
   */
	public Adapter createSimpleocl_ModuleAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.simpleocl.ModuleElement <em>Module Element</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.simpleocl.ModuleElement
   * @generated
   */
	public Adapter createModuleElementAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.simpleocl.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.simpleocl.VariableDeclaration
   * @generated
   */
	public Adapter createVariableDeclarationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.simplegt.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.simplegt.Module
   * @generated
   */
	public Adapter createModuleAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.simplegt.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.simplegt.Rule
   * @generated
   */
	public Adapter createRuleAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.simplegt.InputElementPattern <em>Input Element Pattern</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.simplegt.InputElementPattern
   * @generated
   */
	public Adapter createInputElementPatternAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.simplegt.InPattern <em>In Pattern</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.simplegt.InPattern
   * @generated
   */
	public Adapter createInPatternAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.simplegt.NacPattern <em>Nac Pattern</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.simplegt.NacPattern
   * @generated
   */
	public Adapter createNacPatternAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.simplegt.OutPattern <em>Out Pattern</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.simplegt.OutPattern
   * @generated
   */
	public Adapter createOutPatternAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.simplegt.RuleElement <em>Rule Element</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.simplegt.RuleElement
   * @generated
   */
	public Adapter createRuleElementAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.simplegt.InputElement <em>Input Element</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.simplegt.InputElement
   * @generated
   */
	public Adapter createInputElementAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.simplegt.OutputElement <em>Output Element</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.simplegt.OutputElement
   * @generated
   */
	public Adapter createOutputElementAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.simplegt.Binding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.simplegt.Binding
   * @generated
   */
	public Adapter createBindingAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.simplegt.InputBinding <em>Input Binding</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.simplegt.InputBinding
   * @generated
   */
	public Adapter createInputBindingAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.simplegt.OutputBinding <em>Output Binding</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.simplegt.OutputBinding
   * @generated
   */
	public Adapter createOutputBindingAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
	public Adapter createEObjectAdapter() {
    return null;
  }

} //SimplegtAdapterFactory
