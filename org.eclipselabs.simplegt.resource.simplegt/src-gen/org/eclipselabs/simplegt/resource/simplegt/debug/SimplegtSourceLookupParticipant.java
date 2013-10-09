/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.debug;

public class SimplegtSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof org.eclipselabs.simplegt.resource.simplegt.debug.SimplegtStackFrame) {
			org.eclipselabs.simplegt.resource.simplegt.debug.SimplegtStackFrame frame = (org.eclipselabs.simplegt.resource.simplegt.debug.SimplegtStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
