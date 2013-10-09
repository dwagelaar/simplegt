/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.ui;

/**
 * An adapter from the Eclipse
 * <code>org.eclipse.jface.text.rules.ITokenScanner</code> interface to the
 * generated lexer.
 */
public class SimplegtTokenScanner implements org.eclipse.jface.text.rules.ITokenScanner {
	
	private org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextScanner lexer;
	private org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextToken currentToken;
	private java.util.List<org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextToken> nextTokens;
	private int offset;
	private String languageId;
	private org.eclipse.jface.preference.IPreferenceStore store;
	private org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtColorManager colorManager;
	private org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextResource resource;
	
	/**
	 * 
	 * @param colorManager A manager to obtain color objects
	 */
	public SimplegtTokenScanner(org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextResource resource, org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtColorManager colorManager) {
		this.resource = resource;
		this.colorManager = colorManager;
		this.lexer = new org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtMetaInformation().createLexer();
		this.languageId = new org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtMetaInformation().getSyntaxName();
		org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtUIPlugin plugin = org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtUIPlugin.getDefault();
		if (plugin != null) {
			this.store = plugin.getPreferenceStore();
		}
		this.nextTokens = new java.util.ArrayList<org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextToken>();
	}
	
	public int getTokenLength() {
		return currentToken.getLength();
	}
	
	public int getTokenOffset() {
		return offset + currentToken.getOffset();
	}
	
	public org.eclipse.jface.text.rules.IToken nextToken() {
		boolean isOriginalToken = true;
		if (!nextTokens.isEmpty()) {
			currentToken = nextTokens.remove(0);
			isOriginalToken = false;
		} else {
			currentToken = lexer.getNextToken();
		}
		if (currentToken == null || !currentToken.canBeUsedForSyntaxHighlighting()) {
			return org.eclipse.jface.text.rules.Token.EOF;
		}
		
		if (isOriginalToken) {
			splitCurrentToken();
		}
		
		org.eclipse.jface.text.TextAttribute textAttribute = null;
		String tokenName = currentToken.getName();
		if (tokenName != null) {
			org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenStyle staticStyle = getStaticTokenStyle();
			// now call dynamic token styler to allow to apply modifications to the static
			// style
			org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenStyle dynamicStyle = getDynamicTokenStyle(staticStyle);
			if (dynamicStyle != null) {
				textAttribute = getTextAttribute(dynamicStyle);
			}
		}
		
		return new org.eclipse.jface.text.rules.Token(textAttribute);
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
	
	public org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenStyle getStaticTokenStyle() {
		org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenStyle staticStyle = null;
		String tokenName = currentToken.getName();
		String enableKey = org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.StyleProperty.ENABLE);
		boolean enabled = store.getBoolean(enableKey);
		if (enabled) {
			String colorKey = org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.StyleProperty.COLOR);
			org.eclipse.swt.graphics.RGB foregroundRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(store, colorKey);
			org.eclipse.swt.graphics.RGB backgroundRGB = null;
			boolean bold = store.getBoolean(org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.StyleProperty.BOLD));
			boolean italic = store.getBoolean(org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.StyleProperty.ITALIC));
			boolean strikethrough = store.getBoolean(org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.StyleProperty.STRIKETHROUGH));
			boolean underline = store.getBoolean(org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.StyleProperty.UNDERLINE));
			staticStyle = new org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtTokenStyle(convertToIntArray(foregroundRGB), convertToIntArray(backgroundRGB), bold, italic, strikethrough, underline);
		}
		return staticStyle;
	}
	
	public org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenStyle getDynamicTokenStyle(org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenStyle staticStyle) {
		org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtDynamicTokenStyler dynamicTokenStyler = new org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtDynamicTokenStyler();
		org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenStyle dynamicStyle = dynamicTokenStyler.getDynamicTokenStyle(resource, currentToken, staticStyle);
		return dynamicStyle;
	}
	
	public org.eclipse.jface.text.TextAttribute getTextAttribute(org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenStyle tokeStyle) {
		int[] foregroundColorArray = tokeStyle.getColorAsRGB();
		org.eclipse.swt.graphics.Color foregroundColor = null;
		if (colorManager != null) {
			foregroundColor = colorManager.getColor(new org.eclipse.swt.graphics.RGB(foregroundColorArray[0], foregroundColorArray[1], foregroundColorArray[2]));
		}
		int[] backgroundColorArray = tokeStyle.getBackgroundColorAsRGB();
		org.eclipse.swt.graphics.Color backgroundColor = null;
		if (backgroundColorArray != null) {
			org.eclipse.swt.graphics.RGB backgroundRGB = new org.eclipse.swt.graphics.RGB(backgroundColorArray[0], backgroundColorArray[1], backgroundColorArray[2]);
			if (colorManager != null) {
				backgroundColor = colorManager.getColor(backgroundRGB);
			}
		}
		int style = org.eclipse.swt.SWT.NORMAL;
		if (tokeStyle.isBold()) {
			style = style | org.eclipse.swt.SWT.BOLD;
		}
		if (tokeStyle.isItalic()) {
			style = style | org.eclipse.swt.SWT.ITALIC;
		}
		if (tokeStyle.isStrikethrough()) {
			style = style | org.eclipse.jface.text.TextAttribute.STRIKETHROUGH;
		}
		if (tokeStyle.isUnderline()) {
			style = style | org.eclipse.jface.text.TextAttribute.UNDERLINE;
		}
		return new org.eclipse.jface.text.TextAttribute(foregroundColor, backgroundColor, style);
	}
	
	/**
	 * Tries to split the current token if it contains task items.
	 */
	public void splitCurrentToken() {
		final String text = currentToken.getText();
		final String name = currentToken.getName();
		final int line = currentToken.getLine();
		final int charStart = currentToken.getOffset();
		final int column = currentToken.getColumn();
		
		java.util.List<org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtTaskItem> taskItems = new org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtTaskItemDetector().findTaskItems(text, line, charStart);
		
		// this is the offset for the next token to be added
		int offset = charStart;
		int itemBeginRelative;
		java.util.List<org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextToken> newItems = new java.util.ArrayList<org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextToken>();
		for (org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtTaskItem taskItem : taskItems) {
			int itemBegin = taskItem.getCharStart();
			int itemLine = taskItem.getLine();
			int itemColumn = 0;
			
			itemBeginRelative = itemBegin - charStart;
			// create token before task item (TODO if required)
			String textBefore = text.substring(offset - charStart, itemBeginRelative);
			int textBeforeLength = textBefore.length();
			newItems.add(new org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtTextToken(name, textBefore, offset, textBeforeLength, line, column, true));
			
			// create token for the task item itself
			offset = offset + textBeforeLength;
			String itemText = taskItem.getKeyword();
			int itemTextLength = itemText.length();
			newItems.add(new org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtTextToken(org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME, itemText, offset, itemTextLength, itemLine, itemColumn, true));
			
			offset = offset + itemTextLength;
		}
		
		if (!taskItems.isEmpty()) {
			// create token after last task item (TODO if required)
			String textAfter = text.substring(offset - charStart);
			newItems.add(new org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtTextToken(name, textAfter, offset, textAfter.length(), line, column, true));
		}
		
		if (!newItems.isEmpty()) {
			// replace tokens
			currentToken = newItems.remove(0);
			nextTokens = newItems;
		}
		
	}
}
