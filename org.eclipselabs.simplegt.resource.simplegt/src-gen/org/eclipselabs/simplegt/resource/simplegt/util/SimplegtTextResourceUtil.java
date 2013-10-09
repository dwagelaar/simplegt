/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.util;

/**
 * Class SimplegtTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * org.eclipselabs.simplegt.resource.simplegt.util.SimplegtResourceUtil.
 */
public class SimplegtTextResourceUtil {
	
	/**
	 * Use
	 * org.eclipselabs.simplegt.resource.simplegt.util.SimplegtResourceUtil.getResource
	 * () instead.
	 */
	@Deprecated	
	public static org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtResource getResource(org.eclipse.core.resources.IFile file) {
		return new org.eclipselabs.simplegt.resource.simplegt.util.SimplegtEclipseProxy().getResource(file);
	}
	
	/**
	 * Use
	 * org.eclipselabs.simplegt.resource.simplegt.util.SimplegtResourceUtil.getResource
	 * () instead.
	 */
	@Deprecated	
	public static org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return org.eclipselabs.simplegt.resource.simplegt.util.SimplegtResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use
	 * org.eclipselabs.simplegt.resource.simplegt.util.SimplegtResourceUtil.getResource
	 * () instead.
	 */
	@Deprecated	
	public static org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtResource getResource(org.eclipse.emf.common.util.URI uri) {
		return org.eclipselabs.simplegt.resource.simplegt.util.SimplegtResourceUtil.getResource(uri);
	}
	
	/**
	 * Use
	 * org.eclipselabs.simplegt.resource.simplegt.util.SimplegtResourceUtil.getResource
	 * () instead.
	 */
	@Deprecated	
	public static org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return org.eclipselabs.simplegt.resource.simplegt.util.SimplegtResourceUtil.getResource(uri, options);
	}
	
}
