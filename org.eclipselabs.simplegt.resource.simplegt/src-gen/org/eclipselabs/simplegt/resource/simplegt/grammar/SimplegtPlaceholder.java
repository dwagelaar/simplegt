/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class SimplegtPlaceholder extends org.eclipselabs.simplegt.resource.simplegt.grammar.SimplegtTerminal {
	
	private final String tokenName;
	
	public SimplegtPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, org.eclipselabs.simplegt.resource.simplegt.grammar.SimplegtCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
