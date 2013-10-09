/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.mopp;

public class SimplegtReferenceResolverSwitch implements org.eclipselabs.simplegt.resource.simplegt.ISimplegtReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private java.util.Map<Object, Object> options;
	
	protected org.eclipselabs.simplegt.resource.simplegt.analysis.RuleElementInModelReferenceResolver ruleElementInModelReferenceResolver = new org.eclipselabs.simplegt.resource.simplegt.analysis.RuleElementInModelReferenceResolver();
	protected org.eclipselabs.simplegt.resource.simplegt.analysis.OutputBindingBeforeElementReferenceResolver outputBindingBeforeElementReferenceResolver = new org.eclipselabs.simplegt.resource.simplegt.analysis.OutputBindingBeforeElementReferenceResolver();
	protected org.eclipselabs.simplegt.resource.simplegt.analysis.OclInstanceModelMetamodelReferenceResolver oclInstanceModelMetamodelReferenceResolver = new org.eclipselabs.simplegt.resource.simplegt.analysis.OclInstanceModelMetamodelReferenceResolver();
	protected org.eclipselabs.simplegt.resource.simplegt.analysis.OclModelElementExpModelReferenceResolver oclModelElementExpModelReferenceResolver = new org.eclipselabs.simplegt.resource.simplegt.analysis.OclModelElementExpModelReferenceResolver();
	protected org.eclipselabs.simplegt.resource.simplegt.analysis.VariableExpReferredVariableReferenceResolver variableExpReferredVariableReferenceResolver = new org.eclipselabs.simplegt.resource.simplegt.analysis.VariableExpReferredVariableReferenceResolver();
	protected org.eclipselabs.simplegt.resource.simplegt.analysis.OclModelElementModelReferenceResolver oclModelElementModelReferenceResolver = new org.eclipselabs.simplegt.resource.simplegt.analysis.OclModelElementModelReferenceResolver();
	
	public org.eclipselabs.simplegt.resource.simplegt.ISimplegtReferenceResolver<org.eclipselabs.simplegt.RuleElement, org.eclipselabs.simpleocl.OclInstanceModel> getRuleElementInModelReferenceResolver() {
		return getResolverChain(org.eclipselabs.simplegt.SimplegtPackage.eINSTANCE.getRuleElement_InModel(), ruleElementInModelReferenceResolver);
	}
	
	public org.eclipselabs.simplegt.resource.simplegt.ISimplegtReferenceResolver<org.eclipselabs.simplegt.OutputBinding, org.eclipselabs.simplegt.RuleElement> getOutputBindingBeforeElementReferenceResolver() {
		return getResolverChain(org.eclipselabs.simplegt.SimplegtPackage.eINSTANCE.getOutputBinding_BeforeElement(), outputBindingBeforeElementReferenceResolver);
	}
	
	public org.eclipselabs.simplegt.resource.simplegt.ISimplegtReferenceResolver<org.eclipselabs.simpleocl.OclInstanceModel, org.eclipselabs.simpleocl.OclMetamodel> getOclInstanceModelMetamodelReferenceResolver() {
		return getResolverChain(org.eclipselabs.simpleocl.SimpleoclPackage.eINSTANCE.getOclInstanceModel_Metamodel(), oclInstanceModelMetamodelReferenceResolver);
	}
	
	public org.eclipselabs.simplegt.resource.simplegt.ISimplegtReferenceResolver<org.eclipselabs.simpleocl.OclModelElementExp, org.eclipselabs.simpleocl.OclModel> getOclModelElementExpModelReferenceResolver() {
		return getResolverChain(org.eclipselabs.simpleocl.SimpleoclPackage.eINSTANCE.getOclModelElementExp_Model(), oclModelElementExpModelReferenceResolver);
	}
	
	public org.eclipselabs.simplegt.resource.simplegt.ISimplegtReferenceResolver<org.eclipselabs.simpleocl.VariableExp, org.eclipselabs.simpleocl.VariableDeclaration> getVariableExpReferredVariableReferenceResolver() {
		return getResolverChain(org.eclipselabs.simpleocl.SimpleoclPackage.eINSTANCE.getVariableExp_ReferredVariable(), variableExpReferredVariableReferenceResolver);
	}
	
	public org.eclipselabs.simplegt.resource.simplegt.ISimplegtReferenceResolver<org.eclipselabs.simpleocl.OclModelElement, org.eclipselabs.simpleocl.OclModel> getOclModelElementModelReferenceResolver() {
		return getResolverChain(org.eclipselabs.simpleocl.SimpleoclPackage.eINSTANCE.getOclModelElement_Model(), oclModelElementModelReferenceResolver);
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		if (options != null) {
			this.options = new java.util.LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
		ruleElementInModelReferenceResolver.setOptions(options);
		outputBindingBeforeElementReferenceResolver.setOptions(options);
		oclInstanceModelMetamodelReferenceResolver.setOptions(options);
		oclModelElementExpModelReferenceResolver.setOptions(options);
		variableExpReferredVariableReferenceResolver.setOptions(options);
		oclModelElementModelReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, org.eclipselabs.simplegt.resource.simplegt.ISimplegtReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (org.eclipselabs.simplegt.SimplegtPackage.eINSTANCE.getRuleElement().isInstance(container)) {
			SimplegtFuzzyResolveResult<org.eclipselabs.simpleocl.OclInstanceModel> frr = new SimplegtFuzzyResolveResult<org.eclipselabs.simpleocl.OclInstanceModel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("inModel")) {
				ruleElementInModelReferenceResolver.resolve(identifier, (org.eclipselabs.simplegt.RuleElement) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.eclipselabs.simplegt.SimplegtPackage.eINSTANCE.getOutputBinding().isInstance(container)) {
			SimplegtFuzzyResolveResult<org.eclipselabs.simplegt.RuleElement> frr = new SimplegtFuzzyResolveResult<org.eclipselabs.simplegt.RuleElement>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("beforeElement")) {
				outputBindingBeforeElementReferenceResolver.resolve(identifier, (org.eclipselabs.simplegt.OutputBinding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.eclipselabs.simpleocl.SimpleoclPackage.eINSTANCE.getOclInstanceModel().isInstance(container)) {
			SimplegtFuzzyResolveResult<org.eclipselabs.simpleocl.OclMetamodel> frr = new SimplegtFuzzyResolveResult<org.eclipselabs.simpleocl.OclMetamodel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("metamodel")) {
				oclInstanceModelMetamodelReferenceResolver.resolve(identifier, (org.eclipselabs.simpleocl.OclInstanceModel) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.eclipselabs.simpleocl.SimpleoclPackage.eINSTANCE.getOclModelElementExp().isInstance(container)) {
			SimplegtFuzzyResolveResult<org.eclipselabs.simpleocl.OclModel> frr = new SimplegtFuzzyResolveResult<org.eclipselabs.simpleocl.OclModel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("model")) {
				oclModelElementExpModelReferenceResolver.resolve(identifier, (org.eclipselabs.simpleocl.OclModelElementExp) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.eclipselabs.simpleocl.SimpleoclPackage.eINSTANCE.getVariableExp().isInstance(container)) {
			SimplegtFuzzyResolveResult<org.eclipselabs.simpleocl.VariableDeclaration> frr = new SimplegtFuzzyResolveResult<org.eclipselabs.simpleocl.VariableDeclaration>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("referredVariable")) {
				variableExpReferredVariableReferenceResolver.resolve(identifier, (org.eclipselabs.simpleocl.VariableExp) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.eclipselabs.simpleocl.SimpleoclPackage.eINSTANCE.getOclModelElement().isInstance(container)) {
			SimplegtFuzzyResolveResult<org.eclipselabs.simpleocl.OclModel> frr = new SimplegtFuzzyResolveResult<org.eclipselabs.simpleocl.OclModel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("model")) {
				oclModelElementModelReferenceResolver.resolve(identifier, (org.eclipselabs.simpleocl.OclModelElement) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public org.eclipselabs.simplegt.resource.simplegt.ISimplegtReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == org.eclipselabs.simplegt.SimplegtPackage.eINSTANCE.getRuleElement_InModel()) {
			return getResolverChain(reference, ruleElementInModelReferenceResolver);
		}
		if (reference == org.eclipselabs.simplegt.SimplegtPackage.eINSTANCE.getOutputBinding_BeforeElement()) {
			return getResolverChain(reference, outputBindingBeforeElementReferenceResolver);
		}
		if (reference == org.eclipselabs.simpleocl.SimpleoclPackage.eINSTANCE.getOclInstanceModel_Metamodel()) {
			return getResolverChain(reference, oclInstanceModelMetamodelReferenceResolver);
		}
		if (reference == org.eclipselabs.simpleocl.SimpleoclPackage.eINSTANCE.getOclModelElementExp_Model()) {
			return getResolverChain(reference, oclModelElementExpModelReferenceResolver);
		}
		if (reference == org.eclipselabs.simpleocl.SimpleoclPackage.eINSTANCE.getVariableExp_ReferredVariable()) {
			return getResolverChain(reference, variableExpReferredVariableReferenceResolver);
		}
		if (reference == org.eclipselabs.simpleocl.SimpleoclPackage.eINSTANCE.getOclModelElement_Model()) {
			return getResolverChain(reference, oclModelElementModelReferenceResolver);
		}
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> org.eclipselabs.simplegt.resource.simplegt.ISimplegtReferenceResolver<ContainerType, ReferenceType> getResolverChain(org.eclipse.emf.ecore.EStructuralFeature reference, org.eclipselabs.simplegt.resource.simplegt.ISimplegtReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(org.eclipselabs.simplegt.resource.simplegt.ISimplegtOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof java.util.Map)) {
			// send this to the error log
			new org.eclipselabs.simplegt.resource.simplegt.util.SimplegtRuntimeUtil().logWarning("Found value with invalid type for option " + org.eclipselabs.simplegt.resource.simplegt.ISimplegtOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + java.util.Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		java.util.Map<?,?> resolverMap = (java.util.Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof org.eclipselabs.simplegt.resource.simplegt.ISimplegtReferenceResolver) {
			org.eclipselabs.simplegt.resource.simplegt.ISimplegtReferenceResolver replacingResolver = (org.eclipselabs.simplegt.resource.simplegt.ISimplegtReferenceResolver) resolverValue;
			if (replacingResolver instanceof org.eclipselabs.simplegt.resource.simplegt.ISimplegtDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((org.eclipselabs.simplegt.resource.simplegt.ISimplegtDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof java.util.Collection) {
			java.util.Collection replacingResolvers = (java.util.Collection) resolverValue;
			org.eclipselabs.simplegt.resource.simplegt.ISimplegtReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof org.eclipselabs.simplegt.resource.simplegt.ISimplegtReferenceCache) {
					org.eclipselabs.simplegt.resource.simplegt.ISimplegtReferenceResolver nextResolver = (org.eclipselabs.simplegt.resource.simplegt.ISimplegtReferenceResolver) next;
					if (nextResolver instanceof org.eclipselabs.simplegt.resource.simplegt.ISimplegtDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((org.eclipselabs.simplegt.resource.simplegt.ISimplegtDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new org.eclipselabs.simplegt.resource.simplegt.util.SimplegtRuntimeUtil().logWarning("Found value with invalid type in value map for option " + org.eclipselabs.simplegt.resource.simplegt.ISimplegtOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + org.eclipselabs.simplegt.resource.simplegt.ISimplegtDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new org.eclipselabs.simplegt.resource.simplegt.util.SimplegtRuntimeUtil().logWarning("Found value with invalid type in value map for option " + org.eclipselabs.simplegt.resource.simplegt.ISimplegtOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + org.eclipselabs.simplegt.resource.simplegt.ISimplegtDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
