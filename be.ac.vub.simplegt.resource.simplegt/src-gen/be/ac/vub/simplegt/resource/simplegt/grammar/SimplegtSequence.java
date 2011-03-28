/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.grammar;

public class SimplegtSequence extends be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtSyntaxElement {
	
	public SimplegtSequence(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtCardinality cardinality, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return be.ac.vub.simplegt.resource.simplegt.util.SimplegtStringUtil.explode(getChildren(), " ");
	}
	
}
