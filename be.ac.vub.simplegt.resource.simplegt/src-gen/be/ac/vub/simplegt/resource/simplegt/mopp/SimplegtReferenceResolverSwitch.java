/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.mopp;

public class SimplegtReferenceResolverSwitch implements be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceResolverSwitch {
	
	protected be.ac.vub.simplegt.resource.simplegt.analysis.TypeModelReferenceResolver typeModelReferenceResolver = new be.ac.vub.simplegt.resource.simplegt.analysis.TypeModelReferenceResolver();
	protected be.ac.vub.simplegt.resource.simplegt.analysis.BindingElementReferenceResolver bindingElementReferenceResolver = new be.ac.vub.simplegt.resource.simplegt.analysis.BindingElementReferenceResolver();
	
	public be.ac.vub.simplegt.resource.simplegt.analysis.TypeModelReferenceResolver getTypeModelReferenceResolver() {
		return typeModelReferenceResolver;
	}
	
	public be.ac.vub.simplegt.resource.simplegt.analysis.BindingElementReferenceResolver getBindingElementReferenceResolver() {
		return bindingElementReferenceResolver;
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		typeModelReferenceResolver.setOptions(options);
		bindingElementReferenceResolver.setOptions(options);
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
		if (be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getBinding().isInstance(container)) {
			SimplegtFuzzyResolveResult<be.ac.vub.simplegt.InputElement> frr = new SimplegtFuzzyResolveResult<be.ac.vub.simplegt.InputElement>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("element")) {
				bindingElementReferenceResolver.resolve(identifier, (be.ac.vub.simplegt.Binding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getType_Model()) {
			return typeModelReferenceResolver;
		}
		if (reference == be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getBinding_Element()) {
			return bindingElementReferenceResolver;
		}
		return null;
	}
	
}
