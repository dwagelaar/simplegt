/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.mopp;

/**
 * A basic implementation of the
 * org.eclipselabs.simplegt.resource.simplegt.ISimplegtElementMapping interface.
 * 
 * @param <ReferenceType> the type of the reference that can be mapped to
 */
public class SimplegtElementMapping<ReferenceType> implements org.eclipselabs.simplegt.resource.simplegt.ISimplegtElementMapping<ReferenceType> {
	
	private final ReferenceType target;
	private String identifier;
	private String warning;
	
	public SimplegtElementMapping(String identifier, ReferenceType target, String warning) {
		super();
		this.target = target;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public ReferenceType getTargetElement() {
		return target;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
