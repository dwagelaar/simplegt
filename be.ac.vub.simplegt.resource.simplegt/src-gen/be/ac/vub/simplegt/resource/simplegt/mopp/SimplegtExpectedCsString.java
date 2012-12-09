/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class SimplegtExpectedCsString extends be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtAbstractExpectedElement {
	
	private be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtKeyword keyword;
	
	public SimplegtExpectedCsString(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	/**
	 * Returns the expected keyword.
	 */
	public be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtSyntaxElement getSymtaxElement() {
		return keyword;
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof SimplegtExpectedCsString) {
			return getValue().equals(((SimplegtExpectedCsString) o).getValue());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getValue().hashCode();
	}
	
}
