/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface ISimplegtCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
