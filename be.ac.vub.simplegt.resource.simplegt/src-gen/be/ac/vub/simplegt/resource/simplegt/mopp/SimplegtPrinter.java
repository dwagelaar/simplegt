/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.mopp;

public class SimplegtPrinter implements be.ac.vub.simplegt.resource.simplegt.ISimplegtTextPrinter {
	
	protected be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolverFactory tokenResolverFactory = new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private be.ac.vub.simplegt.resource.simplegt.ISimplegtTextResource resource;
	
	private java.util.Map<?, ?> options;
	
	public SimplegtPrinter(java.io.OutputStream outputStream, be.ac.vub.simplegt.resource.simplegt.ISimplegtTextResource resource) {
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
		
		if (element instanceof be.ac.vub.simplegt.Module) {
			print_be_ac_vub_simplegt_Module((be.ac.vub.simplegt.Module) element, globaltab, out);
			return;
		}
		if (element instanceof be.ac.vub.simplegt.InstanceModel) {
			print_be_ac_vub_simplegt_InstanceModel((be.ac.vub.simplegt.InstanceModel) element, globaltab, out);
			return;
		}
		if (element instanceof be.ac.vub.simplegt.Metamodel) {
			print_be_ac_vub_simplegt_Metamodel((be.ac.vub.simplegt.Metamodel) element, globaltab, out);
			return;
		}
		if (element instanceof be.ac.vub.simplegt.Rule) {
			print_be_ac_vub_simplegt_Rule((be.ac.vub.simplegt.Rule) element, globaltab, out);
			return;
		}
		if (element instanceof be.ac.vub.simplegt.InPattern) {
			print_be_ac_vub_simplegt_InPattern((be.ac.vub.simplegt.InPattern) element, globaltab, out);
			return;
		}
		if (element instanceof be.ac.vub.simplegt.Type) {
			print_be_ac_vub_simplegt_Type((be.ac.vub.simplegt.Type) element, globaltab, out);
			return;
		}
		if (element instanceof be.ac.vub.simplegt.InputElement) {
			print_be_ac_vub_simplegt_InputElement((be.ac.vub.simplegt.InputElement) element, globaltab, out);
			return;
		}
		if (element instanceof be.ac.vub.simplegt.InputBinding) {
			print_be_ac_vub_simplegt_InputBinding((be.ac.vub.simplegt.InputBinding) element, globaltab, out);
			return;
		}
		if (element instanceof be.ac.vub.simplegt.NacPattern) {
			print_be_ac_vub_simplegt_NacPattern((be.ac.vub.simplegt.NacPattern) element, globaltab, out);
			return;
		}
		if (element instanceof be.ac.vub.simplegt.OutPattern) {
			print_be_ac_vub_simplegt_OutPattern((be.ac.vub.simplegt.OutPattern) element, globaltab, out);
			return;
		}
		if (element instanceof be.ac.vub.simplegt.OutputElement) {
			print_be_ac_vub_simplegt_OutputElement((be.ac.vub.simplegt.OutputElement) element, globaltab, out);
			return;
		}
		if (element instanceof be.ac.vub.simplegt.OutputBinding) {
			print_be_ac_vub_simplegt_OutputBinding((be.ac.vub.simplegt.OutputBinding) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtReferenceResolverSwitch getReferenceResolverSwitch() {
		return (be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtReferenceResolverSwitch) new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		be.ac.vub.simplegt.resource.simplegt.ISimplegtTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtProblem(errorMessage, be.ac.vub.simplegt.resource.simplegt.SimplegtEProblemType.PRINT_PROBLEM, be.ac.vub.simplegt.resource.simplegt.SimplegtEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public be.ac.vub.simplegt.resource.simplegt.ISimplegtTextResource getResource() {
		return resource;
	}
	
	/**
	 * Calls {@link #doPrint(EObject, PrintWriter, String)} and writes the result to
	 * the underlying output stream.
	 */
	public void print(org.eclipse.emf.ecore.EObject element) {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.BufferedOutputStream(outputStream));
		doPrint(element, out, "");
		out.flush();
		out.close();
	}
	
	public void print_be_ac_vub_simplegt_Module(be.ac.vub.simplegt.Module element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__MODELS));
		printCountingMap.put("models", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__RULES));
		printCountingMap.put("rules", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__IMPORTS));
		printCountingMap.put("imports", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__NAME));
			if (o != null) {
				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
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
			print_be_ac_vub_simplegt_Module_0(element, localtab, out1, printCountingMap1);
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
		out.print("transform");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("models");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__MODELS));
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
			print_be_ac_vub_simplegt_Module_1(element, localtab, out1, printCountingMap1);
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
		count = printCountingMap.get("rules");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__RULES));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rules", 0);
		}
	}
	
	public void print_be_ac_vub_simplegt_Module_0(be.ac.vub.simplegt.Module element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("import");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("imports");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__IMPORTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__IMPORTS), element));
				out.print(" ");
			}
			printCountingMap.put("imports", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_be_ac_vub_simplegt_Module_1(be.ac.vub.simplegt.Module element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("models");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__MODELS));
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
	
	
	public void print_be_ac_vub_simplegt_InstanceModel(be.ac.vub.simplegt.InstanceModel element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INSTANCE_MODEL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INSTANCE_MODEL__META_MODEL));
		printCountingMap.put("metaModel", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INSTANCE_MODEL__MODULE));
		printCountingMap.put("module", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INSTANCE_MODEL__NAME));
			if (o != null) {
				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INSTANCE_MODEL__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("metaModel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INSTANCE_MODEL__META_MODEL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("metaModel", count - 1);
		}
	}
	
	
	public void print_be_ac_vub_simplegt_Metamodel(be.ac.vub.simplegt.Metamodel element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.METAMODEL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.METAMODEL__NAME));
			if (o != null) {
				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.METAMODEL__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_be_ac_vub_simplegt_Rule(be.ac.vub.simplegt.Rule element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__MODULE));
		printCountingMap.put("module", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__ABSTRACT));
		printCountingMap.put("abstract", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__INPUT));
		printCountingMap.put("input", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__NAC));
		printCountingMap.put("nac", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__OUTPUT));
		printCountingMap.put("output", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__EXTENDS));
		printCountingMap.put("extends", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("abstract");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__ABSTRACT));
			if (o != null) {
			}
			printCountingMap.put("abstract", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("rule");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__NAME));
			if (o != null) {
				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_be_ac_vub_simplegt_Rule_0(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("input");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__INPUT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("input", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("nac");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__NAC));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__OUTPUT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("output", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_be_ac_vub_simplegt_Rule_0(be.ac.vub.simplegt.Rule element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__EXTENDS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__EXTENDS), element));
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
			print_be_ac_vub_simplegt_Rule_0_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_be_ac_vub_simplegt_Rule_0_0(be.ac.vub.simplegt.Rule element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("extends");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__EXTENDS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__EXTENDS), element));
				out.print(" ");
			}
			printCountingMap.put("extends", count - 1);
		}
	}
	
	
	public void print_be_ac_vub_simplegt_InPattern(be.ac.vub.simplegt.InPattern element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.IN_PATTERN__INPUT_FOR));
		printCountingMap.put("inputFor", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.IN_PATTERN__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.IN_PATTERN__ELEMENTS));
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
			print_be_ac_vub_simplegt_InPattern_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_be_ac_vub_simplegt_InPattern_0(be.ac.vub.simplegt.InPattern element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.IN_PATTERN__ELEMENTS));
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
	
	
	public void print_be_ac_vub_simplegt_Type(be.ac.vub.simplegt.Type element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.TYPE__TYPE_OF));
		printCountingMap.put("typeOf", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.TYPE__MODEL));
		printCountingMap.put("model", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_be_ac_vub_simplegt_Type_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.TYPE__NAME));
			if (o != null) {
				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_be_ac_vub_simplegt_Type_0(be.ac.vub.simplegt.Type element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("model");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.TYPE__MODEL));
			if (o != null) {
				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypeModelReferenceResolver().deResolve((be.ac.vub.simplegt.Metamodel) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.TYPE__MODEL)), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.TYPE__MODEL), element));
				out.print(" ");
			}
			printCountingMap.put("model", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("!");
		out.print(" ");
	}
	
	
	public void print_be_ac_vub_simplegt_InputElement(be.ac.vub.simplegt.InputElement element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_ELEMENT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_ELEMENT__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_ELEMENT__IN_PATTERN));
		printCountingMap.put("inPattern", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_ELEMENT__BINDING));
		printCountingMap.put("binding", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_ELEMENT__NAC_PATTERN));
		printCountingMap.put("nacPattern", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_ELEMENT__NAME));
			if (o != null) {
				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_ELEMENT__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_ELEMENT__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_be_ac_vub_simplegt_InputElement_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_be_ac_vub_simplegt_InputElement_0(be.ac.vub.simplegt.InputElement element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("binding");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_ELEMENT__BINDING));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("binding", count - 1);
		}
	}
	
	
	public void print_be_ac_vub_simplegt_InputBinding(be.ac.vub.simplegt.InputBinding element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_BINDING__FEATURE));
		printCountingMap.put("feature", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_BINDING__ELEMENT));
		printCountingMap.put("element", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_BINDING__BINDING_FOR));
		printCountingMap.put("bindingFor", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("element");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_BINDING__ELEMENT));
			if (o != null) {
				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getBindingElementReferenceResolver().deResolve((be.ac.vub.simplegt.InputElement) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_BINDING__ELEMENT)), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_BINDING__ELEMENT), element));
				out.print(" ");
			}
			printCountingMap.put("element", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_be_ac_vub_simplegt_InputBinding_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_be_ac_vub_simplegt_InputBinding_0(be.ac.vub.simplegt.InputBinding element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("feature");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_BINDING__FEATURE));
			if (o != null) {
				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_BINDING__FEATURE), element));
				out.print(" ");
			}
			printCountingMap.put("feature", count - 1);
		}
	}
	
	
	public void print_be_ac_vub_simplegt_NacPattern(be.ac.vub.simplegt.NacPattern element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.NAC_PATTERN__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.NAC_PATTERN__NAC_FOR));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.NAC_PATTERN__ELEMENTS));
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
			print_be_ac_vub_simplegt_NacPattern_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_be_ac_vub_simplegt_NacPattern_0(be.ac.vub.simplegt.NacPattern element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.NAC_PATTERN__ELEMENTS));
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
	
	
	public void print_be_ac_vub_simplegt_OutPattern(be.ac.vub.simplegt.OutPattern element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUT_PATTERN__OUTPUT_FOR));
		printCountingMap.put("outputFor", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUT_PATTERN__ELEMENTS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUT_PATTERN__ELEMENTS));
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
			print_be_ac_vub_simplegt_OutPattern_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_be_ac_vub_simplegt_OutPattern_0(be.ac.vub.simplegt.OutPattern element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUT_PATTERN__ELEMENTS));
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
	
	
	public void print_be_ac_vub_simplegt_OutputElement(be.ac.vub.simplegt.OutputElement element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_ELEMENT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_ELEMENT__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_ELEMENT__PATTERN));
		printCountingMap.put("pattern", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_ELEMENT__BINDINGS));
		printCountingMap.put("bindings", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_ELEMENT__NAME));
			if (o != null) {
				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_ELEMENT__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_ELEMENT__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_be_ac_vub_simplegt_OutputElement_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_be_ac_vub_simplegt_OutputElement_0(be.ac.vub.simplegt.OutputElement element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("bindings");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_ELEMENT__BINDINGS));
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
			print_be_ac_vub_simplegt_OutputElement_0_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_be_ac_vub_simplegt_OutputElement_0_0(be.ac.vub.simplegt.OutputElement element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("bindings");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_ELEMENT__BINDINGS));
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
	
	
	public void print_be_ac_vub_simplegt_OutputBinding(be.ac.vub.simplegt.OutputBinding element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_BINDING__FEATURE));
		printCountingMap.put("feature", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_BINDING__ELEMENT));
		printCountingMap.put("element", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_BINDING__TARGET_FEATURE));
		printCountingMap.put("targetFeature", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_BINDING__BINDING_FOR));
		printCountingMap.put("bindingFor", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("targetFeature");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_BINDING__TARGET_FEATURE));
			if (o != null) {
				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_BINDING__TARGET_FEATURE), element));
				out.print(" ");
			}
			printCountingMap.put("targetFeature", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("element");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_BINDING__ELEMENT));
			if (o != null) {
				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getBindingElementReferenceResolver().deResolve((be.ac.vub.simplegt.InputElement) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_BINDING__ELEMENT)), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_BINDING__ELEMENT), element));
				out.print(" ");
			}
			printCountingMap.put("element", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_be_ac_vub_simplegt_OutputBinding_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_be_ac_vub_simplegt_OutputBinding_0(be.ac.vub.simplegt.OutputBinding element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("feature");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_BINDING__FEATURE));
			if (o != null) {
				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_BINDING__FEATURE), element));
				out.print(" ");
			}
			printCountingMap.put("feature", count - 1);
		}
	}
	
	
}
