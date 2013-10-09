/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.mopp;

public abstract class SimplegtQuickFix implements org.eclipselabs.simplegt.resource.simplegt.ISimplegtQuickFix {
	
	private String displayString;
	private String imageKey;
	private org.eclipse.emf.ecore.resource.Resource resource;
	private java.util.Collection<org.eclipse.emf.ecore.EObject> contextObjects;
	
	public SimplegtQuickFix(String displayString, String imageKey, org.eclipse.emf.ecore.EObject contextObject) {
		this(displayString, imageKey, java.util.Collections.singleton(contextObject), contextObject.eResource());
	}
	
	public SimplegtQuickFix(String displayString, String imageKey, java.util.Collection<org.eclipse.emf.ecore.EObject> contextObjects) {
		this(displayString, imageKey, contextObjects, contextObjects.iterator().next().eResource());
	}
	
	public SimplegtQuickFix(String displayString, String imageKey, java.util.Collection<org.eclipse.emf.ecore.EObject> contextObjects, org.eclipse.emf.ecore.resource.Resource resource) {
		super();
		if (displayString == null) {
			throw new IllegalArgumentException("displayString must not be null.");
		}
		if (contextObjects == null) {
			throw new IllegalArgumentException("contextObjects must not be null.");
		}
		if (contextObjects.isEmpty()) {
			throw new IllegalArgumentException("contextObjects must not be empty.");
		}
		this.displayString = displayString;
		this.imageKey = imageKey;
		this.contextObjects = contextObjects;
		this.resource = resource;
	}
	
	public String apply(String currentText) {
		applyChanges();
		try {
			java.io.ByteArrayOutputStream output = new java.io.ByteArrayOutputStream();
			getResource().save(output, null);
			return output.toString();
		} catch (java.io.IOException e) {
			new org.eclipselabs.simplegt.resource.simplegt.util.SimplegtRuntimeUtil().logError("Exception while applying quick fix", e);
		}
		return null;
	}
	
	public abstract void applyChanges();
	
	public org.eclipse.emf.ecore.resource.Resource getResource() {
		return resource;
	}
	
	public String getDisplayString() {
		return displayString;
	}
	
	public String getImageKey() {
		return imageKey;
	}
	
	public java.util.Collection<org.eclipse.emf.ecore.EObject> getContextObjects() {
		return contextObjects;
	}
	
	public String getContextAsString() {
		StringBuilder result = new StringBuilder();
		result.append(getType());
		result.append(",");
		for (org.eclipse.emf.ecore.EObject contextObject : contextObjects) {
			result.append(org.eclipse.emf.ecore.util.EcoreUtil.getURI(contextObject));
			result.append(",");
		}
		return result.toString();
	}
	
	private String getType() {
		return this.getClass().getName();
	}
	
}
