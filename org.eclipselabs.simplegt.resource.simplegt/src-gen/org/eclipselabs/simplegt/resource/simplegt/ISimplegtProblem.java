/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt;

public interface ISimplegtProblem {
	public String getMessage();
	public org.eclipselabs.simplegt.resource.simplegt.SimplegtEProblemSeverity getSeverity();
	public org.eclipselabs.simplegt.resource.simplegt.SimplegtEProblemType getType();
	public java.util.Collection<org.eclipselabs.simplegt.resource.simplegt.ISimplegtQuickFix> getQuickFixes();
}
