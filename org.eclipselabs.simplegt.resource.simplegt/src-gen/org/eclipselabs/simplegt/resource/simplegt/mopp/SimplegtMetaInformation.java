/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.mopp;

public class SimplegtMetaInformation implements org.eclipselabs.simplegt.resource.simplegt.ISimplegtMetaInformation {
	
	public String getSyntaxName() {
		return "simplegt";
	}
	
	public String getURI() {
		return "http://eclipselabs.org/simplegt/2013/SimpleGT";
	}
	
	public org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextScanner createLexer() {
		return new org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtAntlrScanner(new org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtLexer());
	}
	
	public org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtParser().createInstance(inputStream, encoding);
	}
	
	public org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextPrinter createPrinter(java.io.OutputStream outputStream, org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextResource resource) {
		return new org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public org.eclipselabs.simplegt.resource.simplegt.ISimplegtReferenceResolverSwitch getReferenceResolverSwitch() {
		return new org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtReferenceResolverSwitch();
	}
	
	public org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolverFactory getTokenResolverFactory() {
		return new org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "org.eclipselabs.simplegt/model/simplegt.cs";
	}
	
	public String[] getTokenNames() {
		return org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtParser.tokenNames;
	}
	
	public org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenStyle getDefaultTokenStyle(String tokenName) {
		return new org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<org.eclipselabs.simplegt.resource.simplegt.ISimplegtBracketPair> getBracketPairs() {
		return new org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtResourceFactory();
	}
	
	public org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtNewFileContentProvider getNewFileContentProvider() {
		return new org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtResourceFactory());
	}
	
	/**
	 * Returns the key of the option that can be used to register a preprocessor that
	 * is used as a pipe when loading resources. This key is language-specific. To
	 * register one preprocessor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getInputStreamPreprocessorProviderOptionKey() {
		return getSyntaxName() + "_" + "INPUT_STREAM_PREPROCESSOR_PROVIDER";
	}
	
	/**
	 * Returns the key of the option that can be used to register a post-processors
	 * that are invoked after loading resources. This key is language-specific. To
	 * register one post-processor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getResourcePostProcessorProviderOptionKey() {
		return getSyntaxName() + "_" + "RESOURCE_POSTPROCESSOR_PROVIDER";
	}
	
	public String getLaunchConfigurationType() {
		return "org.eclipselabs.simplegt.resource.simplegt.ui.launchConfigurationType";
	}
	
	public org.eclipselabs.simplegt.resource.simplegt.ISimplegtNameProvider createNameProvider() {
		return new org.eclipselabs.simplegt.resource.simplegt.analysis.SimplegtDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtAntlrTokenHelper tokenHelper = new org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtAntlrTokenHelper();
		java.util.List<String> highlightableTokens = new java.util.ArrayList<String>();
		String[] parserTokenNames = getTokenNames();
		for (int i = 0; i < parserTokenNames.length; i++) {
			// If ANTLR is used we need to normalize the token names
			if (!tokenHelper.canBeUsedForSyntaxHighlighting(i)) {
				continue;
			}
			String tokenName = tokenHelper.getTokenName(parserTokenNames, i);
			if (tokenName == null) {
				continue;
			}
			highlightableTokens.add(tokenName);
		}
		highlightableTokens.add(org.eclipselabs.simplegt.resource.simplegt.mopp.SimplegtTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
