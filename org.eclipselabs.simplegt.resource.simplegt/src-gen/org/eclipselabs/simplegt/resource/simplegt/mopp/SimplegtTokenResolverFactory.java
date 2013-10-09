/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.mopp;

/**
 * The SimplegtTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class SimplegtTokenResolverFactory implements org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolverFactory {
	
	private java.util.Map<String, org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver> featureName2CollectInTokenResolver;
	private static org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver defaultResolver = new org.eclipselabs.simplegt.resource.simplegt.analysis.SimplegtDefaultTokenResolver();
	
	public SimplegtTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver>();
		registerTokenResolver("NOTOP", new org.eclipselabs.simplegt.resource.simplegt.analysis.SimpleoclNOTOPTokenResolver());
		registerTokenResolver("BOOLOP", new org.eclipselabs.simplegt.resource.simplegt.analysis.SimpleoclBOOLOPTokenResolver());
		registerTokenResolver("INTOP", new org.eclipselabs.simplegt.resource.simplegt.analysis.SimpleoclINTOPTokenResolver());
		registerTokenResolver("RELOP", new org.eclipselabs.simplegt.resource.simplegt.analysis.SimpleoclRELOPTokenResolver());
		registerTokenResolver("EQ", new org.eclipselabs.simplegt.resource.simplegt.analysis.SimpleoclEQTokenResolver());
		registerTokenResolver("NEQ", new org.eclipselabs.simplegt.resource.simplegt.analysis.SimpleoclNEQTokenResolver());
		registerTokenResolver("ADDOP", new org.eclipselabs.simplegt.resource.simplegt.analysis.SimpleoclADDOPTokenResolver());
		registerTokenResolver("MULOP", new org.eclipselabs.simplegt.resource.simplegt.analysis.SimpleoclMULOPTokenResolver());
		registerTokenResolver("FLOAT", new org.eclipselabs.simplegt.resource.simplegt.analysis.SimpleoclFLOATTokenResolver());
		registerTokenResolver("INTEGER", new org.eclipselabs.simplegt.resource.simplegt.analysis.SimpleoclINTEGERTokenResolver());
		registerTokenResolver("STRINGTYPE", new org.eclipselabs.simplegt.resource.simplegt.analysis.SimpleoclSTRINGTYPETokenResolver());
		registerTokenResolver("BOOLEANTYPE", new org.eclipselabs.simplegt.resource.simplegt.analysis.SimpleoclBOOLEANTYPETokenResolver());
		registerTokenResolver("INTEGERTYPE", new org.eclipselabs.simplegt.resource.simplegt.analysis.SimpleoclINTEGERTYPETokenResolver());
		registerTokenResolver("REALTYPE", new org.eclipselabs.simplegt.resource.simplegt.analysis.SimpleoclREALTYPETokenResolver());
		registerTokenResolver("COLLECTIONTYPE", new org.eclipselabs.simplegt.resource.simplegt.analysis.SimpleoclCOLLECTIONTYPETokenResolver());
		registerTokenResolver("BAGTYPE", new org.eclipselabs.simplegt.resource.simplegt.analysis.SimpleoclBAGTYPETokenResolver());
		registerTokenResolver("ORDEREDSETTYPE", new org.eclipselabs.simplegt.resource.simplegt.analysis.SimpleoclORDEREDSETTYPETokenResolver());
		registerTokenResolver("SEQUENCETYPE", new org.eclipselabs.simplegt.resource.simplegt.analysis.SimpleoclSEQUENCETYPETokenResolver());
		registerTokenResolver("SETTYPE", new org.eclipselabs.simplegt.resource.simplegt.analysis.SimpleoclSETTYPETokenResolver());
		registerTokenResolver("OCLANYTYPE", new org.eclipselabs.simplegt.resource.simplegt.analysis.SimpleoclOCLANYTYPETokenResolver());
		registerTokenResolver("OCLTYPE", new org.eclipselabs.simplegt.resource.simplegt.analysis.SimpleoclOCLTYPETokenResolver());
		registerTokenResolver("TUPLETYPE", new org.eclipselabs.simplegt.resource.simplegt.analysis.SimpleoclTUPLETYPETokenResolver());
		registerTokenResolver("TUPLE", new org.eclipselabs.simplegt.resource.simplegt.analysis.SimpleoclTUPLETokenResolver());
		registerTokenResolver("MAPTYPE", new org.eclipselabs.simplegt.resource.simplegt.analysis.SimpleoclMAPTYPETokenResolver());
		registerTokenResolver("LAMBDATYPE", new org.eclipselabs.simplegt.resource.simplegt.analysis.SimpleoclLAMBDATYPETokenResolver());
		registerTokenResolver("ENVTYPE", new org.eclipselabs.simplegt.resource.simplegt.analysis.SimpleoclENVTYPETokenResolver());
		registerTokenResolver("TEXT", new org.eclipselabs.simplegt.resource.simplegt.analysis.SimpleoclTEXTTokenResolver());
		registerTokenResolver("QUOTED_34_34_92", new org.eclipselabs.simplegt.resource.simplegt.analysis.SimpleoclQUOTED_34_34_92TokenResolver());
		registerTokenResolver("QUOTED_39_39_92", new org.eclipselabs.simplegt.resource.simplegt.analysis.SimpleoclQUOTED_39_39_92TokenResolver());
	}
	
	public org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver internalCreateResolver(java.util.Map<String, org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver> resolverMap, String key, org.eclipselabs.simplegt.resource.simplegt.ISimplegtTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
