/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt;

/**
 * Implementors of this interface provide an EMF resource.
 */
public interface ISimplegtResourceProvider {
	
	/**
	 * Returns the resource.
	 */
	public be.ac.vub.simplegt.resource.simplegt.ISimplegtTextResource getResource();
	
}
