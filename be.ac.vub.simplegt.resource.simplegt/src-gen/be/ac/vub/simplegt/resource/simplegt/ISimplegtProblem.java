/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt;

public interface ISimplegtProblem {
	public String getMessage();
	public be.ac.vub.simplegt.resource.simplegt.SimplegtEProblemSeverity getSeverity();
	public be.ac.vub.simplegt.resource.simplegt.SimplegtEProblemType getType();
	public java.util.Collection<be.ac.vub.simplegt.resource.simplegt.ISimplegtQuickFix> getQuickFixes();
}
