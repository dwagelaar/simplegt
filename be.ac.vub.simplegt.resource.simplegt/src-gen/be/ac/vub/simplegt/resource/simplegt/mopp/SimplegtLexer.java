// $ANTLR ${project.version} ${buildNumber}

	package be.ac.vub.simplegt.resource.simplegt.mopp;


import org.antlr.runtime3_3_0.*;

public class SimplegtLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int TEXT=4;
    public static final int QUOTED_34_34_92=5;
    public static final int QUOTED_39_39_92=6;
    public static final int EQ=7;
    public static final int COLLECTIONTYPE=8;
    public static final int STRINGTYPE=9;
    public static final int BOOLEANTYPE=10;
    public static final int INTEGERTYPE=11;
    public static final int REALTYPE=12;
    public static final int BAGTYPE=13;
    public static final int ORDEREDSETTYPE=14;
    public static final int SEQUENCETYPE=15;
    public static final int SETTYPE=16;
    public static final int OCLANYTYPE=17;
    public static final int OCLTYPE=18;
    public static final int TUPLETYPE=19;
    public static final int TUPLE=20;
    public static final int MAPTYPE=21;
    public static final int LAMBDATYPE=22;
    public static final int ENVTYPE=23;
    public static final int BOOLOP=24;
    public static final int NEQ=25;
    public static final int RELOP=26;
    public static final int ADDOP=27;
    public static final int INTOP=28;
    public static final int MULOP=29;
    public static final int NOTOP=30;
    public static final int FLOAT=31;
    public static final int INTEGER=32;
    public static final int COMMENT=33;
    public static final int LINEBREAK=34;
    public static final int WHITESPACE=35;

    	public java.util.List<org.antlr.runtime3_3_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_3_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_3_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_3_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators

    public SimplegtLexer() {;} 
    public SimplegtLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SimplegtLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Simplegt.g"; }

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:16:7: ( 'module' )
            // Simplegt.g:16:9: 'module'
            {
            match("module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:17:7: ( 'debug' )
            // Simplegt.g:17:9: 'debug'
            {
            match("debug"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:18:7: ( ';' )
            // Simplegt.g:18:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:19:7: ( 'transform' )
            // Simplegt.g:19:9: 'transform'
            {
            match("transform"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:20:7: ( ',' )
            // Simplegt.g:20:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:21:7: ( 'abstract' )
            // Simplegt.g:21:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:22:7: ( 'unique' )
            // Simplegt.g:22:9: 'unique'
            {
            match("unique"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:23:7: ( 'rule' )
            // Simplegt.g:23:9: 'rule'
            {
            match("rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:24:7: ( 'extends' )
            // Simplegt.g:24:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:25:7: ( '{' )
            // Simplegt.g:25:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:26:7: ( '}' )
            // Simplegt.g:26:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:27:7: ( 'from' )
            // Simplegt.g:27:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:28:7: ( ':' )
            // Simplegt.g:28:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:29:7: ( 'in' )
            // Simplegt.g:29:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:30:7: ( '(' )
            // Simplegt.g:30:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:31:7: ( ')' )
            // Simplegt.g:31:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:32:7: ( '=~|' )
            // Simplegt.g:32:9: '=~|'
            {
            match("=~|"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:33:7: ( '=~' )
            // Simplegt.g:33:9: '=~'
            {
            match("=~"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:34:7: ( 'to' )
            // Simplegt.g:34:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:35:7: ( 'before' )
            // Simplegt.g:35:9: 'before'
            {
            match("before"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:36:7: ( 'import' )
            // Simplegt.g:36:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:37:7: ( 'static' )
            // Simplegt.g:37:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:38:7: ( 'def' )
            // Simplegt.g:38:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:39:7: ( 'context' )
            // Simplegt.g:39:9: 'context'
            {
            match("context"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:40:7: ( 'metamodel' )
            // Simplegt.g:40:9: 'metamodel'
            {
            match("metamodel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:41:7: ( '::' )
            // Simplegt.g:41:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:42:7: ( '.' )
            // Simplegt.g:42:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:43:7: ( '->' )
            // Simplegt.g:43:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:44:7: ( 'iterate' )
            // Simplegt.g:44:9: 'iterate'
            {
            match("iterate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:45:7: ( '|' )
            // Simplegt.g:45:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:46:7: ( '!' )
            // Simplegt.g:46:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:47:7: ( 'super' )
            // Simplegt.g:47:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:48:7: ( 'self' )
            // Simplegt.g:48:9: 'self'
            {
            match("self"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:49:7: ( 'env' )
            // Simplegt.g:49:9: 'env'
            {
            match("env"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:50:7: ( 'true' )
            // Simplegt.g:50:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:51:7: ( 'false' )
            // Simplegt.g:51:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:52:7: ( '#' )
            // Simplegt.g:52:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:53:7: ( 'OclUndefined' )
            // Simplegt.g:53:9: 'OclUndefined'
            {
            match("OclUndefined"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:54:7: ( 'let' )
            // Simplegt.g:54:9: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:55:7: ( 'if' )
            // Simplegt.g:55:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:56:7: ( 'then' )
            // Simplegt.g:56:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:57:7: ( 'else' )
            // Simplegt.g:57:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:58:7: ( 'endif' )
            // Simplegt.g:58:9: 'endif'
            {
            match("endif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "NOTOP"
    public final void mNOTOP() throws RecognitionException {
        try {
            int _type = NOTOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14161:6: ( 'not' )
            // Simplegt.g:14162:1: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTOP"

    // $ANTLR start "BOOLOP"
    public final void mBOOLOP() throws RecognitionException {
        try {
            int _type = BOOLOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14163:7: ( ( ( 'and' | 'or' | 'xor' | 'implies' ) ) )
            // Simplegt.g:14164:1: ( ( 'and' | 'or' | 'xor' | 'implies' ) )
            {
            // Simplegt.g:14164:1: ( ( 'and' | 'or' | 'xor' | 'implies' ) )
            // Simplegt.g:14164:2: ( 'and' | 'or' | 'xor' | 'implies' )
            {
            // Simplegt.g:14164:2: ( 'and' | 'or' | 'xor' | 'implies' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 'a':
                {
                alt1=1;
                }
                break;
            case 'o':
                {
                alt1=2;
                }
                break;
            case 'x':
                {
                alt1=3;
                }
                break;
            case 'i':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // Simplegt.g:14164:3: 'and'
                    {
                    match("and"); 


                    }
                    break;
                case 2 :
                    // Simplegt.g:14164:9: 'or'
                    {
                    match("or"); 


                    }
                    break;
                case 3 :
                    // Simplegt.g:14164:14: 'xor'
                    {
                    match("xor"); 


                    }
                    break;
                case 4 :
                    // Simplegt.g:14164:20: 'implies'
                    {
                    match("implies"); 


                    }
                    break;

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLOP"

    // $ANTLR start "INTOP"
    public final void mINTOP() throws RecognitionException {
        try {
            int _type = INTOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14166:6: ( ( ( 'div' | 'mod' ) ) )
            // Simplegt.g:14167:1: ( ( 'div' | 'mod' ) )
            {
            // Simplegt.g:14167:1: ( ( 'div' | 'mod' ) )
            // Simplegt.g:14167:2: ( 'div' | 'mod' )
            {
            // Simplegt.g:14167:2: ( 'div' | 'mod' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='d') ) {
                alt2=1;
            }
            else if ( (LA2_0=='m') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // Simplegt.g:14167:3: 'div'
                    {
                    match("div"); 


                    }
                    break;
                case 2 :
                    // Simplegt.g:14167:9: 'mod'
                    {
                    match("mod"); 


                    }
                    break;

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTOP"

    // $ANTLR start "RELOP"
    public final void mRELOP() throws RecognitionException {
        try {
            int _type = RELOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14169:6: ( ( ( '>' | '<' | '>=' | '<=' ) ) )
            // Simplegt.g:14170:1: ( ( '>' | '<' | '>=' | '<=' ) )
            {
            // Simplegt.g:14170:1: ( ( '>' | '<' | '>=' | '<=' ) )
            // Simplegt.g:14170:2: ( '>' | '<' | '>=' | '<=' )
            {
            // Simplegt.g:14170:2: ( '>' | '<' | '>=' | '<=' )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='>') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='=') ) {
                    alt3=3;
                }
                else {
                    alt3=1;}
            }
            else if ( (LA3_0=='<') ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2=='=') ) {
                    alt3=4;
                }
                else {
                    alt3=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // Simplegt.g:14170:3: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // Simplegt.g:14170:7: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // Simplegt.g:14170:11: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 4 :
                    // Simplegt.g:14170:16: '<='
                    {
                    match("<="); 


                    }
                    break;

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RELOP"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14172:3: ( ( '=' ) )
            // Simplegt.g:14173:1: ( '=' )
            {
            // Simplegt.g:14173:1: ( '=' )
            // Simplegt.g:14173:2: '='
            {
            match('='); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "NEQ"
    public final void mNEQ() throws RecognitionException {
        try {
            int _type = NEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14175:4: ( ( '<>' ) )
            // Simplegt.g:14176:1: ( '<>' )
            {
            // Simplegt.g:14176:1: ( '<>' )
            // Simplegt.g:14176:2: '<>'
            {
            match("<>"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEQ"

    // $ANTLR start "ADDOP"
    public final void mADDOP() throws RecognitionException {
        try {
            int _type = ADDOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14178:6: ( ( ( '-' | '+' ) ) )
            // Simplegt.g:14179:1: ( ( '-' | '+' ) )
            {
            // Simplegt.g:14179:1: ( ( '-' | '+' ) )
            // Simplegt.g:14179:2: ( '-' | '+' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ADDOP"

    // $ANTLR start "MULOP"
    public final void mMULOP() throws RecognitionException {
        try {
            int _type = MULOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14181:6: ( ( ( '*' | '/' ) ) )
            // Simplegt.g:14182:1: ( ( '*' | '/' ) )
            {
            // Simplegt.g:14182:1: ( ( '*' | '/' ) )
            // Simplegt.g:14182:2: ( '*' | '/' )
            {
            if ( input.LA(1)=='*'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULOP"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14184:8: ( ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // Simplegt.g:14185:1: ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // Simplegt.g:14185:1: ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // Simplegt.g:14185:2: '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("--"); 

            // Simplegt.g:14185:6: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFE')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Simplegt.g:14185:7: ~ ( '\\n' | '\\r' | '\\uffff' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14188:6: ( ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ ) )
            // Simplegt.g:14189:1: ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ )
            {
            // Simplegt.g:14189:1: ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ )
            // Simplegt.g:14189:2: ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+
            {
            // Simplegt.g:14189:2: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Simplegt.g:14189:2: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // Simplegt.g:14189:6: ( ( '0' .. '9' ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Simplegt.g:14189:7: ( '0' .. '9' )
            	    {
            	    // Simplegt.g:14189:7: ( '0' .. '9' )
            	    // Simplegt.g:14189:8: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            match('.'); 
            // Simplegt.g:14189:22: ( ( '0' .. '9' ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Simplegt.g:14189:23: ( '0' .. '9' )
            	    {
            	    // Simplegt.g:14189:23: ( '0' .. '9' )
            	    // Simplegt.g:14189:24: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14191:8: ( ( ( '-' )? ( ( '0' .. '9' ) )+ ) )
            // Simplegt.g:14192:1: ( ( '-' )? ( ( '0' .. '9' ) )+ )
            {
            // Simplegt.g:14192:1: ( ( '-' )? ( ( '0' .. '9' ) )+ )
            // Simplegt.g:14192:2: ( '-' )? ( ( '0' .. '9' ) )+
            {
            // Simplegt.g:14192:2: ( '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='-') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Simplegt.g:14192:2: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // Simplegt.g:14192:6: ( ( '0' .. '9' ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Simplegt.g:14192:7: ( '0' .. '9' )
            	    {
            	    // Simplegt.g:14192:7: ( '0' .. '9' )
            	    // Simplegt.g:14192:8: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "STRINGTYPE"
    public final void mSTRINGTYPE() throws RecognitionException {
        try {
            int _type = STRINGTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14194:11: ( ( 'String' ) )
            // Simplegt.g:14195:1: ( 'String' )
            {
            // Simplegt.g:14195:1: ( 'String' )
            // Simplegt.g:14195:2: 'String'
            {
            match("String"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRINGTYPE"

    // $ANTLR start "BOOLEANTYPE"
    public final void mBOOLEANTYPE() throws RecognitionException {
        try {
            int _type = BOOLEANTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14197:12: ( ( 'Boolean' ) )
            // Simplegt.g:14198:1: ( 'Boolean' )
            {
            // Simplegt.g:14198:1: ( 'Boolean' )
            // Simplegt.g:14198:2: 'Boolean'
            {
            match("Boolean"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLEANTYPE"

    // $ANTLR start "INTEGERTYPE"
    public final void mINTEGERTYPE() throws RecognitionException {
        try {
            int _type = INTEGERTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14200:12: ( ( 'Integer' ) )
            // Simplegt.g:14201:1: ( 'Integer' )
            {
            // Simplegt.g:14201:1: ( 'Integer' )
            // Simplegt.g:14201:2: 'Integer'
            {
            match("Integer"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGERTYPE"

    // $ANTLR start "REALTYPE"
    public final void mREALTYPE() throws RecognitionException {
        try {
            int _type = REALTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14203:9: ( ( 'Real' ) )
            // Simplegt.g:14204:1: ( 'Real' )
            {
            // Simplegt.g:14204:1: ( 'Real' )
            // Simplegt.g:14204:2: 'Real'
            {
            match("Real"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REALTYPE"

    // $ANTLR start "COLLECTIONTYPE"
    public final void mCOLLECTIONTYPE() throws RecognitionException {
        try {
            int _type = COLLECTIONTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14206:15: ( ( 'Collection' ) )
            // Simplegt.g:14207:1: ( 'Collection' )
            {
            // Simplegt.g:14207:1: ( 'Collection' )
            // Simplegt.g:14207:2: 'Collection'
            {
            match("Collection"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLLECTIONTYPE"

    // $ANTLR start "BAGTYPE"
    public final void mBAGTYPE() throws RecognitionException {
        try {
            int _type = BAGTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14209:8: ( 'Bag' )
            // Simplegt.g:14210:1: 'Bag'
            {
            match("Bag"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BAGTYPE"

    // $ANTLR start "ORDEREDSETTYPE"
    public final void mORDEREDSETTYPE() throws RecognitionException {
        try {
            int _type = ORDEREDSETTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14211:15: ( 'OrderedSet' )
            // Simplegt.g:14212:1: 'OrderedSet'
            {
            match("OrderedSet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ORDEREDSETTYPE"

    // $ANTLR start "SEQUENCETYPE"
    public final void mSEQUENCETYPE() throws RecognitionException {
        try {
            int _type = SEQUENCETYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14213:13: ( 'Sequence' )
            // Simplegt.g:14214:1: 'Sequence'
            {
            match("Sequence"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEQUENCETYPE"

    // $ANTLR start "SETTYPE"
    public final void mSETTYPE() throws RecognitionException {
        try {
            int _type = SETTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14215:8: ( 'Set' )
            // Simplegt.g:14216:1: 'Set'
            {
            match("Set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SETTYPE"

    // $ANTLR start "OCLANYTYPE"
    public final void mOCLANYTYPE() throws RecognitionException {
        try {
            int _type = OCLANYTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14217:11: ( ( 'OclAny' ) )
            // Simplegt.g:14218:1: ( 'OclAny' )
            {
            // Simplegt.g:14218:1: ( 'OclAny' )
            // Simplegt.g:14218:2: 'OclAny'
            {
            match("OclAny"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OCLANYTYPE"

    // $ANTLR start "OCLTYPE"
    public final void mOCLTYPE() throws RecognitionException {
        try {
            int _type = OCLTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14220:8: ( ( 'OclType' ) )
            // Simplegt.g:14221:1: ( 'OclType' )
            {
            // Simplegt.g:14221:1: ( 'OclType' )
            // Simplegt.g:14221:2: 'OclType'
            {
            match("OclType"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OCLTYPE"

    // $ANTLR start "TUPLETYPE"
    public final void mTUPLETYPE() throws RecognitionException {
        try {
            int _type = TUPLETYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14223:10: ( ( 'TupleType' ) )
            // Simplegt.g:14224:1: ( 'TupleType' )
            {
            // Simplegt.g:14224:1: ( 'TupleType' )
            // Simplegt.g:14224:2: 'TupleType'
            {
            match("TupleType"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TUPLETYPE"

    // $ANTLR start "TUPLE"
    public final void mTUPLE() throws RecognitionException {
        try {
            int _type = TUPLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14226:6: ( 'Tuple' )
            // Simplegt.g:14227:1: 'Tuple'
            {
            match("Tuple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TUPLE"

    // $ANTLR start "MAPTYPE"
    public final void mMAPTYPE() throws RecognitionException {
        try {
            int _type = MAPTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14228:8: ( 'Map' )
            // Simplegt.g:14229:1: 'Map'
            {
            match("Map"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAPTYPE"

    // $ANTLR start "LAMBDATYPE"
    public final void mLAMBDATYPE() throws RecognitionException {
        try {
            int _type = LAMBDATYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14230:11: ( ( 'Lambda' ) )
            // Simplegt.g:14231:1: ( 'Lambda' )
            {
            // Simplegt.g:14231:1: ( 'Lambda' )
            // Simplegt.g:14231:2: 'Lambda'
            {
            match("Lambda"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LAMBDATYPE"

    // $ANTLR start "ENVTYPE"
    public final void mENVTYPE() throws RecognitionException {
        try {
            int _type = ENVTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14233:8: ( ( 'Env' ) )
            // Simplegt.g:14234:1: ( 'Env' )
            {
            // Simplegt.g:14234:1: ( 'Env' )
            // Simplegt.g:14234:2: 'Env'
            {
            match("Env"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENVTYPE"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14236:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )* ) )
            // Simplegt.g:14237:1: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )* )
            {
            // Simplegt.g:14237:1: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )* )
            // Simplegt.g:14237:2: ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Simplegt.g:14237:21: ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )*
            loop10:
            do {
                int alt10=4;
                switch ( input.LA(1) ) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt10=1;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt10=2;
                    }
                    break;
                case '_':
                    {
                    alt10=3;
                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // Simplegt.g:14237:22: ( 'A' .. 'Z' | 'a' .. 'z' )
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // Simplegt.g:14237:42: ( '0' .. '9' )
            	    {
            	    // Simplegt.g:14237:42: ( '0' .. '9' )
            	    // Simplegt.g:14237:43: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // Simplegt.g:14237:53: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14239:10: ( ( ( '\\r\\n' | '\\'r' | '\\n' ) ) )
            // Simplegt.g:14240:1: ( ( '\\r\\n' | '\\'r' | '\\n' ) )
            {
            // Simplegt.g:14240:1: ( ( '\\r\\n' | '\\'r' | '\\n' ) )
            // Simplegt.g:14240:2: ( '\\r\\n' | '\\'r' | '\\n' )
            {
            // Simplegt.g:14240:2: ( '\\r\\n' | '\\'r' | '\\n' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case '\r':
                {
                alt11=1;
                }
                break;
            case '\'':
                {
                alt11=2;
                }
                break;
            case '\n':
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // Simplegt.g:14240:3: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 2 :
                    // Simplegt.g:14240:10: '\\'r'
                    {
                    match("'r"); 


                    }
                    break;
                case 3 :
                    // Simplegt.g:14240:16: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINEBREAK"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14243:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Simplegt.g:14244:1: ( ( ' ' | '\\t' | '\\f' ) )
            {
            // Simplegt.g:14244:1: ( ( ' ' | '\\t' | '\\f' ) )
            // Simplegt.g:14244:2: ( ' ' | '\\t' | '\\f' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "QUOTED_34_34_92"
    public final void mQUOTED_34_34_92() throws RecognitionException {
        try {
            int _type = QUOTED_34_34_92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14247:16: ( ( ( '\"' ) ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | ~ ( '\"' | '\\\\' ) )* ( '\"' ) ) )
            // Simplegt.g:14248:1: ( ( '\"' ) ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | ~ ( '\"' | '\\\\' ) )* ( '\"' ) )
            {
            // Simplegt.g:14248:1: ( ( '\"' ) ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | ~ ( '\"' | '\\\\' ) )* ( '\"' ) )
            // Simplegt.g:14248:2: ( '\"' ) ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | ~ ( '\"' | '\\\\' ) )* ( '\"' )
            {
            // Simplegt.g:14248:2: ( '\"' )
            // Simplegt.g:14248:3: '\"'
            {
            match('\"'); 

            }

            // Simplegt.g:14248:7: ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | ~ ( '\"' | '\\\\' ) )*
            loop12:
            do {
                int alt12=4;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\\') ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2=='\"') ) {
                        alt12=1;
                    }
                    else if ( (LA12_2=='\\') ) {
                        alt12=2;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                    alt12=3;
                }


                switch (alt12) {
            	case 1 :
            	    // Simplegt.g:14248:8: ( '\\\\' '\"' )
            	    {
            	    // Simplegt.g:14248:8: ( '\\\\' '\"' )
            	    // Simplegt.g:14248:9: '\\\\' '\"'
            	    {
            	    match('\\'); 
            	    match('\"'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // Simplegt.g:14248:18: ( '\\\\' '\\\\' )
            	    {
            	    // Simplegt.g:14248:18: ( '\\\\' '\\\\' )
            	    // Simplegt.g:14248:19: '\\\\' '\\\\'
            	    {
            	    match('\\'); 
            	    match('\\'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // Simplegt.g:14248:29: ~ ( '\"' | '\\\\' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // Simplegt.g:14248:42: ( '\"' )
            // Simplegt.g:14248:43: '\"'
            {
            match('\"'); 

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTED_34_34_92"

    // $ANTLR start "QUOTED_39_39_92"
    public final void mQUOTED_39_39_92() throws RecognitionException {
        try {
            int _type = QUOTED_39_39_92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:14250:16: ( ( ( '\\'' ) ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | ~ ( '\\'' | '\\\\' ) )* ( '\\'' ) ) )
            // Simplegt.g:14251:1: ( ( '\\'' ) ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | ~ ( '\\'' | '\\\\' ) )* ( '\\'' ) )
            {
            // Simplegt.g:14251:1: ( ( '\\'' ) ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | ~ ( '\\'' | '\\\\' ) )* ( '\\'' ) )
            // Simplegt.g:14251:2: ( '\\'' ) ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | ~ ( '\\'' | '\\\\' ) )* ( '\\'' )
            {
            // Simplegt.g:14251:2: ( '\\'' )
            // Simplegt.g:14251:3: '\\''
            {
            match('\''); 

            }

            // Simplegt.g:14251:8: ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | ~ ( '\\'' | '\\\\' ) )*
            loop13:
            do {
                int alt13=4;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='\\') ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2=='\'') ) {
                        alt13=1;
                    }
                    else if ( (LA13_2=='\\') ) {
                        alt13=2;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                    alt13=3;
                }


                switch (alt13) {
            	case 1 :
            	    // Simplegt.g:14251:9: ( '\\\\' '\\'' )
            	    {
            	    // Simplegt.g:14251:9: ( '\\\\' '\\'' )
            	    // Simplegt.g:14251:10: '\\\\' '\\''
            	    {
            	    match('\\'); 
            	    match('\''); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // Simplegt.g:14251:20: ( '\\\\' '\\\\' )
            	    {
            	    // Simplegt.g:14251:20: ( '\\\\' '\\\\' )
            	    // Simplegt.g:14251:21: '\\\\' '\\\\'
            	    {
            	    match('\\'); 
            	    match('\\'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // Simplegt.g:14251:31: ~ ( '\\'' | '\\\\' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // Simplegt.g:14251:45: ( '\\'' )
            // Simplegt.g:14251:46: '\\''
            {
            match('\''); 

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTED_39_39_92"

    public void mTokens() throws RecognitionException {
        // Simplegt.g:1:8: ( T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | NOTOP | BOOLOP | INTOP | RELOP | EQ | NEQ | ADDOP | MULOP | COMMENT | FLOAT | INTEGER | STRINGTYPE | BOOLEANTYPE | INTEGERTYPE | REALTYPE | COLLECTIONTYPE | BAGTYPE | ORDEREDSETTYPE | SEQUENCETYPE | SETTYPE | OCLANYTYPE | OCLTYPE | TUPLETYPE | TUPLE | MAPTYPE | LAMBDATYPE | ENVTYPE | TEXT | LINEBREAK | WHITESPACE | QUOTED_34_34_92 | QUOTED_39_39_92 )
        int alt14=75;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // Simplegt.g:1:10: T__36
                {
                mT__36(); 

                }
                break;
            case 2 :
                // Simplegt.g:1:16: T__37
                {
                mT__37(); 

                }
                break;
            case 3 :
                // Simplegt.g:1:22: T__38
                {
                mT__38(); 

                }
                break;
            case 4 :
                // Simplegt.g:1:28: T__39
                {
                mT__39(); 

                }
                break;
            case 5 :
                // Simplegt.g:1:34: T__40
                {
                mT__40(); 

                }
                break;
            case 6 :
                // Simplegt.g:1:40: T__41
                {
                mT__41(); 

                }
                break;
            case 7 :
                // Simplegt.g:1:46: T__42
                {
                mT__42(); 

                }
                break;
            case 8 :
                // Simplegt.g:1:52: T__43
                {
                mT__43(); 

                }
                break;
            case 9 :
                // Simplegt.g:1:58: T__44
                {
                mT__44(); 

                }
                break;
            case 10 :
                // Simplegt.g:1:64: T__45
                {
                mT__45(); 

                }
                break;
            case 11 :
                // Simplegt.g:1:70: T__46
                {
                mT__46(); 

                }
                break;
            case 12 :
                // Simplegt.g:1:76: T__47
                {
                mT__47(); 

                }
                break;
            case 13 :
                // Simplegt.g:1:82: T__48
                {
                mT__48(); 

                }
                break;
            case 14 :
                // Simplegt.g:1:88: T__49
                {
                mT__49(); 

                }
                break;
            case 15 :
                // Simplegt.g:1:94: T__50
                {
                mT__50(); 

                }
                break;
            case 16 :
                // Simplegt.g:1:100: T__51
                {
                mT__51(); 

                }
                break;
            case 17 :
                // Simplegt.g:1:106: T__52
                {
                mT__52(); 

                }
                break;
            case 18 :
                // Simplegt.g:1:112: T__53
                {
                mT__53(); 

                }
                break;
            case 19 :
                // Simplegt.g:1:118: T__54
                {
                mT__54(); 

                }
                break;
            case 20 :
                // Simplegt.g:1:124: T__55
                {
                mT__55(); 

                }
                break;
            case 21 :
                // Simplegt.g:1:130: T__56
                {
                mT__56(); 

                }
                break;
            case 22 :
                // Simplegt.g:1:136: T__57
                {
                mT__57(); 

                }
                break;
            case 23 :
                // Simplegt.g:1:142: T__58
                {
                mT__58(); 

                }
                break;
            case 24 :
                // Simplegt.g:1:148: T__59
                {
                mT__59(); 

                }
                break;
            case 25 :
                // Simplegt.g:1:154: T__60
                {
                mT__60(); 

                }
                break;
            case 26 :
                // Simplegt.g:1:160: T__61
                {
                mT__61(); 

                }
                break;
            case 27 :
                // Simplegt.g:1:166: T__62
                {
                mT__62(); 

                }
                break;
            case 28 :
                // Simplegt.g:1:172: T__63
                {
                mT__63(); 

                }
                break;
            case 29 :
                // Simplegt.g:1:178: T__64
                {
                mT__64(); 

                }
                break;
            case 30 :
                // Simplegt.g:1:184: T__65
                {
                mT__65(); 

                }
                break;
            case 31 :
                // Simplegt.g:1:190: T__66
                {
                mT__66(); 

                }
                break;
            case 32 :
                // Simplegt.g:1:196: T__67
                {
                mT__67(); 

                }
                break;
            case 33 :
                // Simplegt.g:1:202: T__68
                {
                mT__68(); 

                }
                break;
            case 34 :
                // Simplegt.g:1:208: T__69
                {
                mT__69(); 

                }
                break;
            case 35 :
                // Simplegt.g:1:214: T__70
                {
                mT__70(); 

                }
                break;
            case 36 :
                // Simplegt.g:1:220: T__71
                {
                mT__71(); 

                }
                break;
            case 37 :
                // Simplegt.g:1:226: T__72
                {
                mT__72(); 

                }
                break;
            case 38 :
                // Simplegt.g:1:232: T__73
                {
                mT__73(); 

                }
                break;
            case 39 :
                // Simplegt.g:1:238: T__74
                {
                mT__74(); 

                }
                break;
            case 40 :
                // Simplegt.g:1:244: T__75
                {
                mT__75(); 

                }
                break;
            case 41 :
                // Simplegt.g:1:250: T__76
                {
                mT__76(); 

                }
                break;
            case 42 :
                // Simplegt.g:1:256: T__77
                {
                mT__77(); 

                }
                break;
            case 43 :
                // Simplegt.g:1:262: T__78
                {
                mT__78(); 

                }
                break;
            case 44 :
                // Simplegt.g:1:268: NOTOP
                {
                mNOTOP(); 

                }
                break;
            case 45 :
                // Simplegt.g:1:274: BOOLOP
                {
                mBOOLOP(); 

                }
                break;
            case 46 :
                // Simplegt.g:1:281: INTOP
                {
                mINTOP(); 

                }
                break;
            case 47 :
                // Simplegt.g:1:287: RELOP
                {
                mRELOP(); 

                }
                break;
            case 48 :
                // Simplegt.g:1:293: EQ
                {
                mEQ(); 

                }
                break;
            case 49 :
                // Simplegt.g:1:296: NEQ
                {
                mNEQ(); 

                }
                break;
            case 50 :
                // Simplegt.g:1:300: ADDOP
                {
                mADDOP(); 

                }
                break;
            case 51 :
                // Simplegt.g:1:306: MULOP
                {
                mMULOP(); 

                }
                break;
            case 52 :
                // Simplegt.g:1:312: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 53 :
                // Simplegt.g:1:320: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 54 :
                // Simplegt.g:1:326: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 55 :
                // Simplegt.g:1:334: STRINGTYPE
                {
                mSTRINGTYPE(); 

                }
                break;
            case 56 :
                // Simplegt.g:1:345: BOOLEANTYPE
                {
                mBOOLEANTYPE(); 

                }
                break;
            case 57 :
                // Simplegt.g:1:357: INTEGERTYPE
                {
                mINTEGERTYPE(); 

                }
                break;
            case 58 :
                // Simplegt.g:1:369: REALTYPE
                {
                mREALTYPE(); 

                }
                break;
            case 59 :
                // Simplegt.g:1:378: COLLECTIONTYPE
                {
                mCOLLECTIONTYPE(); 

                }
                break;
            case 60 :
                // Simplegt.g:1:393: BAGTYPE
                {
                mBAGTYPE(); 

                }
                break;
            case 61 :
                // Simplegt.g:1:401: ORDEREDSETTYPE
                {
                mORDEREDSETTYPE(); 

                }
                break;
            case 62 :
                // Simplegt.g:1:416: SEQUENCETYPE
                {
                mSEQUENCETYPE(); 

                }
                break;
            case 63 :
                // Simplegt.g:1:429: SETTYPE
                {
                mSETTYPE(); 

                }
                break;
            case 64 :
                // Simplegt.g:1:437: OCLANYTYPE
                {
                mOCLANYTYPE(); 

                }
                break;
            case 65 :
                // Simplegt.g:1:448: OCLTYPE
                {
                mOCLTYPE(); 

                }
                break;
            case 66 :
                // Simplegt.g:1:456: TUPLETYPE
                {
                mTUPLETYPE(); 

                }
                break;
            case 67 :
                // Simplegt.g:1:466: TUPLE
                {
                mTUPLE(); 

                }
                break;
            case 68 :
                // Simplegt.g:1:472: MAPTYPE
                {
                mMAPTYPE(); 

                }
                break;
            case 69 :
                // Simplegt.g:1:480: LAMBDATYPE
                {
                mLAMBDATYPE(); 

                }
                break;
            case 70 :
                // Simplegt.g:1:491: ENVTYPE
                {
                mENVTYPE(); 

                }
                break;
            case 71 :
                // Simplegt.g:1:499: TEXT
                {
                mTEXT(); 

                }
                break;
            case 72 :
                // Simplegt.g:1:504: LINEBREAK
                {
                mLINEBREAK(); 

                }
                break;
            case 73 :
                // Simplegt.g:1:514: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 74 :
                // Simplegt.g:1:525: QUOTED_34_34_92
                {
                mQUOTED_34_34_92(); 

                }
                break;
            case 75 :
                // Simplegt.g:1:541: QUOTED_39_39_92
                {
                mQUOTED_39_39_92(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\2\55\1\uffff\1\55\1\uffff\4\55\2\uffff\1\55\1\103\1\55"+
        "\2\uffff\1\111\3\55\1\uffff\1\41\3\uffff\5\55\1\uffff\1\37\2\uffff"+
        "\1\131\11\55\5\uffff\5\55\1\156\12\55\2\uffff\1\172\2\55\1\175\1"+
        "\177\1\uffff\5\55\2\uffff\4\55\1\u0089\1\55\3\uffff\13\55\1\56\1"+
        "\uffff\1\u0098\2\55\1\u009b\1\u0098\2\55\1\uffff\2\55\1\u0089\3"+
        "\55\1\u00a3\4\55\1\uffff\2\55\3\uffff\7\55\1\u00b4\1\u00b5\1\uffff"+
        "\1\u0089\2\55\1\u00b8\1\55\1\u00ba\4\55\1\u00bf\1\55\1\u00c1\1\55"+
        "\1\uffff\2\55\1\uffff\1\55\1\u00c6\1\u00c7\2\55\1\u00ca\1\55\1\uffff"+
        "\1\55\1\u00cd\1\u00ce\7\55\1\u00d6\5\55\2\uffff\2\55\1\uffff\1\55"+
        "\1\uffff\1\55\1\u00e0\2\55\1\uffff\1\55\1\uffff\2\55\1\u00e6\1\55"+
        "\2\uffff\2\55\1\uffff\1\55\1\u00eb\2\uffff\1\u00ec\5\55\1\u00f2"+
        "\1\uffff\11\55\1\uffff\1\55\1\u00fe\1\55\1\u0100\1\55\1\uffff\2"+
        "\55\1\u0104\1\55\2\uffff\1\u0106\2\55\1\u0109\1\u010a\1\uffff\2"+
        "\55\1\u010d\2\55\1\u0110\5\55\1\uffff\1\u0116\1\uffff\3\55\1\uffff"+
        "\1\u011a\1\uffff\1\u0089\1\u011b\2\uffff\1\u011c\1\55\1\uffff\1"+
        "\u011e\1\55\1\uffff\1\55\1\u0121\1\u0122\2\55\1\uffff\2\55\1\u0127"+
        "\3\uffff\1\55\1\uffff\1\55\1\u012a\2\uffff\2\55\1\u012d\1\u012e"+
        "\1\uffff\2\55\1\uffff\1\55\1\u0132\2\uffff\1\55\1\u0134\1\u0135"+
        "\1\uffff\1\55\2\uffff\1\u0137\1\uffff";
    static final String DFA14_eofS =
        "\u0138\uffff";
    static final String DFA14_minS =
        "\1\11\2\145\1\uffff\1\150\1\uffff\1\142\1\156\1\165\1\154\2\uffff"+
        "\1\141\1\72\1\146\2\uffff\1\176\2\145\1\157\1\uffff\1\55\3\uffff"+
        "\1\143\1\145\1\157\1\162\1\157\1\uffff\1\76\2\uffff\1\56\1\145\1"+
        "\141\1\156\1\145\1\157\1\165\2\141\1\156\2\uffff\1\0\2\uffff\1\144"+
        "\1\164\1\142\1\166\1\141\1\60\1\145\1\163\1\144\1\151\1\154\1\164"+
        "\1\144\1\163\1\157\1\154\2\uffff\1\60\1\160\1\145\1\60\1\174\1\uffff"+
        "\1\146\1\141\1\160\1\154\1\156\2\uffff\1\154\1\144\2\164\1\60\1"+
        "\162\3\uffff\1\162\1\161\1\157\1\147\1\164\1\141\1\154\2\160\1\155"+
        "\1\166\1\0\1\uffff\1\60\1\141\1\165\2\60\1\156\1\145\1\uffff\1\156"+
        "\1\164\1\60\1\161\2\145\1\60\1\151\1\145\1\155\1\163\1\uffff\1\154"+
        "\1\162\3\uffff\1\157\1\164\1\145\1\146\1\164\1\101\1\145\2\60\1"+
        "\uffff\1\60\1\151\1\165\1\60\1\154\1\60\1\145\3\154\1\60\1\142\1"+
        "\60\1\154\1\uffff\1\155\1\147\1\uffff\1\163\2\60\1\162\1\165\1\60"+
        "\1\156\1\uffff\1\146\2\60\1\145\1\162\1\151\1\141\1\162\1\151\1"+
        "\162\1\60\1\145\2\156\1\171\1\162\2\uffff\1\156\1\145\1\uffff\1"+
        "\145\1\uffff\1\147\1\60\2\145\1\uffff\1\144\1\uffff\1\145\1\157"+
        "\1\60\1\146\2\uffff\1\141\1\145\1\uffff\1\144\1\60\2\uffff\1\60"+
        "\1\164\1\145\1\164\1\145\1\143\1\60\1\uffff\1\170\1\144\1\171\1"+
        "\160\1\145\1\147\1\156\1\141\1\145\1\uffff\1\143\1\60\1\141\1\60"+
        "\1\144\1\uffff\1\157\1\143\1\60\1\163\2\uffff\1\60\1\163\1\145\2"+
        "\60\1\uffff\1\164\1\145\1\60\1\145\1\144\1\60\1\143\1\156\1\162"+
        "\1\164\1\171\1\uffff\1\60\1\uffff\1\145\1\162\1\164\1\uffff\1\60"+
        "\1\uffff\2\60\2\uffff\1\60\1\146\1\uffff\1\60\1\123\1\uffff\1\145"+
        "\2\60\1\151\1\160\1\uffff\1\154\1\155\1\60\3\uffff\1\151\1\uffff"+
        "\1\145\1\60\2\uffff\1\157\1\145\2\60\1\uffff\1\156\1\164\1\uffff"+
        "\1\156\1\60\2\uffff\1\145\2\60\1\uffff\1\144\2\uffff\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\175\1\157\1\151\1\uffff\1\162\1\uffff\2\156\1\165\1\170\2\uffff"+
        "\1\162\1\72\1\164\2\uffff\1\176\1\145\1\165\1\157\1\uffff\1\76\3"+
        "\uffff\1\162\1\145\1\157\1\162\1\157\1\uffff\1\76\2\uffff\1\71\1"+
        "\164\1\157\1\156\1\145\1\157\1\165\2\141\1\156\2\uffff\1\uffff\2"+
        "\uffff\1\144\1\164\1\146\1\166\1\165\1\172\1\145\1\163\1\144\1\151"+
        "\1\154\1\164\1\166\1\163\1\157\1\154\2\uffff\1\172\1\160\1\145\1"+
        "\172\1\174\1\uffff\1\146\1\141\1\160\1\154\1\156\2\uffff\1\154\1"+
        "\144\2\164\1\172\1\162\3\uffff\1\162\1\164\1\157\1\147\1\164\1\141"+
        "\1\154\2\160\1\155\1\166\1\uffff\1\uffff\1\172\1\141\1\165\2\172"+
        "\1\156\1\145\1\uffff\1\156\1\164\1\172\1\161\2\145\1\172\1\151\1"+
        "\145\1\155\1\163\1\uffff\1\157\1\162\3\uffff\1\157\1\164\1\145\1"+
        "\146\1\164\1\125\1\145\2\172\1\uffff\1\172\1\151\1\165\1\172\1\154"+
        "\1\172\1\145\3\154\1\172\1\142\1\172\1\154\1\uffff\1\155\1\147\1"+
        "\uffff\1\163\2\172\1\162\1\165\1\172\1\156\1\uffff\1\146\2\172\1"+
        "\145\1\162\1\151\1\141\1\162\1\151\1\162\1\172\1\145\2\156\1\171"+
        "\1\162\2\uffff\1\156\1\145\1\uffff\1\145\1\uffff\1\147\1\172\2\145"+
        "\1\uffff\1\144\1\uffff\1\145\1\157\1\172\1\146\2\uffff\1\141\1\145"+
        "\1\uffff\1\144\1\172\2\uffff\1\172\1\164\1\145\1\164\1\145\1\143"+
        "\1\172\1\uffff\1\170\1\144\1\171\1\160\1\145\1\147\1\156\1\141\1"+
        "\145\1\uffff\1\143\1\172\1\141\1\172\1\144\1\uffff\1\157\1\143\1"+
        "\172\1\163\2\uffff\1\172\1\163\1\145\2\172\1\uffff\1\164\1\145\1"+
        "\172\1\145\1\144\1\172\1\143\1\156\1\162\1\164\1\171\1\uffff\1\172"+
        "\1\uffff\1\145\1\162\1\164\1\uffff\1\172\1\uffff\2\172\2\uffff\1"+
        "\172\1\146\1\uffff\1\172\1\123\1\uffff\1\145\2\172\1\151\1\160\1"+
        "\uffff\1\154\1\155\1\172\3\uffff\1\151\1\uffff\1\145\1\172\2\uffff"+
        "\1\157\1\145\2\172\1\uffff\1\156\1\164\1\uffff\1\156\1\172\2\uffff"+
        "\1\145\2\172\1\uffff\1\144\2\uffff\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\3\uffff\1\3\1\uffff\1\5\4\uffff\1\12\1\13\3\uffff\1\17\1\20\4\uffff"+
        "\1\33\1\uffff\1\36\1\37\1\45\5\uffff\1\57\1\uffff\1\62\1\63\12\uffff"+
        "\1\107\1\110\1\uffff\1\111\1\112\20\uffff\1\32\1\15\5\uffff\1\60"+
        "\5\uffff\1\34\1\64\6\uffff\1\61\1\65\1\66\14\uffff\1\113\7\uffff"+
        "\1\23\13\uffff\1\16\2\uffff\1\50\1\21\1\22\11\uffff\1\55\16\uffff"+
        "\1\56\2\uffff\1\27\7\uffff\1\42\20\uffff\1\47\1\54\2\uffff\1\77"+
        "\1\uffff\1\74\4\uffff\1\104\1\uffff\1\106\4\uffff\1\43\1\51\2\uffff"+
        "\1\10\2\uffff\1\52\1\14\7\uffff\1\41\11\uffff\1\72\5\uffff\1\2\4"+
        "\uffff\1\53\1\44\5\uffff\1\40\13\uffff\1\103\1\uffff\1\1\3\uffff"+
        "\1\7\1\uffff\1\25\2\uffff\1\24\1\26\2\uffff\1\100\2\uffff\1\67\5"+
        "\uffff\1\105\3\uffff\1\11\1\35\1\30\1\uffff\1\101\2\uffff\1\70\1"+
        "\71\4\uffff\1\6\2\uffff\1\76\2\uffff\1\31\1\4\3\uffff\1\102\1\uffff"+
        "\1\75\1\73\1\uffff\1\46";
    static final String DFA14_specialS =
        "\57\uffff\1\0\65\uffff\1\1\u00d2\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\60\1\56\1\uffff\1\60\1\56\22\uffff\1\60\1\30\1\61\1\31\3"+
            "\uffff\1\57\1\17\1\20\1\42\1\41\1\5\1\26\1\25\1\42\12\43\1\15"+
            "\1\3\1\40\1\21\1\37\2\uffff\1\55\1\45\1\50\1\55\1\54\3\55\1"+
            "\46\2\55\1\53\1\52\1\55\1\32\2\55\1\47\1\44\1\51\6\55\6\uffff"+
            "\1\6\1\22\1\24\1\2\1\11\1\14\2\55\1\16\2\55\1\33\1\1\1\34\1"+
            "\35\2\55\1\10\1\23\1\4\1\7\2\55\1\36\2\55\1\12\1\27\1\13",
            "\1\63\11\uffff\1\62",
            "\1\64\3\uffff\1\65",
            "",
            "\1\70\6\uffff\1\67\2\uffff\1\66",
            "",
            "\1\71\13\uffff\1\72",
            "\1\73",
            "\1\74",
            "\1\77\1\uffff\1\76\11\uffff\1\75",
            "",
            "",
            "\1\101\20\uffff\1\100",
            "\1\102",
            "\1\107\6\uffff\1\105\1\104\5\uffff\1\106",
            "",
            "",
            "\1\110",
            "\1\112",
            "\1\115\16\uffff\1\113\1\114",
            "\1\116",
            "",
            "\1\120\2\uffff\12\43\4\uffff\1\117",
            "",
            "",
            "",
            "\1\121\16\uffff\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "\1\127",
            "",
            "",
            "\1\130\1\uffff\12\43",
            "\1\133\16\uffff\1\132",
            "\1\135\15\uffff\1\134",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "",
            "",
            "\162\146\1\145\uff8d\146",
            "",
            "",
            "\1\147",
            "\1\150",
            "\1\151\3\uffff\1\152",
            "\1\153",
            "\1\154\23\uffff\1\155",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\166\21\uffff\1\165",
            "\1\167",
            "\1\170",
            "\1\171",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\173",
            "\1\174",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\176",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "",
            "",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u008a",
            "",
            "",
            "",
            "\1\u008b",
            "\1\u008c\2\uffff\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\0\146",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\24\55\1\u0097\5\55",
            "\1\u0099",
            "\1\u009a",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u009c",
            "\1\u009d",
            "",
            "\1\u009e",
            "\1\u009f",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "",
            "\1\u00a9\2\uffff\1\u00a8",
            "\1\u00aa",
            "",
            "",
            "",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b1\22\uffff\1\u00b2\1\u00b0",
            "\1\u00b3",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00b6",
            "\1\u00b7",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00b9",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00c0",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00c2",
            "",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "\1\u00c5",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00c8",
            "\1\u00c9",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00cb",
            "",
            "\1\u00cc",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "",
            "\1\u00de",
            "",
            "\1\u00df",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "\1\u00e3",
            "",
            "\1\u00e4",
            "\1\u00e5",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e7",
            "",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "",
            "\1\u00ea",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "",
            "\1\u00fc",
            "\12\55\7\uffff\23\55\1\u00fd\6\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00ff",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0101",
            "",
            "\1\u0102",
            "\1\u0103",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0105",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0107",
            "\1\u0108",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u010b",
            "\1\u010c",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u010e",
            "\1\u010f",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u011d",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u011f",
            "",
            "\1\u0120",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0123",
            "\1\u0124",
            "",
            "\1\u0125",
            "\1\u0126",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "\1\u0128",
            "",
            "\1\u0129",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\u012b",
            "\1\u012c",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u012f",
            "\1\u0130",
            "",
            "\1\u0131",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\u0133",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u0136",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | NOTOP | BOOLOP | INTOP | RELOP | EQ | NEQ | ADDOP | MULOP | COMMENT | FLOAT | INTEGER | STRINGTYPE | BOOLEANTYPE | INTEGERTYPE | REALTYPE | COLLECTIONTYPE | BAGTYPE | ORDEREDSETTYPE | SEQUENCETYPE | SETTYPE | OCLANYTYPE | OCLTYPE | TUPLETYPE | TUPLE | MAPTYPE | LAMBDATYPE | ENVTYPE | TEXT | LINEBREAK | WHITESPACE | QUOTED_34_34_92 | QUOTED_39_39_92 );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_47 = input.LA(1);

                        s = -1;
                        if ( (LA14_47=='r') ) {s = 101;}

                        else if ( ((LA14_47>='\u0000' && LA14_47<='q')||(LA14_47>='s' && LA14_47<='\uFFFF')) ) {s = 102;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_101 = input.LA(1);

                        s = -1;
                        if ( ((LA14_101>='\u0000' && LA14_101<='\uFFFF')) ) {s = 102;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}