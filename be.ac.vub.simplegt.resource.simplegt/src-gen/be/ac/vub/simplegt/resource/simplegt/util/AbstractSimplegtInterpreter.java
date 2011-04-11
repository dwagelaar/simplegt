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
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		while (!interpretationStack.empty()) {
			org.eclipse.emf.ecore.EObject next = interpretationStack.pop();
			result = interprete(next, context);
			if (!continueInterpretation(result)) {
				break;
			}
		}
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ResultType result) {
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
		if (object instanceof be.ac.vub.simplegt.CharLiteralExp) {
			result = interprete_be_ac_vub_simplegt_CharLiteralExp((be.ac.vub.simplegt.CharLiteralExp) object, context);
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
	
	public ResultType interprete_be_ac_vub_simplegt_CharLiteralExp(be.ac.vub.simplegt.CharLiteralExp object, ContextType context) {
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
	
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
}
