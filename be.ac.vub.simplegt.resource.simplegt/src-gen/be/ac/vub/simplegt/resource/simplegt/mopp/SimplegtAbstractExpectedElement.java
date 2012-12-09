/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class SimplegtAbstractExpectedElement implements be.ac.vub.simplegt.resource.simplegt.ISimplegtExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	
	private java.util.Set<be.ac.vub.simplegt.resource.simplegt.util.SimplegtPair<be.ac.vub.simplegt.resource.simplegt.ISimplegtExpectedElement, be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtContainedFeature[]>> followers = new java.util.LinkedHashSet<be.ac.vub.simplegt.resource.simplegt.util.SimplegtPair<be.ac.vub.simplegt.resource.simplegt.ISimplegtExpectedElement, be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtContainedFeature[]>>();
	
	public SimplegtAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(be.ac.vub.simplegt.resource.simplegt.ISimplegtExpectedElement follower, be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtContainedFeature[] path) {
		followers.add(new be.ac.vub.simplegt.resource.simplegt.util.SimplegtPair<be.ac.vub.simplegt.resource.simplegt.ISimplegtExpectedElement, be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtContainedFeature[]>(follower, path));
	}
	
	public java.util.Collection<be.ac.vub.simplegt.resource.simplegt.util.SimplegtPair<be.ac.vub.simplegt.resource.simplegt.ISimplegtExpectedElement, be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
