/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.mopp;

public class SimplegtAntlrScanner implements be.ac.vub.simplegt.resource.simplegt.ISimplegtTextScanner {
	
	private org.antlr.runtime3_4_0.Lexer antlrLexer;
	
	public SimplegtAntlrScanner(org.antlr.runtime3_4_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public be.ac.vub.simplegt.resource.simplegt.ISimplegtTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_4_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		be.ac.vub.simplegt.resource.simplegt.ISimplegtTextToken result = new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtANTLRTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_4_0.ANTLRStringStream(text));
	}
	
}
