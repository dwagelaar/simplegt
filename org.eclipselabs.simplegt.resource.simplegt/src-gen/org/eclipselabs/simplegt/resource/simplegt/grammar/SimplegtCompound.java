/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.grammar;

public class SimplegtCompound extends org.eclipselabs.simplegt.resource.simplegt.grammar.SimplegtSyntaxElement {
	
	public SimplegtCompound(org.eclipselabs.simplegt.resource.simplegt.grammar.SimplegtChoice choice, org.eclipselabs.simplegt.resource.simplegt.grammar.SimplegtCardinality cardinality) {
		super(cardinality, new org.eclipselabs.simplegt.resource.simplegt.grammar.SimplegtSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
