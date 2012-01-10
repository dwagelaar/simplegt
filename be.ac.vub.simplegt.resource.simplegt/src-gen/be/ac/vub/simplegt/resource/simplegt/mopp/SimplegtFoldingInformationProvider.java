/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.mopp;

public class SimplegtFoldingInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.eclipse.emf.ecore.EClass[] {
			be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getRule(),
			be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getInPattern(),
			be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getNacPattern(),
			be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getOutPattern(),
			be.ac.vub.simpleocl.SimpleoclPackage.eINSTANCE.getOclFeatureDefinition(),
		};
	}
	
}
