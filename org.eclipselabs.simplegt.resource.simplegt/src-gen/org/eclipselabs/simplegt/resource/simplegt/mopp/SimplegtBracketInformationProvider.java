/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.mopp;

public class SimplegtBracketInformationProvider {
	
	public class BracketPair implements org.eclipselabs.simplegt.resource.simplegt.ISimplegtBracketPair {
		
		private String opening;
		private String closing;
		private boolean closingEnabledInside;
		
		public BracketPair(String opening, String closing, boolean closingEnabledInside) {
			super();
			this.opening = opening;
			this.closing = closing;
			this.closingEnabledInside = closingEnabledInside;
		}
		
		public String getOpeningBracket() {
			return opening;
		}
		
		public String getClosingBracket() {
			return closing;
		}
		
		public boolean isClosingEnabledInside() {
			return closingEnabledInside;
		}
	}
	
	public java.util.Collection<org.eclipselabs.simplegt.resource.simplegt.ISimplegtBracketPair> getBracketPairs() {
		java.util.Collection<org.eclipselabs.simplegt.resource.simplegt.ISimplegtBracketPair> result = new java.util.ArrayList<org.eclipselabs.simplegt.resource.simplegt.ISimplegtBracketPair>();
		result.add(new BracketPair("{", "}", true));
		result.add(new BracketPair("(", ")", true));
		result.add(new BracketPair("\"", "\"", false));
		result.add(new BracketPair("'", "'", false));
		return result;
	}
	
}
