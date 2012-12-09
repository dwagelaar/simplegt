/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class SimplegtExpectedStructuralFeature extends be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtAbstractExpectedElement {
	
	private be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtPlaceholder placeholder;
	
	public SimplegtExpectedStructuralFeature(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtPlaceholder placeholder) {
		super(placeholder.getMetaclass());
		this.placeholder = placeholder;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return placeholder.getFeature();
	}
	
	/**
	 * Returns the expected placeholder.
	 */
	public be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtSyntaxElement getSymtaxElement() {
		return placeholder;
	}
	
	public String getTokenName() {
		return placeholder.getTokenName();
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton(getTokenName());
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof SimplegtExpectedStructuralFeature) {
			return getFeature().equals(((SimplegtExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
	@Override	
	public int hashCode() {
		return getFeature().hashCode();
	}
	
}
