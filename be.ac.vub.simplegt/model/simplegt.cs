SYNTAXDEF simplegt
FOR <http://soft.vub.ac.be/simplegt/2011/SimpleGT>
START Module

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

TOKENS {
	DEFINE FRAGMENT DIGIT $('0'..'9')$;
	DEFINE FRAGMENT CHAR $('A'..'Z'|'a'..'z')$;
	DEFINE COMMENT $'--'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE FLOAT INTEGER + $'.'($ + DIGIT + $)+$;
	DEFINE INTEGER $'-'?($ + DIGIT + $)+$;
	DEFINE TEXT CHAR + $($ + CHAR + $|$ + DIGIT + $|'-'|'_')*$;
	DEFINE LINEBREAK $('\r\n'|'\'r'|'\n')$;
	DEFINE WHITESPACE $(' '|'\t'|'\f')$;
}

TOKENSTYLES {
	"COMMENT" COLOR #53876D;
	"INTEGER" COLOR #2A00FF;
	"FLOAT" COLOR #2A00FF;
	"abstract" COLOR #800040, BOLD;
	"debug" COLOR #800040, BOLD;
	"true" COLOR #00D0FF;
	"false" COLOR #00D0FF;
}

RULES {
	Module ::= "module" name[] debug["debug" : ""] ";" (!0 "import" imports[] ";")* !0 "transform" models ("," models)* ";" rules*;
	InstanceModel ::= name[] ":" metaModel;
	Metamodel ::= name[];
	@Foldable Rule ::= !0!0 abstract["abstract" : ""] "rule" name[] ("extends" extends[] ("," extends[])*)? "{" !1 input? nac* output? "}";
	@Foldable InPattern ::= "from" elements ("," !1 elements)*;
	Type ::= model[] "!" (name[]|name['"', '"', '\\']);
	InputElement ::= name[] ":" type ("in" inModel[])? ("(" !1 bindings ("," bindings)* ")")?;
	InputBinding ::= property[] last["=~|" : "=~"] expr;
	ElementExp ::= element[] ("." property[])?;
	StringLiteralExp ::= literal['\'', '\'', '\\'];
	IntegerLiteralExp ::= literal[INTEGER];
	DoubleLiteralExp ::= literal[FLOAT];
	BooleanLiteralExp ::= literal["true" : "false"];
	EnumLiteralExp ::= "#" (literal[]|literal['"', '"', '\\']);
	@Foldable NacPattern ::= "not" elements ("," !1 elements)*;
	@Foldable OutPattern ::= "to" elements ("," !1 elements)*;
	OutputElement ::= name[] ":" type ("in" inModel[])? ("(" !1 bindings ("," bindings)* ")")?;
	OutputBinding ::= property[] "=~" expr ("before" beforeElement[])?;
}