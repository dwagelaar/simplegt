/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.grammar;

public class SimplegtChoice extends org.eclipselabs.simplegt.resource.simplegt.grammar.SimplegtSyntaxElement {
	
	public SimplegtChoice(org.eclipselabs.simplegt.resource.simplegt.grammar.SimplegtCardinality cardinality, org.eclipselabs.simplegt.resource.simplegt.grammar.SimplegtSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return org.eclipselabs.simplegt.resource.simplegt.util.SimplegtStringUtil.explode(getChildren(), "|");
	}
	
}
