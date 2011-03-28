/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.mopp;

public class SimplegtProblem implements be.ac.vub.simplegt.resource.simplegt.ISimplegtProblem {
	
	private String message;
	private be.ac.vub.simplegt.resource.simplegt.SimplegtEProblemType type;
	private be.ac.vub.simplegt.resource.simplegt.SimplegtEProblemSeverity severity;
	private java.util.Collection<be.ac.vub.simplegt.resource.simplegt.ISimplegtQuickFix> quickFixes;
	
	public SimplegtProblem(String message, be.ac.vub.simplegt.resource.simplegt.SimplegtEProblemType type, be.ac.vub.simplegt.resource.simplegt.SimplegtEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<be.ac.vub.simplegt.resource.simplegt.ISimplegtQuickFix>emptySet());
	}
	
	public SimplegtProblem(String message, be.ac.vub.simplegt.resource.simplegt.SimplegtEProblemType type, be.ac.vub.simplegt.resource.simplegt.SimplegtEProblemSeverity severity, be.ac.vub.simplegt.resource.simplegt.ISimplegtQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public SimplegtProblem(String message, be.ac.vub.simplegt.resource.simplegt.SimplegtEProblemType type, be.ac.vub.simplegt.resource.simplegt.SimplegtEProblemSeverity severity, java.util.Collection<be.ac.vub.simplegt.resource.simplegt.ISimplegtQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<be.ac.vub.simplegt.resource.simplegt.ISimplegtQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public be.ac.vub.simplegt.resource.simplegt.SimplegtEProblemType getType() {
		return type;
	}
	
	public be.ac.vub.simplegt.resource.simplegt.SimplegtEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<be.ac.vub.simplegt.resource.simplegt.ISimplegtQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
