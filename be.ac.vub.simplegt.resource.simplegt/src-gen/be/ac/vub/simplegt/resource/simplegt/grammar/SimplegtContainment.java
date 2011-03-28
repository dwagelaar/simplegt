/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.grammar;

public class SimplegtContainment extends be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtTerminal {
	
	public SimplegtContainment(org.eclipse.emf.ecore.EStructuralFeature feature, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
	}
	
	public String toString() {
		return getFeature().getName();
	}
	
}
