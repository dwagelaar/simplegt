/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.util;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractSimplegtInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	private java.util.List<be.ac.vub.simplegt.resource.simplegt.ISimplegtInterpreterListener> listeners = new java.util.ArrayList<be.ac.vub.simplegt.resource.simplegt.ISimplegtInterpreterListener>();
	private org.eclipse.emf.ecore.EObject nextObjectToInterprete;
	private Object currentContext;
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		org.eclipse.emf.ecore.EObject next = null;
		currentContext = context;
		while (!interpretationStack.empty()) {
			try {
				next = interpretationStack.pop();
			} catch (java.util.EmptyStackException ese) {
				// this can happen when the interpreter was terminated between the call to empty()
				// and pop()
				break;
			}
			nextObjectToInterprete = next;
			notifyListeners(next);
			result = interprete(next, context);
			if (!continueInterpretation(context, result)) {
				break;
			}
		}
		currentContext = null;
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ContextType context, ResultType result) {
		return true;
	}
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof be.ac.vub.simplegt.InstanceModel) {
			result = interprete_be_ac_vub_simplegt_InstanceModel((be.ac.vub.simplegt.InstanceModel) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof be.ac.vub.simplegt.Metamodel) {
			result = interprete_be_ac_vub_simplegt_Metamodel((be.ac.vub.simplegt.Metamodel) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof be.ac.vub.simplegt.Model) {
			result = interprete_be_ac_vub_simplegt_Model((be.ac.vub.simplegt.Model) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof be.ac.vub.simplegt.EnumLiteralExp) {
			result = interprete_be_ac_vub_simplegt_EnumLiteralExp((be.ac.vub.simplegt.EnumLiteralExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof be.ac.vub.simplegt.BooleanLiteralExp) {
			result = interprete_be_ac_vub_simplegt_BooleanLiteralExp((be.ac.vub.simplegt.BooleanLiteralExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof be.ac.vub.simplegt.DoubleLiteralExp) {
			result = interprete_be_ac_vub_simplegt_DoubleLiteralExp((be.ac.vub.simplegt.DoubleLiteralExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof be.ac.vub.simplegt.IntegerLiteralExp) {
			result = interprete_be_ac_vub_simplegt_IntegerLiteralExp((be.ac.vub.simplegt.IntegerLiteralExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof be.ac.vub.simplegt.StringLiteralExp) {
			result = interprete_be_ac_vub_simplegt_StringLiteralExp((be.ac.vub.simplegt.StringLiteralExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof be.ac.vub.simplegt.LiteralExp) {
			result = interprete_be_ac_vub_simplegt_LiteralExp((be.ac.vub.simplegt.LiteralExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof be.ac.vub.simplegt.ElementExp) {
			result = interprete_be_ac_vub_simplegt_ElementExp((be.ac.vub.simplegt.ElementExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof be.ac.vub.simplegt.Expression) {
			result = interprete_be_ac_vub_simplegt_Expression((be.ac.vub.simplegt.Expression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof be.ac.vub.simplegt.OutputBinding) {
			result = interprete_be_ac_vub_simplegt_OutputBinding((be.ac.vub.simplegt.OutputBinding) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof be.ac.vub.simplegt.InputBinding) {
			result = interprete_be_ac_vub_simplegt_InputBinding((be.ac.vub.simplegt.InputBinding) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof be.ac.vub.simplegt.Binding) {
			result = interprete_be_ac_vub_simplegt_Binding((be.ac.vub.simplegt.Binding) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof be.ac.vub.simplegt.OutputElement) {
			result = interprete_be_ac_vub_simplegt_OutputElement((be.ac.vub.simplegt.OutputElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof be.ac.vub.simplegt.InputElement) {
			result = interprete_be_ac_vub_simplegt_InputElement((be.ac.vub.simplegt.InputElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof be.ac.vub.simplegt.RuleElement) {
			result = interprete_be_ac_vub_simplegt_RuleElement((be.ac.vub.simplegt.RuleElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof be.ac.vub.simplegt.OutPattern) {
			result = interprete_be_ac_vub_simplegt_OutPattern((be.ac.vub.simplegt.OutPattern) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof be.ac.vub.simplegt.NacPattern) {
			result = interprete_be_ac_vub_simplegt_NacPattern((be.ac.vub.simplegt.NacPattern) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof be.ac.vub.simplegt.InPattern) {
			result = interprete_be_ac_vub_simplegt_InPattern((be.ac.vub.simplegt.InPattern) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof be.ac.vub.simplegt.InputElementPattern) {
			result = interprete_be_ac_vub_simplegt_InputElementPattern((be.ac.vub.simplegt.InputElementPattern) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof be.ac.vub.simplegt.Rule) {
			result = interprete_be_ac_vub_simplegt_Rule((be.ac.vub.simplegt.Rule) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof be.ac.vub.simplegt.Module) {
			result = interprete_be_ac_vub_simplegt_Module((be.ac.vub.simplegt.Module) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof be.ac.vub.simplegt.TypedElement) {
			result = interprete_be_ac_vub_simplegt_TypedElement((be.ac.vub.simplegt.TypedElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof be.ac.vub.simplegt.Type) {
			result = interprete_be_ac_vub_simplegt_Type((be.ac.vub.simplegt.Type) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof be.ac.vub.simplegt.NamedElement) {
			result = interprete_be_ac_vub_simplegt_NamedElement((be.ac.vub.simplegt.NamedElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof be.ac.vub.simplegt.LocatedElement) {
			result = interprete_be_ac_vub_simplegt_LocatedElement((be.ac.vub.simplegt.LocatedElement) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_be_ac_vub_simplegt_LocatedElement(be.ac.vub.simplegt.LocatedElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_be_ac_vub_simplegt_NamedElement(be.ac.vub.simplegt.NamedElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_be_ac_vub_simplegt_Type(be.ac.vub.simplegt.Type object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_be_ac_vub_simplegt_TypedElement(be.ac.vub.simplegt.TypedElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_be_ac_vub_simplegt_Module(be.ac.vub.simplegt.Module object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_be_ac_vub_simplegt_Rule(be.ac.vub.simplegt.Rule object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_be_ac_vub_simplegt_InputElementPattern(be.ac.vub.simplegt.InputElementPattern object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_be_ac_vub_simplegt_InPattern(be.ac.vub.simplegt.InPattern object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_be_ac_vub_simplegt_NacPattern(be.ac.vub.simplegt.NacPattern object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_be_ac_vub_simplegt_OutPattern(be.ac.vub.simplegt.OutPattern object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_be_ac_vub_simplegt_RuleElement(be.ac.vub.simplegt.RuleElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_be_ac_vub_simplegt_InputElement(be.ac.vub.simplegt.InputElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_be_ac_vub_simplegt_OutputElement(be.ac.vub.simplegt.OutputElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_be_ac_vub_simplegt_Binding(be.ac.vub.simplegt.Binding object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_be_ac_vub_simplegt_InputBinding(be.ac.vub.simplegt.InputBinding object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_be_ac_vub_simplegt_OutputBinding(be.ac.vub.simplegt.OutputBinding object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_be_ac_vub_simplegt_Expression(be.ac.vub.simplegt.Expression object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_be_ac_vub_simplegt_ElementExp(be.ac.vub.simplegt.ElementExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_be_ac_vub_simplegt_LiteralExp(be.ac.vub.simplegt.LiteralExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_be_ac_vub_simplegt_StringLiteralExp(be.ac.vub.simplegt.StringLiteralExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_be_ac_vub_simplegt_IntegerLiteralExp(be.ac.vub.simplegt.IntegerLiteralExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_be_ac_vub_simplegt_DoubleLiteralExp(be.ac.vub.simplegt.DoubleLiteralExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_be_ac_vub_simplegt_BooleanLiteralExp(be.ac.vub.simplegt.BooleanLiteralExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_be_ac_vub_simplegt_EnumLiteralExp(be.ac.vub.simplegt.EnumLiteralExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_be_ac_vub_simplegt_Model(be.ac.vub.simplegt.Model object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_be_ac_vub_simplegt_Metamodel(be.ac.vub.simplegt.Metamodel object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_be_ac_vub_simplegt_InstanceModel(be.ac.vub.simplegt.InstanceModel object, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (be.ac.vub.simplegt.resource.simplegt.ISimplegtInterpreterListener listener : listeners) {
			listener.handleInterpreteObject(element);
		}
	}
	
	/**
	 * Adds the given object to the interpretation stack. Attention: Objects that are
	 * added first, are interpret last.
	 */
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
	/**
	 * Adds the given collection of objects to the interpretation stack. Attention:
	 * Collections that are added first, are interpret last.
	 */
	public void addObjectsToInterprete(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		for (org.eclipse.emf.ecore.EObject object : objects) {
			addObjectToInterprete(object);
		}
	}
	
	/**
	 * Adds the given collection of objects in reverse order to the interpretation
	 * stack.
	 */
	public void addObjectsToInterpreteInReverseOrder(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		java.util.List<org.eclipse.emf.ecore.EObject> reverse = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>(objects.size());
		reverse.addAll(objects);
		java.util.Collections.reverse(reverse);
		addObjectsToInterprete(reverse);
	}
	
	/**
	 * Adds the given object and all its children to the interpretation stack such
	 * that they are interpret in top down order.
	 */
	public void addObjectTreeToInterpreteTopDown(org.eclipse.emf.ecore.EObject root) {
		java.util.List<org.eclipse.emf.ecore.EObject> objects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		objects.add(root);
		java.util.Iterator<org.eclipse.emf.ecore.EObject> it = root.eAllContents();
		while (it.hasNext()) {
			org.eclipse.emf.ecore.EObject eObject = (org.eclipse.emf.ecore.EObject) it.next();
			objects.add(eObject);
		}
		addObjectsToInterpreteInReverseOrder(objects);
	}
	
	public void addListener(be.ac.vub.simplegt.resource.simplegt.ISimplegtInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(be.ac.vub.simplegt.resource.simplegt.ISimplegtInterpreterListener listener) {
		return listeners.remove(listener);
	}
	
	public org.eclipse.emf.ecore.EObject getNextObjectToInterprete() {
		return nextObjectToInterprete;
	}
	
	public java.util.Stack<org.eclipse.emf.ecore.EObject> getInterpretationStack() {
		return interpretationStack;
	}
	
	public void terminate() {
		interpretationStack.clear();
	}
	
	public Object getCurrentContext() {
		return currentContext;
	}
	
}
