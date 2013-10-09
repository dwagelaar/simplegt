/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.analysis;

public class OclModelElementModelReferenceResolver implements org.eclipselabs.simplegt.resource.simplegt.ISimplegtReferenceResolver<org.eclipselabs.simpleocl.OclModelElement, org.eclipselabs.simpleocl.OclModel> {
	
	private org.eclipselabs.simpleocl.resource.simpleocl.analysis.OclModelElementModelReferenceResolver delegate = new org.eclipselabs.simpleocl.resource.simpleocl.analysis.OclModelElementModelReferenceResolver();
	
	public void resolve(String identifier, org.eclipselabs.simpleocl.OclModelElement container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.eclipselabs.simplegt.resource.simplegt.ISimplegtReferenceResolveResult<org.eclipselabs.simpleocl.OclModel> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, new org.eclipselabs.simpleocl.resource.simpleocl.ISimpleoclReferenceResolveResult<org.eclipselabs.simpleocl.OclModel>() {
			
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
			
			public java.util.Collection<org.eclipselabs.simpleocl.resource.simpleocl.ISimpleoclReferenceMapping<org.eclipselabs.simpleocl.OclModel>> getMappings() {
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
			
			public void addMapping(String identifier, org.eclipselabs.simpleocl.OclModel target) {
				result.addMapping(identifier, target);
			}
			
			public void addMapping(String identifier, org.eclipselabs.simpleocl.OclModel target, String warning) {
				result.addMapping(identifier, target, warning);
			}
			
			public java.util.Collection<org.eclipselabs.simpleocl.resource.simpleocl.ISimpleoclQuickFix> getQuickFixes() {
				return java.util.Collections.emptySet();
			}
			
			public void addQuickFix(final org.eclipselabs.simpleocl.resource.simpleocl.ISimpleoclQuickFix quickFix) {
				result.addQuickFix(new org.eclipselabs.simplegt.resource.simplegt.ISimplegtQuickFix() {
					
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
	
	public String deResolve(org.eclipselabs.simpleocl.OclModel element, org.eclipselabs.simpleocl.OclModelElement container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
