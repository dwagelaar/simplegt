/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.ui;

public class SimplegtUIMetaInformation extends org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtMetaInformation {
	
	public org.eclipselabs.simplegt.resource.simplegt.ISimplegtHoverTextProvider getHoverTextProvider() {
		return new be.ac.vub.simplegt.resource.simplegt.ui.SimplegtHoverTextProvider();
	}
	
	public be.ac.vub.simplegt.resource.simplegt.ui.SimplegtImageProvider getImageProvider() {
		return be.ac.vub.simplegt.resource.simplegt.ui.SimplegtImageProvider.INSTANCE;
	}
	
	public be.ac.vub.simplegt.resource.simplegt.ui.SimplegtColorManager createColorManager() {
		return new be.ac.vub.simplegt.resource.simplegt.ui.SimplegtColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextResource,
	 * org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtColorManager) instead.
	 */
	public be.ac.vub.simplegt.resource.simplegt.ui.SimplegtTokenScanner createTokenScanner(be.ac.vub.simplegt.resource.simplegt.ui.SimplegtColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public be.ac.vub.simplegt.resource.simplegt.ui.SimplegtTokenScanner createTokenScanner(org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextResource resource, be.ac.vub.simplegt.resource.simplegt.ui.SimplegtColorManager colorManager) {
		return new be.ac.vub.simplegt.resource.simplegt.ui.SimplegtTokenScanner(resource, colorManager);
	}
	
	public be.ac.vub.simplegt.resource.simplegt.ui.SimplegtCodeCompletionHelper createCodeCompletionHelper() {
		return new be.ac.vub.simplegt.resource.simplegt.ui.SimplegtCodeCompletionHelper();
	}
	
}
