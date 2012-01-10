/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.analysis;

public class SimpleoclBAGTYPETokenResolver implements be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver {
	
	// If this line does not compile, the imported language plug-ins were generated
	// before EMFText 1.4.0. To resolve the compilation error remove the argument from
	// the constructor call.
	private be.ac.vub.simpleocl.resource.simpleocl.analysis.SimpleoclBAGTYPETokenResolver importedResolver = new be.ac.vub.simpleocl.resource.simpleocl.analysis.SimpleoclBAGTYPETokenResolver();
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		String result = importedResolver.deResolve(value, feature, container);
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, final be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result) {
		importedResolver.resolve(lexem, feature, new be.ac.vub.simpleocl.resource.simpleocl.ISimpleoclTokenResolveResult() {
			public String getErrorMessage() {
				return result.getErrorMessage();
			}
			
			public Object getResolvedToken() {
				return result.getResolvedToken();
			}
			
			public void setErrorMessage(String message) {
				result.setErrorMessage(message);
			}
			
			public void setResolvedToken(Object resolvedToken) {
				result.setResolvedToken(resolvedToken);
			}
			
		});
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		importedResolver.setOptions(options);
	}
	
}
