/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.grammar;

public class SimplegtChoice extends be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtSyntaxElement {
	
	public SimplegtChoice(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtCardinality cardinality, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return be.ac.vub.simplegt.resource.simplegt.util.SimplegtStringUtil.explode(getChildren(), "|");
	}
	
}
