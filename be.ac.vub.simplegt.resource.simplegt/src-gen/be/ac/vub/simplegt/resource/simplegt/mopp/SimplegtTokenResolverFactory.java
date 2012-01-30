/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.mopp;

/**
 * The SimplegtTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class SimplegtTokenResolverFactory implements be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolverFactory {
	
	private java.util.Map<String, be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver> featureName2CollectInTokenResolver;
	private static be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver defaultResolver = new be.ac.vub.simplegt.resource.simplegt.analysis.SimplegtDefaultTokenResolver();
	
	public SimplegtTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver>();
		registerTokenResolver("NOTOP", new be.ac.vub.simplegt.resource.simplegt.analysis.SimpleoclNOTOPTokenResolver());
		registerTokenResolver("BOOLOP", new be.ac.vub.simplegt.resource.simplegt.analysis.SimpleoclBOOLOPTokenResolver());
		registerTokenResolver("INTOP", new be.ac.vub.simplegt.resource.simplegt.analysis.SimpleoclINTOPTokenResolver());
		registerTokenResolver("RELOP", new be.ac.vub.simplegt.resource.simplegt.analysis.SimpleoclRELOPTokenResolver());
		registerTokenResolver("EQ", new be.ac.vub.simplegt.resource.simplegt.analysis.SimpleoclEQTokenResolver());
		registerTokenResolver("NEQ", new be.ac.vub.simplegt.resource.simplegt.analysis.SimpleoclNEQTokenResolver());
		registerTokenResolver("ADDOP", new be.ac.vub.simplegt.resource.simplegt.analysis.SimpleoclADDOPTokenResolver());
		registerTokenResolver("MULOP", new be.ac.vub.simplegt.resource.simplegt.analysis.SimpleoclMULOPTokenResolver());
		registerTokenResolver("FLOAT", new be.ac.vub.simplegt.resource.simplegt.analysis.SimpleoclFLOATTokenResolver());
		registerTokenResolver("INTEGER", new be.ac.vub.simplegt.resource.simplegt.analysis.SimpleoclINTEGERTokenResolver());
		registerTokenResolver("STRINGTYPE", new be.ac.vub.simplegt.resource.simplegt.analysis.SimpleoclSTRINGTYPETokenResolver());
		registerTokenResolver("BOOLEANTYPE", new be.ac.vub.simplegt.resource.simplegt.analysis.SimpleoclBOOLEANTYPETokenResolver());
		registerTokenResolver("INTEGERTYPE", new be.ac.vub.simplegt.resource.simplegt.analysis.SimpleoclINTEGERTYPETokenResolver());
		registerTokenResolver("REALTYPE", new be.ac.vub.simplegt.resource.simplegt.analysis.SimpleoclREALTYPETokenResolver());
		registerTokenResolver("COLLECTIONTYPE", new be.ac.vub.simplegt.resource.simplegt.analysis.SimpleoclCOLLECTIONTYPETokenResolver());
		registerTokenResolver("BAGTYPE", new be.ac.vub.simplegt.resource.simplegt.analysis.SimpleoclBAGTYPETokenResolver());
		registerTokenResolver("ORDEREDSETTYPE", new be.ac.vub.simplegt.resource.simplegt.analysis.SimpleoclORDEREDSETTYPETokenResolver());
		registerTokenResolver("SEQUENCETYPE", new be.ac.vub.simplegt.resource.simplegt.analysis.SimpleoclSEQUENCETYPETokenResolver());
		registerTokenResolver("SETTYPE", new be.ac.vub.simplegt.resource.simplegt.analysis.SimpleoclSETTYPETokenResolver());
		registerTokenResolver("OCLANYTYPE", new be.ac.vub.simplegt.resource.simplegt.analysis.SimpleoclOCLANYTYPETokenResolver());
		registerTokenResolver("OCLTYPE", new be.ac.vub.simplegt.resource.simplegt.analysis.SimpleoclOCLTYPETokenResolver());
		registerTokenResolver("TUPLETYPE", new be.ac.vub.simplegt.resource.simplegt.analysis.SimpleoclTUPLETYPETokenResolver());
		registerTokenResolver("TUPLE", new be.ac.vub.simplegt.resource.simplegt.analysis.SimpleoclTUPLETokenResolver());
		registerTokenResolver("MAPTYPE", new be.ac.vub.simplegt.resource.simplegt.analysis.SimpleoclMAPTYPETokenResolver());
		registerTokenResolver("LAMBDATYPE", new be.ac.vub.simplegt.resource.simplegt.analysis.SimpleoclLAMBDATYPETokenResolver());
		registerTokenResolver("ENVTYPE", new be.ac.vub.simplegt.resource.simplegt.analysis.SimpleoclENVTYPETokenResolver());
		registerTokenResolver("TEXT", new be.ac.vub.simplegt.resource.simplegt.analysis.SimpleoclTEXTTokenResolver());
		registerTokenResolver("QUOTED_34_34_92", new be.ac.vub.simplegt.resource.simplegt.analysis.SimpleoclQUOTED_34_34_92TokenResolver());
		registerTokenResolver("QUOTED_39_39_92", new be.ac.vub.simplegt.resource.simplegt.analysis.SimpleoclQUOTED_39_39_92TokenResolver());
	}
	
	public be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver internalCreateResolver(java.util.Map<String, be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver> resolverMap, String key, be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
