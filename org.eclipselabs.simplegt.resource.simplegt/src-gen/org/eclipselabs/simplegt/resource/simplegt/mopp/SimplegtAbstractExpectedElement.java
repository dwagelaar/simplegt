/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class SimplegtAbstractExpectedElement implements org.eclipselabs.simplegt.resource.simplegt.ISimplegtExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	
	private java.util.Set<org.eclipselabs.simplegt.resource.simplegt.util.SimplegtPair<org.eclipselabs.simplegt.resource.simplegt.ISimplegtExpectedElement, org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtContainedFeature[]>> followers = new java.util.LinkedHashSet<org.eclipselabs.simplegt.resource.simplegt.util.SimplegtPair<org.eclipselabs.simplegt.resource.simplegt.ISimplegtExpectedElement, org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtContainedFeature[]>>();
	
	public SimplegtAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(org.eclipselabs.simplegt.resource.simplegt.ISimplegtExpectedElement follower, org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtContainedFeature[] path) {
		followers.add(new org.eclipselabs.simplegt.resource.simplegt.util.SimplegtPair<org.eclipselabs.simplegt.resource.simplegt.ISimplegtExpectedElement, org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtContainedFeature[]>(follower, path));
	}
	
	public java.util.Collection<org.eclipselabs.simplegt.resource.simplegt.util.SimplegtPair<org.eclipselabs.simplegt.resource.simplegt.ISimplegtExpectedElement, org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
