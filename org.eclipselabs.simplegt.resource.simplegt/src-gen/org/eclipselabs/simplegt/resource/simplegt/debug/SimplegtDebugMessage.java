/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.debug;

/**
 * DebugMessages are exchanged between the debug server (the Eclipse debug
 * framework) and the debug client (a running process or interpreter). To exchange
 * messages they are serialized and sent over sockets.
 */
public class SimplegtDebugMessage {
	
	private static final char DELIMITER = ':';
	private org.eclipselabs.simplegt.resource.simplegt.debug.ESimplegtDebugMessageTypes messageType;
	private String[] arguments;
	
	public SimplegtDebugMessage(org.eclipselabs.simplegt.resource.simplegt.debug.ESimplegtDebugMessageTypes messageType, String[] arguments) {
		super();
		this.messageType = messageType;
		this.arguments = arguments;
	}
	
	public SimplegtDebugMessage(org.eclipselabs.simplegt.resource.simplegt.debug.ESimplegtDebugMessageTypes messageType, java.util.List<String> arguments) {
		super();
		this.messageType = messageType;
		this.arguments = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			this.arguments[i] = arguments.get(i);
		}
	}
	
	public org.eclipselabs.simplegt.resource.simplegt.debug.ESimplegtDebugMessageTypes getMessageType() {
		return messageType;
	}
	
	public String[] getArguments() {
		return arguments;
	}
	
	public String serialize() {
		java.util.List<String> parts = new java.util.ArrayList<String>();
		parts.add(messageType.name());
		for (String argument : arguments) {
			parts.add(argument);
		}
		return org.eclipselabs.simplegt.resource.simplegt.util.SimplegtStringUtil.encode(DELIMITER, parts);
	}
	
	public static SimplegtDebugMessage deserialize(String response) {
		java.util.List<String> parts = org.eclipselabs.simplegt.resource.simplegt.util.SimplegtStringUtil.decode(response, DELIMITER);
		String messageType = parts.get(0);
		String[] arguments = new String[parts.size() - 1];
		for (int i = 1; i < parts.size(); i++) {
			arguments[i - 1] = parts.get(i);
		}
		org.eclipselabs.simplegt.resource.simplegt.debug.ESimplegtDebugMessageTypes type = org.eclipselabs.simplegt.resource.simplegt.debug.ESimplegtDebugMessageTypes.valueOf(messageType);
		SimplegtDebugMessage message = new SimplegtDebugMessage(type, arguments);
		return message;
	}
	
	public boolean hasType(org.eclipselabs.simplegt.resource.simplegt.debug.ESimplegtDebugMessageTypes type) {
		return this.messageType == type;
	}
	
	public String getArgument(int index) {
		return getArguments()[index];
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + messageType.name() + ": " + org.eclipselabs.simplegt.resource.simplegt.util.SimplegtStringUtil.explode(arguments, ", ") + "]";
	}
	
}
