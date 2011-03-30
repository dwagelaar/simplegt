SYNTAXDEF simplegt
FOR <http://soft.vub.ac.be/simplegt/2011/SimpleGT>
START Module

OPTIONS {
    reloadGeneratorModel = "true";
	usePredefinedTokens = "false";
	overrideResourceFactory = "false";
}

TOKENS {
	DEFINE FRAGMENT DIGIT $('0'..'9')$;
	DEFINE FRAGMENT CHAR $('A'..'Z'|'a'..'z')$;
	DEFINE COMMENT $'--'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE FLOAT INTEGER + $'.'$ + INTEGER;
	DEFINE INTEGER $($ + DIGIT + $)+$;
	DEFINE TEXT CHAR + $($ + CHAR + $|$ + DIGIT + $|'-'|'_')*$;
	DEFINE LINEBREAK $('\r\n'|'\'r'|'\n')$;
	DEFINE WHITESPACE $(' '|'\t'|'\f')$;
}

TOKENSTYLES {
	"COMMENT" COLOR #53876D;
}

RULES {
	Module ::= "module" name[] ";" (!0 "import" imports[] ";")* !0 "transform" models ("," models)* ";" rules*;
	InstanceModel ::= name[] ":" metaModel;
	Metamodel ::= name[];
	@Foldable Rule ::= !0!0 abstract["abstract" : ""] "rule" name[] ("extends" extends[] ("," extends[])*)? "{" !1 input? nac* output? "}";
	InPattern ::= "from" elements ("," !1 elements)*;
	Type ::= model[] "!" name[];
	InputElement ::= name[] ":" type ("in" inModel[])? ("(" !1 bindings ("," bindings)* ")")?;
	InputBinding ::= property[] "=" expr;
	ElementExp ::= element[] ("." property[])?;
	StringLiteralExp ::= "\"" literal[] "\"";
	IntegerLiteralExp ::= literal[INTEGER];
	DoubleLiteralExp ::= literal[FLOAT];
	CharLiteralExp ::= "'" literal[] "'";
	BooleanLiteralExp ::= literal["true" : "false"];
	EnumLiteralExp ::= "#" literal[];
	NacPattern ::= "not" elements ("," !1 elements)*;
	OutPattern ::= "to" elements ("," !1 elements)*;
	OutputElement ::= name[] ":" type ("in" inModel[])? ("(" !1 bindings ("," bindings)* ")")?;
	SetBinding ::= property[] "=" expr;
	AddBinding ::= property[] "+=" expr ("before" beforeElement[])?;
	DelBinding ::= property[] "-=" expr;
}