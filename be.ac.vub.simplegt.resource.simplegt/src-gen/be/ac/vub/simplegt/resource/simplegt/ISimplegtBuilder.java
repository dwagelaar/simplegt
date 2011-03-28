/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt;

public interface ISimplegtBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri);
	
	public org.eclipse.core.runtime.IStatus build(be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtResource resource, org.eclipse.core.runtime.IProgressMonitor monitor);
}
