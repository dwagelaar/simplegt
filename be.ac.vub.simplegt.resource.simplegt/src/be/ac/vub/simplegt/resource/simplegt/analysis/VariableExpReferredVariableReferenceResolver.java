/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.analysis;

public class VariableExpReferredVariableReferenceResolver implements be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceResolver<be.ac.vub.simpleocl.VariableExp, be.ac.vub.simpleocl.VariableDeclaration> {
	
	private be.ac.vub.simpleocl.resource.simpleocl.analysis.VariableExpReferredVariableReferenceResolver delegate = new be.ac.vub.simpleocl.resource.simpleocl.analysis.VariableExpReferredVariableReferenceResolver();
	
	public void resolve(String identifier, be.ac.vub.simpleocl.VariableExp container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceResolveResult<be.ac.vub.simpleocl.VariableDeclaration> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, new be.ac.vub.simpleocl.resource.simpleocl.ISimpleoclReferenceResolveResult<be.ac.vub.simpleocl.VariableDeclaration>() {
			
			public boolean wasResolvedUniquely() {
				return result.wasResolvedUniquely();
			}
			
			public boolean wasResolvedMultiple() {
				return result.wasResolvedMultiple();
			}
			
			public boolean wasResolved() {
				return result.wasResolved();
			}
			
			public void setErrorMessage(String message) {
				result.setErrorMessage(message);
			}
			
			public java.util.Collection<be.ac.vub.simpleocl.resource.simpleocl.ISimpleoclReferenceMapping<be.ac.vub.simpleocl.VariableDeclaration>> getMappings() {
				throw new UnsupportedOperationException();
			}
			
			public String getErrorMessage() {
				return result.getErrorMessage();
			}
			
			public void addMapping(String identifier, org.eclipse.emf.common.util.URI newIdentifier) {
				result.addMapping(identifier, newIdentifier);
			}
			
			public void addMapping(String identifier, org.eclipse.emf.common.util.URI newIdentifier, String warning) {
				result.addMapping(identifier, newIdentifier, warning);
			}
			
			public void addMapping(String identifier, be.ac.vub.simpleocl.VariableDeclaration target) {
				result.addMapping(identifier, target);
			}
			
			public void addMapping(String identifier, be.ac.vub.simpleocl.VariableDeclaration target, String warning) {
				result.addMapping(identifier, target, warning);
			}
			
			public java.util.Collection<be.ac.vub.simpleocl.resource.simpleocl.ISimpleoclQuickFix> getQuickFixes() {
				return java.util.Collections.emptySet();
			}
			
			public void addQuickFix(final be.ac.vub.simpleocl.resource.simpleocl.ISimpleoclQuickFix quickFix) {
				result.addQuickFix(new be.ac.vub.simplegt.resource.simplegt.ISimplegtQuickFix() {
					
					public String getImageKey() {
						return quickFix.getImageKey();
					}
					
					public String getDisplayString() {
						return quickFix.getDisplayString();
					}
					
					public java.util.Collection<org.eclipse.emf.ecore.EObject> getContextObjects() {
						return quickFix.getContextObjects();
					}
					
					public String getContextAsString() {
						return quickFix.getContextAsString();
					}
					
					public String apply(String currentText) {
						return quickFix.apply(currentText);
					}
				});
			}
		});
		
	}
	
	public String deResolve(be.ac.vub.simpleocl.VariableDeclaration element, be.ac.vub.simpleocl.VariableExp container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
