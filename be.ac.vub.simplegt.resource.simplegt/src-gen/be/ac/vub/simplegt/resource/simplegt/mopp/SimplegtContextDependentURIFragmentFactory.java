/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.mopp;

/**
 * A factory for ContextDependentURIFragments. Given a feasible reference
 * resolver, this factory returns a matching fragment that used the resolver to
 * resolver proxy objects.
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public class SimplegtContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject>  implements be.ac.vub.simplegt.resource.simplegt.ISimplegtContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public SimplegtContextDependentURIFragmentFactory(be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public be.ac.vub.simplegt.resource.simplegt.ISimplegtContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		
		return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
