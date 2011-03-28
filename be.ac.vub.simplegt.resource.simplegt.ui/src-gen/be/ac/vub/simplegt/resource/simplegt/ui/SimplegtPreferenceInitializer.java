/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.ui;

/**
 * A class used to initialize default preference values.
 */
public class SimplegtPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	private final static be.ac.vub.simplegt.resource.simplegt.ui.SimplegtAntlrTokenHelper tokenHelper = new be.ac.vub.simplegt.resource.simplegt.ui.SimplegtAntlrTokenHelper();
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = be.ac.vub.simplegt.resource.simplegt.ui.SimplegtUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(be.ac.vub.simplegt.resource.simplegt.ui.SimplegtPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(be.ac.vub.simplegt.resource.simplegt.ui.SimplegtPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = be.ac.vub.simplegt.resource.simplegt.ui.SimplegtUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = be.ac.vub.simplegt.resource.simplegt.ui.SimplegtUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, be.ac.vub.simplegt.resource.simplegt.ISimplegtMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		be.ac.vub.simplegt.resource.simplegt.ui.SimplegtBracketSet bracketSet = new be.ac.vub.simplegt.resource.simplegt.ui.SimplegtBracketSet(null, null);
		final java.util.Collection<be.ac.vub.simplegt.resource.simplegt.ISimplegtBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (be.ac.vub.simplegt.resource.simplegt.ISimplegtBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + be.ac.vub.simplegt.resource.simplegt.ui.SimplegtPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, be.ac.vub.simplegt.resource.simplegt.ISimplegtMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			if (!tokenHelper.canBeUsedForSyntaxColoring(i)) {
				continue;
			}
			
			String tokenName = tokenHelper.getTokenName(tokenNames, i);
			if (tokenName == null) {
				continue;
			}
			be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(be.ac.vub.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, be.ac.vub.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(be.ac.vub.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, be.ac.vub.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(be.ac.vub.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, be.ac.vub.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(be.ac.vub.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, be.ac.vub.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(be.ac.vub.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, be.ac.vub.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(be.ac.vub.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, be.ac.vub.simplegt.resource.simplegt.ui.SimplegtSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
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
