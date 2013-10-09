/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.ui;

public class SimplegtUIMetaInformation extends org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtMetaInformation {
	
	public org.eclipselabs.simplegt.resource.simplegt.ISimplegtHoverTextProvider getHoverTextProvider() {
		return new org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtHoverTextProvider();
	}
	
	public org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtImageProvider getImageProvider() {
		return org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtImageProvider.INSTANCE;
	}
	
	public org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtColorManager createColorManager() {
		return new org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextResou
	 * rce, org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtColorManager)
	 * instead.
	 */
	public org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtTokenScanner createTokenScanner(org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtTokenScanner createTokenScanner(org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextResource resource, org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtColorManager colorManager) {
		return new org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtTokenScanner(resource, colorManager);
	}
	
	public org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtCodeCompletionHelper createCodeCompletionHelper() {
		return new org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtCodeCompletionHelper();
	}
	
}
