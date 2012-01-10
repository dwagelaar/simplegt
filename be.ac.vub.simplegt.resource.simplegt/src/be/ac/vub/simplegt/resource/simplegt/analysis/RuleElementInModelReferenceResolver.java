/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.analysis;

public class RuleElementInModelReferenceResolver implements be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceResolver<be.ac.vub.simplegt.RuleElement, be.ac.vub.simpleocl.OclInstanceModel> {
	
	private be.ac.vub.simplegt.resource.simplegt.analysis.SimplegtDefaultResolverDelegate<be.ac.vub.simplegt.RuleElement, be.ac.vub.simpleocl.OclInstanceModel> delegate = new be.ac.vub.simplegt.resource.simplegt.analysis.SimplegtDefaultResolverDelegate<be.ac.vub.simplegt.RuleElement, be.ac.vub.simpleocl.OclInstanceModel>();
	
	public void resolve(String identifier, be.ac.vub.simplegt.RuleElement container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceResolveResult<be.ac.vub.simpleocl.OclInstanceModel> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(be.ac.vub.simpleocl.OclInstanceModel element, be.ac.vub.simplegt.RuleElement container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
