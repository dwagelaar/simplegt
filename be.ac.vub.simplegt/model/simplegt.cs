SYNTAXDEF simplegt
FOR <http://soft.vub.ac.be/simplegt/2011/SimpleGT>
START Module

RULES {
	Module ::= "module" name[] ";" ("import" imports[] ";")* "transform" models ("," models)* ";" rules*;
	InstanceModel ::= name[] ":" metaModel;
	Metamodel ::= name[];
	Rule ::= abstract["abstract" : ""] "rule" name[] ("extends" extends[] ("," extends[])*)? "{" input? nac* output? "}";
	InPattern ::= "from" elements ("," elements)*;
	Type ::= (model[] "!")? name[];
	InputElement ::= name[] ":" type ("=" binding)?;
	InputBinding ::= element[] ("." feature[])?;
	NacPattern ::= "not" elements ("," elements)*;
	OutPattern ::= "to" elements ("," elements)*;
	OutputElement ::= name[] ":" type ("(" bindings ("," bindings)* ")")?;
	OutputBinding ::= targetFeature[] ":=" element[] ("." feature[])?;
}