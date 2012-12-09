/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt;

/**
 * A delegating reference resolver is an extension of a normal reference resolver
 * that can be configured with another resolver that it may delegate method calls
 * to. This interface can be implemented by additional resolvers to customize
 * resolving using the load option ADDITIONAL_REFERENCE_RESOLVERS.
 * 
 * @see be.ac.vub.simplegt.resource.simplegt.ISimplegtOptions
 */
public interface ISimplegtDelegatingReferenceResolver<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> extends be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceResolver<ContainerType, ReferenceType> {
	
	/**
	 * Sets the delegate for this resolver.
	 */
	public void setDelegate(be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceResolver<ContainerType, ReferenceType> delegate);
	
}
