/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class SimplegtKeyword extends be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtSyntaxElement {
	
	private final String value;
	
	public SimplegtKeyword(String value, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
