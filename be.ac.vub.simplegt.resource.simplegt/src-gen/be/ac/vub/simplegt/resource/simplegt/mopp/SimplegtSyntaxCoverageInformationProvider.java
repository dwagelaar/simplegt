/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.mopp;

public class SimplegtSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getModule(),
			be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getInstanceModel(),
			be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getMetamodel(),
			be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getRule(),
			be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getInPattern(),
			be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getType(),
			be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getInputElement(),
			be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getInputBinding(),
			be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getNacPattern(),
			be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getOutPattern(),
			be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getOutputElement(),
			be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getOutputBinding(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			be.ac.vub.simplegt.SimplegtPackage.eINSTANCE.getModule(),
		};
	}
	
}
