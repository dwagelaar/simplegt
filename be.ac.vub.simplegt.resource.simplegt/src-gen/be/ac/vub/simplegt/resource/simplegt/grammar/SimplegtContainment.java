/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.grammar;

public class SimplegtContainment extends be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtTerminal {
	
	private final org.eclipse.emf.ecore.EClass[] allowedTypes;
	
	public SimplegtContainment(org.eclipse.emf.ecore.EStructuralFeature feature, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtCardinality cardinality, org.eclipse.emf.ecore.EClass[] allowedTypes, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.allowedTypes = allowedTypes;
	}
	
	public org.eclipse.emf.ecore.EClass[] getAllowedTypes() {
		return allowedTypes;
	}
	
	public String toString() {
		String typeRestrictions = null;
		if (allowedTypes != null && allowedTypes.length > 0) {
			typeRestrictions = be.ac.vub.simplegt.resource.simplegt.util.SimplegtStringUtil.explode(allowedTypes, ", ", new be.ac.vub.simplegt.resource.simplegt.ISimplegtFunction1<String, org.eclipse.emf.ecore.EClass>() {
				public String execute(org.eclipse.emf.ecore.EClass eClass) {
					return eClass.getName();
				}
			});
		}
		return getFeature().getName() + (typeRestrictions == null ? "" : "[" + typeRestrictions + "]");
	}
	
}
