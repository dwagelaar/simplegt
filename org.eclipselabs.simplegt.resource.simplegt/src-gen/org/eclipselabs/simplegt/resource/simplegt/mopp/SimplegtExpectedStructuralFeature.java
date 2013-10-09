/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class SimplegtExpectedStructuralFeature extends org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtAbstractExpectedElement {
	
	private org.eclipselabs.simplegt.resource.simplegt.grammar.SimplegtPlaceholder placeholder;
	
	public SimplegtExpectedStructuralFeature(org.eclipselabs.simplegt.resource.simplegt.grammar.SimplegtPlaceholder placeholder) {
		super(placeholder.getMetaclass());
		this.placeholder = placeholder;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return placeholder.getFeature();
	}
	
	/**
	 * Returns the expected placeholder.
	 */
	public org.eclipselabs.simplegt.resource.simplegt.grammar.SimplegtSyntaxElement getSymtaxElement() {
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
