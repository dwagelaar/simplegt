/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.ui;

/**
 * An adapter from the Eclipse
 * <code>org.eclipse.jface.text.rules.ITokenScanner</code> interface to the
 * generated lexer.
 */
public class SimplegtTokenScanner implements org.eclipse.jface.text.rules.ITokenScanner {
	
	private be.ac.vub.simplegt.resource.simplegt.ISimplegtTextScanner lexer;
	private be.ac.vub.simplegt.resource.simplegt.ISimplegtTextToken currentToken;
	private int offset;
	private String languageId;
	private org.eclipse.jface.preference.IPreferenceStore store;
	private be.ac.vub.simplegt.resource.simplegt.ui.SimplegtColorManager colorManager;
	private be.ac.vub.simplegt.resource.simplegt.ISimplegtTextResource resource;
	
	/**
	 * 
	 * @param colorManager A manager to obtain color objects
	 */
	public SimplegtTokenScanner(be.ac.vub.simplegt.resource.simplegt.ISimplegtTextResource resource, be.ac.vub.simplegt.resource.simplegt.ui.SimplegtColorManager colorManager) {
		this.resource = resource;
		this.colorManager = colorManager;
		this.lexer = new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtMetaInformation().createLexer();
		this.languageId = new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtMetaInformation().getSyntaxName();
		this.store = be.ac.vub.simplegt.resource.simplegt.ui.SimplegtUIPlugin.getDefault().getPreferenceStore();
	}
	
	public int getTokenLength() {
		return currentToken.getLength();
	}
	
	public int getTokenOffset() {
		return offset + currentToken.getOffset();
	}
	
	public org.eclipse.jface.text.rules.IToken nextToken() {
		be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtDynamicTokenStyler dynamicTokenStyler = new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtDynamicTokenStyler();
		currentToken = lexer.getNextToken();
		if (currentToken == null || !currentToken.canBeUsedForSyntaxHighlighting()) {
			return org.eclipse.jface.text.rules.Token.EOF;
		}
		org.eclipse.jface.text.TextAttribute ta = null;
		String tokenName = currentToken.getName();
		if (tokenName != null) {
			String enableKey = be.ac.vub.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, be.ac.vub.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.StyleProperty.ENABLE);
			boolean enabled = store.getBoolean(enableKey);
			be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenStyle staticStyle = null;
			if (enabled) {
				String colorKey = be.ac.vub.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, be.ac.vub.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.StyleProperty.COLOR);
				org.eclipse.swt.graphics.RGB foregroundRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(store, colorKey);
				org.eclipse.swt.graphics.RGB backgroundRGB = null;
				boolean bold = store.getBoolean(be.ac.vub.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, be.ac.vub.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.StyleProperty.BOLD));
				boolean italic = store.getBoolean(be.ac.vub.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, be.ac.vub.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.StyleProperty.ITALIC));
				boolean strikethrough = store.getBoolean(be.ac.vub.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, be.ac.vub.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.StyleProperty.STRIKETHROUGH));
				boolean underline = store.getBoolean(be.ac.vub.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, be.ac.vub.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.StyleProperty.UNDERLINE));
				// now call dynamic token styler to allow to apply modifications to the static
				// style
				staticStyle = new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTokenStyle(convertToIntArray(foregroundRGB), convertToIntArray(backgroundRGB), bold, italic, strikethrough, underline);
			}
			be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenStyle dynamicStyle = dynamicTokenStyler.getDynamicTokenStyle(resource, currentToken, staticStyle);
			if (dynamicStyle != null) {
				int[] foregroundColorArray = dynamicStyle.getColorAsRGB();
				org.eclipse.swt.graphics.Color foregroundColor = colorManager.getColor(new org.eclipse.swt.graphics.RGB(foregroundColorArray[0], foregroundColorArray[1], foregroundColorArray[2]));
				int[] backgroundColorArray = dynamicStyle.getBackgroundColorAsRGB();
				org.eclipse.swt.graphics.Color backgroundColor = null;
				if (backgroundColorArray != null) {
					org.eclipse.swt.graphics.RGB backgroundRGB = new org.eclipse.swt.graphics.RGB(backgroundColorArray[0], backgroundColorArray[1], backgroundColorArray[2]);
					backgroundColor = colorManager.getColor(backgroundRGB);
				}
				int style = org.eclipse.swt.SWT.NORMAL;
				if (dynamicStyle.isBold()) {
					style = style | org.eclipse.swt.SWT.BOLD;
				}
				if (dynamicStyle.isItalic()) {
					style = style | org.eclipse.swt.SWT.ITALIC;
				}
				if (dynamicStyle.isStrikethrough()) {
					style = style | org.eclipse.jface.text.TextAttribute.STRIKETHROUGH;
				}
				if (dynamicStyle.isUnderline()) {
					style = style | org.eclipse.jface.text.TextAttribute.UNDERLINE;
				}
				ta = new org.eclipse.jface.text.TextAttribute(foregroundColor, backgroundColor, style);
			}
		}
		return new org.eclipse.jface.text.rules.Token(ta);
	}
	
	public void setRange(org.eclipse.jface.text.IDocument document, int offset, int length) {
		this.offset = offset;
		try {
			lexer.setText(document.get(offset, length));
		} catch (org.eclipse.jface.text.BadLocationException e) {
			// ignore this error. It might occur during editing when locations are outdated
			// quickly.
		}
	}
	
	public String getTokenText() {
		return currentToken.getText();
	}
	
	public int[] convertToIntArray(org.eclipse.swt.graphics.RGB rgb) {
		if (rgb == null) {
			return null;
		}
		return new int[] {rgb.red, rgb.green, rgb.blue};
	}
	
}
