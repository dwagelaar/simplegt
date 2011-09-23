/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.mopp;

public class SimplegtResourcePostProcessor implements be.ac.vub.simplegt.resource.simplegt.ISimplegtResourcePostProcessor {
	
	public void process(be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtResource resource) {
		// Set the overrideResourcePostProcessor option to false to customize resource
		// post processing.
	}
	
	public void terminate() {
		// To signal termination to the process() method, setting a boolean field is
		// recommended. Depending on the value of this field process() can stop its
		// computation. However, this is only required for computation intensive
		// post-processors.
	}
	
}
