/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.analysis;

public class SimplegtQUOTED_39_39_92TokenResolver implements be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver {
	
	private be.ac.vub.simplegt.resource.simplegt.analysis.SimplegtDefaultTokenResolver defaultTokenResolver = new be.ac.vub.simplegt.resource.simplegt.analysis.SimplegtDefaultTokenResolver(true);
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		// By default token de-resolving is delegated to the DefaultTokenResolver.
		String result = defaultTokenResolver.deResolve(value, feature, container, "'", "'", "\\");
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result) {
		// By default token resolving is delegated to the DefaultTokenResolver.
		defaultTokenResolver.resolve(lexem, feature, result, "'", "'", "\\");
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
