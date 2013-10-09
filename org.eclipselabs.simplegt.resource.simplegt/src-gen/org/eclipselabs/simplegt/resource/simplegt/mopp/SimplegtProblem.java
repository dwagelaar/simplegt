/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.mopp;

public class SimplegtProblem implements org.eclipselabs.simplegt.resource.simplegt.ISimplegtProblem {
	
	private String message;
	private org.eclipselabs.simplegt.resource.simplegt.SimplegtEProblemType type;
	private org.eclipselabs.simplegt.resource.simplegt.SimplegtEProblemSeverity severity;
	private java.util.Collection<org.eclipselabs.simplegt.resource.simplegt.ISimplegtQuickFix> quickFixes;
	
	public SimplegtProblem(String message, org.eclipselabs.simplegt.resource.simplegt.SimplegtEProblemType type, org.eclipselabs.simplegt.resource.simplegt.SimplegtEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<org.eclipselabs.simplegt.resource.simplegt.ISimplegtQuickFix>emptySet());
	}
	
	public SimplegtProblem(String message, org.eclipselabs.simplegt.resource.simplegt.SimplegtEProblemType type, org.eclipselabs.simplegt.resource.simplegt.SimplegtEProblemSeverity severity, org.eclipselabs.simplegt.resource.simplegt.ISimplegtQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public SimplegtProblem(String message, org.eclipselabs.simplegt.resource.simplegt.SimplegtEProblemType type, org.eclipselabs.simplegt.resource.simplegt.SimplegtEProblemSeverity severity, java.util.Collection<org.eclipselabs.simplegt.resource.simplegt.ISimplegtQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<org.eclipselabs.simplegt.resource.simplegt.ISimplegtQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public org.eclipselabs.simplegt.resource.simplegt.SimplegtEProblemType getType() {
		return type;
	}
	
	public org.eclipselabs.simplegt.resource.simplegt.SimplegtEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<org.eclipselabs.simplegt.resource.simplegt.ISimplegtQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
