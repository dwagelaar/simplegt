/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.grammar;

public class SimplegtCompound extends be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtSyntaxElement {
	
	public SimplegtCompound(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtChoice choice, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtCardinality cardinality) {
		super(cardinality, new be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
