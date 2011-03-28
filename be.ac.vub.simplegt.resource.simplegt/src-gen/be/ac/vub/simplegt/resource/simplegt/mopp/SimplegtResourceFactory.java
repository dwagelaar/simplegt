/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.mopp;

public class SimplegtResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public SimplegtResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtResource(uri);
	}
	
}
