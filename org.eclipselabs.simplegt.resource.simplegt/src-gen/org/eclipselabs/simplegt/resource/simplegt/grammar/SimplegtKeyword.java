/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class SimplegtKeyword extends org.eclipselabs.simplegt.resource.simplegt.grammar.SimplegtSyntaxElement {
	
	private final String value;
	
	public SimplegtKeyword(String value, org.eclipselabs.simplegt.resource.simplegt.grammar.SimplegtCardinality cardinality) {
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
