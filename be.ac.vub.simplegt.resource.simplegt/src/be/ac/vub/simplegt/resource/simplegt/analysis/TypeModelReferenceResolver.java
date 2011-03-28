/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.analysis;

public class TypeModelReferenceResolver implements be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceResolver<be.ac.vub.simplegt.Type, be.ac.vub.simplegt.Metamodel> {
	
	private be.ac.vub.simplegt.resource.simplegt.analysis.SimplegtDefaultResolverDelegate<be.ac.vub.simplegt.Type, be.ac.vub.simplegt.Metamodel> delegate = new be.ac.vub.simplegt.resource.simplegt.analysis.SimplegtDefaultResolverDelegate<be.ac.vub.simplegt.Type, be.ac.vub.simplegt.Metamodel>();
	
	public void resolve(String identifier, be.ac.vub.simplegt.Type container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceResolveResult<be.ac.vub.simplegt.Metamodel> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(be.ac.vub.simplegt.Metamodel element, be.ac.vub.simplegt.Type container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
