/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.grammar;

public class SimplegtSequence extends org.eclipselabs.simplegt.resource.simplegt.grammar.SimplegtSyntaxElement {
	
	public SimplegtSequence(org.eclipselabs.simplegt.resource.simplegt.grammar.SimplegtCardinality cardinality, org.eclipselabs.simplegt.resource.simplegt.grammar.SimplegtSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return org.eclipselabs.simplegt.resource.simplegt.util.SimplegtStringUtil.explode(getChildren(), " ");
	}
	
}
