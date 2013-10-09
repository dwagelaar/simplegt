/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt;

/**
 * Implementors of this interface provide an EMF resource.
 */
public interface ISimplegtResourceProvider {
	
	/**
	 * Returns the resource.
	 */
	public org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextResource getResource();
	
}
