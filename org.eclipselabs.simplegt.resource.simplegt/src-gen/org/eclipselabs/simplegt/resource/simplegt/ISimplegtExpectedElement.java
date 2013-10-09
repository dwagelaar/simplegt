/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface ISimplegtExpectedElement {
	
	/**
	 * Returns the names of all tokens that are expected at the given position.
	 */
	public java.util.Set<String> getTokenNames();
	
	/**
	 * Returns the metaclass of the rule that contains the expected element.
	 */
	public org.eclipse.emf.ecore.EClass getRuleMetaclass();
	
	/**
	 * Returns the syntax element that is expected.
	 */
	public org.eclipselabs.simplegt.resource.simplegt.grammar.SimplegtSyntaxElement getSymtaxElement();
	
	/**
	 * Adds an element that is a valid follower for this element.
	 */
	public void addFollower(org.eclipselabs.simplegt.resource.simplegt.ISimplegtExpectedElement follower, org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtContainedFeature[] path);
	
	/**
	 * Returns all valid followers for this element. Each follower is represented by a
	 * pair of an expected elements and the containment trace that leads from the
	 * current element to the follower.
	 */
	public java.util.Collection<org.eclipselabs.simplegt.resource.simplegt.util.SimplegtPair<org.eclipselabs.simplegt.resource.simplegt.ISimplegtExpectedElement, org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtContainedFeature[]>> getFollowers();
	
}
