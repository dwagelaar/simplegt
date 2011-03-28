/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.analysis;

public class BindingElementReferenceResolver implements be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceResolver<be.ac.vub.simplegt.Binding, be.ac.vub.simplegt.InputElement> {
	
	private be.ac.vub.simplegt.resource.simplegt.analysis.SimplegtDefaultResolverDelegate<be.ac.vub.simplegt.Binding, be.ac.vub.simplegt.InputElement> delegate = new be.ac.vub.simplegt.resource.simplegt.analysis.SimplegtDefaultResolverDelegate<be.ac.vub.simplegt.Binding, be.ac.vub.simplegt.InputElement>();
	
	public void resolve(String identifier, be.ac.vub.simplegt.Binding container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceResolveResult<be.ac.vub.simplegt.InputElement> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(be.ac.vub.simplegt.InputElement element, be.ac.vub.simplegt.Binding container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
