/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class SimplegtRule extends org.eclipselabs.simplegt.resource.simplegt.grammar.SimplegtSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public SimplegtRule(org.eclipse.emf.ecore.EClass metaclass, org.eclipselabs.simplegt.resource.simplegt.grammar.SimplegtChoice choice, org.eclipselabs.simplegt.resource.simplegt.grammar.SimplegtCardinality cardinality) {
		super(cardinality, new org.eclipselabs.simplegt.resource.simplegt.grammar.SimplegtSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public org.eclipselabs.simplegt.resource.simplegt.grammar.SimplegtChoice getDefinition() {
		return (org.eclipselabs.simplegt.resource.simplegt.grammar.SimplegtChoice) getChildren()[0];
	}
	
}

