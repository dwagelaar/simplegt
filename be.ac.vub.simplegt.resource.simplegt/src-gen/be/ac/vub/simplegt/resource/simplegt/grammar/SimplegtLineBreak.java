/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.grammar;

public class SimplegtLineBreak extends be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFormattingElement {
	
	private final int tabs;
	
	public SimplegtLineBreak(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
