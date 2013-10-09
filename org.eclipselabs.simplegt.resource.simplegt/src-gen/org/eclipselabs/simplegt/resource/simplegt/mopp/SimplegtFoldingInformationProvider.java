/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.mopp;

public class SimplegtFoldingInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.eclipselabs.simplegt.SimplegtPackage.eINSTANCE.getRule(),
			org.eclipselabs.simplegt.SimplegtPackage.eINSTANCE.getInPattern(),
			org.eclipselabs.simplegt.SimplegtPackage.eINSTANCE.getNacPattern(),
			org.eclipselabs.simplegt.SimplegtPackage.eINSTANCE.getOutPattern(),
			org.eclipselabs.simpleocl.SimpleoclPackage.eINSTANCE.getOclFeatureDefinition(),
		};
	}
	
}
