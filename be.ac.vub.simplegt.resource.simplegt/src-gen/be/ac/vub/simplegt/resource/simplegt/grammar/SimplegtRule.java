/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class SimplegtRule extends be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public SimplegtRule(org.eclipse.emf.ecore.EClass metaclass, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtChoice choice, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtCardinality cardinality) {
		super(cardinality, new be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtChoice getDefinition() {
		return (be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtChoice) getChildren()[0];
	}
	
}

