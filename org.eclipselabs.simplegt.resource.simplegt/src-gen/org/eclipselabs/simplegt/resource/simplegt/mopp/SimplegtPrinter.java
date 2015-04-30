/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.mopp;

public class SimplegtPrinter implements org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextPrinter {
	
	protected org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolverFactory tokenResolverFactory = new org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextResource resource;
	
	private java.util.Map<?, ?> options;
	private String encoding = System.getProperty("file.encoding");
	
	public SimplegtPrinter(java.io.OutputStream outputStream, org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected int matchCount(java.util.Map<String, Integer> featureCounter, java.util.Collection<String> needed) {
		int pos = 0;
		int neg = 0;
		
		for (String featureName : featureCounter.keySet()) {
			if (needed.contains(featureName)) {
				int value = featureCounter.get(featureName);
				if (value == 0) {
					neg += 1;
				} else {
					pos += 1;
				}
			}
		}
		return neg > 0 ? -neg : pos;
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.io.PrintWriter out, String globaltab) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof org.eclipselabs.simplegt.Module) {
			print_org_eclipselabs_simplegt_Module((org.eclipselabs.simplegt.Module) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simplegt.Rule) {
			print_org_eclipselabs_simplegt_Rule((org.eclipselabs.simplegt.Rule) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simplegt.InPattern) {
			print_org_eclipselabs_simplegt_InPattern((org.eclipselabs.simplegt.InPattern) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simplegt.InputElement) {
			print_org_eclipselabs_simplegt_InputElement((org.eclipselabs.simplegt.InputElement) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simplegt.InputBinding) {
			print_org_eclipselabs_simplegt_InputBinding((org.eclipselabs.simplegt.InputBinding) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simplegt.NacPattern) {
			print_org_eclipselabs_simplegt_NacPattern((org.eclipselabs.simplegt.NacPattern) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simplegt.OutPattern) {
			print_org_eclipselabs_simplegt_OutPattern((org.eclipselabs.simplegt.OutPattern) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simplegt.OutputElement) {
			print_org_eclipselabs_simplegt_OutputElement((org.eclipselabs.simplegt.OutputElement) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simplegt.OutputBinding) {
			print_org_eclipselabs_simplegt_OutputBinding((org.eclipselabs.simplegt.OutputBinding) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.Module) {
			print_org_eclipselabs_simpleocl_Module((org.eclipselabs.simpleocl.Module) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.Import) {
			print_org_eclipselabs_simpleocl_Import((org.eclipselabs.simpleocl.Import) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.OclFeatureDefinition) {
			print_org_eclipselabs_simpleocl_OclFeatureDefinition((org.eclipselabs.simpleocl.OclFeatureDefinition) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.OclContextDefinition) {
			print_org_eclipselabs_simpleocl_OclContextDefinition((org.eclipselabs.simpleocl.OclContextDefinition) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.OclMetamodel) {
			print_org_eclipselabs_simpleocl_OclMetamodel((org.eclipselabs.simpleocl.OclMetamodel) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.OclInstanceModel) {
			print_org_eclipselabs_simpleocl_OclInstanceModel((org.eclipselabs.simpleocl.OclInstanceModel) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.Attribute) {
			print_org_eclipselabs_simpleocl_Attribute((org.eclipselabs.simpleocl.Attribute) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.Operation) {
			print_org_eclipselabs_simpleocl_Operation((org.eclipselabs.simpleocl.Operation) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.Parameter) {
			print_org_eclipselabs_simpleocl_Parameter((org.eclipselabs.simpleocl.Parameter) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.OclModelElementExp) {
			print_org_eclipselabs_simpleocl_OclModelElementExp((org.eclipselabs.simpleocl.OclModelElementExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.LambdaCallExp) {
			print_org_eclipselabs_simpleocl_LambdaCallExp((org.eclipselabs.simpleocl.LambdaCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.VariableExp) {
			print_org_eclipselabs_simpleocl_VariableExp((org.eclipselabs.simpleocl.VariableExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.SuperExp) {
			print_org_eclipselabs_simpleocl_SuperExp((org.eclipselabs.simpleocl.SuperExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.SelfExp) {
			print_org_eclipselabs_simpleocl_SelfExp((org.eclipselabs.simpleocl.SelfExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.EnvExp) {
			print_org_eclipselabs_simpleocl_EnvExp((org.eclipselabs.simpleocl.EnvExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.StringExp) {
			print_org_eclipselabs_simpleocl_StringExp((org.eclipselabs.simpleocl.StringExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.BooleanExp) {
			print_org_eclipselabs_simpleocl_BooleanExp((org.eclipselabs.simpleocl.BooleanExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.RealExp) {
			print_org_eclipselabs_simpleocl_RealExp((org.eclipselabs.simpleocl.RealExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.IntegerExp) {
			print_org_eclipselabs_simpleocl_IntegerExp((org.eclipselabs.simpleocl.IntegerExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.CollectionRange) {
			print_org_eclipselabs_simpleocl_CollectionRange((org.eclipselabs.simpleocl.CollectionRange) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.CollectionItem) {
			print_org_eclipselabs_simpleocl_CollectionItem((org.eclipselabs.simpleocl.CollectionItem) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.BagExp) {
			print_org_eclipselabs_simpleocl_BagExp((org.eclipselabs.simpleocl.BagExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.OrderedSetExp) {
			print_org_eclipselabs_simpleocl_OrderedSetExp((org.eclipselabs.simpleocl.OrderedSetExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.SequenceExp) {
			print_org_eclipselabs_simpleocl_SequenceExp((org.eclipselabs.simpleocl.SequenceExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.SetExp) {
			print_org_eclipselabs_simpleocl_SetExp((org.eclipselabs.simpleocl.SetExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.TupleExp) {
			print_org_eclipselabs_simpleocl_TupleExp((org.eclipselabs.simpleocl.TupleExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.TuplePart) {
			print_org_eclipselabs_simpleocl_TuplePart((org.eclipselabs.simpleocl.TuplePart) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.MapExp) {
			print_org_eclipselabs_simpleocl_MapExp((org.eclipselabs.simpleocl.MapExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.MapElement) {
			print_org_eclipselabs_simpleocl_MapElement((org.eclipselabs.simpleocl.MapElement) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.EnumLiteralExp) {
			print_org_eclipselabs_simpleocl_EnumLiteralExp((org.eclipselabs.simpleocl.EnumLiteralExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.OclUndefinedExp) {
			print_org_eclipselabs_simpleocl_OclUndefinedExp((org.eclipselabs.simpleocl.OclUndefinedExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.LetExp) {
			print_org_eclipselabs_simpleocl_LetExp((org.eclipselabs.simpleocl.LetExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.IfExp) {
			print_org_eclipselabs_simpleocl_IfExp((org.eclipselabs.simpleocl.IfExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.BraceExp) {
			print_org_eclipselabs_simpleocl_BraceExp((org.eclipselabs.simpleocl.BraceExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.EqOpCallExp) {
			print_org_eclipselabs_simpleocl_EqOpCallExp((org.eclipselabs.simpleocl.EqOpCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.RelOpCallExp) {
			print_org_eclipselabs_simpleocl_RelOpCallExp((org.eclipselabs.simpleocl.RelOpCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.AddOpCallExp) {
			print_org_eclipselabs_simpleocl_AddOpCallExp((org.eclipselabs.simpleocl.AddOpCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.IntOpCallExp) {
			print_org_eclipselabs_simpleocl_IntOpCallExp((org.eclipselabs.simpleocl.IntOpCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.MulOpCallExp) {
			print_org_eclipselabs_simpleocl_MulOpCallExp((org.eclipselabs.simpleocl.MulOpCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.NotOpCallExp) {
			print_org_eclipselabs_simpleocl_NotOpCallExp((org.eclipselabs.simpleocl.NotOpCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.StaticPropertyCallExp) {
			print_org_eclipselabs_simpleocl_StaticPropertyCallExp((org.eclipselabs.simpleocl.StaticPropertyCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.StaticOperationCall) {
			print_org_eclipselabs_simpleocl_StaticOperationCall((org.eclipselabs.simpleocl.StaticOperationCall) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.StaticNavigationOrAttributeCall) {
			print_org_eclipselabs_simpleocl_StaticNavigationOrAttributeCall((org.eclipselabs.simpleocl.StaticNavigationOrAttributeCall) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.PropertyCallExp) {
			print_org_eclipselabs_simpleocl_PropertyCallExp((org.eclipselabs.simpleocl.PropertyCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.NavigationOrAttributeCall) {
			print_org_eclipselabs_simpleocl_NavigationOrAttributeCall((org.eclipselabs.simpleocl.NavigationOrAttributeCall) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.IterateExp) {
			print_org_eclipselabs_simpleocl_IterateExp((org.eclipselabs.simpleocl.IterateExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.IteratorExp) {
			print_org_eclipselabs_simpleocl_IteratorExp((org.eclipselabs.simpleocl.IteratorExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.Iterator) {
			print_org_eclipselabs_simpleocl_Iterator((org.eclipselabs.simpleocl.Iterator) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.CollectionOperationCall) {
			print_org_eclipselabs_simpleocl_CollectionOperationCall((org.eclipselabs.simpleocl.CollectionOperationCall) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.StringType) {
			print_org_eclipselabs_simpleocl_StringType((org.eclipselabs.simpleocl.StringType) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.BooleanType) {
			print_org_eclipselabs_simpleocl_BooleanType((org.eclipselabs.simpleocl.BooleanType) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.IntegerType) {
			print_org_eclipselabs_simpleocl_IntegerType((org.eclipselabs.simpleocl.IntegerType) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.RealType) {
			print_org_eclipselabs_simpleocl_RealType((org.eclipselabs.simpleocl.RealType) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.BagType) {
			print_org_eclipselabs_simpleocl_BagType((org.eclipselabs.simpleocl.BagType) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.OrderedSetType) {
			print_org_eclipselabs_simpleocl_OrderedSetType((org.eclipselabs.simpleocl.OrderedSetType) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.SequenceType) {
			print_org_eclipselabs_simpleocl_SequenceType((org.eclipselabs.simpleocl.SequenceType) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.SetType) {
			print_org_eclipselabs_simpleocl_SetType((org.eclipselabs.simpleocl.SetType) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.OclAnyType) {
			print_org_eclipselabs_simpleocl_OclAnyType((org.eclipselabs.simpleocl.OclAnyType) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.TupleType) {
			print_org_eclipselabs_simpleocl_TupleType((org.eclipselabs.simpleocl.TupleType) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.TupleTypeAttribute) {
			print_org_eclipselabs_simpleocl_TupleTypeAttribute((org.eclipselabs.simpleocl.TupleTypeAttribute) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.OclModelElement) {
			print_org_eclipselabs_simpleocl_OclModelElement((org.eclipselabs.simpleocl.OclModelElement) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.MapType) {
			print_org_eclipselabs_simpleocl_MapType((org.eclipselabs.simpleocl.MapType) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.LambdaType) {
			print_org_eclipselabs_simpleocl_LambdaType((org.eclipselabs.simpleocl.LambdaType) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.EnvType) {
			print_org_eclipselabs_simpleocl_EnvType((org.eclipselabs.simpleocl.EnvType) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.LocalVariable) {
			print_org_eclipselabs_simpleocl_LocalVariable((org.eclipselabs.simpleocl.LocalVariable) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.OperatorCallExp) {
			print_org_eclipselabs_simpleocl_OperatorCallExp((org.eclipselabs.simpleocl.OperatorCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.OperationCall) {
			print_org_eclipselabs_simpleocl_OperationCall((org.eclipselabs.simpleocl.OperationCall) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.CollectionType) {
			print_org_eclipselabs_simpleocl_CollectionType((org.eclipselabs.simpleocl.CollectionType) element, globaltab, out);
			return;
		}
		if (element instanceof org.eclipselabs.simpleocl.OclType) {
			print_org_eclipselabs_simpleocl_OclType((org.eclipselabs.simpleocl.OclType) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtReferenceResolverSwitch) new org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtProblem(errorMessage, org.eclipselabs.simplegt.resource.simplegt.SimplegtEProblemType.PRINT_PROBLEM, org.eclipselabs.simplegt.resource.simplegt.SimplegtEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public void setEncoding(String encoding) {
		if (encoding != null) {
			this.encoding = encoding;
		}
	}
	
	public String getEncoding() {
		return encoding;
	}
	
	public org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextResource getResource() {
		return resource;
	}
	
	/**
	 * Calls {@link #doPrint(EObject, PrintWriter, String)} and writes the result to
	 * the underlying output stream.
	 */
	public void print(org.eclipse.emf.ecore.EObject element) throws java.io.IOException {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.OutputStreamWriter(new java.io.BufferedOutputStream(outputStream), encoding));
		doPrint(element, out, "");
		out.flush();
		out.close();
	}
	
	public void print_org_eclipselabs_simplegt_Module(org.eclipselabs.simplegt.Module element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(10);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.MODULE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.MODULE__METAMODELS));
		printCountingMap.put("metamodels", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.MODULE__IMPORTS));
		printCountingMap.put("imports", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.MODULE__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.MODULE__MODELS));
		printCountingMap.put("models", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.MODULE__DEBUG));
		printCountingMap.put("debug", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("module");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.MODULE__NAME));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.MODULE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("debug");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.MODULE__DEBUG));
			if (o != null) {
			}
			printCountingMap.put("debug", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_eclipselabs_simplegt_Module_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_eclipselabs_simplegt_Module_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("transform");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("models");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.MODULE__MODELS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("models", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_eclipselabs_simplegt_Module_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_eclipselabs_simplegt_Module_3(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_eclipselabs_simplegt_Module_0(org.eclipselabs.simplegt.Module element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("imports");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.MODULE__IMPORTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("imports", 0);
		}
	}
	
	public void print_org_eclipselabs_simplegt_Module_1(org.eclipselabs.simplegt.Module element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("metamodels");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.MODULE__METAMODELS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("metamodels", 0);
		}
	}
	
	public void print_org_eclipselabs_simplegt_Module_2(org.eclipselabs.simplegt.Module element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("models");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.MODULE__MODELS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("models", count - 1);
		}
	}
	
	public void print_org_eclipselabs_simplegt_Module_3(org.eclipselabs.simplegt.Module element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.MODULE__ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elements", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simplegt_Rule(org.eclipselabs.simplegt.Rule element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(15);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.RULE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.RULE__MODULE));
		printCountingMap.put("module", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.RULE__ABSTRACT));
		printCountingMap.put("abstract", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.RULE__INPUT));
		printCountingMap.put("input", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.RULE__NAC));
		printCountingMap.put("nac", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.RULE__OUTPUT));
		printCountingMap.put("output", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.RULE__EXTENDS));
		printCountingMap.put("extends", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.RULE__DEFAULT));
		printCountingMap.put("default", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.RULE__UNIQUE));
		printCountingMap.put("unique", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.RULE__LAZY));
		printCountingMap.put("lazy", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.RULE__SINGLE));
		printCountingMap.put("single", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("abstract");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.RULE__ABSTRACT));
			if (o != null) {
			}
			printCountingMap.put("abstract", count - 1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("default");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.RULE__DEFAULT));
			if (o != null) {
			}
			printCountingMap.put("default", count - 1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("unique");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.RULE__UNIQUE));
			if (o != null) {
			}
			printCountingMap.put("unique", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_eclipselabs_simplegt_Rule_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("rule");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.RULE__NAME));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.RULE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_eclipselabs_simplegt_Rule_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("input");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.RULE__INPUT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("input", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("nac");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.RULE__NAC));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("nac", 0);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("output");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.RULE__OUTPUT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("output", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_org_eclipselabs_simplegt_Rule_0(org.eclipselabs.simplegt.Rule element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"single"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"lazy"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (BooleanTerminal)
				count = printCountingMap.get("lazy");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.RULE__LAZY));
					if (o != null) {
					}
					printCountingMap.put("lazy", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (BooleanTerminal)
			count = printCountingMap.get("single");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.RULE__SINGLE));
				if (o != null) {
				}
				printCountingMap.put("single", count - 1);
			}
		}
	}
	
	public void print_org_eclipselabs_simplegt_Rule_1(org.eclipselabs.simplegt.Rule element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("extends");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("extends");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.RULE__EXTENDS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.RULE__EXTENDS), element));
				out.print(" ");
			}
			printCountingMap.put("extends", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_eclipselabs_simplegt_Rule_1_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_eclipselabs_simplegt_Rule_1_0(org.eclipselabs.simplegt.Rule element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("extends");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.RULE__EXTENDS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.RULE__EXTENDS), element));
				out.print(" ");
			}
			printCountingMap.put("extends", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simplegt_InPattern(org.eclipselabs.simplegt.InPattern element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.IN_PATTERN__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.IN_PATTERN__INPUT_FOR));
		printCountingMap.put("inputFor", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("from");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.IN_PATTERN__ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elements", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_eclipselabs_simplegt_InPattern_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_eclipselabs_simplegt_InPattern_0(org.eclipselabs.simplegt.InPattern element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.IN_PATTERN__ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elements", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simplegt_InputElement(org.eclipselabs.simplegt.InputElement element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(10);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.INPUT_ELEMENT__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.INPUT_ELEMENT__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.INPUT_ELEMENT__VARIABLE_EXP));
		printCountingMap.put("variableExp", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.INPUT_ELEMENT__IN_MODEL));
		printCountingMap.put("inModel", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.INPUT_ELEMENT__BINDINGS));
		printCountingMap.put("bindings", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.INPUT_ELEMENT__PATTERN));
		printCountingMap.put("pattern", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("varName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.INPUT_ELEMENT__VAR_NAME));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.INPUT_ELEMENT__VAR_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("varName", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.INPUT_ELEMENT__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_eclipselabs_simplegt_InputElement_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_eclipselabs_simplegt_InputElement_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_eclipselabs_simplegt_InputElement_0(org.eclipselabs.simplegt.InputElement element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("in");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("inModel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.INPUT_ELEMENT__IN_MODEL));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getRuleElementInModelReferenceResolver().deResolve((org.eclipselabs.simpleocl.OclInstanceModel) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.INPUT_ELEMENT__IN_MODEL)), element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.INPUT_ELEMENT__IN_MODEL), element));
				out.print(" ");
			}
			printCountingMap.put("inModel", count - 1);
		}
	}
	
	public void print_org_eclipselabs_simplegt_InputElement_1(org.eclipselabs.simplegt.InputElement element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("bindings");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.INPUT_ELEMENT__BINDINGS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("bindings", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_eclipselabs_simplegt_InputElement_1_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_eclipselabs_simplegt_InputElement_1_0(org.eclipselabs.simplegt.InputElement element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("bindings");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.INPUT_ELEMENT__BINDINGS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("bindings", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simplegt_InputBinding(org.eclipselabs.simplegt.InputBinding element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.INPUT_BINDING__PROPERTY));
		printCountingMap.put("property", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.INPUT_BINDING__EXPR));
		printCountingMap.put("expr", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.INPUT_BINDING__ELEMENT));
		printCountingMap.put("element", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.INPUT_BINDING__LAST));
		printCountingMap.put("last", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("property");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.INPUT_BINDING__PROPERTY));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.INPUT_BINDING__PROPERTY), element));
				out.print(" ");
			}
			printCountingMap.put("property", count - 1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("last");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.INPUT_BINDING__LAST));
			if (o != null) {
			}
			printCountingMap.put("last", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("expr");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.INPUT_BINDING__EXPR));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("expr", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simplegt_NacPattern(org.eclipselabs.simplegt.NacPattern element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.NAC_PATTERN__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.NAC_PATTERN__NAC_FOR));
		printCountingMap.put("nacFor", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("not");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.NAC_PATTERN__ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elements", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_eclipselabs_simplegt_NacPattern_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_eclipselabs_simplegt_NacPattern_0(org.eclipselabs.simplegt.NacPattern element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.NAC_PATTERN__ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elements", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simplegt_OutPattern(org.eclipselabs.simplegt.OutPattern element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.OUT_PATTERN__OUTPUT_FOR));
		printCountingMap.put("outputFor", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.OUT_PATTERN__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("to");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.OUT_PATTERN__ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elements", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_eclipselabs_simplegt_OutPattern_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_eclipselabs_simplegt_OutPattern_0(org.eclipselabs.simplegt.OutPattern element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.OUT_PATTERN__ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elements", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simplegt_OutputElement(org.eclipselabs.simplegt.OutputElement element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(10);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.OUTPUT_ELEMENT__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.OUTPUT_ELEMENT__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.OUTPUT_ELEMENT__VARIABLE_EXP));
		printCountingMap.put("variableExp", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.OUTPUT_ELEMENT__IN_MODEL));
		printCountingMap.put("inModel", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.OUTPUT_ELEMENT__BINDINGS));
		printCountingMap.put("bindings", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.OUTPUT_ELEMENT__PATTERN));
		printCountingMap.put("pattern", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("varName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.OUTPUT_ELEMENT__VAR_NAME));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.OUTPUT_ELEMENT__VAR_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("varName", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.OUTPUT_ELEMENT__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_eclipselabs_simplegt_OutputElement_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_eclipselabs_simplegt_OutputElement_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_eclipselabs_simplegt_OutputElement_0(org.eclipselabs.simplegt.OutputElement element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("in");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("inModel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.OUTPUT_ELEMENT__IN_MODEL));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getRuleElementInModelReferenceResolver().deResolve((org.eclipselabs.simpleocl.OclInstanceModel) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.OUTPUT_ELEMENT__IN_MODEL)), element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.OUTPUT_ELEMENT__IN_MODEL), element));
				out.print(" ");
			}
			printCountingMap.put("inModel", count - 1);
		}
	}
	
	public void print_org_eclipselabs_simplegt_OutputElement_1(org.eclipselabs.simplegt.OutputElement element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("bindings");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.OUTPUT_ELEMENT__BINDINGS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("bindings", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_eclipselabs_simplegt_OutputElement_1_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_eclipselabs_simplegt_OutputElement_1_0(org.eclipselabs.simplegt.OutputElement element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("bindings");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.OUTPUT_ELEMENT__BINDINGS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("bindings", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simplegt_OutputBinding(org.eclipselabs.simplegt.OutputBinding element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.OUTPUT_BINDING__PROPERTY));
		printCountingMap.put("property", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.OUTPUT_BINDING__EXPR));
		printCountingMap.put("expr", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.OUTPUT_BINDING__ELEMENT));
		printCountingMap.put("element", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.OUTPUT_BINDING__BEFORE_ELEMENT));
		printCountingMap.put("beforeElement", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("property");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.OUTPUT_BINDING__PROPERTY));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.OUTPUT_BINDING__PROPERTY), element));
				out.print(" ");
			}
			printCountingMap.put("property", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("=~");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("expr");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.OUTPUT_BINDING__EXPR));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("expr", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_eclipselabs_simplegt_OutputBinding_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_eclipselabs_simplegt_OutputBinding_0(org.eclipselabs.simplegt.OutputBinding element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("before");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("beforeElement");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.OUTPUT_BINDING__BEFORE_ELEMENT));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getOutputBindingBeforeElementReferenceResolver().deResolve((org.eclipselabs.simplegt.RuleElement) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.OUTPUT_BINDING__BEFORE_ELEMENT)), element.eClass().getEStructuralFeature(org.eclipselabs.simplegt.SimplegtPackage.OUTPUT_BINDING__BEFORE_ELEMENT), element));
				out.print(" ");
			}
			printCountingMap.put("beforeElement", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_Module(org.eclipselabs.simpleocl.Module element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MODULE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MODULE__METAMODELS));
		printCountingMap.put("metamodels", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MODULE__IMPORTS));
		printCountingMap.put("imports", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MODULE__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("module");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_eclipselabs_simpleocl_Module_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_eclipselabs_simpleocl_Module_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_eclipselabs_simpleocl_Module_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_eclipselabs_simpleocl_Module_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_eclipselabs_simpleocl_Module_0(org.eclipselabs.simpleocl.Module element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MODULE__NAME));
					if (o != null) {
						org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MODULE__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MODULE__NAME));
				if (o != null) {
					org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MODULE__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	public void print_org_eclipselabs_simpleocl_Module_1(org.eclipselabs.simpleocl.Module element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("metamodels");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MODULE__METAMODELS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("metamodels", 0);
		}
	}
	
	public void print_org_eclipselabs_simpleocl_Module_2(org.eclipselabs.simpleocl.Module element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("imports");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MODULE__IMPORTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("imports", 0);
		}
	}
	
	public void print_org_eclipselabs_simpleocl_Module_3(org.eclipselabs.simpleocl.Module element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MODULE__ELEMENTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elements", 0);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_Import(org.eclipselabs.simpleocl.Import element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.IMPORT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.IMPORT__MODULE));
		printCountingMap.put("module", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("import");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_eclipselabs_simpleocl_Import_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_org_eclipselabs_simpleocl_Import_0(org.eclipselabs.simpleocl.Import element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.IMPORT__NAME));
					if (o != null) {
						org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.IMPORT__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.IMPORT__NAME));
				if (o != null) {
					org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.IMPORT__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_OclFeatureDefinition(org.eclipselabs.simpleocl.OclFeatureDefinition element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_FEATURE_DEFINITION__MODULE));
		printCountingMap.put("module", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_FEATURE_DEFINITION__FEATURE));
		printCountingMap.put("feature", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_FEATURE_DEFINITION__CONTEXT_));
		printCountingMap.put("context_", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_FEATURE_DEFINITION__STATIC));
		printCountingMap.put("static", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("context_");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_FEATURE_DEFINITION__CONTEXT_));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("context_", count - 1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("static");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_FEATURE_DEFINITION__STATIC));
			if (o != null) {
			}
			printCountingMap.put("static", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("def");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("feature");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_FEATURE_DEFINITION__FEATURE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("feature", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_OclContextDefinition(org.eclipselabs.simpleocl.OclContextDefinition element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_CONTEXT_DEFINITION__DEFINITION));
		printCountingMap.put("definition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_CONTEXT_DEFINITION__CONTEXT_));
		printCountingMap.put("context_", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("context");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("context_");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_CONTEXT_DEFINITION__CONTEXT_));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("context_", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_OclMetamodel(org.eclipselabs.simpleocl.OclMetamodel element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_METAMODEL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_METAMODEL__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_METAMODEL__MODEL));
		printCountingMap.put("model", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_METAMODEL__URI));
		printCountingMap.put("uri", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("metamodel");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_eclipselabs_simpleocl_OclMetamodel_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_eclipselabs_simpleocl_OclMetamodel_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_org_eclipselabs_simpleocl_OclMetamodel_0(org.eclipselabs.simpleocl.OclMetamodel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_METAMODEL__NAME));
					if (o != null) {
						org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_METAMODEL__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_METAMODEL__NAME));
				if (o != null) {
					org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_METAMODEL__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	public void print_org_eclipselabs_simpleocl_OclMetamodel_1(org.eclipselabs.simpleocl.OclMetamodel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("uri");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_METAMODEL__URI));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39_92");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_METAMODEL__URI), element));
				out.print(" ");
			}
			printCountingMap.put("uri", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_OclInstanceModel(org.eclipselabs.simpleocl.OclInstanceModel element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_INSTANCE_MODEL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_INSTANCE_MODEL__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_INSTANCE_MODEL__METAMODEL));
		printCountingMap.put("metamodel", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_eclipselabs_simpleocl_OclInstanceModel_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("metamodel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_INSTANCE_MODEL__METAMODEL));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getOclInstanceModelMetamodelReferenceResolver().deResolve((org.eclipselabs.simpleocl.OclMetamodel) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_INSTANCE_MODEL__METAMODEL)), element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_INSTANCE_MODEL__METAMODEL), element));
				out.print(" ");
			}
			printCountingMap.put("metamodel", count - 1);
		}
	}
	
	public void print_org_eclipselabs_simpleocl_OclInstanceModel_0(org.eclipselabs.simpleocl.OclInstanceModel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_INSTANCE_MODEL__NAME));
					if (o != null) {
						org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_INSTANCE_MODEL__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_INSTANCE_MODEL__NAME));
				if (o != null) {
					org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_INSTANCE_MODEL__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_LocalVariable(org.eclipselabs.simpleocl.LocalVariable element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(11);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__VARIABLE_EXP));
		printCountingMap.put("variableExp", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__INIT_EXPRESSION));
		printCountingMap.put("initExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__BASE_EXP));
		printCountingMap.put("baseExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__EQ));
		printCountingMap.put("eq", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("varName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__VAR_NAME));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__VAR_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("varName", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_eclipselabs_simpleocl_LocalVariable_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("eq");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__EQ));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("EQ");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__EQ), element));
				out.print(" ");
			}
			printCountingMap.put("eq", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("initExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__INIT_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("initExpression", count - 1);
		}
	}
	
	public void print_org_eclipselabs_simpleocl_LocalVariable_0(org.eclipselabs.simpleocl.LocalVariable element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_Attribute(org.eclipselabs.simpleocl.Attribute element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(9);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ATTRIBUTE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ATTRIBUTE__DEFINITION));
		printCountingMap.put("definition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ATTRIBUTE__EQ));
		printCountingMap.put("eq", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ATTRIBUTE__INIT_EXPRESSION));
		printCountingMap.put("initExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ATTRIBUTE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_eclipselabs_simpleocl_Attribute_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ATTRIBUTE__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("eq");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ATTRIBUTE__EQ));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("EQ");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ATTRIBUTE__EQ), element));
				out.print(" ");
			}
			printCountingMap.put("eq", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("initExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ATTRIBUTE__INIT_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("initExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_org_eclipselabs_simpleocl_Attribute_0(org.eclipselabs.simpleocl.Attribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ATTRIBUTE__NAME));
					if (o != null) {
						org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ATTRIBUTE__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ATTRIBUTE__NAME));
				if (o != null) {
					org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ATTRIBUTE__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_Operation(org.eclipselabs.simpleocl.Operation element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(10);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATION__DEFINITION));
		printCountingMap.put("definition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATION__EQ));
		printCountingMap.put("eq", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATION__PARAMETERS));
		printCountingMap.put("parameters", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATION__RETURN_TYPE));
		printCountingMap.put("returnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATION__BODY));
		printCountingMap.put("body", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_eclipselabs_simpleocl_Operation_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_eclipselabs_simpleocl_Operation_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("returnType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATION__RETURN_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("returnType", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("eq");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATION__EQ));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("EQ");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATION__EQ), element));
				out.print(" ");
			}
			printCountingMap.put("eq", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("body");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATION__BODY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("body", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_org_eclipselabs_simpleocl_Operation_0(org.eclipselabs.simpleocl.Operation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATION__NAME));
					if (o != null) {
						org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATION__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATION__NAME));
				if (o != null) {
					org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATION__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	public void print_org_eclipselabs_simpleocl_Operation_1(org.eclipselabs.simpleocl.Operation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATION__PARAMETERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameters", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_eclipselabs_simpleocl_Operation_1_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_eclipselabs_simpleocl_Operation_1_0(org.eclipselabs.simpleocl.Operation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATION__PARAMETERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameters", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_Parameter(org.eclipselabs.simpleocl.Parameter element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.PARAMETER__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.PARAMETER__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.PARAMETER__VARIABLE_EXP));
		printCountingMap.put("variableExp", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.PARAMETER__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("varName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.PARAMETER__VAR_NAME));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.PARAMETER__VAR_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("varName", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.PARAMETER__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_OclModelElementExp(org.eclipselabs.simpleocl.OclModelElementExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__MODEL));
		printCountingMap.put("model", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("model");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__MODEL));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getOclModelElementExpModelReferenceResolver().deResolve((org.eclipselabs.simpleocl.OclModel) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__MODEL)), element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__MODEL), element));
				out.print(" ");
			}
			printCountingMap.put("model", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("!");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_eclipselabs_simpleocl_OclModelElementExp_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_eclipselabs_simpleocl_OclModelElementExp_0(org.eclipselabs.simpleocl.OclModelElementExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__NAME));
					if (o != null) {
						org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__NAME));
				if (o != null) {
					org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_LambdaCallExp(org.eclipselabs.simpleocl.LambdaCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__REFERRED_VARIABLE));
		printCountingMap.put("referredVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__ARGUMENTS));
		printCountingMap.put("arguments", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("referredVariable");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__REFERRED_VARIABLE));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getVariableExpReferredVariableReferenceResolver().deResolve((org.eclipselabs.simpleocl.VariableDeclaration) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__REFERRED_VARIABLE)), element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__REFERRED_VARIABLE), element));
				out.print(" ");
			}
			printCountingMap.put("referredVariable", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_eclipselabs_simpleocl_LambdaCallExp_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_eclipselabs_simpleocl_LambdaCallExp_0(org.eclipselabs.simpleocl.LambdaCallExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__ARGUMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("arguments", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_eclipselabs_simpleocl_LambdaCallExp_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_eclipselabs_simpleocl_LambdaCallExp_0_0(org.eclipselabs.simpleocl.LambdaCallExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__ARGUMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("arguments", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_VariableExp(org.eclipselabs.simpleocl.VariableExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.VARIABLE_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.VARIABLE_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.VARIABLE_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.VARIABLE_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.VARIABLE_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.VARIABLE_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.VARIABLE_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.VARIABLE_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.VARIABLE_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.VARIABLE_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.VARIABLE_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.VARIABLE_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.VARIABLE_EXP__REFERRED_VARIABLE));
		printCountingMap.put("referredVariable", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("referredVariable");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.VARIABLE_EXP__REFERRED_VARIABLE));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getVariableExpReferredVariableReferenceResolver().deResolve((org.eclipselabs.simpleocl.VariableDeclaration) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.VARIABLE_EXP__REFERRED_VARIABLE)), element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.VARIABLE_EXP__REFERRED_VARIABLE), element));
				out.print(" ");
			}
			printCountingMap.put("referredVariable", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_SuperExp(org.eclipselabs.simpleocl.SuperExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(16);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SUPER_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SUPER_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SUPER_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SUPER_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SUPER_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SUPER_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SUPER_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SUPER_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SUPER_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SUPER_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SUPER_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SUPER_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("super");
		out.print(" ");
	}
	
	
	public void print_org_eclipselabs_simpleocl_SelfExp(org.eclipselabs.simpleocl.SelfExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(16);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SELF_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SELF_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SELF_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SELF_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SELF_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SELF_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SELF_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SELF_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SELF_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SELF_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SELF_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SELF_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("self");
		out.print(" ");
	}
	
	
	public void print_org_eclipselabs_simpleocl_EnvExp(org.eclipselabs.simpleocl.EnvExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(16);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENV_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENV_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENV_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENV_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENV_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENV_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENV_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENV_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENV_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENV_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENV_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENV_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("env");
		out.print(" ");
	}
	
	
	public void print_org_eclipselabs_simpleocl_StringExp(org.eclipselabs.simpleocl.StringExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_EXP__STRING_SYMBOL));
		printCountingMap.put("stringSymbol", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("stringSymbol");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_EXP__STRING_SYMBOL));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39_92");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_EXP__STRING_SYMBOL), element));
				out.print(" ");
			}
			printCountingMap.put("stringSymbol", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_BooleanExp(org.eclipselabs.simpleocl.BooleanExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BOOLEAN_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BOOLEAN_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BOOLEAN_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BOOLEAN_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BOOLEAN_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BOOLEAN_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BOOLEAN_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BOOLEAN_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BOOLEAN_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BOOLEAN_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BOOLEAN_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BOOLEAN_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BOOLEAN_EXP__BOOLEAN_SYMBOL));
		printCountingMap.put("booleanSymbol", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("booleanSymbol");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BOOLEAN_EXP__BOOLEAN_SYMBOL));
			if (o != null) {
			}
			printCountingMap.put("booleanSymbol", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_RealExp(org.eclipselabs.simpleocl.RealExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_EXP__REAL_SYMBOL));
		printCountingMap.put("realSymbol", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("realSymbol");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_EXP__REAL_SYMBOL));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("FLOAT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_EXP__REAL_SYMBOL), element));
				out.print(" ");
			}
			printCountingMap.put("realSymbol", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_IntegerExp(org.eclipselabs.simpleocl.IntegerExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_EXP__INTEGER_SYMBOL));
		printCountingMap.put("integerSymbol", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("integerSymbol");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_EXP__INTEGER_SYMBOL));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_EXP__INTEGER_SYMBOL), element));
				out.print(" ");
			}
			printCountingMap.put("integerSymbol", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_CollectionRange(org.eclipselabs.simpleocl.CollectionRange element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_RANGE__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_RANGE__FIRST));
		printCountingMap.put("first", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_RANGE__LAST));
		printCountingMap.put("last", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("first");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_RANGE__FIRST));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("first", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("..");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("last");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_RANGE__LAST));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("last", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_CollectionItem(org.eclipselabs.simpleocl.CollectionItem element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_ITEM__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_ITEM__ITEM));
		printCountingMap.put("item", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("item");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_ITEM__ITEM));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("item", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_BagExp(org.eclipselabs.simpleocl.BagExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_EXP__PARTS));
		printCountingMap.put("parts", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Bag");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_eclipselabs_simpleocl_BagExp_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_org_eclipselabs_simpleocl_BagExp_0(org.eclipselabs.simpleocl.BagExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parts");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_EXP__PARTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parts", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_eclipselabs_simpleocl_BagExp_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_eclipselabs_simpleocl_BagExp_0_0(org.eclipselabs.simpleocl.BagExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parts");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_EXP__PARTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parts", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_OrderedSetExp(org.eclipselabs.simpleocl.OrderedSetExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__PARTS));
		printCountingMap.put("parts", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("OrderedSet");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_eclipselabs_simpleocl_OrderedSetExp_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_org_eclipselabs_simpleocl_OrderedSetExp_0(org.eclipselabs.simpleocl.OrderedSetExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parts");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__PARTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parts", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_eclipselabs_simpleocl_OrderedSetExp_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_eclipselabs_simpleocl_OrderedSetExp_0_0(org.eclipselabs.simpleocl.OrderedSetExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parts");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__PARTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parts", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_SequenceExp(org.eclipselabs.simpleocl.SequenceExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_EXP__PARTS));
		printCountingMap.put("parts", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Sequence");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_eclipselabs_simpleocl_SequenceExp_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_org_eclipselabs_simpleocl_SequenceExp_0(org.eclipselabs.simpleocl.SequenceExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parts");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_EXP__PARTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parts", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_eclipselabs_simpleocl_SequenceExp_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_eclipselabs_simpleocl_SequenceExp_0_0(org.eclipselabs.simpleocl.SequenceExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parts");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_EXP__PARTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parts", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_SetExp(org.eclipselabs.simpleocl.SetExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_EXP__PARTS));
		printCountingMap.put("parts", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Set");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_eclipselabs_simpleocl_SetExp_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_org_eclipselabs_simpleocl_SetExp_0(org.eclipselabs.simpleocl.SetExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parts");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_EXP__PARTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parts", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_eclipselabs_simpleocl_SetExp_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_eclipselabs_simpleocl_SetExp_0_0(org.eclipselabs.simpleocl.SetExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parts");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_EXP__PARTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parts", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_TupleExp(org.eclipselabs.simpleocl.TupleExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_EXP__TUPLE_PART));
		printCountingMap.put("tuplePart", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Tuple");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_eclipselabs_simpleocl_TupleExp_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_org_eclipselabs_simpleocl_TupleExp_0(org.eclipselabs.simpleocl.TupleExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("tuplePart");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_EXP__TUPLE_PART));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("tuplePart", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_eclipselabs_simpleocl_TupleExp_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_eclipselabs_simpleocl_TupleExp_0_0(org.eclipselabs.simpleocl.TupleExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("tuplePart");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_EXP__TUPLE_PART));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("tuplePart", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_TuplePart(org.eclipselabs.simpleocl.TuplePart element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(12);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_PART__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_PART__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_PART__VARIABLE_EXP));
		printCountingMap.put("variableExp", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_PART__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_PART__INIT_EXPRESSION));
		printCountingMap.put("initExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_PART__BASE_EXP));
		printCountingMap.put("baseExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_PART__EQ));
		printCountingMap.put("eq", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_PART__TUPLE));
		printCountingMap.put("tuple", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("varName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_PART__VAR_NAME));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_PART__VAR_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("varName", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_eclipselabs_simpleocl_TuplePart_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("eq");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_PART__EQ));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("EQ");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_PART__EQ), element));
				out.print(" ");
			}
			printCountingMap.put("eq", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("initExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_PART__INIT_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("initExpression", count - 1);
		}
	}
	
	public void print_org_eclipselabs_simpleocl_TuplePart_0(org.eclipselabs.simpleocl.TuplePart element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_PART__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_MapExp(org.eclipselabs.simpleocl.MapExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_EXP__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Map");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_eclipselabs_simpleocl_MapExp_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_org_eclipselabs_simpleocl_MapExp_0(org.eclipselabs.simpleocl.MapExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_EXP__ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elements", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_eclipselabs_simpleocl_MapExp_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_eclipselabs_simpleocl_MapExp_0_0(org.eclipselabs.simpleocl.MapExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_EXP__ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elements", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_MapElement(org.eclipselabs.simpleocl.MapElement element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_ELEMENT__MAP));
		printCountingMap.put("map", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_ELEMENT__KEY));
		printCountingMap.put("key", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_ELEMENT__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("key");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_ELEMENT__KEY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("key", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_ELEMENT__VALUE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("value", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_eclipselabs_simpleocl_EnumLiteralExp(org.eclipselabs.simpleocl.EnumLiteralExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("#");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_eclipselabs_simpleocl_EnumLiteralExp_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_eclipselabs_simpleocl_EnumLiteralExp_0(org.eclipselabs.simpleocl.EnumLiteralExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__NAME));
					if (o != null) {
						org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__NAME));
				if (o != null) {
					org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_OclUndefinedExp(org.eclipselabs.simpleocl.OclUndefinedExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(16);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_UNDEFINED_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_UNDEFINED_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_UNDEFINED_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_UNDEFINED_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_UNDEFINED_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_UNDEFINED_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_UNDEFINED_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_UNDEFINED_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_UNDEFINED_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_UNDEFINED_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_UNDEFINED_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_UNDEFINED_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("OclUndefined");
		out.print(" ");
	}
	
	
	public void print_org_eclipselabs_simpleocl_LetExp(org.eclipselabs.simpleocl.LetExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LET_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LET_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LET_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LET_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LET_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LET_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LET_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LET_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LET_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LET_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LET_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LET_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LET_EXP__VARIABLE));
		printCountingMap.put("variable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LET_EXP__IN_));
		printCountingMap.put("in_", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("let");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("variable");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LET_EXP__VARIABLE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("variable", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("in");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("in_");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LET_EXP__IN_));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("in_", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_IfExp(org.eclipselabs.simpleocl.IfExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(19);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.IF_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.IF_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.IF_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.IF_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.IF_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.IF_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.IF_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.IF_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.IF_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.IF_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.IF_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.IF_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.IF_EXP__THEN_EXPRESSION));
		printCountingMap.put("thenExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.IF_EXP__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.IF_EXP__ELSE_EXPRESSION));
		printCountingMap.put("elseExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("if");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.IF_EXP__CONDITION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("then");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("thenExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.IF_EXP__THEN_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("thenExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("else");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elseExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.IF_EXP__ELSE_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elseExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("endif");
		out.print(" ");
	}
	
	
	public void print_org_eclipselabs_simpleocl_BraceExp(org.eclipselabs.simpleocl.BraceExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BRACE_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BRACE_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BRACE_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BRACE_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BRACE_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BRACE_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BRACE_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BRACE_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BRACE_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BRACE_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BRACE_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BRACE_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BRACE_EXP__EXP));
		printCountingMap.put("exp", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("exp");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BRACE_EXP__EXP));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("exp", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_eclipselabs_simpleocl_OperatorCallExp(org.eclipselabs.simpleocl.OperatorCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(19);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__ARGUMENT));
		printCountingMap.put("argument", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("operationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__OPERATION_NAME));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("BOOLOP");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__OPERATION_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("operationName", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argument");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__ARGUMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argument", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_EqOpCallExp(org.eclipselabs.simpleocl.EqOpCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(19);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__ARGUMENT));
		printCountingMap.put("argument", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_eclipselabs_simpleocl_EqOpCallExp_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argument");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__ARGUMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argument", count - 1);
		}
	}
	
	public void print_org_eclipselabs_simpleocl_EqOpCallExp_0(org.eclipselabs.simpleocl.EqOpCallExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operationName");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__OPERATION_NAME));
					if (o != null) {
						org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("NEQ");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__OPERATION_NAME), element));
						out.print(" ");
					}
					printCountingMap.put("operationName", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("operationName");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__OPERATION_NAME));
				if (o != null) {
					org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("EQ");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__OPERATION_NAME), element));
					out.print(" ");
				}
				printCountingMap.put("operationName", count - 1);
			}
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_RelOpCallExp(org.eclipselabs.simpleocl.RelOpCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(19);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__ARGUMENT));
		printCountingMap.put("argument", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("operationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__OPERATION_NAME));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("RELOP");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__OPERATION_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("operationName", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argument");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__ARGUMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argument", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_AddOpCallExp(org.eclipselabs.simpleocl.AddOpCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(19);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__ARGUMENT));
		printCountingMap.put("argument", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("operationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__OPERATION_NAME));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("ADDOP");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__OPERATION_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("operationName", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argument");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__ARGUMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argument", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_IntOpCallExp(org.eclipselabs.simpleocl.IntOpCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(19);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__ARGUMENT));
		printCountingMap.put("argument", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("operationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__OPERATION_NAME));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTOP");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__OPERATION_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("operationName", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argument");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__ARGUMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argument", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_MulOpCallExp(org.eclipselabs.simpleocl.MulOpCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(19);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__ARGUMENT));
		printCountingMap.put("argument", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("operationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__OPERATION_NAME));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("MULOP");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__OPERATION_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("operationName", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argument");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__ARGUMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argument", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_NotOpCallExp(org.eclipselabs.simpleocl.NotOpCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(19);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__ARGUMENT));
		printCountingMap.put("argument", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("operationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__OPERATION_NAME));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("NOTOP");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__OPERATION_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("operationName", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_StaticPropertyCallExp(org.eclipselabs.simpleocl.StaticPropertyCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__STATIC_CALL));
		printCountingMap.put("staticCall", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("staticCall");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__STATIC_CALL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("staticCall", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_StaticOperationCall(org.eclipselabs.simpleocl.StaticOperationCall element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_OPERATION_CALL__STATIC_CALL_EXP));
		printCountingMap.put("staticCallExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_OPERATION_CALL__ARGUMENTS));
		printCountingMap.put("arguments", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_OPERATION_CALL__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("::");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_eclipselabs_simpleocl_StaticOperationCall_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_eclipselabs_simpleocl_StaticOperationCall_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_eclipselabs_simpleocl_StaticOperationCall_0(org.eclipselabs.simpleocl.StaticOperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("operationName");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_OPERATION_CALL__OPERATION_NAME));
					if (o != null) {
						org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_OPERATION_CALL__OPERATION_NAME), element));
						out.print(" ");
					}
					printCountingMap.put("operationName", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("operationName");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_OPERATION_CALL__OPERATION_NAME));
				if (o != null) {
					org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_OPERATION_CALL__OPERATION_NAME), element));
					out.print(" ");
				}
				printCountingMap.put("operationName", count - 1);
			}
		}
	}
	
	public void print_org_eclipselabs_simpleocl_StaticOperationCall_1(org.eclipselabs.simpleocl.StaticOperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_OPERATION_CALL__ARGUMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("arguments", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_eclipselabs_simpleocl_StaticOperationCall_1_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_eclipselabs_simpleocl_StaticOperationCall_1_0(org.eclipselabs.simpleocl.StaticOperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_OPERATION_CALL__ARGUMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("arguments", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_StaticNavigationOrAttributeCall(org.eclipselabs.simpleocl.StaticNavigationOrAttributeCall element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__STATIC_CALL_EXP));
		printCountingMap.put("staticCallExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("::");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_eclipselabs_simpleocl_StaticNavigationOrAttributeCall_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_eclipselabs_simpleocl_StaticNavigationOrAttributeCall_0(org.eclipselabs.simpleocl.StaticNavigationOrAttributeCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__NAME));
					if (o != null) {
						org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__NAME));
				if (o != null) {
					org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_PropertyCallExp(org.eclipselabs.simpleocl.PropertyCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__CALLS));
		printCountingMap.put("calls", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("calls");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__CALLS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("calls", 0);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_OperationCall(org.eclipselabs.simpleocl.OperationCall element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATION_CALL__CALL_EXP));
		printCountingMap.put("callExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATION_CALL__ARGUMENTS));
		printCountingMap.put("arguments", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATION_CALL__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_eclipselabs_simpleocl_OperationCall_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_eclipselabs_simpleocl_OperationCall_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_eclipselabs_simpleocl_OperationCall_0(org.eclipselabs.simpleocl.OperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("operationName");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATION_CALL__OPERATION_NAME));
					if (o != null) {
						org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATION_CALL__OPERATION_NAME), element));
						out.print(" ");
					}
					printCountingMap.put("operationName", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("operationName");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATION_CALL__OPERATION_NAME));
				if (o != null) {
					org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATION_CALL__OPERATION_NAME), element));
					out.print(" ");
				}
				printCountingMap.put("operationName", count - 1);
			}
		}
	}
	
	public void print_org_eclipselabs_simpleocl_OperationCall_1(org.eclipselabs.simpleocl.OperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATION_CALL__ARGUMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("arguments", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_eclipselabs_simpleocl_OperationCall_1_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_eclipselabs_simpleocl_OperationCall_1_0(org.eclipselabs.simpleocl.OperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OPERATION_CALL__ARGUMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("arguments", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_NavigationOrAttributeCall(org.eclipselabs.simpleocl.NavigationOrAttributeCall element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.NAVIGATION_OR_ATTRIBUTE_CALL__CALL_EXP));
		printCountingMap.put("callExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.NAVIGATION_OR_ATTRIBUTE_CALL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_eclipselabs_simpleocl_NavigationOrAttributeCall_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_eclipselabs_simpleocl_NavigationOrAttributeCall_0(org.eclipselabs.simpleocl.NavigationOrAttributeCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.NAVIGATION_OR_ATTRIBUTE_CALL__NAME));
					if (o != null) {
						org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.NAVIGATION_OR_ATTRIBUTE_CALL__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.NAVIGATION_OR_ATTRIBUTE_CALL__NAME));
				if (o != null) {
					org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.NAVIGATION_OR_ATTRIBUTE_CALL__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_IterateExp(org.eclipselabs.simpleocl.IterateExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ITERATE_EXP__CALL_EXP));
		printCountingMap.put("callExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ITERATE_EXP__BODY));
		printCountingMap.put("body", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ITERATE_EXP__ITERATORS));
		printCountingMap.put("iterators", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ITERATE_EXP__RESULT));
		printCountingMap.put("result", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("->");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("iterate");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("iterators");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ITERATE_EXP__ITERATORS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("iterators", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_eclipselabs_simpleocl_IterateExp_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("result");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ITERATE_EXP__RESULT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("result", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("|");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("body");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ITERATE_EXP__BODY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("body", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_eclipselabs_simpleocl_IterateExp_0(org.eclipselabs.simpleocl.IterateExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("iterators");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ITERATE_EXP__ITERATORS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("iterators", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_IteratorExp(org.eclipselabs.simpleocl.IteratorExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ITERATOR_EXP__CALL_EXP));
		printCountingMap.put("callExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ITERATOR_EXP__BODY));
		printCountingMap.put("body", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ITERATOR_EXP__ITERATORS));
		printCountingMap.put("iterators", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ITERATOR_EXP__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("->");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_eclipselabs_simpleocl_IteratorExp_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("iterators");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ITERATOR_EXP__ITERATORS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("iterators", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_eclipselabs_simpleocl_IteratorExp_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("|");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("body");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ITERATOR_EXP__BODY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("body", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_eclipselabs_simpleocl_IteratorExp_0(org.eclipselabs.simpleocl.IteratorExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ITERATOR_EXP__NAME));
					if (o != null) {
						org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ITERATOR_EXP__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ITERATOR_EXP__NAME));
				if (o != null) {
					org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ITERATOR_EXP__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	public void print_org_eclipselabs_simpleocl_IteratorExp_1(org.eclipselabs.simpleocl.IteratorExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("iterators");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ITERATOR_EXP__ITERATORS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("iterators", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_Iterator(org.eclipselabs.simpleocl.Iterator element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ITERATOR__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ITERATOR__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ITERATOR__VARIABLE_EXP));
		printCountingMap.put("variableExp", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ITERATOR__LOOP_EXPR));
		printCountingMap.put("loopExpr", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("varName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ITERATOR__VAR_NAME));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ITERATOR__VAR_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("varName", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_eclipselabs_simpleocl_Iterator_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_eclipselabs_simpleocl_Iterator_0(org.eclipselabs.simpleocl.Iterator element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ITERATOR__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_CollectionOperationCall(org.eclipselabs.simpleocl.CollectionOperationCall element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_OPERATION_CALL__CALL_EXP));
		printCountingMap.put("callExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_OPERATION_CALL__ARGUMENTS));
		printCountingMap.put("arguments", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_OPERATION_CALL__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("->");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_eclipselabs_simpleocl_CollectionOperationCall_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_eclipselabs_simpleocl_CollectionOperationCall_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_eclipselabs_simpleocl_CollectionOperationCall_0(org.eclipselabs.simpleocl.CollectionOperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("operationName");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_OPERATION_CALL__OPERATION_NAME));
					if (o != null) {
						org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_OPERATION_CALL__OPERATION_NAME), element));
						out.print(" ");
					}
					printCountingMap.put("operationName", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("operationName");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_OPERATION_CALL__OPERATION_NAME));
				if (o != null) {
					org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_OPERATION_CALL__OPERATION_NAME), element));
					out.print(" ");
				}
				printCountingMap.put("operationName", count - 1);
			}
		}
	}
	
	public void print_org_eclipselabs_simpleocl_CollectionOperationCall_1(org.eclipselabs.simpleocl.CollectionOperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_OPERATION_CALL__ARGUMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("arguments", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_eclipselabs_simpleocl_CollectionOperationCall_1_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_eclipselabs_simpleocl_CollectionOperationCall_1_0(org.eclipselabs.simpleocl.CollectionOperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_OPERATION_CALL__ARGUMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("arguments", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_CollectionType(org.eclipselabs.simpleocl.CollectionType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_TYPE__ELEMENT_TYPE));
		printCountingMap.put("elementType", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_TYPE__NAME));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COLLECTIONTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elementType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.COLLECTION_TYPE__ELEMENT_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elementType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_eclipselabs_simpleocl_StringType(org.eclipselabs.simpleocl.StringType element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_TYPE__NAME));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRINGTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.STRING_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_BooleanType(org.eclipselabs.simpleocl.BooleanType element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__NAME));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("BOOLEANTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_IntegerType(org.eclipselabs.simpleocl.IntegerType element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_TYPE__NAME));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGERTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.INTEGER_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_RealType(org.eclipselabs.simpleocl.RealType element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_TYPE__NAME));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("REALTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.REAL_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_BagType(org.eclipselabs.simpleocl.BagType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_TYPE__ELEMENT_TYPE));
		printCountingMap.put("elementType", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_TYPE__NAME));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("BAGTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elementType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.BAG_TYPE__ELEMENT_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elementType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_eclipselabs_simpleocl_OrderedSetType(org.eclipselabs.simpleocl.OrderedSetType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__ELEMENT_TYPE));
		printCountingMap.put("elementType", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__NAME));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("ORDEREDSETTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elementType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__ELEMENT_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elementType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_eclipselabs_simpleocl_SequenceType(org.eclipselabs.simpleocl.SequenceType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__ELEMENT_TYPE));
		printCountingMap.put("elementType", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__NAME));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("SEQUENCETYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elementType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__ELEMENT_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elementType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_eclipselabs_simpleocl_SetType(org.eclipselabs.simpleocl.SetType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_TYPE__ELEMENT_TYPE));
		printCountingMap.put("elementType", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_TYPE__NAME));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("SETTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elementType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.SET_TYPE__ELEMENT_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elementType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_eclipselabs_simpleocl_OclAnyType(org.eclipselabs.simpleocl.OclAnyType element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__NAME));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("OCLANYTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_OclType(org.eclipselabs.simpleocl.OclType element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_TYPE__NAME));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("OCLTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_TupleType(org.eclipselabs.simpleocl.TupleType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_TYPE__ATTRIBUTES));
		printCountingMap.put("attributes", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_eclipselabs_simpleocl_TupleType_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_eclipselabs_simpleocl_TupleType_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_eclipselabs_simpleocl_TupleType_0(org.eclipselabs.simpleocl.TupleType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_TYPE__NAME));
					if (o != null) {
						org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TUPLE");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_TYPE__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_TYPE__NAME));
				if (o != null) {
					org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TUPLETYPE");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_TYPE__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	public void print_org_eclipselabs_simpleocl_TupleType_1(org.eclipselabs.simpleocl.TupleType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("attributes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_TYPE__ATTRIBUTES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("attributes", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_eclipselabs_simpleocl_TupleType_1_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_eclipselabs_simpleocl_TupleType_1_0(org.eclipselabs.simpleocl.TupleType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("attributes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_TYPE__ATTRIBUTES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("attributes", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_TupleTypeAttribute(org.eclipselabs.simpleocl.TupleTypeAttribute element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_TYPE_ATTRIBUTE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_TYPE_ATTRIBUTE__TUPLE_TYPE));
		printCountingMap.put("tupleType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_TYPE_ATTRIBUTE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_eclipselabs_simpleocl_TupleTypeAttribute_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_TYPE_ATTRIBUTE__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	public void print_org_eclipselabs_simpleocl_TupleTypeAttribute_0(org.eclipselabs.simpleocl.TupleTypeAttribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_TYPE_ATTRIBUTE__NAME));
					if (o != null) {
						org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_TYPE_ATTRIBUTE__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_TYPE_ATTRIBUTE__NAME));
				if (o != null) {
					org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.TUPLE_TYPE_ATTRIBUTE__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_OclModelElement(org.eclipselabs.simpleocl.OclModelElement element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__MODEL));
		printCountingMap.put("model", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_eclipselabs_simpleocl_OclModelElement_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("!");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_eclipselabs_simpleocl_OclModelElement_1(element, localtab, out, printCountingMap);
	}
	
	public void print_org_eclipselabs_simpleocl_OclModelElement_0(org.eclipselabs.simpleocl.OclModelElement element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"model"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"model"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("model");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__MODEL));
					if (o != null) {
						org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getOclModelElementModelReferenceResolver().deResolve((org.eclipselabs.simpleocl.OclModel) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__MODEL)), element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__MODEL), element));
						out.print(" ");
					}
					printCountingMap.put("model", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("model");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__MODEL));
				if (o != null) {
					org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getOclModelElementModelReferenceResolver().deResolve((org.eclipselabs.simpleocl.OclModel) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__MODEL)), element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__MODEL), element));
					out.print(" ");
				}
				printCountingMap.put("model", count - 1);
			}
		}
	}
	
	public void print_org_eclipselabs_simpleocl_OclModelElement_1(org.eclipselabs.simpleocl.OclModelElement element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__NAME));
					if (o != null) {
						org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__NAME));
				if (o != null) {
					org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_MapType(org.eclipselabs.simpleocl.MapType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(19);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_TYPE__VALUE_TYPE));
		printCountingMap.put("valueType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_TYPE__KEY_TYPE));
		printCountingMap.put("keyType", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_TYPE__NAME));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("MAPTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("keyType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_TYPE__KEY_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("keyType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("valueType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.MAP_TYPE__VALUE_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("valueType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_eclipselabs_simpleocl_LambdaType(org.eclipselabs.simpleocl.LambdaType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(19);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_TYPE__RETURN_TYPE));
		printCountingMap.put("returnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_TYPE__ARGUMENT_TYPES));
		printCountingMap.put("argumentTypes", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_TYPE__NAME));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("LAMBDATYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_eclipselabs_simpleocl_LambdaType_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("returnType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_TYPE__RETURN_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("returnType", count - 1);
		}
	}
	
	public void print_org_eclipselabs_simpleocl_LambdaType_0(org.eclipselabs.simpleocl.LambdaType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argumentTypes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_TYPE__ARGUMENT_TYPES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argumentTypes", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_eclipselabs_simpleocl_LambdaType_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_eclipselabs_simpleocl_LambdaType_0_0(org.eclipselabs.simpleocl.LambdaType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argumentTypes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.LAMBDA_TYPE__ARGUMENT_TYPES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argumentTypes", count - 1);
		}
	}
	
	
	public void print_org_eclipselabs_simpleocl_EnvType(org.eclipselabs.simpleocl.EnvType element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENV_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENV_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENV_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENV_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENV_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENV_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENV_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENV_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENV_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENV_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENV_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENV_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENV_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENV_TYPE__NAME));
			if (o != null) {
				org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("ENVTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.eclipselabs.simpleocl.SimpleoclPackage.ENV_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
}
