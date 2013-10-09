/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.ui;

/**
 * A class used to initialize default preference values.
 */
public class SimplegtPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, org.eclipselabs.simplegt.resource.simplegt.ISimplegtMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtBracketSet bracketSet = new org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtBracketSet(null, null);
		final java.util.Collection<org.eclipselabs.simplegt.resource.simplegt.ISimplegtBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (org.eclipselabs.simplegt.resource.simplegt.ISimplegtBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getSyntaxHighlightableTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			String tokenName = tokenNames[i];
			org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
	}
	
	private String getColorString(int[] colorAsRGB) {
		if (colorAsRGB == null) {
			return "0,0,0";
		}
		if (colorAsRGB.length != 3) {
			return "0,0,0";
		}
		return colorAsRGB[0] + "," +colorAsRGB[1] + ","+ colorAsRGB[2];
	}
}
