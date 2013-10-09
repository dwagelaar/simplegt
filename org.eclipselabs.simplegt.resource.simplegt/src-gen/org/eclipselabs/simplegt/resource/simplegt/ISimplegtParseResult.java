/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt;

/**
 * An interface used to access the result of parsing a document.
 */
public interface ISimplegtParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<org.eclipselabs.simplegt.resource.simplegt.ISimplegtCommand<org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextResource>> getPostParseCommands();
	
}
