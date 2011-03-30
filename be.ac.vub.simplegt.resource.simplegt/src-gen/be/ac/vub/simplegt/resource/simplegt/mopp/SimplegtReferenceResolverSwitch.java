/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.mopp;

public class SimplegtReferenceResolverSwitch implements be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceResolverSwitch {
	
	protected be.ac.vub.simplegt.resource.simplegt.analysis.TypeModelReferenceResolver typeModelReferenceResolver = new be.ac.vub.simplegt.resource.simplegt.analysis.TypeModelReferenceResolver();
	protected be.ac.vub.simplegt.resource.simplegt.analysis.RuleElementInModelReferenceResolver ruleElementInModelReferenceResolver = new be.ac.vub.simplegt.resource.simplegt.analysis.RuleElementInModelReferenceResolver();
	protected be.ac.vub.simplegt.resource.simplegt.analysis.ElementExpElementReferenceResolver elementExpElementReferenceResolver = new be.ac.vub.simplegt.resource.simplegt.analysis.ElementExpElementReferenceResolver();
	protected be.ac.vub.simplegt.resource.simplegt.analysis.AddBindingBeforeElementReferenceResolver addBindingBeforeElementReferenceResolver = new be.ac.vub.simplegt.resource.simplegt.analysis.AddBindingBeforeElementReferenceResolver();
	
	public be.ac.vub.simplegt.resource.simplegt.analysis.TypeModelReferenceResolver getTypeModelReferenceResolver() {
		return typeModelReferenceResolver;
	}
	
	public be.ac.vub.simplegt.resource.simplegt.analysis.RuleElementInModelReferenceResolver getRuleElementInModelReferenceResolver() {
		return ruleElementInModelReferenceResolver;
	}
	
	public be.ac.vub.simplegt.resource.simplegt.analysis.ElementExpElementReferenceResolver getElementExpElementReferenceResolver() {
		return elementExpElementReferenceResolver;
	}
	
	public be.ac.vub.simplegt.resource.simplegt.analysis.AddBindingBeforeElementReferenceResolver getAddBindingBeforeElementReferenceResolver() {
		return addBindingBeforeElementReferenceResolver;
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		typeModelReferenceResolver.setOptions(options);
		ruleElementInModelReferenceResolver.setOptions(options);
		elementExpElementReferenceResolver.setOptions(options);
		addBindingBeforeElementReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getType().isInstance(container)) {
			SimplegtFuzzyResolveResult<be.ac.vub.simplegt.Metamodel> frr = new SimplegtFuzzyResolveResult<be.ac.vub.simplegt.Metamodel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("model")) {
				typeModelReferenceResolver.resolve(identifier, (be.ac.vub.simplegt.Type) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getRuleElement().isInstance(container)) {
			SimplegtFuzzyResolveResult<be.ac.vub.simplegt.InstanceModel> frr = new SimplegtFuzzyResolveResult<be.ac.vub.simplegt.InstanceModel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("inModel")) {
				ruleElementInModelReferenceResolver.resolve(identifier, (be.ac.vub.simplegt.RuleElement) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getElementExp().isInstance(container)) {
			SimplegtFuzzyResolveResult<be.ac.vub.simplegt.RuleElement> frr = new SimplegtFuzzyResolveResult<be.ac.vub.simplegt.RuleElement>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("element")) {
				elementExpElementReferenceResolver.resolve(identifier, (be.ac.vub.simplegt.ElementExp) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getAddBinding().isInstance(container)) {
			SimplegtFuzzyResolveResult<be.ac.vub.simplegt.RuleElement> frr = new SimplegtFuzzyResolveResult<be.ac.vub.simplegt.RuleElement>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("beforeElement")) {
				addBindingBeforeElementReferenceResolver.resolve(identifier, (be.ac.vub.simplegt.AddBinding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getType_Model()) {
			return typeModelReferenceResolver;
		}
		if (reference == be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getRuleElement_InModel()) {
			return ruleElementInModelReferenceResolver;
		}
		if (reference == be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getElementExp_Element()) {
			return elementExpElementReferenceResolver;
		}
		if (reference == be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getAddBinding_BeforeElement()) {
			return addBindingBeforeElementReferenceResolver;
		}
		return null;
	}
	
}
