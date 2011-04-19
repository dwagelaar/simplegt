// $ANTLR ${project.version} ${buildNumber}

	package be.ac.vub.simplegt.resource.simplegt.mopp;


import org.antlr.runtime3_2_0.*;

public class SimplegtLexer extends Lexer {
    public static final int INTEGER=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int WHITESPACE=9;
    public static final int FLOAT=6;
    public static final int TEXT=4;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__17=17;
    public static final int T__36=36;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int COMMENT=7;
    public static final int LINEBREAK=8;

    	public java.util.List<org.antlr.runtime3_2_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_2_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_2_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_2_0.ANTLRStringStream) input).index());
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

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:17:7: ( ';' )
            // Simplegt.g:17:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:18:7: ( 'import' )
            // Simplegt.g:18:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:21:7: ( ':' )
            // Simplegt.g:21:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:22:7: ( 'abstract' )
            // Simplegt.g:22:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:28:7: ( '!' )
            // Simplegt.g:28:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
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
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:34:7: ( '.' )
            // Simplegt.g:34:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:35:7: ( '\\\"' )
            // Simplegt.g:35:9: '\\\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:36:7: ( '\\'' )
            // Simplegt.g:36:9: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:37:7: ( 'true' )
            // Simplegt.g:37:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:38:7: ( 'false' )
            // Simplegt.g:38:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:39:7: ( '#' )
            // Simplegt.g:39:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:40:7: ( 'not' )
            // Simplegt.g:40:9: 'not'
            {
            match("not"); 


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
            // Simplegt.g:41:7: ( 'to' )
            // Simplegt.g:41:9: 'to'
            {
            match("to"); 


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
            // Simplegt.g:42:7: ( 'before' )
            // Simplegt.g:42:9: 'before'
            {
            match("before"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:3151:8: ( ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // Simplegt.g:3152:2: ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // Simplegt.g:3152:2: ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // Simplegt.g:3152:3: '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("--"); 

            // Simplegt.g:3152:7: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Simplegt.g:3152:8: ~ ( '\\n' | '\\r' | '\\uffff' )
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
            	    break loop1;
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
            // Simplegt.g:3155:6: ( ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ ) )
            // Simplegt.g:3156:2: ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ )
            {
            // Simplegt.g:3156:2: ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ )
            // Simplegt.g:3156:3: ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+
            {
            // Simplegt.g:3156:3: ( '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Simplegt.g:3156:3: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // Simplegt.g:3156:7: ( ( '0' .. '9' ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Simplegt.g:3156:8: ( '0' .. '9' )
            	    {
            	    // Simplegt.g:3156:8: ( '0' .. '9' )
            	    // Simplegt.g:3156:9: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            match('.'); 
            // Simplegt.g:3156:23: ( ( '0' .. '9' ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Simplegt.g:3156:24: ( '0' .. '9' )
            	    {
            	    // Simplegt.g:3156:24: ( '0' .. '9' )
            	    // Simplegt.g:3156:25: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // Simplegt.g:3158:8: ( ( ( '-' )? ( ( '0' .. '9' ) )+ ) )
            // Simplegt.g:3159:2: ( ( '-' )? ( ( '0' .. '9' ) )+ )
            {
            // Simplegt.g:3159:2: ( ( '-' )? ( ( '0' .. '9' ) )+ )
            // Simplegt.g:3159:3: ( '-' )? ( ( '0' .. '9' ) )+
            {
            // Simplegt.g:3159:3: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Simplegt.g:3159:3: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // Simplegt.g:3159:7: ( ( '0' .. '9' ) )+
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
            	    // Simplegt.g:3159:8: ( '0' .. '9' )
            	    {
            	    // Simplegt.g:3159:8: ( '0' .. '9' )
            	    // Simplegt.g:3159:9: '0' .. '9'
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


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Simplegt.g:3161:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* ) )
            // Simplegt.g:3162:2: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* )
            {
            // Simplegt.g:3162:2: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* )
            // Simplegt.g:3162:3: ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Simplegt.g:3162:22: ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )*
            loop7:
            do {
                int alt7=5;
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
                    alt7=1;
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
                    alt7=2;
                    }
                    break;
                case '-':
                    {
                    alt7=3;
                    }
                    break;
                case '_':
                    {
                    alt7=4;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // Simplegt.g:3162:23: ( 'A' .. 'Z' | 'a' .. 'z' )
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
            	    // Simplegt.g:3162:43: ( '0' .. '9' )
            	    {
            	    // Simplegt.g:3162:43: ( '0' .. '9' )
            	    // Simplegt.g:3162:44: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // Simplegt.g:3162:54: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;
            	case 4 :
            	    // Simplegt.g:3162:58: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // Simplegt.g:3164:10: ( ( ( '\\r\\n' | '\\'r' | '\\n' ) ) )
            // Simplegt.g:3165:2: ( ( '\\r\\n' | '\\'r' | '\\n' ) )
            {
            // Simplegt.g:3165:2: ( ( '\\r\\n' | '\\'r' | '\\n' ) )
            // Simplegt.g:3165:3: ( '\\r\\n' | '\\'r' | '\\n' )
            {
            // Simplegt.g:3165:3: ( '\\r\\n' | '\\'r' | '\\n' )
            int alt8=3;
            switch ( input.LA(1) ) {
            case '\r':
                {
                alt8=1;
                }
                break;
            case '\'':
                {
                alt8=2;
                }
                break;
            case '\n':
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // Simplegt.g:3165:4: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 2 :
                    // Simplegt.g:3165:11: '\\'r'
                    {
                    match("'r"); 


                    }
                    break;
                case 3 :
                    // Simplegt.g:3165:17: '\\n'
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
            // Simplegt.g:3168:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Simplegt.g:3169:2: ( ( ' ' | '\\t' | '\\f' ) )
            {
            // Simplegt.g:3169:2: ( ( ' ' | '\\t' | '\\f' ) )
            // Simplegt.g:3169:3: ( ' ' | '\\t' | '\\f' )
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

    public void mTokens() throws RecognitionException {
        // Simplegt.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | COMMENT | FLOAT | INTEGER | TEXT | LINEBREAK | WHITESPACE )
        int alt9=33;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // Simplegt.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // Simplegt.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // Simplegt.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // Simplegt.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // Simplegt.g:1:34: T__14
                {
                mT__14(); 

                }
                break;
            case 6 :
                // Simplegt.g:1:40: T__15
                {
                mT__15(); 

                }
                break;
            case 7 :
                // Simplegt.g:1:46: T__16
                {
                mT__16(); 

                }
                break;
            case 8 :
                // Simplegt.g:1:52: T__17
                {
                mT__17(); 

                }
                break;
            case 9 :
                // Simplegt.g:1:58: T__18
                {
                mT__18(); 

                }
                break;
            case 10 :
                // Simplegt.g:1:64: T__19
                {
                mT__19(); 

                }
                break;
            case 11 :
                // Simplegt.g:1:70: T__20
                {
                mT__20(); 

                }
                break;
            case 12 :
                // Simplegt.g:1:76: T__21
                {
                mT__21(); 

                }
                break;
            case 13 :
                // Simplegt.g:1:82: T__22
                {
                mT__22(); 

                }
                break;
            case 14 :
                // Simplegt.g:1:88: T__23
                {
                mT__23(); 

                }
                break;
            case 15 :
                // Simplegt.g:1:94: T__24
                {
                mT__24(); 

                }
                break;
            case 16 :
                // Simplegt.g:1:100: T__25
                {
                mT__25(); 

                }
                break;
            case 17 :
                // Simplegt.g:1:106: T__26
                {
                mT__26(); 

                }
                break;
            case 18 :
                // Simplegt.g:1:112: T__27
                {
                mT__27(); 

                }
                break;
            case 19 :
                // Simplegt.g:1:118: T__28
                {
                mT__28(); 

                }
                break;
            case 20 :
                // Simplegt.g:1:124: T__29
                {
                mT__29(); 

                }
                break;
            case 21 :
                // Simplegt.g:1:130: T__30
                {
                mT__30(); 

                }
                break;
            case 22 :
                // Simplegt.g:1:136: T__31
                {
                mT__31(); 

                }
                break;
            case 23 :
                // Simplegt.g:1:142: T__32
                {
                mT__32(); 

                }
                break;
            case 24 :
                // Simplegt.g:1:148: T__33
                {
                mT__33(); 

                }
                break;
            case 25 :
                // Simplegt.g:1:154: T__34
                {
                mT__34(); 

                }
                break;
            case 26 :
                // Simplegt.g:1:160: T__35
                {
                mT__35(); 

                }
                break;
            case 27 :
                // Simplegt.g:1:166: T__36
                {
                mT__36(); 

                }
                break;
            case 28 :
                // Simplegt.g:1:172: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 29 :
                // Simplegt.g:1:180: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 30 :
                // Simplegt.g:1:186: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 31 :
                // Simplegt.g:1:194: TEXT
                {
                mTEXT(); 

                }
                break;
            case 32 :
                // Simplegt.g:1:199: LINEBREAK
                {
                mLINEBREAK(); 

                }
                break;
            case 33 :
                // Simplegt.g:1:209: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\1\uffff\1\31\1\uffff\2\31\2\uffff\3\31\2\uffff\1\31\6\uffff\1\47"+
        "\1\uffff\2\31\1\uffff\1\54\3\uffff\2\31\1\57\1\31\1\62\5\31\1\71"+
        "\1\uffff\2\31\3\uffff\2\31\1\uffff\2\31\1\uffff\5\31\2\uffff\1\105"+
        "\4\31\1\112\1\31\1\114\1\31\1\116\1\31\1\uffff\4\31\1\uffff\1\31"+
        "\1\uffff\1\31\1\uffff\1\126\1\31\1\130\1\131\3\31\1\uffff\1\135"+
        "\2\uffff\2\31\1\140\1\uffff\1\31\1\142\1\uffff\1\143\2\uffff";
    static final String DFA9_eofS =
        "\144\uffff";
    static final String DFA9_minS =
        "\1\11\1\157\1\uffff\1\155\1\157\2\uffff\1\142\1\165\1\170\2\uffff"+
        "\1\141\3\uffff\1\176\2\uffff\1\162\1\uffff\1\157\1\145\1\55\1\56"+
        "\3\uffff\1\144\1\160\1\55\1\141\1\55\1\163\1\154\1\164\1\157\1\154"+
        "\1\174\1\uffff\1\164\1\146\3\uffff\1\165\1\157\1\uffff\1\156\1\145"+
        "\1\uffff\1\164\2\145\1\155\1\163\2\uffff\1\55\1\157\1\154\1\162"+
        "\1\163\1\55\1\162\1\55\1\156\1\55\1\145\1\uffff\1\162\1\145\1\164"+
        "\1\146\1\uffff\1\141\1\uffff\1\144\1\uffff\1\55\1\145\2\55\1\157"+
        "\1\143\1\163\1\uffff\1\55\2\uffff\1\162\1\164\1\55\1\uffff\1\155"+
        "\1\55\1\uffff\1\55\2\uffff";
    static final String DFA9_maxS =
        "\1\175\1\157\1\uffff\1\156\1\162\2\uffff\1\142\1\165\1\170\2\uffff"+
        "\1\162\3\uffff\1\176\2\uffff\1\162\1\uffff\1\157\1\145\2\71\3\uffff"+
        "\1\144\1\160\1\172\1\165\1\172\1\163\1\154\1\164\1\157\1\154\1\174"+
        "\1\uffff\1\164\1\146\3\uffff\1\165\1\157\1\uffff\1\156\1\145\1\uffff"+
        "\1\164\2\145\1\155\1\163\2\uffff\1\172\1\157\1\154\1\162\1\163\1"+
        "\172\1\162\1\172\1\156\1\172\1\145\1\uffff\1\162\1\145\1\164\1\146"+
        "\1\uffff\1\141\1\uffff\1\144\1\uffff\1\172\1\145\2\172\1\157\1\143"+
        "\1\163\1\uffff\1\172\2\uffff\1\162\1\164\1\172\1\uffff\1\155\1\172"+
        "\1\uffff\1\172\2\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\2\uffff\1\5\1\6\3\uffff\1\12\1\13\1\uffff\1\15\1\17"+
        "\1\20\1\uffff\1\23\1\24\1\uffff\1\30\4\uffff\1\37\1\40\1\41\13\uffff"+
        "\1\25\2\uffff\1\34\1\35\1\36\2\uffff\1\16\2\uffff\1\32\5\uffff\1"+
        "\21\1\22\13\uffff\1\31\4\uffff\1\26\1\uffff\1\10\1\uffff\1\14\7"+
        "\uffff\1\27\1\uffff\1\1\1\3\3\uffff\1\33\2\uffff\1\11\1\uffff\1"+
        "\7\1\4";
    static final String DFA9_specialS =
        "\144\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\33\1\32\1\uffff\1\33\1\32\22\uffff\1\33\1\15\1\22\1\24\3"+
            "\uffff\1\23\1\16\1\17\2\uffff\1\5\1\27\1\21\1\uffff\12\30\1"+
            "\6\1\2\1\uffff\1\20\3\uffff\32\31\6\uffff\1\7\1\26\2\31\1\11"+
            "\1\14\2\31\1\3\3\31\1\1\1\25\3\31\1\10\1\31\1\4\6\31\1\12\1"+
            "\uffff\1\13",
            "\1\34",
            "",
            "\1\35\1\36",
            "\1\40\2\uffff\1\37",
            "",
            "",
            "\1\41",
            "\1\42",
            "\1\43",
            "",
            "",
            "\1\45\20\uffff\1\44",
            "",
            "",
            "",
            "\1\46",
            "",
            "",
            "\1\32",
            "",
            "\1\50",
            "\1\51",
            "\1\52\2\uffff\12\30",
            "\1\53\1\uffff\12\30",
            "",
            "",
            "",
            "\1\55",
            "\1\56",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\60\23\uffff\1\61",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "\1\72",
            "\1\73",
            "",
            "",
            "",
            "\1\74",
            "\1\75",
            "",
            "\1\76",
            "\1\77",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "",
            "",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\113",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\115",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\117",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "",
            "\1\124",
            "",
            "\1\125",
            "",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\127",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\1\136",
            "\1\137",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\141",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | COMMENT | FLOAT | INTEGER | TEXT | LINEBREAK | WHITESPACE );";
        }
    }
 

}