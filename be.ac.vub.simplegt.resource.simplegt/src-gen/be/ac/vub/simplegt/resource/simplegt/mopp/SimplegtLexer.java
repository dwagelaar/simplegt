// $ANTLR ${project.version} ${buildNumber}

	package be.ac.vub.simplegt.resource.simplegt.mopp;


import org.antlr.runtime3_3_0.*;

public class SimplegtLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__34=34;
    public static final int T__35=35;
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
    public static final int TUPLETYPE=18;
    public static final int MAPTYPE=19;
    public static final int LAMBDATYPE=20;
    public static final int ENVTYPE=21;
    public static final int BOOLOP=22;
    public static final int NEQ=23;
    public static final int RELOP=24;
    public static final int ADDOP=25;
    public static final int INTOP=26;
    public static final int MULOP=27;
    public static final int NOTOP=28;
    public static final int FLOAT=29;
    public static final int INTEGER=30;
    public static final int COMMENT=31;
    public static final int LINEBREAK=32;
    public static final int WHITESPACE=33;

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

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
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
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
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
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
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
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:22:7: ( 'rule' )
            // Simplegt.g:22:9: 'rule'
            {
            match("rule"); 


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
            // Simplegt.g:23:7: ( 'extends' )
            // Simplegt.g:23:9: 'extends'
            {
            match("extends"); 


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
            // Simplegt.g:24:7: ( '{' )
            // Simplegt.g:24:9: '{'
            {
            match('{'); 

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
            // Simplegt.g:25:7: ( '}' )
            // Simplegt.g:25:9: '}'
            {
            match('}'); 

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
            // Simplegt.g:26:7: ( 'from' )
            // Simplegt.g:26:9: 'from'
            {
            match("from"); 


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
            // Simplegt.g:27:7: ( ':' )
            // Simplegt.g:27:9: ':'
            {
            match(':'); 

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
            // Simplegt.g:28:7: ( 'in' )
            // Simplegt.g:28:9: 'in'
            {
            match("in"); 


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
            // Simplegt.g:29:7: ( '(' )
            // Simplegt.g:29:9: '('
            {
            match('('); 

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
            // Simplegt.g:30:7: ( ')' )
            // Simplegt.g:30:9: ')'
            {
            match(')'); 

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
            // Simplegt.g:31:7: ( '=~|' )
            // Simplegt.g:31:9: '=~|'
            {
            match("=~|"); 


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
            // Simplegt.g:32:7: ( '=~' )
            // Simplegt.g:32:9: '=~'
            {
            match("=~"); 


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
            // Simplegt.g:33:7: ( 'to' )
            // Simplegt.g:33:9: 'to'
            {
            match("to"); 


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
            // Simplegt.g:34:7: ( 'before' )
            // Simplegt.g:34:9: 'before'
            {
            match("before"); 


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
            // Simplegt.g:35:7: ( 'import' )
            // Simplegt.g:35:9: 'import'
            {
            match("import"); 


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
            // Simplegt.g:36:7: ( 'static' )
            // Simplegt.g:36:9: 'static'
            {
            match("static"); 


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
            // Simplegt.g:37:7: ( 'def' )
            // Simplegt.g:37:9: 'def'
            {
            match("def"); 


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
            // Simplegt.g:38:7: ( 'context' )
            // Simplegt.g:38:9: 'context'
            {
            match("context"); 


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
            // Simplegt.g:39:7: ( 'metamodel' )
            // Simplegt.g:39:9: 'metamodel'
            {
            match("metamodel"); 


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
            // Simplegt.g:40:7: ( '::' )
            // Simplegt.g:40:9: '::'
            {
            match("::"); 


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
            // Simplegt.g:41:7: ( '.' )
            // Simplegt.g:41:9: '.'
            {
            match('.'); 

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
            // Simplegt.g:42:7: ( '->' )
            // Simplegt.g:42:9: '->'
            {
            match("->"); 


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
            // Simplegt.g:43:7: ( 'iterate' )
            // Simplegt.g:43:9: 'iterate'
            {
            match("iterate"); 


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
            // Simplegt.g:44:7: ( '|' )
            // Simplegt.g:44:9: '|'
            {
            match('|'); 

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
            // Simplegt.g:45:7: ( '!' )
            // Simplegt.g:45:9: '!'
            {
            match('!'); 

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
            // Simplegt.g:46:7: ( 'super' )
            // Simplegt.g:46:9: 'super'
            {
            match("super"); 


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
            // Simplegt.g:47:7: ( 'self' )
            // Simplegt.g:47:9: 'self'
            {
            match("self"); 


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
            // Simplegt.g:48:7: ( 'env' )
            // Simplegt.g:48:9: 'env'
            {
            match("env"); 


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
            // Simplegt.g:49:7: ( 'true' )
            // Simplegt.g:49:9: 'true'
            {
            match("true"); 


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
            // Simplegt.g:50:7: ( 'false' )
            // Simplegt.g:50:9: 'false'
            {
            match("false"); 


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
            // Simplegt.g:51:7: ( '#' )
            // Simplegt.g:51:9: '#'
            {
            match('#'); 

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
            // Simplegt.g:52:7: ( 'OclUndefined' )
            // Simplegt.g:52:9: 'OclUndefined'
            {
            match("OclUndefined"); 


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
            // Simplegt.g:53:7: ( 'let' )
            // Simplegt.g:53:9: 'let'
            {
            match("let"); 


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
            // Simplegt.g:54:7: ( 'if' )
            // Simplegt.g:54:9: 'if'
            {
            match("if"); 


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
            // Simplegt.g:55:7: ( 'then' )
            // Simplegt.g:55:9: 'then'
            {
            match("then"); 


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
            // Simplegt.g:56:7: ( 'else' )
            // Simplegt.g:56:9: 'else'
            {
            match("else"); 


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
            // Simplegt.g:57:7: ( 'endif' )
            // Simplegt.g:57:9: 'endif'
            {
            match("endif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "NOTOP"
    public final void mNOTOP() throws RecognitionException {
        try {
            int _type = NOTOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:13816:6: ( 'not' )
            // Simplegt.g:13817:1: 'not'
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
            // Simplegt.g:13818:7: ( ( ( 'and' | 'or' | 'xor' | 'implies' ) ) )
            // Simplegt.g:13819:1: ( ( 'and' | 'or' | 'xor' | 'implies' ) )
            {
            // Simplegt.g:13819:1: ( ( 'and' | 'or' | 'xor' | 'implies' ) )
            // Simplegt.g:13819:2: ( 'and' | 'or' | 'xor' | 'implies' )
            {
            // Simplegt.g:13819:2: ( 'and' | 'or' | 'xor' | 'implies' )
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
                    // Simplegt.g:13819:3: 'and'
                    {
                    match("and"); 


                    }
                    break;
                case 2 :
                    // Simplegt.g:13819:9: 'or'
                    {
                    match("or"); 


                    }
                    break;
                case 3 :
                    // Simplegt.g:13819:14: 'xor'
                    {
                    match("xor"); 


                    }
                    break;
                case 4 :
                    // Simplegt.g:13819:20: 'implies'
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
            // Simplegt.g:13821:6: ( ( ( 'div' | 'mod' ) ) )
            // Simplegt.g:13822:1: ( ( 'div' | 'mod' ) )
            {
            // Simplegt.g:13822:1: ( ( 'div' | 'mod' ) )
            // Simplegt.g:13822:2: ( 'div' | 'mod' )
            {
            // Simplegt.g:13822:2: ( 'div' | 'mod' )
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
                    // Simplegt.g:13822:3: 'div'
                    {
                    match("div"); 


                    }
                    break;
                case 2 :
                    // Simplegt.g:13822:9: 'mod'
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
            // Simplegt.g:13824:6: ( ( ( '>' | '<' | '>=' | '<=' ) ) )
            // Simplegt.g:13825:1: ( ( '>' | '<' | '>=' | '<=' ) )
            {
            // Simplegt.g:13825:1: ( ( '>' | '<' | '>=' | '<=' ) )
            // Simplegt.g:13825:2: ( '>' | '<' | '>=' | '<=' )
            {
            // Simplegt.g:13825:2: ( '>' | '<' | '>=' | '<=' )
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
                    // Simplegt.g:13825:3: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // Simplegt.g:13825:7: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // Simplegt.g:13825:11: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 4 :
                    // Simplegt.g:13825:16: '<='
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
            // Simplegt.g:13827:3: ( ( '=' ) )
            // Simplegt.g:13828:1: ( '=' )
            {
            // Simplegt.g:13828:1: ( '=' )
            // Simplegt.g:13828:2: '='
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
            // Simplegt.g:13830:4: ( ( '<>' ) )
            // Simplegt.g:13831:1: ( '<>' )
            {
            // Simplegt.g:13831:1: ( '<>' )
            // Simplegt.g:13831:2: '<>'
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
            // Simplegt.g:13833:6: ( ( ( '-' | '+' ) ) )
            // Simplegt.g:13834:1: ( ( '-' | '+' ) )
            {
            // Simplegt.g:13834:1: ( ( '-' | '+' ) )
            // Simplegt.g:13834:2: ( '-' | '+' )
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
            // Simplegt.g:13836:6: ( ( ( '*' | '/' ) ) )
            // Simplegt.g:13837:1: ( ( '*' | '/' ) )
            {
            // Simplegt.g:13837:1: ( ( '*' | '/' ) )
            // Simplegt.g:13837:2: ( '*' | '/' )
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
            // Simplegt.g:13839:8: ( ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // Simplegt.g:13840:1: ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // Simplegt.g:13840:1: ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // Simplegt.g:13840:2: '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("--"); 

            // Simplegt.g:13840:6: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFE')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Simplegt.g:13840:7: ~ ( '\\n' | '\\r' | '\\uffff' )
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
            // Simplegt.g:13843:6: ( ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ ) )
            // Simplegt.g:13844:1: ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ )
            {
            // Simplegt.g:13844:1: ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ )
            // Simplegt.g:13844:2: ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+
            {
            // Simplegt.g:13844:2: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Simplegt.g:13844:2: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // Simplegt.g:13844:6: ( ( '0' .. '9' ) )+
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
            	    // Simplegt.g:13844:7: ( '0' .. '9' )
            	    {
            	    // Simplegt.g:13844:7: ( '0' .. '9' )
            	    // Simplegt.g:13844:8: '0' .. '9'
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
            // Simplegt.g:13844:22: ( ( '0' .. '9' ) )+
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
            	    // Simplegt.g:13844:23: ( '0' .. '9' )
            	    {
            	    // Simplegt.g:13844:23: ( '0' .. '9' )
            	    // Simplegt.g:13844:24: '0' .. '9'
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
            // Simplegt.g:13846:8: ( ( ( '-' )? ( ( '0' .. '9' ) )+ ) )
            // Simplegt.g:13847:1: ( ( '-' )? ( ( '0' .. '9' ) )+ )
            {
            // Simplegt.g:13847:1: ( ( '-' )? ( ( '0' .. '9' ) )+ )
            // Simplegt.g:13847:2: ( '-' )? ( ( '0' .. '9' ) )+
            {
            // Simplegt.g:13847:2: ( '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='-') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Simplegt.g:13847:2: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // Simplegt.g:13847:6: ( ( '0' .. '9' ) )+
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
            	    // Simplegt.g:13847:7: ( '0' .. '9' )
            	    {
            	    // Simplegt.g:13847:7: ( '0' .. '9' )
            	    // Simplegt.g:13847:8: '0' .. '9'
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
            // Simplegt.g:13849:11: ( ( 'String' ) )
            // Simplegt.g:13850:1: ( 'String' )
            {
            // Simplegt.g:13850:1: ( 'String' )
            // Simplegt.g:13850:2: 'String'
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
            // Simplegt.g:13852:12: ( ( 'Boolean' ) )
            // Simplegt.g:13853:1: ( 'Boolean' )
            {
            // Simplegt.g:13853:1: ( 'Boolean' )
            // Simplegt.g:13853:2: 'Boolean'
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
            // Simplegt.g:13855:12: ( ( 'Integer' ) )
            // Simplegt.g:13856:1: ( 'Integer' )
            {
            // Simplegt.g:13856:1: ( 'Integer' )
            // Simplegt.g:13856:2: 'Integer'
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
            // Simplegt.g:13858:9: ( ( 'Real' ) )
            // Simplegt.g:13859:1: ( 'Real' )
            {
            // Simplegt.g:13859:1: ( 'Real' )
            // Simplegt.g:13859:2: 'Real'
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
            // Simplegt.g:13861:15: ( ( 'Collection' ) )
            // Simplegt.g:13862:1: ( 'Collection' )
            {
            // Simplegt.g:13862:1: ( 'Collection' )
            // Simplegt.g:13862:2: 'Collection'
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
            // Simplegt.g:13864:8: ( 'Bag' )
            // Simplegt.g:13865:1: 'Bag'
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
            // Simplegt.g:13866:15: ( 'OrderedSet' )
            // Simplegt.g:13867:1: 'OrderedSet'
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
            // Simplegt.g:13868:13: ( 'Sequence' )
            // Simplegt.g:13869:1: 'Sequence'
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
            // Simplegt.g:13870:8: ( 'Set' )
            // Simplegt.g:13871:1: 'Set'
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
            // Simplegt.g:13872:11: ( ( 'OclAny' ) )
            // Simplegt.g:13873:1: ( 'OclAny' )
            {
            // Simplegt.g:13873:1: ( 'OclAny' )
            // Simplegt.g:13873:2: 'OclAny'
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

    // $ANTLR start "TUPLETYPE"
    public final void mTUPLETYPE() throws RecognitionException {
        try {
            int _type = TUPLETYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:13875:10: ( 'Tuple' )
            // Simplegt.g:13876:1: 'Tuple'
            {
            match("Tuple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TUPLETYPE"

    // $ANTLR start "MAPTYPE"
    public final void mMAPTYPE() throws RecognitionException {
        try {
            int _type = MAPTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:13877:8: ( 'Map' )
            // Simplegt.g:13878:1: 'Map'
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
            // Simplegt.g:13879:11: ( ( 'Lambda' ) )
            // Simplegt.g:13880:1: ( 'Lambda' )
            {
            // Simplegt.g:13880:1: ( 'Lambda' )
            // Simplegt.g:13880:2: 'Lambda'
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
            // Simplegt.g:13882:8: ( ( 'Env' ) )
            // Simplegt.g:13883:1: ( 'Env' )
            {
            // Simplegt.g:13883:1: ( 'Env' )
            // Simplegt.g:13883:2: 'Env'
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
            // Simplegt.g:13885:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )* ) )
            // Simplegt.g:13886:1: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )* )
            {
            // Simplegt.g:13886:1: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )* )
            // Simplegt.g:13886:2: ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Simplegt.g:13886:21: ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )*
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
            	    // Simplegt.g:13886:22: ( 'A' .. 'Z' | 'a' .. 'z' )
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
            	    // Simplegt.g:13886:42: ( '0' .. '9' )
            	    {
            	    // Simplegt.g:13886:42: ( '0' .. '9' )
            	    // Simplegt.g:13886:43: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // Simplegt.g:13886:53: '_'
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
            // Simplegt.g:13888:10: ( ( ( '\\r\\n' | '\\'r' | '\\n' ) ) )
            // Simplegt.g:13889:1: ( ( '\\r\\n' | '\\'r' | '\\n' ) )
            {
            // Simplegt.g:13889:1: ( ( '\\r\\n' | '\\'r' | '\\n' ) )
            // Simplegt.g:13889:2: ( '\\r\\n' | '\\'r' | '\\n' )
            {
            // Simplegt.g:13889:2: ( '\\r\\n' | '\\'r' | '\\n' )
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
                    // Simplegt.g:13889:3: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 2 :
                    // Simplegt.g:13889:10: '\\'r'
                    {
                    match("'r"); 


                    }
                    break;
                case 3 :
                    // Simplegt.g:13889:16: '\\n'
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
            // Simplegt.g:13892:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Simplegt.g:13893:1: ( ( ' ' | '\\t' | '\\f' ) )
            {
            // Simplegt.g:13893:1: ( ( ' ' | '\\t' | '\\f' ) )
            // Simplegt.g:13893:2: ( ' ' | '\\t' | '\\f' )
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
            // Simplegt.g:13896:16: ( ( ( '\"' ) ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | ~ ( '\"' | '\\\\' ) )* ( '\"' ) ) )
            // Simplegt.g:13897:1: ( ( '\"' ) ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | ~ ( '\"' | '\\\\' ) )* ( '\"' ) )
            {
            // Simplegt.g:13897:1: ( ( '\"' ) ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | ~ ( '\"' | '\\\\' ) )* ( '\"' ) )
            // Simplegt.g:13897:2: ( '\"' ) ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | ~ ( '\"' | '\\\\' ) )* ( '\"' )
            {
            // Simplegt.g:13897:2: ( '\"' )
            // Simplegt.g:13897:3: '\"'
            {
            match('\"'); 

            }

            // Simplegt.g:13897:7: ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | ~ ( '\"' | '\\\\' ) )*
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
            	    // Simplegt.g:13897:8: ( '\\\\' '\"' )
            	    {
            	    // Simplegt.g:13897:8: ( '\\\\' '\"' )
            	    // Simplegt.g:13897:9: '\\\\' '\"'
            	    {
            	    match('\\'); 
            	    match('\"'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // Simplegt.g:13897:18: ( '\\\\' '\\\\' )
            	    {
            	    // Simplegt.g:13897:18: ( '\\\\' '\\\\' )
            	    // Simplegt.g:13897:19: '\\\\' '\\\\'
            	    {
            	    match('\\'); 
            	    match('\\'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // Simplegt.g:13897:29: ~ ( '\"' | '\\\\' )
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

            // Simplegt.g:13897:42: ( '\"' )
            // Simplegt.g:13897:43: '\"'
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
            // Simplegt.g:13899:16: ( ( ( '\\'' ) ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | ~ ( '\\'' | '\\\\' ) )* ( '\\'' ) ) )
            // Simplegt.g:13900:1: ( ( '\\'' ) ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | ~ ( '\\'' | '\\\\' ) )* ( '\\'' ) )
            {
            // Simplegt.g:13900:1: ( ( '\\'' ) ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | ~ ( '\\'' | '\\\\' ) )* ( '\\'' ) )
            // Simplegt.g:13900:2: ( '\\'' ) ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | ~ ( '\\'' | '\\\\' ) )* ( '\\'' )
            {
            // Simplegt.g:13900:2: ( '\\'' )
            // Simplegt.g:13900:3: '\\''
            {
            match('\''); 

            }

            // Simplegt.g:13900:8: ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | ~ ( '\\'' | '\\\\' ) )*
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
            	    // Simplegt.g:13900:9: ( '\\\\' '\\'' )
            	    {
            	    // Simplegt.g:13900:9: ( '\\\\' '\\'' )
            	    // Simplegt.g:13900:10: '\\\\' '\\''
            	    {
            	    match('\\'); 
            	    match('\''); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // Simplegt.g:13900:20: ( '\\\\' '\\\\' )
            	    {
            	    // Simplegt.g:13900:20: ( '\\\\' '\\\\' )
            	    // Simplegt.g:13900:21: '\\\\' '\\\\'
            	    {
            	    match('\\'); 
            	    match('\\'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // Simplegt.g:13900:31: ~ ( '\\'' | '\\\\' )
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

            // Simplegt.g:13900:45: ( '\\'' )
            // Simplegt.g:13900:46: '\\''
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
        // Simplegt.g:1:8: ( T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | NOTOP | BOOLOP | INTOP | RELOP | EQ | NEQ | ADDOP | MULOP | COMMENT | FLOAT | INTEGER | STRINGTYPE | BOOLEANTYPE | INTEGERTYPE | REALTYPE | COLLECTIONTYPE | BAGTYPE | ORDEREDSETTYPE | SEQUENCETYPE | SETTYPE | OCLANYTYPE | TUPLETYPE | MAPTYPE | LAMBDATYPE | ENVTYPE | TEXT | LINEBREAK | WHITESPACE | QUOTED_34_34_92 | QUOTED_39_39_92 )
        int alt14=72;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // Simplegt.g:1:10: T__34
                {
                mT__34(); 

                }
                break;
            case 2 :
                // Simplegt.g:1:16: T__35
                {
                mT__35(); 

                }
                break;
            case 3 :
                // Simplegt.g:1:22: T__36
                {
                mT__36(); 

                }
                break;
            case 4 :
                // Simplegt.g:1:28: T__37
                {
                mT__37(); 

                }
                break;
            case 5 :
                // Simplegt.g:1:34: T__38
                {
                mT__38(); 

                }
                break;
            case 6 :
                // Simplegt.g:1:40: T__39
                {
                mT__39(); 

                }
                break;
            case 7 :
                // Simplegt.g:1:46: T__40
                {
                mT__40(); 

                }
                break;
            case 8 :
                // Simplegt.g:1:52: T__41
                {
                mT__41(); 

                }
                break;
            case 9 :
                // Simplegt.g:1:58: T__42
                {
                mT__42(); 

                }
                break;
            case 10 :
                // Simplegt.g:1:64: T__43
                {
                mT__43(); 

                }
                break;
            case 11 :
                // Simplegt.g:1:70: T__44
                {
                mT__44(); 

                }
                break;
            case 12 :
                // Simplegt.g:1:76: T__45
                {
                mT__45(); 

                }
                break;
            case 13 :
                // Simplegt.g:1:82: T__46
                {
                mT__46(); 

                }
                break;
            case 14 :
                // Simplegt.g:1:88: T__47
                {
                mT__47(); 

                }
                break;
            case 15 :
                // Simplegt.g:1:94: T__48
                {
                mT__48(); 

                }
                break;
            case 16 :
                // Simplegt.g:1:100: T__49
                {
                mT__49(); 

                }
                break;
            case 17 :
                // Simplegt.g:1:106: T__50
                {
                mT__50(); 

                }
                break;
            case 18 :
                // Simplegt.g:1:112: T__51
                {
                mT__51(); 

                }
                break;
            case 19 :
                // Simplegt.g:1:118: T__52
                {
                mT__52(); 

                }
                break;
            case 20 :
                // Simplegt.g:1:124: T__53
                {
                mT__53(); 

                }
                break;
            case 21 :
                // Simplegt.g:1:130: T__54
                {
                mT__54(); 

                }
                break;
            case 22 :
                // Simplegt.g:1:136: T__55
                {
                mT__55(); 

                }
                break;
            case 23 :
                // Simplegt.g:1:142: T__56
                {
                mT__56(); 

                }
                break;
            case 24 :
                // Simplegt.g:1:148: T__57
                {
                mT__57(); 

                }
                break;
            case 25 :
                // Simplegt.g:1:154: T__58
                {
                mT__58(); 

                }
                break;
            case 26 :
                // Simplegt.g:1:160: T__59
                {
                mT__59(); 

                }
                break;
            case 27 :
                // Simplegt.g:1:166: T__60
                {
                mT__60(); 

                }
                break;
            case 28 :
                // Simplegt.g:1:172: T__61
                {
                mT__61(); 

                }
                break;
            case 29 :
                // Simplegt.g:1:178: T__62
                {
                mT__62(); 

                }
                break;
            case 30 :
                // Simplegt.g:1:184: T__63
                {
                mT__63(); 

                }
                break;
            case 31 :
                // Simplegt.g:1:190: T__64
                {
                mT__64(); 

                }
                break;
            case 32 :
                // Simplegt.g:1:196: T__65
                {
                mT__65(); 

                }
                break;
            case 33 :
                // Simplegt.g:1:202: T__66
                {
                mT__66(); 

                }
                break;
            case 34 :
                // Simplegt.g:1:208: T__67
                {
                mT__67(); 

                }
                break;
            case 35 :
                // Simplegt.g:1:214: T__68
                {
                mT__68(); 

                }
                break;
            case 36 :
                // Simplegt.g:1:220: T__69
                {
                mT__69(); 

                }
                break;
            case 37 :
                // Simplegt.g:1:226: T__70
                {
                mT__70(); 

                }
                break;
            case 38 :
                // Simplegt.g:1:232: T__71
                {
                mT__71(); 

                }
                break;
            case 39 :
                // Simplegt.g:1:238: T__72
                {
                mT__72(); 

                }
                break;
            case 40 :
                // Simplegt.g:1:244: T__73
                {
                mT__73(); 

                }
                break;
            case 41 :
                // Simplegt.g:1:250: T__74
                {
                mT__74(); 

                }
                break;
            case 42 :
                // Simplegt.g:1:256: T__75
                {
                mT__75(); 

                }
                break;
            case 43 :
                // Simplegt.g:1:262: NOTOP
                {
                mNOTOP(); 

                }
                break;
            case 44 :
                // Simplegt.g:1:268: BOOLOP
                {
                mBOOLOP(); 

                }
                break;
            case 45 :
                // Simplegt.g:1:275: INTOP
                {
                mINTOP(); 

                }
                break;
            case 46 :
                // Simplegt.g:1:281: RELOP
                {
                mRELOP(); 

                }
                break;
            case 47 :
                // Simplegt.g:1:287: EQ
                {
                mEQ(); 

                }
                break;
            case 48 :
                // Simplegt.g:1:290: NEQ
                {
                mNEQ(); 

                }
                break;
            case 49 :
                // Simplegt.g:1:294: ADDOP
                {
                mADDOP(); 

                }
                break;
            case 50 :
                // Simplegt.g:1:300: MULOP
                {
                mMULOP(); 

                }
                break;
            case 51 :
                // Simplegt.g:1:306: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 52 :
                // Simplegt.g:1:314: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 53 :
                // Simplegt.g:1:320: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 54 :
                // Simplegt.g:1:328: STRINGTYPE
                {
                mSTRINGTYPE(); 

                }
                break;
            case 55 :
                // Simplegt.g:1:339: BOOLEANTYPE
                {
                mBOOLEANTYPE(); 

                }
                break;
            case 56 :
                // Simplegt.g:1:351: INTEGERTYPE
                {
                mINTEGERTYPE(); 

                }
                break;
            case 57 :
                // Simplegt.g:1:363: REALTYPE
                {
                mREALTYPE(); 

                }
                break;
            case 58 :
                // Simplegt.g:1:372: COLLECTIONTYPE
                {
                mCOLLECTIONTYPE(); 

                }
                break;
            case 59 :
                // Simplegt.g:1:387: BAGTYPE
                {
                mBAGTYPE(); 

                }
                break;
            case 60 :
                // Simplegt.g:1:395: ORDEREDSETTYPE
                {
                mORDEREDSETTYPE(); 

                }
                break;
            case 61 :
                // Simplegt.g:1:410: SEQUENCETYPE
                {
                mSEQUENCETYPE(); 

                }
                break;
            case 62 :
                // Simplegt.g:1:423: SETTYPE
                {
                mSETTYPE(); 

                }
                break;
            case 63 :
                // Simplegt.g:1:431: OCLANYTYPE
                {
                mOCLANYTYPE(); 

                }
                break;
            case 64 :
                // Simplegt.g:1:442: TUPLETYPE
                {
                mTUPLETYPE(); 

                }
                break;
            case 65 :
                // Simplegt.g:1:452: MAPTYPE
                {
                mMAPTYPE(); 

                }
                break;
            case 66 :
                // Simplegt.g:1:460: LAMBDATYPE
                {
                mLAMBDATYPE(); 

                }
                break;
            case 67 :
                // Simplegt.g:1:471: ENVTYPE
                {
                mENVTYPE(); 

                }
                break;
            case 68 :
                // Simplegt.g:1:479: TEXT
                {
                mTEXT(); 

                }
                break;
            case 69 :
                // Simplegt.g:1:484: LINEBREAK
                {
                mLINEBREAK(); 

                }
                break;
            case 70 :
                // Simplegt.g:1:494: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 71 :
                // Simplegt.g:1:505: QUOTED_34_34_92
                {
                mQUOTED_34_34_92(); 

                }
                break;
            case 72 :
                // Simplegt.g:1:521: QUOTED_39_39_92
                {
                mQUOTED_39_39_92(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\2\54\1\uffff\1\54\1\uffff\3\54\2\uffff\1\54\1\101\1\54"+
        "\2\uffff\1\107\3\54\1\uffff\1\40\3\uffff\5\54\1\uffff\1\36\2\uffff"+
        "\1\127\11\54\5\uffff\5\54\1\154\11\54\2\uffff\1\167\2\54\1\172\1"+
        "\174\1\uffff\5\54\2\uffff\4\54\1\u0086\1\54\3\uffff\13\54\1\55\1"+
        "\uffff\1\u0095\2\54\1\u0098\1\u0095\2\54\1\uffff\2\54\1\u0086\2"+
        "\54\1\u009f\4\54\1\uffff\2\54\3\uffff\7\54\1\u00af\1\u00b0\1\uffff"+
        "\1\u0086\2\54\1\u00b3\1\54\1\u00b5\4\54\1\u00ba\1\54\1\u00bc\1\54"+
        "\1\uffff\2\54\1\uffff\1\54\1\u00c1\1\u00c2\1\54\1\u00c4\1\54\1\uffff"+
        "\1\54\1\u00c7\1\u00c8\7\54\1\u00d0\4\54\2\uffff\2\54\1\uffff\1\54"+
        "\1\uffff\1\54\1\u00d9\2\54\1\uffff\1\54\1\uffff\2\54\1\u00df\1\54"+
        "\2\uffff\1\54\1\uffff\1\54\1\u00e3\2\uffff\1\u00e4\5\54\1\u00ea"+
        "\1\uffff\10\54\1\uffff\1\54\1\u00f4\1\54\1\u00f6\1\54\1\uffff\3"+
        "\54\2\uffff\1\u00fb\2\54\1\u00fe\1\u00ff\1\uffff\2\54\1\u0102\1"+
        "\54\1\u0104\4\54\1\uffff\1\u0109\1\uffff\3\54\1\u010d\1\uffff\1"+
        "\u0086\1\u010e\2\uffff\1\u010f\1\54\1\uffff\1\54\1\uffff\1\54\1"+
        "\u0113\1\u0114\1\54\1\uffff\2\54\1\u0118\3\uffff\2\54\1\u011b\2"+
        "\uffff\1\54\1\u011d\1\u011e\1\uffff\2\54\1\uffff\1\54\2\uffff\1"+
        "\54\1\u0123\1\u0124\1\54\2\uffff\1\u0126\1\uffff";
    static final String DFA14_eofS =
        "\u0127\uffff";
    static final String DFA14_minS =
        "\1\11\2\145\1\uffff\1\150\1\uffff\1\142\1\165\1\154\2\uffff\1\141"+
        "\1\72\1\146\2\uffff\1\176\2\145\1\157\1\uffff\1\55\3\uffff\1\143"+
        "\1\145\1\157\1\162\1\157\1\uffff\1\76\2\uffff\1\56\1\145\1\141\1"+
        "\156\1\145\1\157\1\165\2\141\1\156\2\uffff\1\0\2\uffff\1\144\1\164"+
        "\1\142\1\166\1\141\1\60\1\145\1\163\1\144\1\154\1\164\1\144\1\163"+
        "\1\157\1\154\2\uffff\1\60\1\160\1\145\1\60\1\174\1\uffff\1\146\1"+
        "\141\1\160\1\154\1\156\2\uffff\1\154\1\144\2\164\1\60\1\162\3\uffff"+
        "\1\162\1\161\1\157\1\147\1\164\1\141\1\154\2\160\1\155\1\166\1\0"+
        "\1\uffff\1\60\1\141\1\165\2\60\1\156\1\145\1\uffff\1\156\1\164\1"+
        "\60\2\145\1\60\1\151\1\145\1\155\1\163\1\uffff\1\154\1\162\3\uffff"+
        "\1\157\1\164\1\145\1\146\1\164\1\101\1\145\2\60\1\uffff\1\60\1\151"+
        "\1\165\1\60\1\154\1\60\1\145\3\154\1\60\1\142\1\60\1\154\1\uffff"+
        "\1\155\1\147\1\uffff\1\163\2\60\1\162\1\60\1\156\1\uffff\1\146\2"+
        "\60\1\145\1\162\1\151\1\141\1\162\1\151\1\162\1\60\1\145\2\156\1"+
        "\162\2\uffff\1\156\1\145\1\uffff\1\145\1\uffff\1\147\1\60\2\145"+
        "\1\uffff\1\144\1\uffff\1\145\1\157\1\60\1\146\2\uffff\1\141\1\uffff"+
        "\1\144\1\60\2\uffff\1\60\1\164\1\145\1\164\1\145\1\143\1\60\1\uffff"+
        "\1\170\1\144\1\171\1\145\1\147\1\156\1\141\1\145\1\uffff\1\143\1"+
        "\60\1\141\1\60\1\144\1\uffff\1\157\1\143\1\163\2\uffff\1\60\1\163"+
        "\1\145\2\60\1\uffff\1\164\1\145\1\60\1\144\1\60\1\143\1\156\1\162"+
        "\1\164\1\uffff\1\60\1\uffff\1\145\1\162\1\164\1\60\1\uffff\2\60"+
        "\2\uffff\1\60\1\146\1\uffff\1\123\1\uffff\1\145\2\60\1\151\1\uffff"+
        "\1\154\1\155\1\60\3\uffff\1\151\1\145\1\60\2\uffff\1\157\2\60\1"+
        "\uffff\1\156\1\164\1\uffff\1\156\2\uffff\1\145\2\60\1\144\2\uffff"+
        "\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\175\1\157\1\151\1\uffff\1\162\1\uffff\1\156\1\165\1\170\2\uffff"+
        "\1\162\1\72\1\164\2\uffff\1\176\1\145\1\165\1\157\1\uffff\1\76\3"+
        "\uffff\1\162\1\145\1\157\1\162\1\157\1\uffff\1\76\2\uffff\1\71\1"+
        "\164\1\157\1\156\1\145\1\157\1\165\2\141\1\156\2\uffff\1\uffff\2"+
        "\uffff\1\144\1\164\1\146\1\166\1\165\1\172\1\145\1\163\1\144\1\154"+
        "\1\164\1\166\1\163\1\157\1\154\2\uffff\1\172\1\160\1\145\1\172\1"+
        "\174\1\uffff\1\146\1\141\1\160\1\154\1\156\2\uffff\1\154\1\144\2"+
        "\164\1\172\1\162\3\uffff\1\162\1\164\1\157\1\147\1\164\1\141\1\154"+
        "\2\160\1\155\1\166\1\uffff\1\uffff\1\172\1\141\1\165\2\172\1\156"+
        "\1\145\1\uffff\1\156\1\164\1\172\2\145\1\172\1\151\1\145\1\155\1"+
        "\163\1\uffff\1\157\1\162\3\uffff\1\157\1\164\1\145\1\146\1\164\1"+
        "\125\1\145\2\172\1\uffff\1\172\1\151\1\165\1\172\1\154\1\172\1\145"+
        "\3\154\1\172\1\142\1\172\1\154\1\uffff\1\155\1\147\1\uffff\1\163"+
        "\2\172\1\162\1\172\1\156\1\uffff\1\146\2\172\1\145\1\162\1\151\1"+
        "\141\1\162\1\151\1\162\1\172\1\145\2\156\1\162\2\uffff\1\156\1\145"+
        "\1\uffff\1\145\1\uffff\1\147\1\172\2\145\1\uffff\1\144\1\uffff\1"+
        "\145\1\157\1\172\1\146\2\uffff\1\141\1\uffff\1\144\1\172\2\uffff"+
        "\1\172\1\164\1\145\1\164\1\145\1\143\1\172\1\uffff\1\170\1\144\1"+
        "\171\1\145\1\147\1\156\1\141\1\145\1\uffff\1\143\1\172\1\141\1\172"+
        "\1\144\1\uffff\1\157\1\143\1\163\2\uffff\1\172\1\163\1\145\2\172"+
        "\1\uffff\1\164\1\145\1\172\1\144\1\172\1\143\1\156\1\162\1\164\1"+
        "\uffff\1\172\1\uffff\1\145\1\162\1\164\1\172\1\uffff\2\172\2\uffff"+
        "\1\172\1\146\1\uffff\1\123\1\uffff\1\145\2\172\1\151\1\uffff\1\154"+
        "\1\155\1\172\3\uffff\1\151\1\145\1\172\2\uffff\1\157\2\172\1\uffff"+
        "\1\156\1\164\1\uffff\1\156\2\uffff\1\145\2\172\1\144\2\uffff\1\172"+
        "\1\uffff";
    static final String DFA14_acceptS =
        "\3\uffff\1\3\1\uffff\1\5\3\uffff\1\11\1\12\3\uffff\1\16\1\17\4\uffff"+
        "\1\32\1\uffff\1\35\1\36\1\44\5\uffff\1\56\1\uffff\1\61\1\62\12\uffff"+
        "\1\104\1\105\1\uffff\1\106\1\107\17\uffff\1\31\1\14\5\uffff\1\57"+
        "\5\uffff\1\33\1\63\6\uffff\1\60\1\64\1\65\14\uffff\1\110\7\uffff"+
        "\1\22\12\uffff\1\15\2\uffff\1\47\1\20\1\21\11\uffff\1\54\16\uffff"+
        "\1\55\2\uffff\1\26\6\uffff\1\41\17\uffff\1\46\1\53\2\uffff\1\76"+
        "\1\uffff\1\73\4\uffff\1\101\1\uffff\1\103\4\uffff\1\42\1\50\1\uffff"+
        "\1\7\2\uffff\1\51\1\13\7\uffff\1\40\10\uffff\1\71\5\uffff\1\2\3"+
        "\uffff\1\52\1\43\5\uffff\1\37\11\uffff\1\100\1\uffff\1\1\4\uffff"+
        "\1\24\2\uffff\1\23\1\25\2\uffff\1\77\1\uffff\1\66\4\uffff\1\102"+
        "\3\uffff\1\10\1\34\1\27\3\uffff\1\67\1\70\3\uffff\1\6\2\uffff\1"+
        "\75\1\uffff\1\30\1\4\4\uffff\1\74\1\72\1\uffff\1\45";
    static final String DFA14_specialS =
        "\56\uffff\1\0\64\uffff\1\1\u00c3\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\57\1\55\1\uffff\1\57\1\55\22\uffff\1\57\1\27\1\60\1\30\3"+
            "\uffff\1\56\1\16\1\17\1\41\1\40\1\5\1\25\1\24\1\41\12\42\1\14"+
            "\1\3\1\37\1\20\1\36\2\uffff\1\54\1\44\1\47\1\54\1\53\3\54\1"+
            "\45\2\54\1\52\1\51\1\54\1\31\2\54\1\46\1\43\1\50\6\54\6\uffff"+
            "\1\6\1\21\1\23\1\2\1\10\1\13\2\54\1\15\2\54\1\32\1\1\1\33\1"+
            "\34\2\54\1\7\1\22\1\4\3\54\1\35\2\54\1\11\1\26\1\12",
            "\1\62\11\uffff\1\61",
            "\1\63\3\uffff\1\64",
            "",
            "\1\67\6\uffff\1\66\2\uffff\1\65",
            "",
            "\1\70\13\uffff\1\71",
            "\1\72",
            "\1\75\1\uffff\1\74\11\uffff\1\73",
            "",
            "",
            "\1\77\20\uffff\1\76",
            "\1\100",
            "\1\105\6\uffff\1\103\1\102\5\uffff\1\104",
            "",
            "",
            "\1\106",
            "\1\110",
            "\1\113\16\uffff\1\111\1\112",
            "\1\114",
            "",
            "\1\116\2\uffff\12\42\4\uffff\1\115",
            "",
            "",
            "",
            "\1\117\16\uffff\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "",
            "\1\125",
            "",
            "",
            "\1\126\1\uffff\12\42",
            "\1\131\16\uffff\1\130",
            "\1\133\15\uffff\1\132",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "",
            "\162\144\1\143\uff8d\144",
            "",
            "",
            "\1\145",
            "\1\146",
            "\1\147\3\uffff\1\150",
            "\1\151",
            "\1\152\23\uffff\1\153",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\163\21\uffff\1\162",
            "\1\164",
            "\1\165",
            "\1\166",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\170",
            "\1\171",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\173",
            "",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "",
            "",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0087",
            "",
            "",
            "",
            "\1\u0088",
            "\1\u0089\2\uffff\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\0\144",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\24\54\1\u0094\5\54",
            "\1\u0096",
            "\1\u0097",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0099",
            "\1\u009a",
            "",
            "\1\u009b",
            "\1\u009c",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u009d",
            "\1\u009e",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "\1\u00a5\2\uffff\1\u00a4",
            "\1\u00a6",
            "",
            "",
            "",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ad\23\uffff\1\u00ac",
            "\1\u00ae",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00b1",
            "\1\u00b2",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00b4",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00bb",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00bd",
            "",
            "\1\u00be",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00c3",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00c5",
            "",
            "\1\u00c6",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "\1\u00d7",
            "",
            "\1\u00d8",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00da",
            "\1\u00db",
            "",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00e0",
            "",
            "",
            "\1\u00e1",
            "",
            "\1\u00e2",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "\1\u00f3",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00f5",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00f7",
            "",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00fc",
            "\1\u00fd",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u0100",
            "\1\u0101",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0103",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0110",
            "",
            "\1\u0111",
            "",
            "\1\u0112",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0115",
            "",
            "\1\u0116",
            "\1\u0117",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "",
            "\1\u0119",
            "\1\u011a",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\1\u011c",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u011f",
            "\1\u0120",
            "",
            "\1\u0121",
            "",
            "",
            "\1\u0122",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0125",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
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
            return "1:1: Tokens : ( T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | NOTOP | BOOLOP | INTOP | RELOP | EQ | NEQ | ADDOP | MULOP | COMMENT | FLOAT | INTEGER | STRINGTYPE | BOOLEANTYPE | INTEGERTYPE | REALTYPE | COLLECTIONTYPE | BAGTYPE | ORDEREDSETTYPE | SEQUENCETYPE | SETTYPE | OCLANYTYPE | TUPLETYPE | MAPTYPE | LAMBDATYPE | ENVTYPE | TEXT | LINEBREAK | WHITESPACE | QUOTED_34_34_92 | QUOTED_39_39_92 );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_46 = input.LA(1);

                        s = -1;
                        if ( (LA14_46=='r') ) {s = 99;}

                        else if ( ((LA14_46>='\u0000' && LA14_46<='q')||(LA14_46>='s' && LA14_46<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_99 = input.LA(1);

                        s = -1;
                        if ( ((LA14_99>='\u0000' && LA14_99<='\uFFFF')) ) {s = 100;}

                        else s = 45;

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