/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface ISimplegtResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public org.eclipselabs.simplegt.resource.simplegt.ISimplegtResourcePostProcessor getResourcePostProcessor();
	
}
