/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.grammar;

public class SimplegtWhiteSpace extends org.eclipselabs.simplegt.resource.simplegt.grammar.SimplegtFormattingElement {
	
	private final int amount;
	
	public SimplegtWhiteSpace(int amount, org.eclipselabs.simplegt.resource.simplegt.grammar.SimplegtCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}
