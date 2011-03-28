/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.mopp;

public class SimplegtSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private SimplegtSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private java.util.List<Integer> indicesToPrint = new java.util.ArrayList<Integer>();
	
	public SimplegtSyntaxElementDecorator(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtSyntaxElement decoratedElement, SimplegtSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(Integer index) {
		indicesToPrint.add(index);
	}
	
	public be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public SimplegtSyntaxElementDecorator[] getChildDecorators() {
		return childDecorators;
	}
	
	public Integer getNextIndexToPrint() {
		if (indicesToPrint.size() == 0) {
			return null;
		}
		return indicesToPrint.remove(0);
	}
	
	public String toString() {
		return "" + getDecoratedElement();
	}
	
}
