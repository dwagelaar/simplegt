/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.debug;

public interface ISimplegtDebugEventListener {
	
	/**
	 * Notification that the given event occurred in the while debugging.
	 */
	public void handleMessage(be.ac.vub.simplegt.resource.simplegt.debug.SimplegtDebugMessage message);
}
