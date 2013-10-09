/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.analysis;

public class OutputBindingBeforeElementReferenceResolver implements org.eclipselabs.simplegt.resource.simplegt.ISimplegtReferenceResolver<org.eclipselabs.simplegt.OutputBinding, org.eclipselabs.simplegt.RuleElement> {
	
	private org.eclipselabs.simplegt.resource.simplegt.analysis.SimplegtDefaultResolverDelegate<org.eclipselabs.simplegt.OutputBinding, org.eclipselabs.simplegt.RuleElement> delegate = new org.eclipselabs.simplegt.resource.simplegt.analysis.SimplegtDefaultResolverDelegate<org.eclipselabs.simplegt.OutputBinding, org.eclipselabs.simplegt.RuleElement>();
	
	public void resolve(String identifier, org.eclipselabs.simplegt.OutputBinding container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.eclipselabs.simplegt.resource.simplegt.ISimplegtReferenceResolveResult<org.eclipselabs.simplegt.RuleElement> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(org.eclipselabs.simplegt.RuleElement element, org.eclipselabs.simplegt.OutputBinding container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
