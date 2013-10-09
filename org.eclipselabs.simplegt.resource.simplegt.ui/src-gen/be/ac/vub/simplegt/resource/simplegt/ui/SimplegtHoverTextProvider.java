/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.ui;

public class SimplegtHoverTextProvider implements org.eclipselabs.simplegt.resource.simplegt.ISimplegtHoverTextProvider {
	
	private be.ac.vub.simplegt.resource.simplegt.ui.SimplegtDefaultHoverTextProvider defaultProvider = new be.ac.vub.simplegt.resource.simplegt.ui.SimplegtDefaultHoverTextProvider();
	
	public String getHoverText(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EObject referencedObject) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(referencedObject);
	}
	
	public String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
