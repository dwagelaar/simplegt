/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.analysis;

public class RuleElementInModelReferenceResolver implements org.eclipselabs.simplegt.resource.simplegt.ISimplegtReferenceResolver<org.eclipselabs.simplegt.RuleElement, org.eclipselabs.simpleocl.OclInstanceModel> {
	
	private org.eclipselabs.simplegt.resource.simplegt.analysis.SimplegtDefaultResolverDelegate<org.eclipselabs.simplegt.RuleElement, org.eclipselabs.simpleocl.OclInstanceModel> delegate = new org.eclipselabs.simplegt.resource.simplegt.analysis.SimplegtDefaultResolverDelegate<org.eclipselabs.simplegt.RuleElement, org.eclipselabs.simpleocl.OclInstanceModel>();
	
	public void resolve(String identifier, org.eclipselabs.simplegt.RuleElement container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.eclipselabs.simplegt.resource.simplegt.ISimplegtReferenceResolveResult<org.eclipselabs.simpleocl.OclInstanceModel> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(org.eclipselabs.simpleocl.OclInstanceModel element, org.eclipselabs.simplegt.RuleElement container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
