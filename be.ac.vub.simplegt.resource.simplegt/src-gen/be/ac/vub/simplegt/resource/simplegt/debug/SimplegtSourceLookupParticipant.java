/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.debug;

public class SimplegtSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof be.ac.vub.simplegt.resource.simplegt.debug.SimplegtStackFrame) {
			be.ac.vub.simplegt.resource.simplegt.debug.SimplegtStackFrame frame = (be.ac.vub.simplegt.resource.simplegt.debug.SimplegtStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
