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
		return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtParser(null).getTokenNames();
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
	
}