/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.mopp;

public class SimplegtBracketInformationProvider {
	
	public class BracketPair implements be.ac.vub.simplegt.resource.simplegt.ISimplegtBracketPair {
		
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
	
	public java.util.Collection<be.ac.vub.simplegt.resource.simplegt.ISimplegtBracketPair> getBracketPairs() {
		java.util.Collection<be.ac.vub.simplegt.resource.simplegt.ISimplegtBracketPair> result = new java.util.ArrayList<be.ac.vub.simplegt.resource.simplegt.ISimplegtBracketPair>();
		result.add(new BracketPair("{", "}", true));
		result.add(new BracketPair("(", ")", true));
		result.add(new BracketPair("\"", "\"", true));
		result.add(new BracketPair("'", "'", true));
		return result;
	}
	
}
