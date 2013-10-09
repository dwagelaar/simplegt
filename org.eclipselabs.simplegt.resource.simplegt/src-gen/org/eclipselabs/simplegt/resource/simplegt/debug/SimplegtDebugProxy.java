/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.debug;

/**
 * The DebugProxy allows to communicate between the interpreter, which runs in a
 * separate thread or process and the Eclipse Debug framework (i.e., the
 * DebugTarget class).
 */
public class SimplegtDebugProxy {
	
	public static final int STARTUP_DELAY = 1000;
	
	private java.io.PrintStream output;
	
	private java.io.BufferedReader reader;
	
	private org.eclipselabs.simplegt.resource.simplegt.debug.SimplegtDebugTarget debugTarget;
	
	private org.eclipselabs.simplegt.resource.simplegt.debug.SimplegtDebugCommunicationHelper communicationHelper = new org.eclipselabs.simplegt.resource.simplegt.debug.SimplegtDebugCommunicationHelper();
	
	public SimplegtDebugProxy(org.eclipselabs.simplegt.resource.simplegt.debug.SimplegtDebugTarget debugTarget, int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		this.debugTarget = debugTarget;
		// give interpreter a chance to start
		try {
			Thread.sleep(STARTUP_DELAY);
		} catch (InterruptedException e) {
		}
		startSocket(requestPort);
	}
	
	private void startSocket(int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		// creating client proxy socket (trying to connect)...
		java.net.Socket client = new java.net.Socket("localhost", requestPort);
		// creating client proxy socket - done. (connected)
		try {
			java.io.BufferedInputStream input = new java.io.BufferedInputStream(client.getInputStream());
			reader = new java.io.BufferedReader(new java.io.InputStreamReader(input));
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
		try {
			output = new java.io.PrintStream(client.getOutputStream());
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
	}
	
	public void resume() {
		sendCommand(org.eclipselabs.simplegt.resource.simplegt.debug.ESimplegtDebugMessageTypes.RESUME);
	}
	
	public void stepOver() {
		sendCommand(org.eclipselabs.simplegt.resource.simplegt.debug.ESimplegtDebugMessageTypes.STEP_OVER);
	}
	
	public void stepInto() {
		sendCommand(org.eclipselabs.simplegt.resource.simplegt.debug.ESimplegtDebugMessageTypes.STEP_INTO);
	}
	
	public void stepReturn() {
		sendCommand(org.eclipselabs.simplegt.resource.simplegt.debug.ESimplegtDebugMessageTypes.STEP_RETURN);
	}
	
	public void terminate() {
		sendCommand(org.eclipselabs.simplegt.resource.simplegt.debug.ESimplegtDebugMessageTypes.EXIT);
	}
	
	public org.eclipselabs.simplegt.resource.simplegt.debug.SimplegtDebugMessage getStack() {
		return sendCommandAndRead(org.eclipselabs.simplegt.resource.simplegt.debug.ESimplegtDebugMessageTypes.GET_STACK);
	}
	
	public void addLineBreakpoint(String location, int line) {
		org.eclipselabs.simplegt.resource.simplegt.debug.SimplegtDebugMessage message = new org.eclipselabs.simplegt.resource.simplegt.debug.SimplegtDebugMessage(org.eclipselabs.simplegt.resource.simplegt.debug.ESimplegtDebugMessageTypes.ADD_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public void removeLineBreakpoint(String location, int line) {
		org.eclipselabs.simplegt.resource.simplegt.debug.SimplegtDebugMessage message = new org.eclipselabs.simplegt.resource.simplegt.debug.SimplegtDebugMessage(org.eclipselabs.simplegt.resource.simplegt.debug.ESimplegtDebugMessageTypes.REMOVE_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public org.eclipse.debug.core.model.IVariable[] getStackVariables(String stackFrame) {
		org.eclipselabs.simplegt.resource.simplegt.debug.SimplegtDebugMessage response = sendCommandAndRead(org.eclipselabs.simplegt.resource.simplegt.debug.ESimplegtDebugMessageTypes.GET_FRAME_VARIABLES, new String[] {stackFrame});
		String[] ids = response.getArguments();
		// fetch all variables
		org.eclipse.debug.core.model.IVariable[] variables = getVariables(ids);
		return variables;
	}
	
	public org.eclipse.debug.core.model.IVariable[] getVariables(String... requestedIDs) {
		org.eclipselabs.simplegt.resource.simplegt.debug.SimplegtDebugMessage response = sendCommandAndRead(org.eclipselabs.simplegt.resource.simplegt.debug.ESimplegtDebugMessageTypes.GET_VARIABLES, requestedIDs);
		String[] varStrings = response.getArguments();
		org.eclipselabs.simplegt.resource.simplegt.debug.SimplegtDebugVariable[] variables  = new org.eclipselabs.simplegt.resource.simplegt.debug.SimplegtDebugVariable[varStrings.length];
		int i = 0;
		for (String varString : varStrings) {
			java.util.Map<String, String> properties = org.eclipselabs.simplegt.resource.simplegt.util.SimplegtStringUtil.convertFromString(varString);
			
			// convert varString to variables and values
			String valueString = properties.get("!valueString");
			String valueRefType = "valueRefType";
			java.util.Map<String, Long> childVariables = new java.util.TreeMap<String, Long>(new java.util.Comparator<String>() {
				public int compare(String s1, String s2) {
					return s1.compareToIgnoreCase(s2);
				}
			});
			for (String property : properties.keySet()) {
				// ignore special properties - they are not children
				if (property.startsWith("!")) {
					continue;
				}
				childVariables.put(property, Long.parseLong(properties.get(property)));
			}
			String id = properties.get("!id");
			org.eclipse.debug.core.model.IValue value = new org.eclipselabs.simplegt.resource.simplegt.debug.SimplegtDebugValue(debugTarget, id, valueString, valueRefType, childVariables);
			
			String variableName = properties.get("!name");
			String variableRefType = properties.get("!type");
			
			org.eclipselabs.simplegt.resource.simplegt.debug.SimplegtDebugVariable variable = new org.eclipselabs.simplegt.resource.simplegt.debug.SimplegtDebugVariable(debugTarget, variableName, value, variableRefType);
			variables[i++] = variable;
		}
		return variables;
	}
	
	private void sendCommand(org.eclipselabs.simplegt.resource.simplegt.debug.ESimplegtDebugMessageTypes command, String... parameters) {
		org.eclipselabs.simplegt.resource.simplegt.debug.SimplegtDebugMessage message = new org.eclipselabs.simplegt.resource.simplegt.debug.SimplegtDebugMessage(command, parameters);
		communicationHelper.sendEvent(message, output);
	}
	
	private org.eclipselabs.simplegt.resource.simplegt.debug.SimplegtDebugMessage sendCommandAndRead(org.eclipselabs.simplegt.resource.simplegt.debug.ESimplegtDebugMessageTypes command, String... parameters) {
		org.eclipselabs.simplegt.resource.simplegt.debug.SimplegtDebugMessage message = new org.eclipselabs.simplegt.resource.simplegt.debug.SimplegtDebugMessage(command, parameters);
		return communicationHelper.sendAndReceive(message, output, reader);
	}
	
}
