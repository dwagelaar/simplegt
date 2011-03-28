/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.analysis;

public class TypedElementTypeReferenceResolver implements be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceResolver<be.ac.vub.simplegt.TypedElement, be.ac.vub.simplegt.Type> {
	
	private be.ac.vub.simplegt.resource.simplegt.analysis.SimplegtDefaultResolverDelegate<be.ac.vub.simplegt.TypedElement, be.ac.vub.simplegt.Type> delegate = new be.ac.vub.simplegt.resource.simplegt.analysis.SimplegtDefaultResolverDelegate<be.ac.vub.simplegt.TypedElement, be.ac.vub.simplegt.Type>();
	
	public void resolve(String identifier, be.ac.vub.simplegt.TypedElement container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceResolveResult<be.ac.vub.simplegt.Type> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(be.ac.vub.simplegt.Type element, be.ac.vub.simplegt.TypedElement container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
