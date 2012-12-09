/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.util;

/**
 * Class SimplegtTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * be.ac.vub.simplegt.resource.simplegt.util.SimplegtResourceUtil.
 */
public class SimplegtTextResourceUtil {
	
	/**
	 * Use
	 * be.ac.vub.simplegt.resource.simplegt.util.SimplegtResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated	
	public static be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtResource getResource(org.eclipse.core.resources.IFile file) {
		return new be.ac.vub.simplegt.resource.simplegt.util.SimplegtEclipseProxy().getResource(file);
	}
	
	/**
	 * Use
	 * be.ac.vub.simplegt.resource.simplegt.util.SimplegtResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated	
	public static be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return be.ac.vub.simplegt.resource.simplegt.util.SimplegtResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use
	 * be.ac.vub.simplegt.resource.simplegt.util.SimplegtResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated	
	public static be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtResource getResource(org.eclipse.emf.common.util.URI uri) {
		return be.ac.vub.simplegt.resource.simplegt.util.SimplegtResourceUtil.getResource(uri);
	}
	
	/**
	 * Use
	 * be.ac.vub.simplegt.resource.simplegt.util.SimplegtResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated	
	public static be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return be.ac.vub.simplegt.resource.simplegt.util.SimplegtResourceUtil.getResource(uri, options);
	}
	
}
