// $ANTLR ${project.version} ${buildNumber}

	package be.ac.vub.simplegt.resource.simplegt.mopp;


import org.antlr.runtime3_3_0.*;
import java.util.HashMap;
@SuppressWarnings("unused")
public class SimplegtParser extends SimplegtANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TEXT", "QUOTED_34_34_92", "QUOTED_39_39_92", "INTEGER", "FLOAT", "COMMENT", "LINEBREAK", "WHITESPACE", "'module'", "'debug'", "';'", "'import'", "'transform'", "','", "':'", "'abstract'", "'rule'", "'extends'", "'{'", "'}'", "'from'", "'!'", "'in'", "'('", "')'", "'=~|'", "'=~'", "'.'", "'true'", "'false'", "'#'", "'not'", "'to'", "'before'"
    };
    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int TEXT=4;
    public static final int QUOTED_34_34_92=5;
    public static final int QUOTED_39_39_92=6;
    public static final int INTEGER=7;
    public static final int FLOAT=8;
    public static final int COMMENT=9;
    public static final int LINEBREAK=10;
    public static final int WHITESPACE=11;

    // delegates
    // delegators


        public SimplegtParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SimplegtParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[50+1];
             
             
        }
        

    public String[] getTokenNames() { return SimplegtParser.tokenNames; }
    public String getGrammarFileName() { return "Simplegt.g"; }


    	private be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolverFactory tokenResolverFactory = new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTokenResolverFactory();
    	
    	/**
    	 * the index of the last token that was handled by collectHiddenTokens()
    	 */
    	private int lastPosition;
    	
    	/**
    	 * A flag that indicates whether the parser should remember all expected elements.
    	 * This flag is set to true when using the parse for code completion. Otherwise it
    	 * is set to false.
    	 */
    	private boolean rememberExpectedElements = false;
    	
    	private Object parseToIndexTypeObject;
    	private int lastTokenIndex = 0;
    	
    	/**
    	 * A list of expected elements the were collected while parsing the input stream.
    	 * This list is only filled if <code>rememberExpectedElements</code> is set to
    	 * true.
    	 */
    	private java.util.List<be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtExpectedTerminal> expectedElements = new java.util.ArrayList<be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtExpectedTerminal>();
    	
    	private int mismatchedTokenRecoveryTries = 0;
    	/**
    	 * A helper list to allow a lexer to pass errors to its parser
    	 */
    	protected java.util.List<org.antlr.runtime3_3_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_3_0.RecognitionException>());
    	
    	/**
    	 * Another helper list to allow a lexer to pass positions of errors to its parser
    	 */
    	protected java.util.List<Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<Integer>());
    	
    	/**
    	 * A stack for incomplete objects. This stack is used filled when the parser is
    	 * used for code completion. Whenever the parser starts to read an object it is
    	 * pushed on the stack. Once the element was parser completely it is popped from
    	 * the stack.
    	 */
    	protected java.util.Stack<org.eclipse.emf.ecore.EObject> incompleteObjects = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
    	
    	private int stopIncludingHiddenTokens;
    	private int stopExcludingHiddenTokens;
    	private int tokenIndexOfLastCompleteElement;
    	
    	private int expectedElementsIndexOfLastCompleteElement;
    	
    	/**
    	 * The offset indicating the cursor position when the parser is used for code
    	 * completion by calling parseToExpectedElements().
    	 */
    	private int cursorOffset;
    	
    	/**
    	 * The offset of the first hidden token of the last expected element. This offset
    	 * is used to discard expected elements, which are not needed for code completion.
    	 */
    	private int lastStartIncludingHidden;
    	
    	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
    		postParseCommands.add(new be.ac.vub.simplegt.resource.simplegt.ISimplegtCommand<be.ac.vub.simplegt.resource.simplegt.ISimplegtTextResource>() {
    			public boolean execute(be.ac.vub.simplegt.resource.simplegt.ISimplegtTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.addProblem(new be.ac.vub.simplegt.resource.simplegt.ISimplegtProblem() {
    					public be.ac.vub.simplegt.resource.simplegt.SimplegtEProblemSeverity getSeverity() {
    						return be.ac.vub.simplegt.resource.simplegt.SimplegtEProblemSeverity.ERROR;
    					}
    					public be.ac.vub.simplegt.resource.simplegt.SimplegtEProblemType getType() {
    						return be.ac.vub.simplegt.resource.simplegt.SimplegtEProblemType.SYNTAX_ERROR;
    					}
    					public String getMessage() {
    						return errorMessage;
    					}
    					public java.util.Collection<be.ac.vub.simplegt.resource.simplegt.ISimplegtQuickFix> getQuickFixes() {
    						return null;
    					}
    				}, column, line, startIndex, stopIndex);
    				return true;
    			}
    		});
    	}
    	
    	public void addExpectedElement(be.ac.vub.simplegt.resource.simplegt.ISimplegtExpectedElement terminal, int followSetID, org.eclipse.emf.ecore.EStructuralFeature... containmentTrace) {
    		if (!this.rememberExpectedElements) {
    			return;
    		}
    		be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtExpectedTerminal expectedElement = new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtExpectedTerminal(terminal, followSetID, containmentTrace);
    		setPosition(expectedElement, input.index());
    		int startIncludingHiddenTokens = expectedElement.getStartIncludingHiddenTokens();
    		if (lastStartIncludingHidden >= 0 && lastStartIncludingHidden < startIncludingHiddenTokens && cursorOffset > startIncludingHiddenTokens) {
    			// clear list of expected elements
    			this.expectedElements.clear();
    		}
    		lastStartIncludingHidden = startIncludingHiddenTokens;
    		this.expectedElements.add(expectedElement);
    	}
    	
    	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
    	}
    	
    	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
    		postParseCommands.add(new be.ac.vub.simplegt.resource.simplegt.ISimplegtCommand<be.ac.vub.simplegt.resource.simplegt.ISimplegtTextResource>() {
    			public boolean execute(be.ac.vub.simplegt.resource.simplegt.ISimplegtTextResource resource) {
    				be.ac.vub.simplegt.resource.simplegt.ISimplegtLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharStart(target, locationMap.getCharStart(source));
    				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
    				locationMap.setColumn(target, locationMap.getColumn(source));
    				locationMap.setLine(target, locationMap.getLine(source));
    				return true;
    			}
    		});
    	}
    	
    	protected void copyLocalizationInfos(final org.antlr.runtime3_3_0.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
    		postParseCommands.add(new be.ac.vub.simplegt.resource.simplegt.ISimplegtCommand<be.ac.vub.simplegt.resource.simplegt.ISimplegtTextResource>() {
    			public boolean execute(be.ac.vub.simplegt.resource.simplegt.ISimplegtTextResource resource) {
    				be.ac.vub.simplegt.resource.simplegt.ISimplegtLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				if (source == null) {
    					return true;
    				}
    				locationMap.setCharStart(target, source.getStartIndex());
    				locationMap.setCharEnd(target, source.getStopIndex());
    				locationMap.setColumn(target, source.getCharPositionInLine());
    				locationMap.setLine(target, source.getLine());
    				return true;
    			}
    		});
    	}
    	
    	/**
    	 * Sets the end character index and the last line for the given object in the
    	 * location map.
    	 */
    	protected void setLocalizationEnd(java.util.Collection<be.ac.vub.simplegt.resource.simplegt.ISimplegtCommand<be.ac.vub.simplegt.resource.simplegt.ISimplegtTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
    		postParseCommands.add(new be.ac.vub.simplegt.resource.simplegt.ISimplegtCommand<be.ac.vub.simplegt.resource.simplegt.ISimplegtTextResource>() {
    			public boolean execute(be.ac.vub.simplegt.resource.simplegt.ISimplegtTextResource resource) {
    				be.ac.vub.simplegt.resource.simplegt.ISimplegtLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharEnd(object, endChar);
    				locationMap.setLine(object, endLine);
    				return true;
    			}
    		});
    	}
    	
    	public be.ac.vub.simplegt.resource.simplegt.ISimplegtTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
    		try {
    			if (encoding == null) {
    				return new SimplegtParser(new org.antlr.runtime3_3_0.CommonTokenStream(new SimplegtLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new SimplegtParser(new org.antlr.runtime3_3_0.CommonTokenStream(new SimplegtLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (java.io.IOException e) {
    			be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtPlugin.logError("Error while creating parser.", e);
    			return null;
    		}
    	}
    	
    	/**
    	 * This default constructor is only used to call createInstance() on it.
    	 */
    	public SimplegtParser() {
    		super(null);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_3_0.RecognitionException {
    		this.lastPosition = 0;
    		// required because the lexer class can not be subclassed
    		((SimplegtLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((SimplegtLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
    		Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
    			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
    			if (type.getInstanceClass() == be.ac.vub.simplegt.Module.class) {
    				return parse_be_ac_vub_simplegt_Module();
    			}
    			if (type.getInstanceClass() == be.ac.vub.simplegt.InstanceModel.class) {
    				return parse_be_ac_vub_simplegt_InstanceModel();
    			}
    			if (type.getInstanceClass() == be.ac.vub.simplegt.Metamodel.class) {
    				return parse_be_ac_vub_simplegt_Metamodel();
    			}
    			if (type.getInstanceClass() == be.ac.vub.simplegt.Rule.class) {
    				return parse_be_ac_vub_simplegt_Rule();
    			}
    			if (type.getInstanceClass() == be.ac.vub.simplegt.InPattern.class) {
    				return parse_be_ac_vub_simplegt_InPattern();
    			}
    			if (type.getInstanceClass() == be.ac.vub.simplegt.Type.class) {
    				return parse_be_ac_vub_simplegt_Type();
    			}
    			if (type.getInstanceClass() == be.ac.vub.simplegt.InputElement.class) {
    				return parse_be_ac_vub_simplegt_InputElement();
    			}
    			if (type.getInstanceClass() == be.ac.vub.simplegt.InputBinding.class) {
    				return parse_be_ac_vub_simplegt_InputBinding();
    			}
    			if (type.getInstanceClass() == be.ac.vub.simplegt.ElementExp.class) {
    				return parse_be_ac_vub_simplegt_ElementExp();
    			}
    			if (type.getInstanceClass() == be.ac.vub.simplegt.StringLiteralExp.class) {
    				return parse_be_ac_vub_simplegt_StringLiteralExp();
    			}
    			if (type.getInstanceClass() == be.ac.vub.simplegt.IntegerLiteralExp.class) {
    				return parse_be_ac_vub_simplegt_IntegerLiteralExp();
    			}
    			if (type.getInstanceClass() == be.ac.vub.simplegt.DoubleLiteralExp.class) {
    				return parse_be_ac_vub_simplegt_DoubleLiteralExp();
    			}
    			if (type.getInstanceClass() == be.ac.vub.simplegt.BooleanLiteralExp.class) {
    				return parse_be_ac_vub_simplegt_BooleanLiteralExp();
    			}
    			if (type.getInstanceClass() == be.ac.vub.simplegt.EnumLiteralExp.class) {
    				return parse_be_ac_vub_simplegt_EnumLiteralExp();
    			}
    			if (type.getInstanceClass() == be.ac.vub.simplegt.NacPattern.class) {
    				return parse_be_ac_vub_simplegt_NacPattern();
    			}
    			if (type.getInstanceClass() == be.ac.vub.simplegt.OutPattern.class) {
    				return parse_be_ac_vub_simplegt_OutPattern();
    			}
    			if (type.getInstanceClass() == be.ac.vub.simplegt.OutputElement.class) {
    				return parse_be_ac_vub_simplegt_OutputElement();
    			}
    			if (type.getInstanceClass() == be.ac.vub.simplegt.OutputBinding.class) {
    				return parse_be_ac_vub_simplegt_OutputBinding();
    			}
    		}
    		throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtUnexpectedContentTypeException(typeObject);
    	}
    	
    	public int getMismatchedTokenRecoveryTries() {
    		return mismatchedTokenRecoveryTries;
    	}
    	
    	public Object getMissingSymbol(org.antlr.runtime3_3_0.IntStream arg0, org.antlr.runtime3_3_0.RecognitionException arg1, int arg2, org.antlr.runtime3_3_0.BitSet arg3) {
    		mismatchedTokenRecoveryTries++;
    		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
    	}
    	
    	public Object getParseToIndexTypeObject() {
    		return parseToIndexTypeObject;
    	}
    	
    	protected Object getTypeObject() {
    		Object typeObject = getParseToIndexTypeObject();
    		if (typeObject != null) {
    			return typeObject;
    		}
    		java.util.Map<?,?> options = getOptions();
    		if (options != null) {
    			typeObject = options.get(be.ac.vub.simplegt.resource.simplegt.ISimplegtOptions.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	/**
    	 * Implementation that calls {@link #doParse()} and handles the thrown
    	 * RecognitionExceptions.
    	 */
    	public be.ac.vub.simplegt.resource.simplegt.ISimplegtParseResult parse() {
    		terminateParsing = false;
    		postParseCommands = new java.util.ArrayList<be.ac.vub.simplegt.resource.simplegt.ISimplegtCommand<be.ac.vub.simplegt.resource.simplegt.ISimplegtTextResource>>();
    		be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtParseResult parseResult = new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtParseResult();
    		try {
    			org.eclipse.emf.ecore.EObject result =  doParse();
    			if (lexerExceptions.isEmpty()) {
    				parseResult.setRoot(result);
    			}
    		} catch (org.antlr.runtime3_3_0.RecognitionException re) {
    			reportError(re);
    		} catch (java.lang.IllegalArgumentException iae) {
    			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
    				// can be caused if a null is set on EMF models where not allowed. this will just
    				// happen if other errors occurred before
    			} else {
    				iae.printStackTrace();
    			}
    		}
    		for (org.antlr.runtime3_3_0.RecognitionException re : lexerExceptions) {
    			reportLexicalError(re);
    		}
    		parseResult.getPostParseCommands().addAll(postParseCommands);
    		return parseResult;
    	}
    	
    	public java.util.List<be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, be.ac.vub.simplegt.resource.simplegt.ISimplegtTextResource dummyResource, int cursorOffset) {
    		this.rememberExpectedElements = true;
    		this.parseToIndexTypeObject = type;
    		this.cursorOffset = cursorOffset;
    		this.lastStartIncludingHidden = -1;
    		final org.antlr.runtime3_3_0.CommonTokenStream tokenStream = (org.antlr.runtime3_3_0.CommonTokenStream) getTokenStream();
    		be.ac.vub.simplegt.resource.simplegt.ISimplegtParseResult result = parse();
    		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
    			org.antlr.runtime3_3_0.Lexer lexer = (org.antlr.runtime3_3_0.Lexer) tokenStream.getTokenSource();
    			int endChar = lexer.getCharIndex();
    			int endLine = lexer.getLine();
    			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
    		}
    		if (result != null) {
    			org.eclipse.emf.ecore.EObject root = result.getRoot();
    			if (root != null) {
    				dummyResource.getContentsInternal().add(root);
    			}
    			for (be.ac.vub.simplegt.resource.simplegt.ISimplegtCommand<be.ac.vub.simplegt.resource.simplegt.ISimplegtTextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		java.util.Set<be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtExpectedTerminal>();
    		java.util.List<be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtExpectedTerminal> newFollowSet = new java.util.ArrayList<be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 101;
    		int i;
    		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
    			org.antlr.runtime3_3_0.CommonToken nextToken = (org.antlr.runtime3_3_0.CommonToken) tokenStream.get(i);
    			if (nextToken.getType() < 0) {
    				break;
    			}
    			if (nextToken.getChannel() == 99) {
    				// hidden tokens do not reduce the follow set
    			} else {
    				// now that we have found the next visible token the position for that expected
    				// terminals can be set
    				for (be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are
    				// kept
    				for (be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						java.util.Collection<be.ac.vub.simplegt.resource.simplegt.util.SimplegtPair<be.ac.vub.simplegt.resource.simplegt.ISimplegtExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (be.ac.vub.simplegt.resource.simplegt.util.SimplegtPair<be.ac.vub.simplegt.resource.simplegt.ISimplegtExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]> newFollowerPair : newFollowers) {
    							be.ac.vub.simplegt.resource.simplegt.ISimplegtExpectedElement newFollower = newFollowerPair.getLeft();
    							be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtExpectedTerminal newFollowTerminal = new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtExpectedTerminal(newFollower, followSetID, newFollowerPair.getRight());
    							newFollowSet.add(newFollowTerminal);
    							expectedElements.add(newFollowTerminal);
    						}
    					}
    				}
    				currentFollowSet.clear();
    				currentFollowSet.addAll(newFollowSet);
    			}
    			followSetID++;
    		}
    		// after the last token in the stream we must set the position for the elements
    		// that were added during the last iteration of the loop
    		for (be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtExpectedTerminal expectedElement, int tokenIndex) {
    		int currentIndex = Math.max(0, tokenIndex);
    		for (int index = lastTokenIndex; index < currentIndex; index++) {
    			if (index >= input.size()) {
    				break;
    			}
    			org.antlr.runtime3_3_0.CommonToken tokenAtIndex = (org.antlr.runtime3_3_0.CommonToken) input.get(index);
    			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			if (tokenAtIndex.getChannel() != 99) {
    				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			}
    		}
    		lastTokenIndex = Math.max(0, currentIndex);
    		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
    	}
    	
    	public Object recoverFromMismatchedToken(org.antlr.runtime3_3_0.IntStream input, int ttype, org.antlr.runtime3_3_0.BitSet follow) throws org.antlr.runtime3_3_0.RecognitionException {
    		if (!rememberExpectedElements) {
    			return super.recoverFromMismatchedToken(input, ttype, follow);
    		} else {
    			return null;
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the parser into human readable messages.
    	 */
    	public void reportError(final org.antlr.runtime3_3_0.RecognitionException e)  {
    		String message = e.getMessage();
    		if (e instanceof org.antlr.runtime3_3_0.MismatchedTokenException) {
    			org.antlr.runtime3_3_0.MismatchedTokenException mte = (org.antlr.runtime3_3_0.MismatchedTokenException) e;
    			String expectedTokenName = formatTokenName(mte.expecting);
    			String actualTokenName = formatTokenName(e.token.getType());
    			message = "Syntax error on token \"" + e.token.getText() + " (" + actualTokenName + ")\", \"" + expectedTokenName + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedTreeNodeException) {
    			org.antlr.runtime3_3_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_3_0.MismatchedTreeNodeException) e;
    			String expectedTokenName = formatTokenName(mtne.expecting);
    			message = "mismatched tree node: " + "xxx" + "; tokenName " + expectedTokenName;
    		} else if (e instanceof org.antlr.runtime3_3_0.NoViableAltException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
    		} else if (e instanceof org.antlr.runtime3_3_0.EarlyExitException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedSetException) {
    			org.antlr.runtime3_3_0.MismatchedSetException mse = (org.antlr.runtime3_3_0.MismatchedSetException) e;
    			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedNotSetException) {
    			org.antlr.runtime3_3_0.MismatchedNotSetException mse = (org.antlr.runtime3_3_0.MismatchedNotSetException) e;
    			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_3_0.FailedPredicateException) {
    			org.antlr.runtime3_3_0.FailedPredicateException fpe = (org.antlr.runtime3_3_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText + "}?";
    		}
    		// the resource may be null if the parser is used for code completion
    		final String finalMessage = message;
    		if (e.token instanceof org.antlr.runtime3_3_0.CommonToken) {
    			final org.antlr.runtime3_3_0.CommonToken ct = (org.antlr.runtime3_3_0.CommonToken) e.token;
    			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
    		} else {
    			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the lexer into human readable messages.
    	 */
    	public void reportLexicalError(final org.antlr.runtime3_3_0.RecognitionException e)  {
    		String message = "";
    		if (e instanceof org.antlr.runtime3_3_0.MismatchedTokenException) {
    			org.antlr.runtime3_3_0.MismatchedTokenException mte = (org.antlr.runtime3_3_0.MismatchedTokenException) e;
    			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_3_0.NoViableAltException) {
    			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_3_0.EarlyExitException) {
    			org.antlr.runtime3_3_0.EarlyExitException eee = (org.antlr.runtime3_3_0.EarlyExitException) e;
    			message = "required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedSetException) {
    			org.antlr.runtime3_3_0.MismatchedSetException mse = (org.antlr.runtime3_3_0.MismatchedSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedNotSetException) {
    			org.antlr.runtime3_3_0.MismatchedNotSetException mse = (org.antlr.runtime3_3_0.MismatchedNotSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedRangeException) {
    			org.antlr.runtime3_3_0.MismatchedRangeException mre = (org.antlr.runtime3_3_0.MismatchedRangeException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
    		} else if (e instanceof org.antlr.runtime3_3_0.FailedPredicateException) {
    			org.antlr.runtime3_3_0.FailedPredicateException fpe = (org.antlr.runtime3_3_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
    		}
    		addErrorToResource(message, e.charPositionInLine, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
    	}
    	
    	protected void completedElement(Object object, boolean isContainment) {
    		if (isContainment && !this.incompleteObjects.isEmpty()) {
    			this.incompleteObjects.pop();
    		}
    		if (object instanceof org.eclipse.emf.ecore.EObject) {
    			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
    			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
    		}
    	}
    	



    // $ANTLR start "start"
    // Simplegt.g:514:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_be_ac_vub_simplegt_Module ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;
        int start_StartIndex = input.index();
        be.ac.vub.simplegt.Module c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }
            // Simplegt.g:515:1: ( (c0= parse_be_ac_vub_simplegt_Module ) EOF )
            // Simplegt.g:516:2: (c0= parse_be_ac_vub_simplegt_Module ) EOF
            {
            if ( state.backtracking==0 ) {

              		// follow set for start rule(s)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_0, 0);
              		expectedElementsIndexOfLastCompleteElement = 0;
              	
            }
            // Simplegt.g:521:2: (c0= parse_be_ac_vub_simplegt_Module )
            // Simplegt.g:522:3: c0= parse_be_ac_vub_simplegt_Module
            {
            pushFollow(FOLLOW_parse_be_ac_vub_simplegt_Module_in_start82);
            c0=parse_be_ac_vub_simplegt_Module();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {
               element = c0; 
            }

            }

            match(input,EOF,FOLLOW_EOF_in_start89); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		retrieveLayoutInformation(element, null, null, false);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, start_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "start"


    // $ANTLR start "parse_be_ac_vub_simplegt_Module"
    // Simplegt.g:530:1: parse_be_ac_vub_simplegt_Module returns [be.ac.vub.simplegt.Module element = null] : a0= 'module' (a1= TEXT ) ( (a2= 'debug' )? ) a5= ';' ( (a6= 'import' (a7= TEXT ) a8= ';' ) )* a9= 'transform' (a10_0= parse_be_ac_vub_simplegt_InstanceModel ) ( (a11= ',' (a12_0= parse_be_ac_vub_simplegt_InstanceModel ) ) )* a13= ';' ( (a14_0= parse_be_ac_vub_simplegt_Rule ) )* ;
    public final be.ac.vub.simplegt.Module parse_be_ac_vub_simplegt_Module() throws RecognitionException {
        be.ac.vub.simplegt.Module element =  null;
        int parse_be_ac_vub_simplegt_Module_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a11=null;
        Token a13=null;
        be.ac.vub.simplegt.InstanceModel a10_0 = null;

        be.ac.vub.simplegt.InstanceModel a12_0 = null;

        be.ac.vub.simplegt.Rule a14_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }
            // Simplegt.g:533:1: (a0= 'module' (a1= TEXT ) ( (a2= 'debug' )? ) a5= ';' ( (a6= 'import' (a7= TEXT ) a8= ';' ) )* a9= 'transform' (a10_0= parse_be_ac_vub_simplegt_InstanceModel ) ( (a11= ',' (a12_0= parse_be_ac_vub_simplegt_InstanceModel ) ) )* a13= ';' ( (a14_0= parse_be_ac_vub_simplegt_Rule ) )* )
            // Simplegt.g:534:2: a0= 'module' (a1= TEXT ) ( (a2= 'debug' )? ) a5= ';' ( (a6= 'import' (a7= TEXT ) a8= ';' ) )* a9= 'transform' (a10_0= parse_be_ac_vub_simplegt_InstanceModel ) ( (a11= ',' (a12_0= parse_be_ac_vub_simplegt_InstanceModel ) ) )* a13= ';' ( (a14_0= parse_be_ac_vub_simplegt_Rule ) )*
            {
            a0=(Token)match(input,12,FOLLOW_12_in_parse_be_ac_vub_simplegt_Module115); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
              			incompleteObjects.push(element);
              			// initialize boolean attribute
              			{
              				Object value = false;
              				element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__DEBUG), value);
              			}
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_1, 1);
              	
            }
            // Simplegt.g:553:2: (a1= TEXT )
            // Simplegt.g:554:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Module133); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
              				incompleteObjects.push(element);
              				// initialize boolean attribute
              				{
              					Object value = false;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__DEBUG), value);
              				}
              			}
              			if (a1 != null) {
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_1, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_2, 2);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_3, 2);
              	
            }
            // Simplegt.g:595:2: ( (a2= 'debug' )? )
            // Simplegt.g:596:3: (a2= 'debug' )?
            {
            // Simplegt.g:596:3: (a2= 'debug' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Simplegt.g:597:4: a2= 'debug'
                    {
                    a2=(Token)match(input,13,FOLLOW_13_in_parse_be_ac_vub_simplegt_Module163); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
                      					incompleteObjects.push(element);
                      					// initialize boolean attribute
                      					{
                      						Object value = false;
                      						element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__DEBUG), value);
                      					}
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_2, true, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      				// set value of boolean attribute
                      				Object value = true;
                      				element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__DEBUG), value);
                      				completedElement(value, false);
                      			
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_3, 3);
              	
            }
            a5=(Token)match(input,14,FOLLOW_14_in_parse_be_ac_vub_simplegt_Module184); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
              			incompleteObjects.push(element);
              			// initialize boolean attribute
              			{
              				Object value = false;
              				element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__DEBUG), value);
              			}
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_4, 4);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_5, 4);
              	
            }
            // Simplegt.g:641:2: ( (a6= 'import' (a7= TEXT ) a8= ';' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Simplegt.g:642:3: (a6= 'import' (a7= TEXT ) a8= ';' )
            	    {
            	    // Simplegt.g:642:3: (a6= 'import' (a7= TEXT ) a8= ';' )
            	    // Simplegt.g:643:4: a6= 'import' (a7= TEXT ) a8= ';'
            	    {
            	    a6=(Token)match(input,15,FOLLOW_15_in_parse_be_ac_vub_simplegt_Module207); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
            	      					incompleteObjects.push(element);
            	      					// initialize boolean attribute
            	      					{
            	      						Object value = false;
            	      						element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__DEBUG), value);
            	      					}
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_4_0_0_1, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_6, 5);
            	      			
            	    }
            	    // Simplegt.g:662:4: (a7= TEXT )
            	    // Simplegt.g:663:5: a7= TEXT
            	    {
            	    a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Module233); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
            	      						incompleteObjects.push(element);
            	      						// initialize boolean attribute
            	      						{
            	      							Object value = false;
            	      							element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__DEBUG), value);
            	      						}
            	      					}
            	      					if (a7 != null) {
            	      						be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            	      						tokenResolver.setOptions(getOptions());
            	      						be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
            	      						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__IMPORTS), result);
            	      						Object resolvedObject = result.getResolvedToken();
            	      						if (resolvedObject == null) {
            	      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStopIndex());
            	      						}
            	      						java.lang.String resolved = (java.lang.String) resolvedObject;
            	      						if (resolved != null) {
            	      							Object value = resolved;
            	      							addObjectToList(element, be.ac.vub.simplegt.SimplegtPackage.MODULE__IMPORTS, value);
            	      							completedElement(value, false);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_4_0_0_2, resolved, true);
            	      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a7, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_7, 6);
            	      			
            	    }
            	    a8=(Token)match(input,14,FOLLOW_14_in_parse_be_ac_vub_simplegt_Module266); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
            	      					incompleteObjects.push(element);
            	      					// initialize boolean attribute
            	      					{
            	      						Object value = false;
            	      						element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__DEBUG), value);
            	      					}
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_4_0_0_3, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_4, 7);
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_5, 7);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_4, 8);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_5, 8);
              	
            }
            a9=(Token)match(input,16,FOLLOW_16_in_parse_be_ac_vub_simplegt_Module299); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
              			incompleteObjects.push(element);
              			// initialize boolean attribute
              			{
              				Object value = false;
              				element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__DEBUG), value);
              			}
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_6, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a9, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_8, 9, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_0);
              	
            }
            // Simplegt.g:750:2: (a10_0= parse_be_ac_vub_simplegt_InstanceModel )
            // Simplegt.g:751:3: a10_0= parse_be_ac_vub_simplegt_InstanceModel
            {
            pushFollow(FOLLOW_parse_be_ac_vub_simplegt_InstanceModel_in_parse_be_ac_vub_simplegt_Module317);
            a10_0=parse_be_ac_vub_simplegt_InstanceModel();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
              				incompleteObjects.push(element);
              				// initialize boolean attribute
              				{
              					Object value = false;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__DEBUG), value);
              				}
              			}
              			if (a10_0 != null) {
              				if (a10_0 != null) {
              					Object value = a10_0;
              					addObjectToList(element, be.ac.vub.simplegt.SimplegtPackage.MODULE__MODELS, value);
              					completedElement(value, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_7, a10_0, true);
              				copyLocalizationInfos(a10_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_9, 10);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_10, 10);
              	
            }
            // Simplegt.g:782:2: ( (a11= ',' (a12_0= parse_be_ac_vub_simplegt_InstanceModel ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Simplegt.g:783:3: (a11= ',' (a12_0= parse_be_ac_vub_simplegt_InstanceModel ) )
            	    {
            	    // Simplegt.g:783:3: (a11= ',' (a12_0= parse_be_ac_vub_simplegt_InstanceModel ) )
            	    // Simplegt.g:784:4: a11= ',' (a12_0= parse_be_ac_vub_simplegt_InstanceModel )
            	    {
            	    a11=(Token)match(input,17,FOLLOW_17_in_parse_be_ac_vub_simplegt_Module344); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
            	      					incompleteObjects.push(element);
            	      					// initialize boolean attribute
            	      					{
            	      						Object value = false;
            	      						element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__DEBUG), value);
            	      					}
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_8_0_0_0, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a11, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_8, 11, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_0);
            	      			
            	    }
            	    // Simplegt.g:803:4: (a12_0= parse_be_ac_vub_simplegt_InstanceModel )
            	    // Simplegt.g:804:5: a12_0= parse_be_ac_vub_simplegt_InstanceModel
            	    {
            	    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_InstanceModel_in_parse_be_ac_vub_simplegt_Module370);
            	    a12_0=parse_be_ac_vub_simplegt_InstanceModel();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
            	      						incompleteObjects.push(element);
            	      						// initialize boolean attribute
            	      						{
            	      							Object value = false;
            	      							element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__DEBUG), value);
            	      						}
            	      					}
            	      					if (a12_0 != null) {
            	      						if (a12_0 != null) {
            	      							Object value = a12_0;
            	      							addObjectToList(element, be.ac.vub.simplegt.SimplegtPackage.MODULE__MODELS, value);
            	      							completedElement(value, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_8_0_0_1, a12_0, true);
            	      						copyLocalizationInfos(a12_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_9, 12);
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_10, 12);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_9, 13);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_10, 13);
              	
            }
            a13=(Token)match(input,14,FOLLOW_14_in_parse_be_ac_vub_simplegt_Module411); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
              			incompleteObjects.push(element);
              			// initialize boolean attribute
              			{
              				Object value = false;
              				element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__DEBUG), value);
              			}
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_9, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a13, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_11, 14, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_1);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_12, 14, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_1);
              	
            }
            // Simplegt.g:863:2: ( (a14_0= parse_be_ac_vub_simplegt_Rule ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=19 && LA4_0<=20)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Simplegt.g:864:3: (a14_0= parse_be_ac_vub_simplegt_Rule )
            	    {
            	    // Simplegt.g:864:3: (a14_0= parse_be_ac_vub_simplegt_Rule )
            	    // Simplegt.g:865:4: a14_0= parse_be_ac_vub_simplegt_Rule
            	    {
            	    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_Rule_in_parse_be_ac_vub_simplegt_Module434);
            	    a14_0=parse_be_ac_vub_simplegt_Rule();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
            	      					incompleteObjects.push(element);
            	      					// initialize boolean attribute
            	      					{
            	      						Object value = false;
            	      						element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__DEBUG), value);
            	      					}
            	      				}
            	      				if (a14_0 != null) {
            	      					if (a14_0 != null) {
            	      						Object value = a14_0;
            	      						addObjectToList(element, be.ac.vub.simplegt.SimplegtPackage.MODULE__RULES, value);
            	      						completedElement(value, true);
            	      					}
            	      					collectHiddenTokens(element);
            	      					retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_10, a14_0, true);
            	      					copyLocalizationInfos(a14_0, element);
            	      				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_11, 15, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_1);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_12, 15, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_1);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, parse_be_ac_vub_simplegt_Module_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_Module"


    // $ANTLR start "parse_be_ac_vub_simplegt_InstanceModel"
    // Simplegt.g:899:1: parse_be_ac_vub_simplegt_InstanceModel returns [be.ac.vub.simplegt.InstanceModel element = null] : (a0= TEXT ) a1= ':' (a2_0= parse_be_ac_vub_simplegt_Metamodel ) ;
    public final be.ac.vub.simplegt.InstanceModel parse_be_ac_vub_simplegt_InstanceModel() throws RecognitionException {
        be.ac.vub.simplegt.InstanceModel element =  null;
        int parse_be_ac_vub_simplegt_InstanceModel_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        be.ac.vub.simplegt.Metamodel a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // Simplegt.g:902:1: ( (a0= TEXT ) a1= ':' (a2_0= parse_be_ac_vub_simplegt_Metamodel ) )
            // Simplegt.g:903:2: (a0= TEXT ) a1= ':' (a2_0= parse_be_ac_vub_simplegt_Metamodel )
            {
            // Simplegt.g:903:2: (a0= TEXT )
            // Simplegt.g:904:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_InstanceModel479); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInstanceModel();
              				incompleteObjects.push(element);
              			}
              			if (a0 != null) {
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INSTANCE_MODEL__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INSTANCE_MODEL__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_1_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_13, 16);
              	
            }
            a1=(Token)match(input,18,FOLLOW_18_in_parse_be_ac_vub_simplegt_InstanceModel500); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInstanceModel();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_1_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_14, 17, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_2);
              	
            }
            // Simplegt.g:953:2: (a2_0= parse_be_ac_vub_simplegt_Metamodel )
            // Simplegt.g:954:3: a2_0= parse_be_ac_vub_simplegt_Metamodel
            {
            pushFollow(FOLLOW_parse_be_ac_vub_simplegt_Metamodel_in_parse_be_ac_vub_simplegt_InstanceModel518);
            a2_0=parse_be_ac_vub_simplegt_Metamodel();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInstanceModel();
              				incompleteObjects.push(element);
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					Object value = a2_0;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INSTANCE_MODEL__META_MODEL), value);
              					completedElement(value, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_1_0_0_2, a2_0, true);
              				copyLocalizationInfos(a2_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_9, 18);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_10, 18);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, parse_be_ac_vub_simplegt_InstanceModel_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_InstanceModel"


    // $ANTLR start "parse_be_ac_vub_simplegt_Metamodel"
    // Simplegt.g:982:1: parse_be_ac_vub_simplegt_Metamodel returns [be.ac.vub.simplegt.Metamodel element = null] : (a0= TEXT ) ;
    public final be.ac.vub.simplegt.Metamodel parse_be_ac_vub_simplegt_Metamodel() throws RecognitionException {
        be.ac.vub.simplegt.Metamodel element =  null;
        int parse_be_ac_vub_simplegt_Metamodel_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // Simplegt.g:985:1: ( (a0= TEXT ) )
            // Simplegt.g:986:2: (a0= TEXT )
            {
            // Simplegt.g:986:2: (a0= TEXT )
            // Simplegt.g:987:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Metamodel555); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createMetamodel();
              				incompleteObjects.push(element);
              			}
              			if (a0 != null) {
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.METAMODEL__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.METAMODEL__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_2_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_9, 19);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_10, 19);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, parse_be_ac_vub_simplegt_Metamodel_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_Metamodel"


    // $ANTLR start "parse_be_ac_vub_simplegt_Rule"
    // Simplegt.g:1025:1: parse_be_ac_vub_simplegt_Rule returns [be.ac.vub.simplegt.Rule element = null] : ( (a0= 'abstract' )? ) a3= 'rule' (a4= TEXT ) ( (a5= 'extends' (a6= TEXT ) ( (a7= ',' (a8= TEXT ) ) )* ) )? a9= '{' ( (a10_0= parse_be_ac_vub_simplegt_InPattern ) )? ( (a11_0= parse_be_ac_vub_simplegt_NacPattern ) )* ( (a12_0= parse_be_ac_vub_simplegt_OutPattern ) )? a13= '}' ;
    public final be.ac.vub.simplegt.Rule parse_be_ac_vub_simplegt_Rule() throws RecognitionException {
        be.ac.vub.simplegt.Rule element =  null;
        int parse_be_ac_vub_simplegt_Rule_StartIndex = input.index();
        Token a0=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a13=null;
        be.ac.vub.simplegt.InPattern a10_0 = null;

        be.ac.vub.simplegt.NacPattern a11_0 = null;

        be.ac.vub.simplegt.OutPattern a12_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }
            // Simplegt.g:1028:1: ( ( (a0= 'abstract' )? ) a3= 'rule' (a4= TEXT ) ( (a5= 'extends' (a6= TEXT ) ( (a7= ',' (a8= TEXT ) ) )* ) )? a9= '{' ( (a10_0= parse_be_ac_vub_simplegt_InPattern ) )? ( (a11_0= parse_be_ac_vub_simplegt_NacPattern ) )* ( (a12_0= parse_be_ac_vub_simplegt_OutPattern ) )? a13= '}' )
            // Simplegt.g:1029:2: ( (a0= 'abstract' )? ) a3= 'rule' (a4= TEXT ) ( (a5= 'extends' (a6= TEXT ) ( (a7= ',' (a8= TEXT ) ) )* ) )? a9= '{' ( (a10_0= parse_be_ac_vub_simplegt_InPattern ) )? ( (a11_0= parse_be_ac_vub_simplegt_NacPattern ) )* ( (a12_0= parse_be_ac_vub_simplegt_OutPattern ) )? a13= '}'
            {
            // Simplegt.g:1029:2: ( (a0= 'abstract' )? )
            // Simplegt.g:1030:3: (a0= 'abstract' )?
            {
            // Simplegt.g:1030:3: (a0= 'abstract' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Simplegt.g:1031:4: a0= 'abstract'
                    {
                    a0=(Token)match(input,19,FOLLOW_19_in_parse_be_ac_vub_simplegt_Rule600); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createRule();
                      					incompleteObjects.push(element);
                      					// initialize boolean attribute
                      					{
                      						Object value = false;
                      						element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__ABSTRACT), value);
                      					}
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_3_0_0_2, true, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
                      				// set value of boolean attribute
                      				Object value = true;
                      				element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__ABSTRACT), value);
                      				completedElement(value, false);
                      			
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_12, 20);
              	
            }
            a3=(Token)match(input,20,FOLLOW_20_in_parse_be_ac_vub_simplegt_Rule621); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createRule();
              			incompleteObjects.push(element);
              			// initialize boolean attribute
              			{
              				Object value = false;
              				element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__ABSTRACT), value);
              			}
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_3_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_15, 21);
              	
            }
            // Simplegt.g:1074:2: (a4= TEXT )
            // Simplegt.g:1075:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Rule639); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createRule();
              				incompleteObjects.push(element);
              				// initialize boolean attribute
              				{
              					Object value = false;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__ABSTRACT), value);
              				}
              			}
              			if (a4 != null) {
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_3_0_0_4, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_16, 22);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_17, 22);
              	
            }
            // Simplegt.g:1116:2: ( (a5= 'extends' (a6= TEXT ) ( (a7= ',' (a8= TEXT ) ) )* ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Simplegt.g:1117:3: (a5= 'extends' (a6= TEXT ) ( (a7= ',' (a8= TEXT ) ) )* )
                    {
                    // Simplegt.g:1117:3: (a5= 'extends' (a6= TEXT ) ( (a7= ',' (a8= TEXT ) ) )* )
                    // Simplegt.g:1118:4: a5= 'extends' (a6= TEXT ) ( (a7= ',' (a8= TEXT ) ) )*
                    {
                    a5=(Token)match(input,21,FOLLOW_21_in_parse_be_ac_vub_simplegt_Rule669); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createRule();
                      					incompleteObjects.push(element);
                      					// initialize boolean attribute
                      					{
                      						Object value = false;
                      						element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__ABSTRACT), value);
                      					}
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_3_0_0_5_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_18, 23);
                      			
                    }
                    // Simplegt.g:1137:4: (a6= TEXT )
                    // Simplegt.g:1138:5: a6= TEXT
                    {
                    a6=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Rule695); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createRule();
                      						incompleteObjects.push(element);
                      						// initialize boolean attribute
                      						{
                      							Object value = false;
                      							element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__ABSTRACT), value);
                      						}
                      					}
                      					if (a6 != null) {
                      						be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      						tokenResolver.setOptions(getOptions());
                      						be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__EXTENDS), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String) resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							addObjectToList(element, be.ac.vub.simplegt.SimplegtPackage.RULE__EXTENDS, value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_3_0_0_5_0_0_1, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a6, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_19, 24);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_17, 24);
                      			
                    }
                    // Simplegt.g:1179:4: ( (a7= ',' (a8= TEXT ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==17) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // Simplegt.g:1180:5: (a7= ',' (a8= TEXT ) )
                    	    {
                    	    // Simplegt.g:1180:5: (a7= ',' (a8= TEXT ) )
                    	    // Simplegt.g:1181:6: a7= ',' (a8= TEXT )
                    	    {
                    	    a7=(Token)match(input,17,FOLLOW_17_in_parse_be_ac_vub_simplegt_Rule741); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (element == null) {
                    	      							element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createRule();
                    	      							incompleteObjects.push(element);
                    	      							// initialize boolean attribute
                    	      							{
                    	      								Object value = false;
                    	      								element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__ABSTRACT), value);
                    	      							}
                    	      						}
                    	      						collectHiddenTokens(element);
                    	      						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_3_0_0_5_0_0_2_0_0_0, null, true);
                    	      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a7, element);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_20, 25);
                    	      					
                    	    }
                    	    // Simplegt.g:1200:6: (a8= TEXT )
                    	    // Simplegt.g:1201:7: a8= TEXT
                    	    {
                    	    a8=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Rule775); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      							if (terminateParsing) {
                    	      								throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
                    	      							}
                    	      							if (element == null) {
                    	      								element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createRule();
                    	      								incompleteObjects.push(element);
                    	      								// initialize boolean attribute
                    	      								{
                    	      									Object value = false;
                    	      									element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__ABSTRACT), value);
                    	      								}
                    	      							}
                    	      							if (a8 != null) {
                    	      								be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                    	      								tokenResolver.setOptions(getOptions());
                    	      								be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
                    	      								tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__EXTENDS), result);
                    	      								Object resolvedObject = result.getResolvedToken();
                    	      								if (resolvedObject == null) {
                    	      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a8).getStopIndex());
                    	      								}
                    	      								java.lang.String resolved = (java.lang.String) resolvedObject;
                    	      								if (resolved != null) {
                    	      									Object value = resolved;
                    	      									addObjectToList(element, be.ac.vub.simplegt.SimplegtPackage.RULE__EXTENDS, value);
                    	      									completedElement(value, false);
                    	      								}
                    	      								collectHiddenTokens(element);
                    	      								retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_3_0_0_5_0_0_2_0_0_1, resolved, true);
                    	      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a8, element);
                    	      							}
                    	      						
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_19, 26);
                    	      						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_17, 26);
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_19, 27);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_17, 27);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_17, 28);
              	
            }
            a9=(Token)match(input,22,FOLLOW_22_in_parse_be_ac_vub_simplegt_Rule856); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createRule();
              			incompleteObjects.push(element);
              			// initialize boolean attribute
              			{
              				Object value = false;
              				element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__ABSTRACT), value);
              			}
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_3_0_0_6, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a9, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 29, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_3);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 29, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 29, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 29);
              	
            }
            // Simplegt.g:1279:2: ( (a10_0= parse_be_ac_vub_simplegt_InPattern ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Simplegt.g:1280:3: (a10_0= parse_be_ac_vub_simplegt_InPattern )
                    {
                    // Simplegt.g:1280:3: (a10_0= parse_be_ac_vub_simplegt_InPattern )
                    // Simplegt.g:1281:4: a10_0= parse_be_ac_vub_simplegt_InPattern
                    {
                    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_InPattern_in_parse_be_ac_vub_simplegt_Rule879);
                    a10_0=parse_be_ac_vub_simplegt_InPattern();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createRule();
                      					incompleteObjects.push(element);
                      					// initialize boolean attribute
                      					{
                      						Object value = false;
                      						element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__ABSTRACT), value);
                      					}
                      				}
                      				if (a10_0 != null) {
                      					if (a10_0 != null) {
                      						Object value = a10_0;
                      						element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__INPUT), value);
                      						completedElement(value, true);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_3_0_0_8, a10_0, true);
                      					copyLocalizationInfos(a10_0, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 30, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 30, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 30);
              	
            }
            // Simplegt.g:1314:2: ( (a11_0= parse_be_ac_vub_simplegt_NacPattern ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==35) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Simplegt.g:1315:3: (a11_0= parse_be_ac_vub_simplegt_NacPattern )
            	    {
            	    // Simplegt.g:1315:3: (a11_0= parse_be_ac_vub_simplegt_NacPattern )
            	    // Simplegt.g:1316:4: a11_0= parse_be_ac_vub_simplegt_NacPattern
            	    {
            	    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_NacPattern_in_parse_be_ac_vub_simplegt_Rule914);
            	    a11_0=parse_be_ac_vub_simplegt_NacPattern();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createRule();
            	      					incompleteObjects.push(element);
            	      					// initialize boolean attribute
            	      					{
            	      						Object value = false;
            	      						element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__ABSTRACT), value);
            	      					}
            	      				}
            	      				if (a11_0 != null) {
            	      					if (a11_0 != null) {
            	      						Object value = a11_0;
            	      						addObjectToList(element, be.ac.vub.simplegt.SimplegtPackage.RULE__NAC, value);
            	      						completedElement(value, true);
            	      					}
            	      					collectHiddenTokens(element);
            	      					retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_3_0_0_9, a11_0, true);
            	      					copyLocalizationInfos(a11_0, element);
            	      				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 31, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 31, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 31);
              	
            }
            // Simplegt.g:1349:2: ( (a12_0= parse_be_ac_vub_simplegt_OutPattern ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Simplegt.g:1350:3: (a12_0= parse_be_ac_vub_simplegt_OutPattern )
                    {
                    // Simplegt.g:1350:3: (a12_0= parse_be_ac_vub_simplegt_OutPattern )
                    // Simplegt.g:1351:4: a12_0= parse_be_ac_vub_simplegt_OutPattern
                    {
                    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_OutPattern_in_parse_be_ac_vub_simplegt_Rule949);
                    a12_0=parse_be_ac_vub_simplegt_OutPattern();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createRule();
                      					incompleteObjects.push(element);
                      					// initialize boolean attribute
                      					{
                      						Object value = false;
                      						element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__ABSTRACT), value);
                      					}
                      				}
                      				if (a12_0 != null) {
                      					if (a12_0 != null) {
                      						Object value = a12_0;
                      						element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__OUTPUT), value);
                      						completedElement(value, true);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_3_0_0_10, a12_0, true);
                      					copyLocalizationInfos(a12_0, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 32);
              	
            }
            a13=(Token)match(input,23,FOLLOW_23_in_parse_be_ac_vub_simplegt_Rule975); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createRule();
              			incompleteObjects.push(element);
              			// initialize boolean attribute
              			{
              				Object value = false;
              				element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__ABSTRACT), value);
              			}
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_3_0_0_11, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a13, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_11, 33, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_1);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_12, 33, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_1);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, parse_be_ac_vub_simplegt_Rule_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_Rule"


    // $ANTLR start "parse_be_ac_vub_simplegt_InPattern"
    // Simplegt.g:1404:1: parse_be_ac_vub_simplegt_InPattern returns [be.ac.vub.simplegt.InPattern element = null] : a0= 'from' (a1_0= parse_be_ac_vub_simplegt_InputElement ) ( (a2= ',' (a3_0= parse_be_ac_vub_simplegt_InputElement ) ) )* ;
    public final be.ac.vub.simplegt.InPattern parse_be_ac_vub_simplegt_InPattern() throws RecognitionException {
        be.ac.vub.simplegt.InPattern element =  null;
        int parse_be_ac_vub_simplegt_InPattern_StartIndex = input.index();
        Token a0=null;
        Token a2=null;
        be.ac.vub.simplegt.InputElement a1_0 = null;

        be.ac.vub.simplegt.InputElement a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }
            // Simplegt.g:1407:1: (a0= 'from' (a1_0= parse_be_ac_vub_simplegt_InputElement ) ( (a2= ',' (a3_0= parse_be_ac_vub_simplegt_InputElement ) ) )* )
            // Simplegt.g:1408:2: a0= 'from' (a1_0= parse_be_ac_vub_simplegt_InputElement ) ( (a2= ',' (a3_0= parse_be_ac_vub_simplegt_InputElement ) ) )*
            {
            a0=(Token)match(input,24,FOLLOW_24_in_parse_be_ac_vub_simplegt_InPattern1004); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInPattern();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_4_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_25, 34, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_6);
              	
            }
            // Simplegt.g:1422:2: (a1_0= parse_be_ac_vub_simplegt_InputElement )
            // Simplegt.g:1423:3: a1_0= parse_be_ac_vub_simplegt_InputElement
            {
            pushFollow(FOLLOW_parse_be_ac_vub_simplegt_InputElement_in_parse_be_ac_vub_simplegt_InPattern1022);
            a1_0=parse_be_ac_vub_simplegt_InputElement();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInPattern();
              				incompleteObjects.push(element);
              			}
              			if (a1_0 != null) {
              				if (a1_0 != null) {
              					Object value = a1_0;
              					addObjectToList(element, be.ac.vub.simplegt.SimplegtPackage.IN_PATTERN__ELEMENTS, value);
              					completedElement(value, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_4_0_0_1, a1_0, true);
              				copyLocalizationInfos(a1_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_26, 35);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 35, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 35, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 35);
              	
            }
            // Simplegt.g:1451:2: ( (a2= ',' (a3_0= parse_be_ac_vub_simplegt_InputElement ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Simplegt.g:1452:3: (a2= ',' (a3_0= parse_be_ac_vub_simplegt_InputElement ) )
            	    {
            	    // Simplegt.g:1452:3: (a2= ',' (a3_0= parse_be_ac_vub_simplegt_InputElement ) )
            	    // Simplegt.g:1453:4: a2= ',' (a3_0= parse_be_ac_vub_simplegt_InputElement )
            	    {
            	    a2=(Token)match(input,17,FOLLOW_17_in_parse_be_ac_vub_simplegt_InPattern1049); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInPattern();
            	      					incompleteObjects.push(element);
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_4_0_0_2_0_0_0, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_25, 36, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_6);
            	      			
            	    }
            	    // Simplegt.g:1467:4: (a3_0= parse_be_ac_vub_simplegt_InputElement )
            	    // Simplegt.g:1468:5: a3_0= parse_be_ac_vub_simplegt_InputElement
            	    {
            	    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_InputElement_in_parse_be_ac_vub_simplegt_InPattern1075);
            	    a3_0=parse_be_ac_vub_simplegt_InputElement();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInPattern();
            	      						incompleteObjects.push(element);
            	      					}
            	      					if (a3_0 != null) {
            	      						if (a3_0 != null) {
            	      							Object value = a3_0;
            	      							addObjectToList(element, be.ac.vub.simplegt.SimplegtPackage.IN_PATTERN__ELEMENTS, value);
            	      							completedElement(value, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_4_0_0_2_0_0_2, a3_0, true);
            	      						copyLocalizationInfos(a3_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_26, 37);
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 37, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 37, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 37);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_26, 38);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 38, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 38, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 38);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, parse_be_ac_vub_simplegt_InPattern_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_InPattern"


    // $ANTLR start "parse_be_ac_vub_simplegt_Type"
    // Simplegt.g:1508:1: parse_be_ac_vub_simplegt_Type returns [be.ac.vub.simplegt.Type element = null] : (a0= TEXT ) a1= '!' ( (a2= TEXT ) | (a3= QUOTED_34_34_92 ) ) ;
    public final be.ac.vub.simplegt.Type parse_be_ac_vub_simplegt_Type() throws RecognitionException {
        be.ac.vub.simplegt.Type element =  null;
        int parse_be_ac_vub_simplegt_Type_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }
            // Simplegt.g:1511:1: ( (a0= TEXT ) a1= '!' ( (a2= TEXT ) | (a3= QUOTED_34_34_92 ) ) )
            // Simplegt.g:1512:2: (a0= TEXT ) a1= '!' ( (a2= TEXT ) | (a3= QUOTED_34_34_92 ) )
            {
            // Simplegt.g:1512:2: (a0= TEXT )
            // Simplegt.g:1513:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Type1135); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createType();
              				incompleteObjects.push(element);
              			}
              			if (a0 != null) {
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.TYPE__MODEL), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				be.ac.vub.simplegt.Metamodel proxy = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createMetamodel();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtContextDependentURIFragmentFactory<be.ac.vub.simplegt.Type, be.ac.vub.simplegt.Metamodel>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypeModelReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.TYPE__MODEL), resolved, proxy);
              				if (proxy != null) {
              					Object value = proxy;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.TYPE__MODEL), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_5_0_0_0, proxy, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_28, 39);
              	
            }
            a1=(Token)match(input,25,FOLLOW_25_in_parse_be_ac_vub_simplegt_Type1156); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createType();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_5_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_29, 40);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_30, 40);
              	
            }
            // Simplegt.g:1567:2: ( (a2= TEXT ) | (a3= QUOTED_34_34_92 ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==TEXT) ) {
                alt12=1;
            }
            else if ( (LA12_0==QUOTED_34_34_92) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // Simplegt.g:1568:3: (a2= TEXT )
                    {
                    // Simplegt.g:1568:3: (a2= TEXT )
                    // Simplegt.g:1569:4: a2= TEXT
                    {
                    a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Type1179); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createType();
                      					incompleteObjects.push(element);
                      				}
                      				if (a2 != null) {
                      					be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      					tokenResolver.setOptions(getOptions());
                      					be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.TYPE__NAME), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.TYPE__NAME), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_5_0_0_2_0_0_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_31, 41);
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_32, 41);
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_26, 41);
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 41, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 41, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 41);
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_33, 41);
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_34, 41);
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_35, 41);
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_36, 41);
                      		
                    }

                    }
                    break;
                case 2 :
                    // Simplegt.g:1614:6: (a3= QUOTED_34_34_92 )
                    {
                    // Simplegt.g:1614:6: (a3= QUOTED_34_34_92 )
                    // Simplegt.g:1615:4: a3= QUOTED_34_34_92
                    {
                    a3=(Token)match(input,QUOTED_34_34_92,FOLLOW_QUOTED_34_34_92_in_parse_be_ac_vub_simplegt_Type1217); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createType();
                      					incompleteObjects.push(element);
                      				}
                      				if (a3 != null) {
                      					be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
                      					tokenResolver.setOptions(getOptions());
                      					be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.TYPE__NAME), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.TYPE__NAME), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_5_0_0_2_0_1_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_31, 42);
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_32, 42);
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_26, 42);
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 42, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 42, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 42);
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_33, 42);
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_34, 42);
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_35, 42);
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_36, 42);
                      		
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_31, 43);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_32, 43);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_26, 43);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 43, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 43, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 43);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_33, 43);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_34, 43);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_35, 43);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_36, 43);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, parse_be_ac_vub_simplegt_Type_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_Type"


    // $ANTLR start "parse_be_ac_vub_simplegt_InputElement"
    // Simplegt.g:1676:1: parse_be_ac_vub_simplegt_InputElement returns [be.ac.vub.simplegt.InputElement element = null] : (a0= TEXT ) a1= ':' (a2_0= parse_be_ac_vub_simplegt_Type ) ( (a3= 'in' (a4= TEXT ) ) )? ( (a5= '(' (a6_0= parse_be_ac_vub_simplegt_InputBinding ) ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_InputBinding ) ) )* a9= ')' ) )? ;
    public final be.ac.vub.simplegt.InputElement parse_be_ac_vub_simplegt_InputElement() throws RecognitionException {
        be.ac.vub.simplegt.InputElement element =  null;
        int parse_be_ac_vub_simplegt_InputElement_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a7=null;
        Token a9=null;
        be.ac.vub.simplegt.Type a2_0 = null;

        be.ac.vub.simplegt.InputBinding a6_0 = null;

        be.ac.vub.simplegt.InputBinding a8_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }
            // Simplegt.g:1679:1: ( (a0= TEXT ) a1= ':' (a2_0= parse_be_ac_vub_simplegt_Type ) ( (a3= 'in' (a4= TEXT ) ) )? ( (a5= '(' (a6_0= parse_be_ac_vub_simplegt_InputBinding ) ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_InputBinding ) ) )* a9= ')' ) )? )
            // Simplegt.g:1680:2: (a0= TEXT ) a1= ':' (a2_0= parse_be_ac_vub_simplegt_Type ) ( (a3= 'in' (a4= TEXT ) ) )? ( (a5= '(' (a6_0= parse_be_ac_vub_simplegt_InputBinding ) ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_InputBinding ) ) )* a9= ')' ) )?
            {
            // Simplegt.g:1680:2: (a0= TEXT )
            // Simplegt.g:1681:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_InputElement1270); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputElement();
              				incompleteObjects.push(element);
              			}
              			if (a0 != null) {
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_ELEMENT__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_ELEMENT__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_6_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_37, 44);
              	
            }
            a1=(Token)match(input,18,FOLLOW_18_in_parse_be_ac_vub_simplegt_InputElement1291); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputElement();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_6_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_27, 45, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_7);
              	
            }
            // Simplegt.g:1730:2: (a2_0= parse_be_ac_vub_simplegt_Type )
            // Simplegt.g:1731:3: a2_0= parse_be_ac_vub_simplegt_Type
            {
            pushFollow(FOLLOW_parse_be_ac_vub_simplegt_Type_in_parse_be_ac_vub_simplegt_InputElement1309);
            a2_0=parse_be_ac_vub_simplegt_Type();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputElement();
              				incompleteObjects.push(element);
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					Object value = a2_0;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_ELEMENT__TYPE), value);
              					completedElement(value, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_6_0_0_2, a2_0, true);
              				copyLocalizationInfos(a2_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_31, 46);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_32, 46);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_26, 46);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 46, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 46, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 46);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_33, 46);
              	
            }
            // Simplegt.g:1762:2: ( (a3= 'in' (a4= TEXT ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Simplegt.g:1763:3: (a3= 'in' (a4= TEXT ) )
                    {
                    // Simplegt.g:1763:3: (a3= 'in' (a4= TEXT ) )
                    // Simplegt.g:1764:4: a3= 'in' (a4= TEXT )
                    {
                    a3=(Token)match(input,26,FOLLOW_26_in_parse_be_ac_vub_simplegt_InputElement1336); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputElement();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_6_0_0_3_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_38, 47);
                      			
                    }
                    // Simplegt.g:1778:4: (a4= TEXT )
                    // Simplegt.g:1779:5: a4= TEXT
                    {
                    a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_InputElement1362); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputElement();
                      						incompleteObjects.push(element);
                      					}
                      					if (a4 != null) {
                      						be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      						tokenResolver.setOptions(getOptions());
                      						be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_ELEMENT__IN_MODEL), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStopIndex());
                      						}
                      						String resolved = (String) resolvedObject;
                      						be.ac.vub.simplegt.InstanceModel proxy = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInstanceModel();
                      						collectHiddenTokens(element);
                      						registerContextDependentProxy(new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtContextDependentURIFragmentFactory<be.ac.vub.simplegt.RuleElement, be.ac.vub.simplegt.InstanceModel>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getRuleElementInModelReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_ELEMENT__IN_MODEL), resolved, proxy);
                      						if (proxy != null) {
                      							Object value = proxy;
                      							element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_ELEMENT__IN_MODEL), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_6_0_0_3_0_0_1, proxy, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, element);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, proxy);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_32, 48);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_26, 48);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 48, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 48, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 48);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_33, 48);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_32, 49);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_26, 49);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 49, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 49, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 49);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_33, 49);
              	
            }
            // Simplegt.g:1835:2: ( (a5= '(' (a6_0= parse_be_ac_vub_simplegt_InputBinding ) ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_InputBinding ) ) )* a9= ')' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Simplegt.g:1836:3: (a5= '(' (a6_0= parse_be_ac_vub_simplegt_InputBinding ) ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_InputBinding ) ) )* a9= ')' )
                    {
                    // Simplegt.g:1836:3: (a5= '(' (a6_0= parse_be_ac_vub_simplegt_InputBinding ) ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_InputBinding ) ) )* a9= ')' )
                    // Simplegt.g:1837:4: a5= '(' (a6_0= parse_be_ac_vub_simplegt_InputBinding ) ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_InputBinding ) ) )* a9= ')'
                    {
                    a5=(Token)match(input,27,FOLLOW_27_in_parse_be_ac_vub_simplegt_InputElement1417); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputElement();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_6_0_0_4_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 50, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_8);
                      			
                    }
                    // Simplegt.g:1851:4: (a6_0= parse_be_ac_vub_simplegt_InputBinding )
                    // Simplegt.g:1852:5: a6_0= parse_be_ac_vub_simplegt_InputBinding
                    {
                    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_InputBinding_in_parse_be_ac_vub_simplegt_InputElement1443);
                    a6_0=parse_be_ac_vub_simplegt_InputBinding();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputElement();
                      						incompleteObjects.push(element);
                      					}
                      					if (a6_0 != null) {
                      						if (a6_0 != null) {
                      							Object value = a6_0;
                      							addObjectToList(element, be.ac.vub.simplegt.SimplegtPackage.INPUT_ELEMENT__BINDINGS, value);
                      							completedElement(value, true);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_6_0_0_4_0_0_2, a6_0, true);
                      						copyLocalizationInfos(a6_0, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 51);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_41, 51);
                      			
                    }
                    // Simplegt.g:1878:4: ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_InputBinding ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==17) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // Simplegt.g:1879:5: (a7= ',' (a8_0= parse_be_ac_vub_simplegt_InputBinding ) )
                    	    {
                    	    // Simplegt.g:1879:5: (a7= ',' (a8_0= parse_be_ac_vub_simplegt_InputBinding ) )
                    	    // Simplegt.g:1880:6: a7= ',' (a8_0= parse_be_ac_vub_simplegt_InputBinding )
                    	    {
                    	    a7=(Token)match(input,17,FOLLOW_17_in_parse_be_ac_vub_simplegt_InputElement1484); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (element == null) {
                    	      							element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputElement();
                    	      							incompleteObjects.push(element);
                    	      						}
                    	      						collectHiddenTokens(element);
                    	      						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_6_0_0_4_0_0_3_0_0_0, null, true);
                    	      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a7, element);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 52, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_8);
                    	      					
                    	    }
                    	    // Simplegt.g:1894:6: (a8_0= parse_be_ac_vub_simplegt_InputBinding )
                    	    // Simplegt.g:1895:7: a8_0= parse_be_ac_vub_simplegt_InputBinding
                    	    {
                    	    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_InputBinding_in_parse_be_ac_vub_simplegt_InputElement1518);
                    	    a8_0=parse_be_ac_vub_simplegt_InputBinding();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      							if (terminateParsing) {
                    	      								throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
                    	      							}
                    	      							if (element == null) {
                    	      								element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputElement();
                    	      								incompleteObjects.push(element);
                    	      							}
                    	      							if (a8_0 != null) {
                    	      								if (a8_0 != null) {
                    	      									Object value = a8_0;
                    	      									addObjectToList(element, be.ac.vub.simplegt.SimplegtPackage.INPUT_ELEMENT__BINDINGS, value);
                    	      									completedElement(value, true);
                    	      								}
                    	      								collectHiddenTokens(element);
                    	      								retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_6_0_0_4_0_0_3_0_0_1, a8_0, true);
                    	      								copyLocalizationInfos(a8_0, element);
                    	      							}
                    	      						
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 53);
                    	      						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_41, 53);
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 54);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_41, 54);
                      			
                    }
                    a9=(Token)match(input,28,FOLLOW_28_in_parse_be_ac_vub_simplegt_InputElement1579); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputElement();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_6_0_0_4_0_0_4, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a9, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_26, 55);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 55, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 55, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 55);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_33, 55);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_26, 56);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 56, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 56, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 56);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_33, 56);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, parse_be_ac_vub_simplegt_InputElement_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_InputElement"


    // $ANTLR start "parse_be_ac_vub_simplegt_InputBinding"
    // Simplegt.g:1960:1: parse_be_ac_vub_simplegt_InputBinding returns [be.ac.vub.simplegt.InputBinding element = null] : (a0= TEXT ) ( (a1= '=~|' | a2= '=~' ) ) (a4_0= parse_be_ac_vub_simplegt_Expression ) ;
    public final be.ac.vub.simplegt.InputBinding parse_be_ac_vub_simplegt_InputBinding() throws RecognitionException {
        be.ac.vub.simplegt.InputBinding element =  null;
        int parse_be_ac_vub_simplegt_InputBinding_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        be.ac.vub.simplegt.Expression a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }
            // Simplegt.g:1963:1: ( (a0= TEXT ) ( (a1= '=~|' | a2= '=~' ) ) (a4_0= parse_be_ac_vub_simplegt_Expression ) )
            // Simplegt.g:1964:2: (a0= TEXT ) ( (a1= '=~|' | a2= '=~' ) ) (a4_0= parse_be_ac_vub_simplegt_Expression )
            {
            // Simplegt.g:1964:2: (a0= TEXT )
            // Simplegt.g:1965:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_InputBinding1631); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputBinding();
              				incompleteObjects.push(element);
              			}
              			if (a0 != null) {
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_BINDING__PROPERTY), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_BINDING__PROPERTY), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_7_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_42, 57);
              	
            }
            // Simplegt.g:2000:2: ( (a1= '=~|' | a2= '=~' ) )
            // Simplegt.g:2001:3: (a1= '=~|' | a2= '=~' )
            {
            // Simplegt.g:2001:3: (a1= '=~|' | a2= '=~' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            else if ( (LA16_0==30) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // Simplegt.g:2002:4: a1= '=~|'
                    {
                    a1=(Token)match(input,29,FOLLOW_29_in_parse_be_ac_vub_simplegt_InputBinding1661); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputBinding();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_7_0_0_1, true, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      				// set value of boolean attribute
                      				Object value = true;
                      				element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_BINDING__LAST), value);
                      				completedElement(value, false);
                      			
                    }

                    }
                    break;
                case 2 :
                    // Simplegt.g:2015:8: a2= '=~'
                    {
                    a2=(Token)match(input,30,FOLLOW_30_in_parse_be_ac_vub_simplegt_InputBinding1676); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputBinding();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_7_0_0_1, false, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      				// set value of boolean attribute
                      				Object value = false;
                      				element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_BINDING__LAST), value);
                      				completedElement(value, false);
                      			
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_43, 58, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_44, 58, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_45, 58, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_46, 58, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_47, 58, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_48, 58, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              	
            }
            // Simplegt.g:2040:2: (a4_0= parse_be_ac_vub_simplegt_Expression )
            // Simplegt.g:2041:3: a4_0= parse_be_ac_vub_simplegt_Expression
            {
            pushFollow(FOLLOW_parse_be_ac_vub_simplegt_Expression_in_parse_be_ac_vub_simplegt_InputBinding1701);
            a4_0=parse_be_ac_vub_simplegt_Expression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputBinding();
              				incompleteObjects.push(element);
              			}
              			if (a4_0 != null) {
              				if (a4_0 != null) {
              					Object value = a4_0;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_BINDING__EXPR), value);
              					completedElement(value, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_7_0_0_2, a4_0, true);
              				copyLocalizationInfos(a4_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 59);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_41, 59);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, parse_be_ac_vub_simplegt_InputBinding_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_InputBinding"


    // $ANTLR start "parse_be_ac_vub_simplegt_ElementExp"
    // Simplegt.g:2069:1: parse_be_ac_vub_simplegt_ElementExp returns [be.ac.vub.simplegt.ElementExp element = null] : (a0= TEXT ) ( (a1= '.' (a2= TEXT ) ) )? ;
    public final be.ac.vub.simplegt.ElementExp parse_be_ac_vub_simplegt_ElementExp() throws RecognitionException {
        be.ac.vub.simplegt.ElementExp element =  null;
        int parse_be_ac_vub_simplegt_ElementExp_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }
            // Simplegt.g:2072:1: ( (a0= TEXT ) ( (a1= '.' (a2= TEXT ) ) )? )
            // Simplegt.g:2073:2: (a0= TEXT ) ( (a1= '.' (a2= TEXT ) ) )?
            {
            // Simplegt.g:2073:2: (a0= TEXT )
            // Simplegt.g:2074:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_ElementExp1738); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createElementExp();
              				incompleteObjects.push(element);
              			}
              			if (a0 != null) {
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.ELEMENT_EXP__ELEMENT), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				be.ac.vub.simplegt.RuleElement proxy = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputElement();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtContextDependentURIFragmentFactory<be.ac.vub.simplegt.ElementExp, be.ac.vub.simplegt.RuleElement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementExpElementReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.ELEMENT_EXP__ELEMENT), resolved, proxy);
              				if (proxy != null) {
              					Object value = proxy;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.ELEMENT_EXP__ELEMENT), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_8_0_0_0, proxy, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_49, 60);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 60);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_41, 60);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 60);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 60);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 60);
              	
            }
            // Simplegt.g:2118:2: ( (a1= '.' (a2= TEXT ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // Simplegt.g:2119:3: (a1= '.' (a2= TEXT ) )
                    {
                    // Simplegt.g:2119:3: (a1= '.' (a2= TEXT ) )
                    // Simplegt.g:2120:4: a1= '.' (a2= TEXT )
                    {
                    a1=(Token)match(input,31,FOLLOW_31_in_parse_be_ac_vub_simplegt_ElementExp1768); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createElementExp();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_8_0_0_1_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_53, 61);
                      			
                    }
                    // Simplegt.g:2134:4: (a2= TEXT )
                    // Simplegt.g:2135:5: a2= TEXT
                    {
                    a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_ElementExp1794); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createElementExp();
                      						incompleteObjects.push(element);
                      					}
                      					if (a2 != null) {
                      						be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      						tokenResolver.setOptions(getOptions());
                      						be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.ELEMENT_EXP__PROPERTY), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String) resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.ELEMENT_EXP__PROPERTY), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_8_0_0_1_0_0_1, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 62);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_41, 62);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 62);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 62);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 62);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 63);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_41, 63);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 63);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 63);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 63);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, parse_be_ac_vub_simplegt_ElementExp_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_ElementExp"


    // $ANTLR start "parse_be_ac_vub_simplegt_StringLiteralExp"
    // Simplegt.g:2187:1: parse_be_ac_vub_simplegt_StringLiteralExp returns [be.ac.vub.simplegt.StringLiteralExp element = null] : (a0= QUOTED_39_39_92 ) ;
    public final be.ac.vub.simplegt.StringLiteralExp parse_be_ac_vub_simplegt_StringLiteralExp() throws RecognitionException {
        be.ac.vub.simplegt.StringLiteralExp element =  null;
        int parse_be_ac_vub_simplegt_StringLiteralExp_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }
            // Simplegt.g:2190:1: ( (a0= QUOTED_39_39_92 ) )
            // Simplegt.g:2191:2: (a0= QUOTED_39_39_92 )
            {
            // Simplegt.g:2191:2: (a0= QUOTED_39_39_92 )
            // Simplegt.g:2192:3: a0= QUOTED_39_39_92
            {
            a0=(Token)match(input,QUOTED_39_39_92,FOLLOW_QUOTED_39_39_92_in_parse_be_ac_vub_simplegt_StringLiteralExp1859); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createStringLiteralExp();
              				incompleteObjects.push(element);
              			}
              			if (a0 != null) {
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39_92");
              				tokenResolver.setOptions(getOptions());
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.STRING_LITERAL_EXP__LITERAL), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.STRING_LITERAL_EXP__LITERAL), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_9_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 64);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_41, 64);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 64);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 64);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 64);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, parse_be_ac_vub_simplegt_StringLiteralExp_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_StringLiteralExp"


    // $ANTLR start "parse_be_ac_vub_simplegt_IntegerLiteralExp"
    // Simplegt.g:2233:1: parse_be_ac_vub_simplegt_IntegerLiteralExp returns [be.ac.vub.simplegt.IntegerLiteralExp element = null] : (a0= INTEGER ) ;
    public final be.ac.vub.simplegt.IntegerLiteralExp parse_be_ac_vub_simplegt_IntegerLiteralExp() throws RecognitionException {
        be.ac.vub.simplegt.IntegerLiteralExp element =  null;
        int parse_be_ac_vub_simplegt_IntegerLiteralExp_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }
            // Simplegt.g:2236:1: ( (a0= INTEGER ) )
            // Simplegt.g:2237:2: (a0= INTEGER )
            {
            // Simplegt.g:2237:2: (a0= INTEGER )
            // Simplegt.g:2238:3: a0= INTEGER
            {
            a0=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_be_ac_vub_simplegt_IntegerLiteralExp1899); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createIntegerLiteralExp();
              				incompleteObjects.push(element);
              			}
              			if (a0 != null) {
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
              				tokenResolver.setOptions(getOptions());
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INTEGER_LITERAL_EXP__LITERAL), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INTEGER_LITERAL_EXP__LITERAL), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_10_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 65);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_41, 65);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 65);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 65);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 65);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, parse_be_ac_vub_simplegt_IntegerLiteralExp_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_IntegerLiteralExp"


    // $ANTLR start "parse_be_ac_vub_simplegt_DoubleLiteralExp"
    // Simplegt.g:2279:1: parse_be_ac_vub_simplegt_DoubleLiteralExp returns [be.ac.vub.simplegt.DoubleLiteralExp element = null] : (a0= FLOAT ) ;
    public final be.ac.vub.simplegt.DoubleLiteralExp parse_be_ac_vub_simplegt_DoubleLiteralExp() throws RecognitionException {
        be.ac.vub.simplegt.DoubleLiteralExp element =  null;
        int parse_be_ac_vub_simplegt_DoubleLiteralExp_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }
            // Simplegt.g:2282:1: ( (a0= FLOAT ) )
            // Simplegt.g:2283:2: (a0= FLOAT )
            {
            // Simplegt.g:2283:2: (a0= FLOAT )
            // Simplegt.g:2284:3: a0= FLOAT
            {
            a0=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_parse_be_ac_vub_simplegt_DoubleLiteralExp1939); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createDoubleLiteralExp();
              				incompleteObjects.push(element);
              			}
              			if (a0 != null) {
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("FLOAT");
              				tokenResolver.setOptions(getOptions());
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.DOUBLE_LITERAL_EXP__LITERAL), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.Double resolved = (java.lang.Double) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.DOUBLE_LITERAL_EXP__LITERAL), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_11_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 66);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_41, 66);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 66);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 66);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 66);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, parse_be_ac_vub_simplegt_DoubleLiteralExp_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_DoubleLiteralExp"


    // $ANTLR start "parse_be_ac_vub_simplegt_BooleanLiteralExp"
    // Simplegt.g:2325:1: parse_be_ac_vub_simplegt_BooleanLiteralExp returns [be.ac.vub.simplegt.BooleanLiteralExp element = null] : ( (a0= 'true' | a1= 'false' ) ) ;
    public final be.ac.vub.simplegt.BooleanLiteralExp parse_be_ac_vub_simplegt_BooleanLiteralExp() throws RecognitionException {
        be.ac.vub.simplegt.BooleanLiteralExp element =  null;
        int parse_be_ac_vub_simplegt_BooleanLiteralExp_StartIndex = input.index();
        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }
            // Simplegt.g:2328:1: ( ( (a0= 'true' | a1= 'false' ) ) )
            // Simplegt.g:2329:2: ( (a0= 'true' | a1= 'false' ) )
            {
            // Simplegt.g:2329:2: ( (a0= 'true' | a1= 'false' ) )
            // Simplegt.g:2330:3: (a0= 'true' | a1= 'false' )
            {
            // Simplegt.g:2330:3: (a0= 'true' | a1= 'false' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            else if ( (LA18_0==33) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // Simplegt.g:2331:4: a0= 'true'
                    {
                    a0=(Token)match(input,32,FOLLOW_32_in_parse_be_ac_vub_simplegt_BooleanLiteralExp1984); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createBooleanLiteralExp();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_12_0_0_0, true, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
                      				// set value of boolean attribute
                      				Object value = true;
                      				element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.BOOLEAN_LITERAL_EXP__LITERAL), value);
                      				completedElement(value, false);
                      			
                    }

                    }
                    break;
                case 2 :
                    // Simplegt.g:2344:8: a1= 'false'
                    {
                    a1=(Token)match(input,33,FOLLOW_33_in_parse_be_ac_vub_simplegt_BooleanLiteralExp1999); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createBooleanLiteralExp();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_12_0_0_0, false, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      				// set value of boolean attribute
                      				Object value = false;
                      				element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.BOOLEAN_LITERAL_EXP__LITERAL), value);
                      				completedElement(value, false);
                      			
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 67);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_41, 67);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 67);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 67);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 67);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, parse_be_ac_vub_simplegt_BooleanLiteralExp_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_BooleanLiteralExp"


    // $ANTLR start "parse_be_ac_vub_simplegt_EnumLiteralExp"
    // Simplegt.g:2370:1: parse_be_ac_vub_simplegt_EnumLiteralExp returns [be.ac.vub.simplegt.EnumLiteralExp element = null] : a0= '#' ( (a1= TEXT ) | (a2= QUOTED_34_34_92 ) ) ;
    public final be.ac.vub.simplegt.EnumLiteralExp parse_be_ac_vub_simplegt_EnumLiteralExp() throws RecognitionException {
        be.ac.vub.simplegt.EnumLiteralExp element =  null;
        int parse_be_ac_vub_simplegt_EnumLiteralExp_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }
            // Simplegt.g:2373:1: (a0= '#' ( (a1= TEXT ) | (a2= QUOTED_34_34_92 ) ) )
            // Simplegt.g:2374:2: a0= '#' ( (a1= TEXT ) | (a2= QUOTED_34_34_92 ) )
            {
            a0=(Token)match(input,34,FOLLOW_34_in_parse_be_ac_vub_simplegt_EnumLiteralExp2035); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createEnumLiteralExp();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_13_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_54, 68);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_55, 68);
              	
            }
            // Simplegt.g:2389:2: ( (a1= TEXT ) | (a2= QUOTED_34_34_92 ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==TEXT) ) {
                alt19=1;
            }
            else if ( (LA19_0==QUOTED_34_34_92) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // Simplegt.g:2390:3: (a1= TEXT )
                    {
                    // Simplegt.g:2390:3: (a1= TEXT )
                    // Simplegt.g:2391:4: a1= TEXT
                    {
                    a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_EnumLiteralExp2058); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createEnumLiteralExp();
                      					incompleteObjects.push(element);
                      				}
                      				if (a1 != null) {
                      					be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      					tokenResolver.setOptions(getOptions());
                      					be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.ENUM_LITERAL_EXP__LITERAL), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.ENUM_LITERAL_EXP__LITERAL), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_13_0_0_1_0_0_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 69);
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_41, 69);
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 69);
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 69);
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 69);
                      		
                    }

                    }
                    break;
                case 2 :
                    // Simplegt.g:2431:6: (a2= QUOTED_34_34_92 )
                    {
                    // Simplegt.g:2431:6: (a2= QUOTED_34_34_92 )
                    // Simplegt.g:2432:4: a2= QUOTED_34_34_92
                    {
                    a2=(Token)match(input,QUOTED_34_34_92,FOLLOW_QUOTED_34_34_92_in_parse_be_ac_vub_simplegt_EnumLiteralExp2096); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createEnumLiteralExp();
                      					incompleteObjects.push(element);
                      				}
                      				if (a2 != null) {
                      					be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
                      					tokenResolver.setOptions(getOptions());
                      					be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.ENUM_LITERAL_EXP__LITERAL), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.ENUM_LITERAL_EXP__LITERAL), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_13_0_0_1_0_1_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 70);
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_41, 70);
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 70);
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 70);
                      			addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 70);
                      		
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 71);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_41, 71);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 71);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 71);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 71);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, parse_be_ac_vub_simplegt_EnumLiteralExp_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_EnumLiteralExp"


    // $ANTLR start "parse_be_ac_vub_simplegt_NacPattern"
    // Simplegt.g:2483:1: parse_be_ac_vub_simplegt_NacPattern returns [be.ac.vub.simplegt.NacPattern element = null] : a0= 'not' (a1_0= parse_be_ac_vub_simplegt_InputElement ) ( (a2= ',' (a3_0= parse_be_ac_vub_simplegt_InputElement ) ) )* ;
    public final be.ac.vub.simplegt.NacPattern parse_be_ac_vub_simplegt_NacPattern() throws RecognitionException {
        be.ac.vub.simplegt.NacPattern element =  null;
        int parse_be_ac_vub_simplegt_NacPattern_StartIndex = input.index();
        Token a0=null;
        Token a2=null;
        be.ac.vub.simplegt.InputElement a1_0 = null;

        be.ac.vub.simplegt.InputElement a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }
            // Simplegt.g:2486:1: (a0= 'not' (a1_0= parse_be_ac_vub_simplegt_InputElement ) ( (a2= ',' (a3_0= parse_be_ac_vub_simplegt_InputElement ) ) )* )
            // Simplegt.g:2487:2: a0= 'not' (a1_0= parse_be_ac_vub_simplegt_InputElement ) ( (a2= ',' (a3_0= parse_be_ac_vub_simplegt_InputElement ) ) )*
            {
            a0=(Token)match(input,35,FOLLOW_35_in_parse_be_ac_vub_simplegt_NacPattern2145); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createNacPattern();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_14_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_25, 72, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_6);
              	
            }
            // Simplegt.g:2501:2: (a1_0= parse_be_ac_vub_simplegt_InputElement )
            // Simplegt.g:2502:3: a1_0= parse_be_ac_vub_simplegt_InputElement
            {
            pushFollow(FOLLOW_parse_be_ac_vub_simplegt_InputElement_in_parse_be_ac_vub_simplegt_NacPattern2163);
            a1_0=parse_be_ac_vub_simplegt_InputElement();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createNacPattern();
              				incompleteObjects.push(element);
              			}
              			if (a1_0 != null) {
              				if (a1_0 != null) {
              					Object value = a1_0;
              					addObjectToList(element, be.ac.vub.simplegt.SimplegtPackage.NAC_PATTERN__ELEMENTS, value);
              					completedElement(value, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_14_0_0_1, a1_0, true);
              				copyLocalizationInfos(a1_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_33, 73);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 73, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 73, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 73);
              	
            }
            // Simplegt.g:2530:2: ( (a2= ',' (a3_0= parse_be_ac_vub_simplegt_InputElement ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==17) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Simplegt.g:2531:3: (a2= ',' (a3_0= parse_be_ac_vub_simplegt_InputElement ) )
            	    {
            	    // Simplegt.g:2531:3: (a2= ',' (a3_0= parse_be_ac_vub_simplegt_InputElement ) )
            	    // Simplegt.g:2532:4: a2= ',' (a3_0= parse_be_ac_vub_simplegt_InputElement )
            	    {
            	    a2=(Token)match(input,17,FOLLOW_17_in_parse_be_ac_vub_simplegt_NacPattern2190); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createNacPattern();
            	      					incompleteObjects.push(element);
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_14_0_0_2_0_0_0, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_25, 74, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_6);
            	      			
            	    }
            	    // Simplegt.g:2546:4: (a3_0= parse_be_ac_vub_simplegt_InputElement )
            	    // Simplegt.g:2547:5: a3_0= parse_be_ac_vub_simplegt_InputElement
            	    {
            	    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_InputElement_in_parse_be_ac_vub_simplegt_NacPattern2216);
            	    a3_0=parse_be_ac_vub_simplegt_InputElement();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createNacPattern();
            	      						incompleteObjects.push(element);
            	      					}
            	      					if (a3_0 != null) {
            	      						if (a3_0 != null) {
            	      							Object value = a3_0;
            	      							addObjectToList(element, be.ac.vub.simplegt.SimplegtPackage.NAC_PATTERN__ELEMENTS, value);
            	      							completedElement(value, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_14_0_0_2_0_0_2, a3_0, true);
            	      						copyLocalizationInfos(a3_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_33, 75);
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 75, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 75, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 75);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_33, 76);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 76, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 76, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 76);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, parse_be_ac_vub_simplegt_NacPattern_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_NacPattern"


    // $ANTLR start "parse_be_ac_vub_simplegt_OutPattern"
    // Simplegt.g:2587:1: parse_be_ac_vub_simplegt_OutPattern returns [be.ac.vub.simplegt.OutPattern element = null] : a0= 'to' (a1_0= parse_be_ac_vub_simplegt_OutputElement ) ( (a2= ',' (a3_0= parse_be_ac_vub_simplegt_OutputElement ) ) )* ;
    public final be.ac.vub.simplegt.OutPattern parse_be_ac_vub_simplegt_OutPattern() throws RecognitionException {
        be.ac.vub.simplegt.OutPattern element =  null;
        int parse_be_ac_vub_simplegt_OutPattern_StartIndex = input.index();
        Token a0=null;
        Token a2=null;
        be.ac.vub.simplegt.OutputElement a1_0 = null;

        be.ac.vub.simplegt.OutputElement a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }
            // Simplegt.g:2590:1: (a0= 'to' (a1_0= parse_be_ac_vub_simplegt_OutputElement ) ( (a2= ',' (a3_0= parse_be_ac_vub_simplegt_OutputElement ) ) )* )
            // Simplegt.g:2591:2: a0= 'to' (a1_0= parse_be_ac_vub_simplegt_OutputElement ) ( (a2= ',' (a3_0= parse_be_ac_vub_simplegt_OutputElement ) ) )*
            {
            a0=(Token)match(input,36,FOLLOW_36_in_parse_be_ac_vub_simplegt_OutPattern2272); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutPattern();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_15_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_56, 77, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_10);
              	
            }
            // Simplegt.g:2605:2: (a1_0= parse_be_ac_vub_simplegt_OutputElement )
            // Simplegt.g:2606:3: a1_0= parse_be_ac_vub_simplegt_OutputElement
            {
            pushFollow(FOLLOW_parse_be_ac_vub_simplegt_OutputElement_in_parse_be_ac_vub_simplegt_OutPattern2290);
            a1_0=parse_be_ac_vub_simplegt_OutputElement();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutPattern();
              				incompleteObjects.push(element);
              			}
              			if (a1_0 != null) {
              				if (a1_0 != null) {
              					Object value = a1_0;
              					addObjectToList(element, be.ac.vub.simplegt.SimplegtPackage.OUT_PATTERN__ELEMENTS, value);
              					completedElement(value, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_15_0_0_1, a1_0, true);
              				copyLocalizationInfos(a1_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_36, 78);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 78);
              	
            }
            // Simplegt.g:2632:2: ( (a2= ',' (a3_0= parse_be_ac_vub_simplegt_OutputElement ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==17) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Simplegt.g:2633:3: (a2= ',' (a3_0= parse_be_ac_vub_simplegt_OutputElement ) )
            	    {
            	    // Simplegt.g:2633:3: (a2= ',' (a3_0= parse_be_ac_vub_simplegt_OutputElement ) )
            	    // Simplegt.g:2634:4: a2= ',' (a3_0= parse_be_ac_vub_simplegt_OutputElement )
            	    {
            	    a2=(Token)match(input,17,FOLLOW_17_in_parse_be_ac_vub_simplegt_OutPattern2317); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutPattern();
            	      					incompleteObjects.push(element);
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_15_0_0_2_0_0_0, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_56, 79, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_10);
            	      			
            	    }
            	    // Simplegt.g:2648:4: (a3_0= parse_be_ac_vub_simplegt_OutputElement )
            	    // Simplegt.g:2649:5: a3_0= parse_be_ac_vub_simplegt_OutputElement
            	    {
            	    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_OutputElement_in_parse_be_ac_vub_simplegt_OutPattern2343);
            	    a3_0=parse_be_ac_vub_simplegt_OutputElement();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutPattern();
            	      						incompleteObjects.push(element);
            	      					}
            	      					if (a3_0 != null) {
            	      						if (a3_0 != null) {
            	      							Object value = a3_0;
            	      							addObjectToList(element, be.ac.vub.simplegt.SimplegtPackage.OUT_PATTERN__ELEMENTS, value);
            	      							completedElement(value, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_15_0_0_2_0_0_2, a3_0, true);
            	      						copyLocalizationInfos(a3_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_36, 80);
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 80);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_36, 81);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 81);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, parse_be_ac_vub_simplegt_OutPattern_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_OutPattern"


    // $ANTLR start "parse_be_ac_vub_simplegt_OutputElement"
    // Simplegt.g:2685:1: parse_be_ac_vub_simplegt_OutputElement returns [be.ac.vub.simplegt.OutputElement element = null] : (a0= TEXT ) a1= ':' (a2_0= parse_be_ac_vub_simplegt_Type ) ( (a3= 'in' (a4= TEXT ) ) )? ( (a5= '(' (a6_0= parse_be_ac_vub_simplegt_OutputBinding ) ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_OutputBinding ) ) )* a9= ')' ) )? ;
    public final be.ac.vub.simplegt.OutputElement parse_be_ac_vub_simplegt_OutputElement() throws RecognitionException {
        be.ac.vub.simplegt.OutputElement element =  null;
        int parse_be_ac_vub_simplegt_OutputElement_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a7=null;
        Token a9=null;
        be.ac.vub.simplegt.Type a2_0 = null;

        be.ac.vub.simplegt.OutputBinding a6_0 = null;

        be.ac.vub.simplegt.OutputBinding a8_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }
            // Simplegt.g:2688:1: ( (a0= TEXT ) a1= ':' (a2_0= parse_be_ac_vub_simplegt_Type ) ( (a3= 'in' (a4= TEXT ) ) )? ( (a5= '(' (a6_0= parse_be_ac_vub_simplegt_OutputBinding ) ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_OutputBinding ) ) )* a9= ')' ) )? )
            // Simplegt.g:2689:2: (a0= TEXT ) a1= ':' (a2_0= parse_be_ac_vub_simplegt_Type ) ( (a3= 'in' (a4= TEXT ) ) )? ( (a5= '(' (a6_0= parse_be_ac_vub_simplegt_OutputBinding ) ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_OutputBinding ) ) )* a9= ')' ) )?
            {
            // Simplegt.g:2689:2: (a0= TEXT )
            // Simplegt.g:2690:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_OutputElement2403); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputElement();
              				incompleteObjects.push(element);
              			}
              			if (a0 != null) {
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_ELEMENT__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_ELEMENT__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_16_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_57, 82);
              	
            }
            a1=(Token)match(input,18,FOLLOW_18_in_parse_be_ac_vub_simplegt_OutputElement2424); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputElement();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_16_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_27, 83, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_7);
              	
            }
            // Simplegt.g:2739:2: (a2_0= parse_be_ac_vub_simplegt_Type )
            // Simplegt.g:2740:3: a2_0= parse_be_ac_vub_simplegt_Type
            {
            pushFollow(FOLLOW_parse_be_ac_vub_simplegt_Type_in_parse_be_ac_vub_simplegt_OutputElement2442);
            a2_0=parse_be_ac_vub_simplegt_Type();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputElement();
              				incompleteObjects.push(element);
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					Object value = a2_0;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_ELEMENT__TYPE), value);
              					completedElement(value, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_16_0_0_2, a2_0, true);
              				copyLocalizationInfos(a2_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_34, 84);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_35, 84);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_36, 84);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 84);
              	
            }
            // Simplegt.g:2768:2: ( (a3= 'in' (a4= TEXT ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // Simplegt.g:2769:3: (a3= 'in' (a4= TEXT ) )
                    {
                    // Simplegt.g:2769:3: (a3= 'in' (a4= TEXT ) )
                    // Simplegt.g:2770:4: a3= 'in' (a4= TEXT )
                    {
                    a3=(Token)match(input,26,FOLLOW_26_in_parse_be_ac_vub_simplegt_OutputElement2469); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputElement();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_16_0_0_3_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_58, 85);
                      			
                    }
                    // Simplegt.g:2784:4: (a4= TEXT )
                    // Simplegt.g:2785:5: a4= TEXT
                    {
                    a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_OutputElement2495); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputElement();
                      						incompleteObjects.push(element);
                      					}
                      					if (a4 != null) {
                      						be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      						tokenResolver.setOptions(getOptions());
                      						be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_ELEMENT__IN_MODEL), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStopIndex());
                      						}
                      						String resolved = (String) resolvedObject;
                      						be.ac.vub.simplegt.InstanceModel proxy = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInstanceModel();
                      						collectHiddenTokens(element);
                      						registerContextDependentProxy(new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtContextDependentURIFragmentFactory<be.ac.vub.simplegt.RuleElement, be.ac.vub.simplegt.InstanceModel>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getRuleElementInModelReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_ELEMENT__IN_MODEL), resolved, proxy);
                      						if (proxy != null) {
                      							Object value = proxy;
                      							element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_ELEMENT__IN_MODEL), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_16_0_0_3_0_0_1, proxy, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, element);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, proxy);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_35, 86);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_36, 86);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 86);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_35, 87);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_36, 87);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 87);
              	
            }
            // Simplegt.g:2835:2: ( (a5= '(' (a6_0= parse_be_ac_vub_simplegt_OutputBinding ) ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_OutputBinding ) ) )* a9= ')' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==27) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // Simplegt.g:2836:3: (a5= '(' (a6_0= parse_be_ac_vub_simplegt_OutputBinding ) ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_OutputBinding ) ) )* a9= ')' )
                    {
                    // Simplegt.g:2836:3: (a5= '(' (a6_0= parse_be_ac_vub_simplegt_OutputBinding ) ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_OutputBinding ) ) )* a9= ')' )
                    // Simplegt.g:2837:4: a5= '(' (a6_0= parse_be_ac_vub_simplegt_OutputBinding ) ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_OutputBinding ) ) )* a9= ')'
                    {
                    a5=(Token)match(input,27,FOLLOW_27_in_parse_be_ac_vub_simplegt_OutputElement2550); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputElement();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_16_0_0_4_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_59, 88, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_11);
                      			
                    }
                    // Simplegt.g:2851:4: (a6_0= parse_be_ac_vub_simplegt_OutputBinding )
                    // Simplegt.g:2852:5: a6_0= parse_be_ac_vub_simplegt_OutputBinding
                    {
                    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_OutputBinding_in_parse_be_ac_vub_simplegt_OutputElement2576);
                    a6_0=parse_be_ac_vub_simplegt_OutputBinding();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputElement();
                      						incompleteObjects.push(element);
                      					}
                      					if (a6_0 != null) {
                      						if (a6_0 != null) {
                      							Object value = a6_0;
                      							addObjectToList(element, be.ac.vub.simplegt.SimplegtPackage.OUTPUT_ELEMENT__BINDINGS, value);
                      							completedElement(value, true);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_16_0_0_4_0_0_2, a6_0, true);
                      						copyLocalizationInfos(a6_0, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 89);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 89);
                      			
                    }
                    // Simplegt.g:2878:4: ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_OutputBinding ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==17) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // Simplegt.g:2879:5: (a7= ',' (a8_0= parse_be_ac_vub_simplegt_OutputBinding ) )
                    	    {
                    	    // Simplegt.g:2879:5: (a7= ',' (a8_0= parse_be_ac_vub_simplegt_OutputBinding ) )
                    	    // Simplegt.g:2880:6: a7= ',' (a8_0= parse_be_ac_vub_simplegt_OutputBinding )
                    	    {
                    	    a7=(Token)match(input,17,FOLLOW_17_in_parse_be_ac_vub_simplegt_OutputElement2617); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (element == null) {
                    	      							element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputElement();
                    	      							incompleteObjects.push(element);
                    	      						}
                    	      						collectHiddenTokens(element);
                    	      						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_16_0_0_4_0_0_3_0_0_0, null, true);
                    	      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a7, element);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_59, 90, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_11);
                    	      					
                    	    }
                    	    // Simplegt.g:2894:6: (a8_0= parse_be_ac_vub_simplegt_OutputBinding )
                    	    // Simplegt.g:2895:7: a8_0= parse_be_ac_vub_simplegt_OutputBinding
                    	    {
                    	    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_OutputBinding_in_parse_be_ac_vub_simplegt_OutputElement2651);
                    	    a8_0=parse_be_ac_vub_simplegt_OutputBinding();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      							if (terminateParsing) {
                    	      								throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
                    	      							}
                    	      							if (element == null) {
                    	      								element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputElement();
                    	      								incompleteObjects.push(element);
                    	      							}
                    	      							if (a8_0 != null) {
                    	      								if (a8_0 != null) {
                    	      									Object value = a8_0;
                    	      									addObjectToList(element, be.ac.vub.simplegt.SimplegtPackage.OUTPUT_ELEMENT__BINDINGS, value);
                    	      									completedElement(value, true);
                    	      								}
                    	      								collectHiddenTokens(element);
                    	      								retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_16_0_0_4_0_0_3_0_0_1, a8_0, true);
                    	      								copyLocalizationInfos(a8_0, element);
                    	      							}
                    	      						
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 91);
                    	      						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 91);
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 92);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 92);
                      			
                    }
                    a9=(Token)match(input,28,FOLLOW_28_in_parse_be_ac_vub_simplegt_OutputElement2712); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputElement();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_16_0_0_4_0_0_4, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a9, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_36, 93);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 93);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_36, 94);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 94);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, parse_be_ac_vub_simplegt_OutputElement_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_OutputElement"


    // $ANTLR start "parse_be_ac_vub_simplegt_OutputBinding"
    // Simplegt.g:2954:1: parse_be_ac_vub_simplegt_OutputBinding returns [be.ac.vub.simplegt.OutputBinding element = null] : (a0= TEXT ) a1= '=~' (a2_0= parse_be_ac_vub_simplegt_Expression ) ( (a3= 'before' (a4= TEXT ) ) )? ;
    public final be.ac.vub.simplegt.OutputBinding parse_be_ac_vub_simplegt_OutputBinding() throws RecognitionException {
        be.ac.vub.simplegt.OutputBinding element =  null;
        int parse_be_ac_vub_simplegt_OutputBinding_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        Token a4=null;
        be.ac.vub.simplegt.Expression a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return element; }
            // Simplegt.g:2957:1: ( (a0= TEXT ) a1= '=~' (a2_0= parse_be_ac_vub_simplegt_Expression ) ( (a3= 'before' (a4= TEXT ) ) )? )
            // Simplegt.g:2958:2: (a0= TEXT ) a1= '=~' (a2_0= parse_be_ac_vub_simplegt_Expression ) ( (a3= 'before' (a4= TEXT ) ) )?
            {
            // Simplegt.g:2958:2: (a0= TEXT )
            // Simplegt.g:2959:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_OutputBinding2764); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputBinding();
              				incompleteObjects.push(element);
              			}
              			if (a0 != null) {
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_BINDING__PROPERTY), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_BINDING__PROPERTY), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_17_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_60, 95);
              	
            }
            a1=(Token)match(input,30,FOLLOW_30_in_parse_be_ac_vub_simplegt_OutputBinding2785); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputBinding();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_17_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_43, 96, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_44, 96, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_45, 96, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_46, 96, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_47, 96, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_48, 96, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              	
            }
            // Simplegt.g:3013:2: (a2_0= parse_be_ac_vub_simplegt_Expression )
            // Simplegt.g:3014:3: a2_0= parse_be_ac_vub_simplegt_Expression
            {
            pushFollow(FOLLOW_parse_be_ac_vub_simplegt_Expression_in_parse_be_ac_vub_simplegt_OutputBinding2803);
            a2_0=parse_be_ac_vub_simplegt_Expression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputBinding();
              				incompleteObjects.push(element);
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					Object value = a2_0;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_BINDING__EXPR), value);
              					completedElement(value, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_17_0_0_2, a2_0, true);
              				copyLocalizationInfos(a2_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 97);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 97);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 97);
              	
            }
            // Simplegt.g:3041:2: ( (a3= 'before' (a4= TEXT ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // Simplegt.g:3042:3: (a3= 'before' (a4= TEXT ) )
                    {
                    // Simplegt.g:3042:3: (a3= 'before' (a4= TEXT ) )
                    // Simplegt.g:3043:4: a3= 'before' (a4= TEXT )
                    {
                    a3=(Token)match(input,37,FOLLOW_37_in_parse_be_ac_vub_simplegt_OutputBinding2830); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputBinding();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_17_0_0_3_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_61, 98);
                      			
                    }
                    // Simplegt.g:3057:4: (a4= TEXT )
                    // Simplegt.g:3058:5: a4= TEXT
                    {
                    a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_OutputBinding2856); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputBinding();
                      						incompleteObjects.push(element);
                      					}
                      					if (a4 != null) {
                      						be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      						tokenResolver.setOptions(getOptions());
                      						be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_BINDING__BEFORE_ELEMENT), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStopIndex());
                      						}
                      						String resolved = (String) resolvedObject;
                      						be.ac.vub.simplegt.RuleElement proxy = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputElement();
                      						collectHiddenTokens(element);
                      						registerContextDependentProxy(new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtContextDependentURIFragmentFactory<be.ac.vub.simplegt.OutputBinding, be.ac.vub.simplegt.RuleElement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getOutputBindingBeforeElementReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_BINDING__BEFORE_ELEMENT), resolved, proxy);
                      						if (proxy != null) {
                      							Object value = proxy;
                      							element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_BINDING__BEFORE_ELEMENT), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_17_0_0_3_0_0_1, proxy, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, element);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, proxy);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 99);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 99);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 100);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 100);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, parse_be_ac_vub_simplegt_OutputBinding_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_OutputBinding"


    // $ANTLR start "parse_be_ac_vub_simplegt_Expression"
    // Simplegt.g:3108:1: parse_be_ac_vub_simplegt_Expression returns [be.ac.vub.simplegt.Expression element = null] : (c0= parse_be_ac_vub_simplegt_ElementExp | c1= parse_be_ac_vub_simplegt_StringLiteralExp | c2= parse_be_ac_vub_simplegt_IntegerLiteralExp | c3= parse_be_ac_vub_simplegt_DoubleLiteralExp | c4= parse_be_ac_vub_simplegt_BooleanLiteralExp | c5= parse_be_ac_vub_simplegt_EnumLiteralExp );
    public final be.ac.vub.simplegt.Expression parse_be_ac_vub_simplegt_Expression() throws RecognitionException {
        be.ac.vub.simplegt.Expression element =  null;
        int parse_be_ac_vub_simplegt_Expression_StartIndex = input.index();
        be.ac.vub.simplegt.ElementExp c0 = null;

        be.ac.vub.simplegt.StringLiteralExp c1 = null;

        be.ac.vub.simplegt.IntegerLiteralExp c2 = null;

        be.ac.vub.simplegt.DoubleLiteralExp c3 = null;

        be.ac.vub.simplegt.BooleanLiteralExp c4 = null;

        be.ac.vub.simplegt.EnumLiteralExp c5 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return element; }
            // Simplegt.g:3109:1: (c0= parse_be_ac_vub_simplegt_ElementExp | c1= parse_be_ac_vub_simplegt_StringLiteralExp | c2= parse_be_ac_vub_simplegt_IntegerLiteralExp | c3= parse_be_ac_vub_simplegt_DoubleLiteralExp | c4= parse_be_ac_vub_simplegt_BooleanLiteralExp | c5= parse_be_ac_vub_simplegt_EnumLiteralExp )
            int alt26=6;
            switch ( input.LA(1) ) {
            case TEXT:
                {
                alt26=1;
                }
                break;
            case QUOTED_39_39_92:
                {
                alt26=2;
                }
                break;
            case INTEGER:
                {
                alt26=3;
                }
                break;
            case FLOAT:
                {
                alt26=4;
                }
                break;
            case 32:
            case 33:
                {
                alt26=5;
                }
                break;
            case 34:
                {
                alt26=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // Simplegt.g:3110:2: c0= parse_be_ac_vub_simplegt_ElementExp
                    {
                    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_ElementExp_in_parse_be_ac_vub_simplegt_Expression2913);
                    c0=parse_be_ac_vub_simplegt_ElementExp();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Simplegt.g:3111:4: c1= parse_be_ac_vub_simplegt_StringLiteralExp
                    {
                    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_StringLiteralExp_in_parse_be_ac_vub_simplegt_Expression2923);
                    c1=parse_be_ac_vub_simplegt_StringLiteralExp();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Simplegt.g:3112:4: c2= parse_be_ac_vub_simplegt_IntegerLiteralExp
                    {
                    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_IntegerLiteralExp_in_parse_be_ac_vub_simplegt_Expression2933);
                    c2=parse_be_ac_vub_simplegt_IntegerLiteralExp();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // Simplegt.g:3113:4: c3= parse_be_ac_vub_simplegt_DoubleLiteralExp
                    {
                    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_DoubleLiteralExp_in_parse_be_ac_vub_simplegt_Expression2943);
                    c3=parse_be_ac_vub_simplegt_DoubleLiteralExp();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 5 :
                    // Simplegt.g:3114:4: c4= parse_be_ac_vub_simplegt_BooleanLiteralExp
                    {
                    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_BooleanLiteralExp_in_parse_be_ac_vub_simplegt_Expression2953);
                    c4=parse_be_ac_vub_simplegt_BooleanLiteralExp();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c4; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 6 :
                    // Simplegt.g:3115:4: c5= parse_be_ac_vub_simplegt_EnumLiteralExp
                    {
                    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_EnumLiteralExp_in_parse_be_ac_vub_simplegt_Expression2963);
                    c5=parse_be_ac_vub_simplegt_EnumLiteralExp();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c5; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, parse_be_ac_vub_simplegt_Expression_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_Expression"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_Module_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_parse_be_ac_vub_simplegt_Module115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Module133 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_parse_be_ac_vub_simplegt_Module163 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_be_ac_vub_simplegt_Module184 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_parse_be_ac_vub_simplegt_Module207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Module233 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_be_ac_vub_simplegt_Module266 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_parse_be_ac_vub_simplegt_Module299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_InstanceModel_in_parse_be_ac_vub_simplegt_Module317 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_parse_be_ac_vub_simplegt_Module344 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_InstanceModel_in_parse_be_ac_vub_simplegt_Module370 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_parse_be_ac_vub_simplegt_Module411 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_Rule_in_parse_be_ac_vub_simplegt_Module434 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_InstanceModel479 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_be_ac_vub_simplegt_InstanceModel500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_Metamodel_in_parse_be_ac_vub_simplegt_InstanceModel518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Metamodel555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_parse_be_ac_vub_simplegt_Rule600 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_parse_be_ac_vub_simplegt_Rule621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Rule639 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_parse_be_ac_vub_simplegt_Rule669 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Rule695 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_17_in_parse_be_ac_vub_simplegt_Rule741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Rule775 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_22_in_parse_be_ac_vub_simplegt_Rule856 = new BitSet(new long[]{0x0000001801800000L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_InPattern_in_parse_be_ac_vub_simplegt_Rule879 = new BitSet(new long[]{0x0000001800800000L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_NacPattern_in_parse_be_ac_vub_simplegt_Rule914 = new BitSet(new long[]{0x0000001800800000L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_OutPattern_in_parse_be_ac_vub_simplegt_Rule949 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_parse_be_ac_vub_simplegt_Rule975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parse_be_ac_vub_simplegt_InPattern1004 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_InputElement_in_parse_be_ac_vub_simplegt_InPattern1022 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_parse_be_ac_vub_simplegt_InPattern1049 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_InputElement_in_parse_be_ac_vub_simplegt_InPattern1075 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Type1135 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_parse_be_ac_vub_simplegt_Type1156 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Type1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_34_34_92_in_parse_be_ac_vub_simplegt_Type1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_InputElement1270 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_be_ac_vub_simplegt_InputElement1291 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_Type_in_parse_be_ac_vub_simplegt_InputElement1309 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_26_in_parse_be_ac_vub_simplegt_InputElement1336 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_InputElement1362 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_parse_be_ac_vub_simplegt_InputElement1417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_InputBinding_in_parse_be_ac_vub_simplegt_InputElement1443 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_17_in_parse_be_ac_vub_simplegt_InputElement1484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_InputBinding_in_parse_be_ac_vub_simplegt_InputElement1518 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_28_in_parse_be_ac_vub_simplegt_InputElement1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_InputBinding1631 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_parse_be_ac_vub_simplegt_InputBinding1661 = new BitSet(new long[]{0x00000007000001D0L});
    public static final BitSet FOLLOW_30_in_parse_be_ac_vub_simplegt_InputBinding1676 = new BitSet(new long[]{0x00000007000001D0L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_Expression_in_parse_be_ac_vub_simplegt_InputBinding1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_ElementExp1738 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_parse_be_ac_vub_simplegt_ElementExp1768 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_ElementExp1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_39_39_92_in_parse_be_ac_vub_simplegt_StringLiteralExp1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_parse_be_ac_vub_simplegt_IntegerLiteralExp1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_parse_be_ac_vub_simplegt_DoubleLiteralExp1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_parse_be_ac_vub_simplegt_BooleanLiteralExp1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_parse_be_ac_vub_simplegt_BooleanLiteralExp1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_parse_be_ac_vub_simplegt_EnumLiteralExp2035 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_EnumLiteralExp2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_34_34_92_in_parse_be_ac_vub_simplegt_EnumLiteralExp2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_parse_be_ac_vub_simplegt_NacPattern2145 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_InputElement_in_parse_be_ac_vub_simplegt_NacPattern2163 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_parse_be_ac_vub_simplegt_NacPattern2190 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_InputElement_in_parse_be_ac_vub_simplegt_NacPattern2216 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_36_in_parse_be_ac_vub_simplegt_OutPattern2272 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_OutputElement_in_parse_be_ac_vub_simplegt_OutPattern2290 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_parse_be_ac_vub_simplegt_OutPattern2317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_OutputElement_in_parse_be_ac_vub_simplegt_OutPattern2343 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_OutputElement2403 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_be_ac_vub_simplegt_OutputElement2424 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_Type_in_parse_be_ac_vub_simplegt_OutputElement2442 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_26_in_parse_be_ac_vub_simplegt_OutputElement2469 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_OutputElement2495 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_parse_be_ac_vub_simplegt_OutputElement2550 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_OutputBinding_in_parse_be_ac_vub_simplegt_OutputElement2576 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_17_in_parse_be_ac_vub_simplegt_OutputElement2617 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_OutputBinding_in_parse_be_ac_vub_simplegt_OutputElement2651 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_28_in_parse_be_ac_vub_simplegt_OutputElement2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_OutputBinding2764 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_parse_be_ac_vub_simplegt_OutputBinding2785 = new BitSet(new long[]{0x00000007000001D0L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_Expression_in_parse_be_ac_vub_simplegt_OutputBinding2803 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_parse_be_ac_vub_simplegt_OutputBinding2830 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_OutputBinding2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_ElementExp_in_parse_be_ac_vub_simplegt_Expression2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_StringLiteralExp_in_parse_be_ac_vub_simplegt_Expression2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_IntegerLiteralExp_in_parse_be_ac_vub_simplegt_Expression2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_DoubleLiteralExp_in_parse_be_ac_vub_simplegt_Expression2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_BooleanLiteralExp_in_parse_be_ac_vub_simplegt_Expression2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_EnumLiteralExp_in_parse_be_ac_vub_simplegt_Expression2963 = new BitSet(new long[]{0x0000000000000002L});

}