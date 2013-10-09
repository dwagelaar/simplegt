/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.debug;

public interface ISimplegtDebugEventListener {
	
	/**
	 * Notification that the given event occurred in the while debugging.
	 */
	public void handleMessage(org.eclipselabs.simplegt.resource.simplegt.debug.SimplegtDebugMessage message);
}
