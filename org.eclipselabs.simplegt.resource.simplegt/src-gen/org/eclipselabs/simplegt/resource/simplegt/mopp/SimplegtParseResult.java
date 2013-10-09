/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.mopp;

public class SimplegtParseResult implements org.eclipselabs.simplegt.resource.simplegt.ISimplegtParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<org.eclipselabs.simplegt.resource.simplegt.ISimplegtCommand<org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextResource>> commands = new java.util.ArrayList<org.eclipselabs.simplegt.resource.simplegt.ISimplegtCommand<org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextResource>>();
	
	public SimplegtParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<org.eclipselabs.simplegt.resource.simplegt.ISimplegtCommand<org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
