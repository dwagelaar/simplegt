/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.mopp;

/**
 * A representation for a range in a document where a boolean attribute is
 * expected.
 */
public class SimplegtExpectedBooleanTerminal extends be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtAbstractExpectedElement {
	
	private be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtBooleanTerminal booleanTerminal;
	
	public SimplegtExpectedBooleanTerminal(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtBooleanTerminal booleanTerminal) {
		super(booleanTerminal.getMetaclass());
		this.booleanTerminal = booleanTerminal;
	}
	
	public be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtBooleanTerminal getBooleanTerminal() {
		return booleanTerminal;
	}
	
	/**
	 * Returns the expected boolean terminal.
	 */
	public be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtSyntaxElement getSymtaxElement() {
		return booleanTerminal;
	}
	
	private org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return booleanTerminal.getFeature();
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof SimplegtExpectedBooleanTerminal) {
			return getFeature().equals(((SimplegtExpectedBooleanTerminal) o).getFeature());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getFeature().hashCode();
	}
	
	public java.util.Set<String> getTokenNames() {
		// BooleanTerminals are associated with two or one token(s)
		java.util.Set<String> tokenNames = new java.util.LinkedHashSet<String>(2);
		String trueLiteral = booleanTerminal.getTrueLiteral();
		if (!"".equals(trueLiteral)) {
			tokenNames.add("'" + trueLiteral + "'");
		}
		String falseLiteral = booleanTerminal.getFalseLiteral();
		if (!"".equals(falseLiteral)) {
			tokenNames.add("'" + falseLiteral + "'");
		}
		return tokenNames;
	}
	
}
