/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.mopp;

/**
 * A basic implementation of the ITokenResolveResult interface.
 */
public class SimplegtTokenResolveResult implements org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolveResult {
	
	private String errorMessage;
	private Object resolvedToken;
	
	public SimplegtTokenResolveResult() {
		super();
		clear();
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public Object getResolvedToken() {
		return resolvedToken;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void setResolvedToken(Object resolvedToken) {
		this.resolvedToken = resolvedToken;
	}
	
	public void clear() {
		errorMessage = "Can't resolve token.";
		resolvedToken = null;
	}
	
}
