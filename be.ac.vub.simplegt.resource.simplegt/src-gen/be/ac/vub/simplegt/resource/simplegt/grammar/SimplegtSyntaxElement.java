/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class SimplegtSyntaxElement {
	
	private SimplegtSyntaxElement[] children;
	private SimplegtSyntaxElement parent;
	private be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtCardinality cardinality;
	
	public SimplegtSyntaxElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtCardinality cardinality, SimplegtSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (SimplegtSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	/**
	 * Sets the parent of this syntax element. This method must be invoked at most
	 * once.
	 */
	public void setParent(SimplegtSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	/**
	 * Returns the parent of this syntax element. This parent is determined by the
	 * containment hierarchy in the CS model.
	 */
	public SimplegtSyntaxElement getParent() {
		return parent;
	}
	
	public SimplegtSyntaxElement[] getChildren() {
		if (children == null) {
			return new SimplegtSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtCardinality getCardinality() {
		return cardinality;
	}
	
}
