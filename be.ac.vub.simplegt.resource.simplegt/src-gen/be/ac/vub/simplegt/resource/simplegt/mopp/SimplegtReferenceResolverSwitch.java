/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.mopp;

public class SimplegtReferenceResolverSwitch implements be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceResolverSwitch {
	
	protected be.ac.vub.simplegt.resource.simplegt.analysis.RuleElementInModelReferenceResolver ruleElementInModelReferenceResolver = new be.ac.vub.simplegt.resource.simplegt.analysis.RuleElementInModelReferenceResolver();
	protected be.ac.vub.simplegt.resource.simplegt.analysis.OutputBindingBeforeElementReferenceResolver outputBindingBeforeElementReferenceResolver = new be.ac.vub.simplegt.resource.simplegt.analysis.OutputBindingBeforeElementReferenceResolver();
	protected be.ac.vub.simplegt.resource.simplegt.analysis.OclInstanceModelMetamodelReferenceResolver oclInstanceModelMetamodelReferenceResolver = new be.ac.vub.simplegt.resource.simplegt.analysis.OclInstanceModelMetamodelReferenceResolver();
	protected be.ac.vub.simplegt.resource.simplegt.analysis.OclModelElementExpModelReferenceResolver oclModelElementExpModelReferenceResolver = new be.ac.vub.simplegt.resource.simplegt.analysis.OclModelElementExpModelReferenceResolver();
	protected be.ac.vub.simplegt.resource.simplegt.analysis.VariableExpReferredVariableReferenceResolver variableExpReferredVariableReferenceResolver = new be.ac.vub.simplegt.resource.simplegt.analysis.VariableExpReferredVariableReferenceResolver();
	protected be.ac.vub.simplegt.resource.simplegt.analysis.OclModelElementModelReferenceResolver oclModelElementModelReferenceResolver = new be.ac.vub.simplegt.resource.simplegt.analysis.OclModelElementModelReferenceResolver();
	
	public be.ac.vub.simplegt.resource.simplegt.analysis.RuleElementInModelReferenceResolver getRuleElementInModelReferenceResolver() {
		return ruleElementInModelReferenceResolver;
	}
	
	public be.ac.vub.simplegt.resource.simplegt.analysis.OutputBindingBeforeElementReferenceResolver getOutputBindingBeforeElementReferenceResolver() {
		return outputBindingBeforeElementReferenceResolver;
	}
	
	public be.ac.vub.simplegt.resource.simplegt.analysis.OclInstanceModelMetamodelReferenceResolver getOclInstanceModelMetamodelReferenceResolver() {
		return oclInstanceModelMetamodelReferenceResolver;
	}
	
	public be.ac.vub.simplegt.resource.simplegt.analysis.OclModelElementExpModelReferenceResolver getOclModelElementExpModelReferenceResolver() {
		return oclModelElementExpModelReferenceResolver;
	}
	
	public be.ac.vub.simplegt.resource.simplegt.analysis.VariableExpReferredVariableReferenceResolver getVariableExpReferredVariableReferenceResolver() {
		return variableExpReferredVariableReferenceResolver;
	}
	
	public be.ac.vub.simplegt.resource.simplegt.analysis.OclModelElementModelReferenceResolver getOclModelElementModelReferenceResolver() {
		return oclModelElementModelReferenceResolver;
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		ruleElementInModelReferenceResolver.setOptions(options);
		outputBindingBeforeElementReferenceResolver.setOptions(options);
		oclInstanceModelMetamodelReferenceResolver.setOptions(options);
		oclModelElementExpModelReferenceResolver.setOptions(options);
		variableExpReferredVariableReferenceResolver.setOptions(options);
		oclModelElementModelReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getRuleElement().isInstance(container)) {
			SimplegtFuzzyResolveResult<be.ac.vub.simpleocl.OclInstanceModel> frr = new SimplegtFuzzyResolveResult<be.ac.vub.simpleocl.OclInstanceModel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("inModel")) {
				ruleElementInModelReferenceResolver.resolve(identifier, (be.ac.vub.simplegt.RuleElement) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getOutputBinding().isInstance(container)) {
			SimplegtFuzzyResolveResult<be.ac.vub.simplegt.RuleElement> frr = new SimplegtFuzzyResolveResult<be.ac.vub.simplegt.RuleElement>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("beforeElement")) {
				outputBindingBeforeElementReferenceResolver.resolve(identifier, (be.ac.vub.simplegt.OutputBinding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (be.ac.vub.simpleocl.SimpleoclPackage.eINSTANCE.getOclInstanceModel().isInstance(container)) {
			SimplegtFuzzyResolveResult<be.ac.vub.simpleocl.OclMetamodel> frr = new SimplegtFuzzyResolveResult<be.ac.vub.simpleocl.OclMetamodel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("metamodel")) {
				oclInstanceModelMetamodelReferenceResolver.resolve(identifier, (be.ac.vub.simpleocl.OclInstanceModel) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (be.ac.vub.simpleocl.SimpleoclPackage.eINSTANCE.getOclModelElementExp().isInstance(container)) {
			SimplegtFuzzyResolveResult<be.ac.vub.simpleocl.OclModel> frr = new SimplegtFuzzyResolveResult<be.ac.vub.simpleocl.OclModel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("model")) {
				oclModelElementExpModelReferenceResolver.resolve(identifier, (be.ac.vub.simpleocl.OclModelElementExp) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (be.ac.vub.simpleocl.SimpleoclPackage.eINSTANCE.getVariableExp().isInstance(container)) {
			SimplegtFuzzyResolveResult<be.ac.vub.simpleocl.VariableDeclaration> frr = new SimplegtFuzzyResolveResult<be.ac.vub.simpleocl.VariableDeclaration>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("referredVariable")) {
				variableExpReferredVariableReferenceResolver.resolve(identifier, (be.ac.vub.simpleocl.VariableExp) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (be.ac.vub.simpleocl.SimpleoclPackage.eINSTANCE.getOclModelElement().isInstance(container)) {
			SimplegtFuzzyResolveResult<be.ac.vub.simpleocl.OclModel> frr = new SimplegtFuzzyResolveResult<be.ac.vub.simpleocl.OclModel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("model")) {
				oclModelElementModelReferenceResolver.resolve(identifier, (be.ac.vub.simpleocl.OclModelElement) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getRuleElement_InModel()) {
			return ruleElementInModelReferenceResolver;
		}
		if (reference == be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getOutputBinding_BeforeElement()) {
			return outputBindingBeforeElementReferenceResolver;
		}
		if (reference == be.ac.vub.simpleocl.SimpleoclPackage.eINSTANCE.getOclInstanceModel_Metamodel()) {
			return oclInstanceModelMetamodelReferenceResolver;
		}
		if (reference == be.ac.vub.simpleocl.SimpleoclPackage.eINSTANCE.getOclModelElementExp_Model()) {
			return oclModelElementExpModelReferenceResolver;
		}
		if (reference == be.ac.vub.simpleocl.SimpleoclPackage.eINSTANCE.getVariableExp_ReferredVariable()) {
			return variableExpReferredVariableReferenceResolver;
		}
		if (reference == be.ac.vub.simpleocl.SimpleoclPackage.eINSTANCE.getOclModelElement_Model()) {
			return oclModelElementModelReferenceResolver;
		}
		return null;
	}
	
}
