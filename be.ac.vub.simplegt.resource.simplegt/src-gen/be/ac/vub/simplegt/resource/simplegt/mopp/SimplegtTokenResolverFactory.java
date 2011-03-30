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
		registerTokenResolver("FLOAT", new be.ac.vub.simplegt.resource.simplegt.analysis.SimplegtFLOATTokenResolver());
		registerTokenResolver("INTEGER", new be.ac.vub.simplegt.resource.simplegt.analysis.SimplegtINTEGERTokenResolver());
		registerTokenResolver("TEXT", new be.ac.vub.simplegt.resource.simplegt.analysis.SimplegtTEXTTokenResolver());
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
