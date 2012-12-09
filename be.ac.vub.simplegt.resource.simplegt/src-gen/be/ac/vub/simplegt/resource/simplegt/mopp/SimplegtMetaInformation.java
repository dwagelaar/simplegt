/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.mopp;

public class SimplegtMetaInformation implements be.ac.vub.simplegt.resource.simplegt.ISimplegtMetaInformation {
	
	public String getSyntaxName() {
		return "simplegt";
	}
	
	public String getURI() {
		return "http://soft.vub.ac.be/simplegt/2011/SimpleGT";
	}
	
	public be.ac.vub.simplegt.resource.simplegt.ISimplegtTextScanner createLexer() {
		return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtAntlrScanner(new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtLexer());
	}
	
	public be.ac.vub.simplegt.resource.simplegt.ISimplegtTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtParser().createInstance(inputStream, encoding);
	}
	
	public be.ac.vub.simplegt.resource.simplegt.ISimplegtTextPrinter createPrinter(java.io.OutputStream outputStream, be.ac.vub.simplegt.resource.simplegt.ISimplegtTextResource resource) {
		return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceResolverSwitch getReferenceResolverSwitch() {
		return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtReferenceResolverSwitch();
	}
	
	public be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolverFactory getTokenResolverFactory() {
		return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "be.ac.vub.simplegt/model/simplegt.cs";
	}
	
	public String[] getTokenNames() {
		return be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtParser.tokenNames;
	}
	
	public be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenStyle getDefaultTokenStyle(String tokenName) {
		return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<be.ac.vub.simplegt.resource.simplegt.ISimplegtBracketPair> getBracketPairs() {
		return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtResourceFactory();
	}
	
	public be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtNewFileContentProvider getNewFileContentProvider() {
		return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtResourceFactory());
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
		return "be.ac.vub.simplegt.resource.simplegt.ui.launchConfigurationType";
	}
	
	public be.ac.vub.simplegt.resource.simplegt.ISimplegtNameProvider createNameProvider() {
		return new be.ac.vub.simplegt.resource.simplegt.analysis.SimplegtDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtAntlrTokenHelper tokenHelper = new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtAntlrTokenHelper();
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
		highlightableTokens.add(be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
