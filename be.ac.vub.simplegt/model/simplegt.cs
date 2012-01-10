SYNTAXDEF simplegt
FOR <http://soft.vub.ac.be/simplegt/2011/SimpleGT>
START Module

IMPORTS {
	simpleocl : <http://soft.vub.ac.be/simpleocl/2011/SimpleOCL>
		WITH SYNTAX simpleocl <platform:/plugin/be.ac.vub.simpleocl/metamodel/simpleocl.cs>
}

OPTIONS {
    reloadGeneratorModel = "true";
	usePredefinedTokens = "false";
	overrideResourceFactory = "false";
	overrideBuilder = "false";
	overrideBuilderAdapter = "false";
	overrideManifest = "false";
	disableLaunchSupport = "true";
	overrideLineBreakpoint = "false";
	overrideLineBreakpointAdapter = "false";
	overrideUIManifest = "false";
	overrideNewFileWizard = "false";
	overrideNewFileWizardPage = "false";
	overrideNewProjectWizard = "false";
	overrideUIPluginXML = "false";
	overrideProjectFile = "false";
	overrideBuildProperties = "false";
}

TOKENSTYLES {
	"abstract" COLOR #800040, BOLD;
	"debug" COLOR #800040, BOLD;
}

RULES {
	Module ::= "module" name[] debug["debug" : ""] ";" (!0 imports*)? (!0 metamodels*)? !0 "transform" models ("," models)* ";" (elements)*;
	@Foldable Rule ::= !0!0 abstract["abstract" : ""] "rule" name[] ("extends" extends[] ("," extends[])*)? "{" !1 input? nac* output? "}";
	@Foldable InPattern ::= "from" elements ("," !1 elements)*;
	InputElement ::= varName[] ":" type ("in" inModel[])? ("(" !1 bindings ("," bindings)* ")")?;
	InputBinding ::= property[] last["=~|" : "=~"] expr;
	@Foldable NacPattern ::= "not" elements ("," !1 elements)*;
	@Foldable OutPattern ::= "to" elements ("," !1 elements)*;
	OutputElement ::= varName[] ":" type ("in" inModel[])? ("(" !1 bindings ("," bindings)* ")")?;
	OutputBinding ::= property[] "=~" expr ("before" beforeElement[])?;
}