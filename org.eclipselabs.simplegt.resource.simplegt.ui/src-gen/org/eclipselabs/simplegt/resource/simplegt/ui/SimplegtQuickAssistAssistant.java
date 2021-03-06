/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.ui;

public class SimplegtQuickAssistAssistant extends org.eclipse.jface.text.quickassist.QuickAssistAssistant implements org.eclipse.jface.text.quickassist.IQuickAssistAssistant {
	
	public SimplegtQuickAssistAssistant(org.eclipselabs.simplegt.resource.simplegt.ISimplegtResourceProvider resourceProvider, org.eclipselabs.simplegt.resource.simplegt.ui.ISimplegtAnnotationModelProvider annotationModelProvider) {
		setQuickAssistProcessor(new org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtQuickAssistProcessor(resourceProvider, annotationModelProvider));
		setInformationControlCreator(new org.eclipse.jface.text.AbstractReusableInformationControlCreator() {
			public org.eclipse.jface.text.IInformationControl doCreateInformationControl(org.eclipse.swt.widgets.Shell parent) {
				return new org.eclipse.jface.text.DefaultInformationControl(parent, (org.eclipse.jface.text.DefaultInformationControl.IInformationPresenter) null);
			}
		});
	}
	
	public boolean canAssist(org.eclipse.jface.text.quickassist.IQuickAssistInvocationContext invocationContext) {
		return false;
	}
	
	public boolean canFix(org.eclipse.jface.text.source.Annotation annotation) {
		return true;
	}
	
}
