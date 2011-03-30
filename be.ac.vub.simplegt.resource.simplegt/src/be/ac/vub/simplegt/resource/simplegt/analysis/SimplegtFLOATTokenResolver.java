/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.analysis;

public class SimplegtFLOATTokenResolver implements be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver {
	
	private be.ac.vub.simplegt.resource.simplegt.analysis.SimplegtDefaultTokenResolver defaultTokenResolver = new be.ac.vub.simplegt.resource.simplegt.analysis.SimplegtDefaultTokenResolver();
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		String result = defaultTokenResolver.deResolve(value, feature, container);
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result) {
		defaultTokenResolver.resolve(lexem, feature, result);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
