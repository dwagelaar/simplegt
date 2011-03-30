// $ANTLR ${project.version} ${buildNumber}

	package be.ac.vub.simplegt.resource.simplegt.mopp;


import org.antlr.runtime3_2_0.*;
import java.util.HashMap;
@SuppressWarnings("unused")
public class SimplegtParser extends SimplegtANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TEXT", "INTEGER", "FLOAT", "COMMENT", "LINEBREAK", "WHITESPACE", "'module'", "';'", "'import'", "'transform'", "','", "':'", "'abstract'", "'rule'", "'extends'", "'{'", "'}'", "'from'", "'!'", "'in'", "'('", "')'", "'='", "'.'", "'\\\"'", "'\\''", "'true'", "'false'", "'#'", "'not'", "'to'", "'+='", "'before'", "'-='"
    };
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
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int COMMENT=7;
    public static final int LINEBREAK=8;

    // delegates
    // delegators


        public SimplegtParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SimplegtParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[53+1];
             
             
        }
        

    public String[] getTokenNames() { return SimplegtParser.tokenNames; }
    public String getGrammarFileName() { return "Simplegt.g"; }


    	private be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolverFactory tokenResolverFactory = new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTokenResolverFactory();
    	
    	/**
    	 * the index of the last token that was handled by collectHiddenTokens()
    	 */
    	private int lastPosition;
    	
    	private be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTokenResolveResult tokenResolveResult = new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTokenResolveResult();
    	
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
    	private java.util.Map<?, ?> options;
    	/**
    	 * A helper list to allow a lexer to pass errors to its parser
    	 */
    	protected java.util.List<org.antlr.runtime3_2_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_2_0.RecognitionException>());
    	
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
    	/**
    	 * A flag to indicate that the parser should stop parsing as soon as possible. The
    	 * flag is set to false before parsing starts. It can be set to true by invoking
    	 * the terminateParsing() method from another thread. This feature is used, when
    	 * documents are parsed in the background (i.e., while editing them). In order to
    	 * cancel running parsers, the parsing process can be terminated. This is done
    	 * whenever a document changes, because the previous content of the document is
    	 * not valid anymore and parsing the old content is not necessary any longer.
    	 */
    	private boolean terminateParsing;
    	
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
    	
    	protected void addMapEntry(org.eclipse.emf.ecore.EObject element, org.eclipse.emf.ecore.EStructuralFeature structuralFeature, be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtDummyEObject dummy) {
    		Object value = element.eGet(structuralFeature);
    		Object mapKey = dummy.getValueByName("key");
    		Object mapValue = dummy.getValueByName("value");
    		if (value instanceof org.eclipse.emf.common.util.EMap<?, ?>) {
    			org.eclipse.emf.common.util.EMap<Object, Object> valueMap = be.ac.vub.simplegt.resource.simplegt.util.SimplegtMapUtil.castToEMap(value);
    			if (mapKey != null && mapValue != null) {
    				valueMap.put(mapKey, mapValue);
    			}
    		}
    	}
    	
    	@SuppressWarnings("unchecked")
    	
    	public boolean addObjectToList(org.eclipse.emf.ecore.EObject container, int featureID, Object object) {
    		return ((java.util.List<Object>) container.eGet(container.eClass().getEStructuralFeature(featureID))).add(object);
    	}
    	
    	@SuppressWarnings("unchecked")
    	
    	public boolean addObjectToList(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EStructuralFeature feature, Object object) {
    		return ((java.util.List<Object>) container.eGet(feature)).add(object);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject apply(org.eclipse.emf.ecore.EObject target, java.util.List<org.eclipse.emf.ecore.EObject> dummyEObjects) {
    		org.eclipse.emf.ecore.EObject currentTarget = target;
    		for (org.eclipse.emf.ecore.EObject object : dummyEObjects) {
    			assert(object instanceof be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtDummyEObject);
    			be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtDummyEObject dummy = (be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtDummyEObject) object;
    			org.eclipse.emf.ecore.EObject newEObject = dummy.applyTo(currentTarget);
    			currentTarget = newEObject;
    		}
    		return currentTarget;
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
    	
    	protected void copyLocalizationInfos(final org.antlr.runtime3_2_0.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
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
    				return new SimplegtParser(new org.antlr.runtime3_2_0.CommonTokenStream(new SimplegtLexer(new org.antlr.runtime3_2_0.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new SimplegtParser(new org.antlr.runtime3_2_0.CommonTokenStream(new SimplegtLexer(new org.antlr.runtime3_2_0.ANTLRInputStream(actualInputStream, encoding))));
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
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_2_0.RecognitionException {
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
    			if (type.getInstanceClass() == be.ac.vub.simplegt.CharLiteralExp.class) {
    				return parse_be_ac_vub_simplegt_CharLiteralExp();
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
    			if (type.getInstanceClass() == be.ac.vub.simplegt.SetBinding.class) {
    				return parse_be_ac_vub_simplegt_SetBinding();
    			}
    			if (type.getInstanceClass() == be.ac.vub.simplegt.AddBinding.class) {
    				return parse_be_ac_vub_simplegt_AddBinding();
    			}
    			if (type.getInstanceClass() == be.ac.vub.simplegt.DelBinding.class) {
    				return parse_be_ac_vub_simplegt_DelBinding();
    			}
    		}
    		throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtUnexpectedContentTypeException(typeObject);
    	}
    	
    	private be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTokenResolveResult getFreshTokenResolveResult() {
    		tokenResolveResult.clear();
    		return tokenResolveResult;
    	}
    	
    	public int getMismatchedTokenRecoveryTries() {
    		return mismatchedTokenRecoveryTries;
    	}
    	
    	public Object getMissingSymbol(org.antlr.runtime3_2_0.IntStream arg0, org.antlr.runtime3_2_0.RecognitionException arg1, int arg2, org.antlr.runtime3_2_0.BitSet arg3) {
    		mismatchedTokenRecoveryTries++;
    		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
    	}
    	
    	protected java.util.Map<?,?> getOptions() {
    		return options;
    	}
    	
    	public be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtMetaInformation getMetaInformation() {
    		return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtMetaInformation();
    	}
    	
    	public Object getParseToIndexTypeObject() {
    		return parseToIndexTypeObject;
    	}
    	
    	protected be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtReferenceResolverSwitch getReferenceResolverSwitch() {
    		return (be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtReferenceResolverSwitch) getMetaInformation().getReferenceResolverSwitch();
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
    		} catch (org.antlr.runtime3_2_0.RecognitionException re) {
    			reportError(re);
    		} catch (java.lang.IllegalArgumentException iae) {
    			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
    				// can be caused if a null is set on EMF models where not allowed. this will just
    				// happen if other errors occurred before
    			} else {
    				iae.printStackTrace();
    			}
    		}
    		for (org.antlr.runtime3_2_0.RecognitionException re : lexerExceptions) {
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
    		final org.antlr.runtime3_2_0.CommonTokenStream tokenStream = (org.antlr.runtime3_2_0.CommonTokenStream) getTokenStream();
    		be.ac.vub.simplegt.resource.simplegt.ISimplegtParseResult result = parse();
    		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
    			org.antlr.runtime3_2_0.Lexer lexer = (org.antlr.runtime3_2_0.Lexer) tokenStream.getTokenSource();
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
    		int followSetID = 107;
    		int i;
    		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
    			org.antlr.runtime3_2_0.CommonToken nextToken = (org.antlr.runtime3_2_0.CommonToken) tokenStream.get(i);
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
    			org.antlr.runtime3_2_0.CommonToken tokenAtIndex = (org.antlr.runtime3_2_0.CommonToken) input.get(index);
    			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			if (tokenAtIndex.getChannel() != 99) {
    				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			}
    		}
    		lastTokenIndex = Math.max(0, currentIndex);
    		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
    	}
    	
    	public Object recoverFromMismatchedToken(org.antlr.runtime3_2_0.IntStream input, int ttype, org.antlr.runtime3_2_0.BitSet follow) throws org.antlr.runtime3_2_0.RecognitionException {
    		if (!rememberExpectedElements) {
    			return super.recoverFromMismatchedToken(input, ttype, follow);
    		} else {
    			return null;
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the parser into human readable messages.
    	 */
    	public void reportError(final org.antlr.runtime3_2_0.RecognitionException e)  {
    		String message = e.getMessage();
    		if (e instanceof org.antlr.runtime3_2_0.MismatchedTokenException) {
    			org.antlr.runtime3_2_0.MismatchedTokenException mte = (org.antlr.runtime3_2_0.MismatchedTokenException) e;
    			String expectedTokenName = formatTokenName(mte.expecting);
    			String actualTokenName = formatTokenName(e.token.getType());
    			message = "Syntax error on token \"" + e.token.getText() + " (" + actualTokenName + ")\", \"" + expectedTokenName + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedTreeNodeException) {
    			org.antlr.runtime3_2_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_2_0.MismatchedTreeNodeException) e;
    			String expectedTokenName = formatTokenName(mtne.expecting);
    			message = "mismatched tree node: " + "xxx" + "; tokenName " + expectedTokenName;
    		} else if (e instanceof org.antlr.runtime3_2_0.NoViableAltException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
    		} else if (e instanceof org.antlr.runtime3_2_0.EarlyExitException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedSetException) {
    			org.antlr.runtime3_2_0.MismatchedSetException mse = (org.antlr.runtime3_2_0.MismatchedSetException) e;
    			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedNotSetException) {
    			org.antlr.runtime3_2_0.MismatchedNotSetException mse = (org.antlr.runtime3_2_0.MismatchedNotSetException) e;
    			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_2_0.FailedPredicateException) {
    			org.antlr.runtime3_2_0.FailedPredicateException fpe = (org.antlr.runtime3_2_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText + "}?";
    		}
    		// the resource may be null if the parse is used for code completion
    		final String finalMessage = message;
    		if (e.token instanceof org.antlr.runtime3_2_0.CommonToken) {
    			final org.antlr.runtime3_2_0.CommonToken ct = (org.antlr.runtime3_2_0.CommonToken) e.token;
    			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
    		} else {
    			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the lexer into human readable messages.
    	 */
    	public void reportLexicalError(final org.antlr.runtime3_2_0.RecognitionException e)  {
    		String message = "";
    		if (e instanceof org.antlr.runtime3_2_0.MismatchedTokenException) {
    			org.antlr.runtime3_2_0.MismatchedTokenException mte = (org.antlr.runtime3_2_0.MismatchedTokenException) e;
    			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_2_0.NoViableAltException) {
    			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_2_0.EarlyExitException) {
    			org.antlr.runtime3_2_0.EarlyExitException eee = (org.antlr.runtime3_2_0.EarlyExitException) e;
    			message = "required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
    		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedSetException) {
    			org.antlr.runtime3_2_0.MismatchedSetException mse = (org.antlr.runtime3_2_0.MismatchedSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedNotSetException) {
    			org.antlr.runtime3_2_0.MismatchedNotSetException mse = (org.antlr.runtime3_2_0.MismatchedNotSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedRangeException) {
    			org.antlr.runtime3_2_0.MismatchedRangeException mre = (org.antlr.runtime3_2_0.MismatchedRangeException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
    		} else if (e instanceof org.antlr.runtime3_2_0.FailedPredicateException) {
    			org.antlr.runtime3_2_0.FailedPredicateException fpe = (org.antlr.runtime3_2_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
    		}
    		addErrorToResource(message, e.charPositionInLine, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
    	}
    	
    	private String formatTokenName(int tokenType)  {
    		String tokenName = "<unknown>";
    		if (tokenType == org.antlr.runtime3_2_0.Token.EOF) {
    			tokenName = "EOF";
    		} else {
    			if (tokenType < 0) {
    				return tokenName;
    			}
    			tokenName = getTokenNames()[tokenType];
    			tokenName = be.ac.vub.simplegt.resource.simplegt.util.SimplegtStringUtil.formatTokenName(tokenName);
    		}
    		return tokenName;
    	}
    	
    	public void setOptions(java.util.Map<?,?> options) {
    		this.options = options;
    	}
    	
    	public void terminate() {
    		terminateParsing = true;
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
    	
    	/**
    	 * Creates a dynamic Java proxy that mimics the interface of the given class.
    	 */
    	@SuppressWarnings("unchecked")
    	
    	public <T> T createDynamicProxy(Class<T> clazz) {
    		Object proxy = java.lang.reflect.Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class<?>[]{clazz, org.eclipse.emf.ecore.EObject.class, org.eclipse.emf.ecore.InternalEObject.class}, new java.lang.reflect.InvocationHandler() {
    			
    			private org.eclipse.emf.ecore.EObject dummyObject = new org.eclipse.emf.ecore.impl.EObjectImpl() {};
    			
    			public Object invoke(Object object, java.lang.reflect.Method method, Object[] args) throws Throwable {
    				// search in dummyObject for the requested method
    				java.lang.reflect.Method[] methodsInDummy = dummyObject.getClass().getMethods();
    				for (java.lang.reflect.Method methodInDummy : methodsInDummy) {
    					boolean matches = true;
    					if (methodInDummy.getName().equals(method.getName())) {
    						Class<?>[] parameterTypes = method.getParameterTypes();
    						Class<?>[] parameterTypesInDummy = methodInDummy.getParameterTypes();
    						if (parameterTypes.length == parameterTypesInDummy.length) {
    							for (int p = 0; p < parameterTypes.length; p++) {
    								Class<?> parameterType = parameterTypes[p];
    								Class<?> parameterTypeInDummy = parameterTypesInDummy[p];
    								if (!parameterType.equals(parameterTypeInDummy)) {
    									matches = false;
    								}
    							}
    						} else {
    							matches = false;
    						}
    					} else {
    						matches = false;
    					}
    					if (matches) {
    						return methodInDummy.invoke(dummyObject, args);
    					}
    				}
    				return null;
    			}
    		});
    		return (T) proxy;
    	}
    	



    // $ANTLR start "start"
    // Simplegt.g:650:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_be_ac_vub_simplegt_Module ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;
        int start_StartIndex = input.index();
        be.ac.vub.simplegt.Module c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }
            // Simplegt.g:651:1: ( (c0= parse_be_ac_vub_simplegt_Module ) EOF )
            // Simplegt.g:652:2: (c0= parse_be_ac_vub_simplegt_Module ) EOF
            {
            if ( state.backtracking==0 ) {

              		// follow set for start rule(s)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_0, 0);
              		expectedElementsIndexOfLastCompleteElement = 0;
              	
            }
            // Simplegt.g:657:2: (c0= parse_be_ac_vub_simplegt_Module )
            // Simplegt.g:658:3: c0= parse_be_ac_vub_simplegt_Module
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
    // Simplegt.g:666:1: parse_be_ac_vub_simplegt_Module returns [be.ac.vub.simplegt.Module element = null] : a0= 'module' (a1= TEXT ) a2= ';' ( (a3= 'import' (a4= TEXT ) a5= ';' ) )* a6= 'transform' (a7_0= parse_be_ac_vub_simplegt_InstanceModel ) ( (a8= ',' (a9_0= parse_be_ac_vub_simplegt_InstanceModel ) ) )* a10= ';' ( (a11_0= parse_be_ac_vub_simplegt_Rule ) )* ;
    public final be.ac.vub.simplegt.Module parse_be_ac_vub_simplegt_Module() throws RecognitionException {
        be.ac.vub.simplegt.Module element =  null;
        int parse_be_ac_vub_simplegt_Module_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a8=null;
        Token a10=null;
        be.ac.vub.simplegt.InstanceModel a7_0 = null;

        be.ac.vub.simplegt.InstanceModel a9_0 = null;

        be.ac.vub.simplegt.Rule a11_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }
            // Simplegt.g:669:1: (a0= 'module' (a1= TEXT ) a2= ';' ( (a3= 'import' (a4= TEXT ) a5= ';' ) )* a6= 'transform' (a7_0= parse_be_ac_vub_simplegt_InstanceModel ) ( (a8= ',' (a9_0= parse_be_ac_vub_simplegt_InstanceModel ) ) )* a10= ';' ( (a11_0= parse_be_ac_vub_simplegt_Rule ) )* )
            // Simplegt.g:670:2: a0= 'module' (a1= TEXT ) a2= ';' ( (a3= 'import' (a4= TEXT ) a5= ';' ) )* a6= 'transform' (a7_0= parse_be_ac_vub_simplegt_InstanceModel ) ( (a8= ',' (a9_0= parse_be_ac_vub_simplegt_InstanceModel ) ) )* a10= ';' ( (a11_0= parse_be_ac_vub_simplegt_Rule ) )*
            {
            a0=(Token)match(input,10,FOLLOW_10_in_parse_be_ac_vub_simplegt_Module115); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_1, 1);
              	
            }
            // Simplegt.g:684:2: (a1= TEXT )
            // Simplegt.g:685:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Module133); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_1, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_2, 2);
              	
            }
            a2=(Token)match(input,11,FOLLOW_11_in_parse_be_ac_vub_simplegt_Module154); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_3, 3);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_4, 3);
              	
            }
            // Simplegt.g:735:2: ( (a3= 'import' (a4= TEXT ) a5= ';' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Simplegt.g:736:3: (a3= 'import' (a4= TEXT ) a5= ';' )
            	    {
            	    // Simplegt.g:736:3: (a3= 'import' (a4= TEXT ) a5= ';' )
            	    // Simplegt.g:737:4: a3= 'import' (a4= TEXT ) a5= ';'
            	    {
            	    a3=(Token)match(input,12,FOLLOW_12_in_parse_be_ac_vub_simplegt_Module177); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
            	      					incompleteObjects.push(element);
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_3_0_0_1, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_5, 4);
            	      			
            	    }
            	    // Simplegt.g:751:4: (a4= TEXT )
            	    // Simplegt.g:752:5: a4= TEXT
            	    {
            	    a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Module203); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
            	      						incompleteObjects.push(element);
            	      					}
            	      					if (a4 != null) {
            	      						be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            	      						tokenResolver.setOptions(getOptions());
            	      						be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
            	      						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.MODULE__IMPORTS), result);
            	      						Object resolvedObject = result.getResolvedToken();
            	      						if (resolvedObject == null) {
            	      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
            	      						}
            	      						java.lang.String resolved = (java.lang.String)resolvedObject;
            	      						if (resolved != null) {
            	      							Object value = resolved;
            	      							addObjectToList(element, be.ac.vub.simplegt.SimplegtPackage.MODULE__IMPORTS, value);
            	      							completedElement(value, false);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_3_0_0_2, resolved, true);
            	      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_6, 5);
            	      			
            	    }
            	    a5=(Token)match(input,11,FOLLOW_11_in_parse_be_ac_vub_simplegt_Module236); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
            	      					incompleteObjects.push(element);
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_3_0_0_3, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_3, 6);
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_4, 6);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_3, 7);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_4, 7);
              	
            }
            a6=(Token)match(input,13,FOLLOW_13_in_parse_be_ac_vub_simplegt_Module269); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_5, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a6, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_7, 8, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_0);
              	
            }
            // Simplegt.g:824:2: (a7_0= parse_be_ac_vub_simplegt_InstanceModel )
            // Simplegt.g:825:3: a7_0= parse_be_ac_vub_simplegt_InstanceModel
            {
            pushFollow(FOLLOW_parse_be_ac_vub_simplegt_InstanceModel_in_parse_be_ac_vub_simplegt_Module287);
            a7_0=parse_be_ac_vub_simplegt_InstanceModel();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
              				incompleteObjects.push(element);
              			}
              			if (a7_0 != null) {
              				if (a7_0 != null) {
              					Object value = a7_0;
              					addObjectToList(element, be.ac.vub.simplegt.SimplegtPackage.MODULE__MODELS, value);
              					completedElement(value, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_6, a7_0, true);
              				copyLocalizationInfos(a7_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_8, 9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_9, 9);
              	
            }
            // Simplegt.g:851:2: ( (a8= ',' (a9_0= parse_be_ac_vub_simplegt_InstanceModel ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Simplegt.g:852:3: (a8= ',' (a9_0= parse_be_ac_vub_simplegt_InstanceModel ) )
            	    {
            	    // Simplegt.g:852:3: (a8= ',' (a9_0= parse_be_ac_vub_simplegt_InstanceModel ) )
            	    // Simplegt.g:853:4: a8= ',' (a9_0= parse_be_ac_vub_simplegt_InstanceModel )
            	    {
            	    a8=(Token)match(input,14,FOLLOW_14_in_parse_be_ac_vub_simplegt_Module314); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
            	      					incompleteObjects.push(element);
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_7_0_0_0, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a8, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_7, 10, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_0);
            	      			
            	    }
            	    // Simplegt.g:867:4: (a9_0= parse_be_ac_vub_simplegt_InstanceModel )
            	    // Simplegt.g:868:5: a9_0= parse_be_ac_vub_simplegt_InstanceModel
            	    {
            	    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_InstanceModel_in_parse_be_ac_vub_simplegt_Module340);
            	    a9_0=parse_be_ac_vub_simplegt_InstanceModel();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
            	      						incompleteObjects.push(element);
            	      					}
            	      					if (a9_0 != null) {
            	      						if (a9_0 != null) {
            	      							Object value = a9_0;
            	      							addObjectToList(element, be.ac.vub.simplegt.SimplegtPackage.MODULE__MODELS, value);
            	      							completedElement(value, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_7_0_0_1, a9_0, true);
            	      						copyLocalizationInfos(a9_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_8, 11);
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_9, 11);
            	      			
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
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_8, 12);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_9, 12);
              	
            }
            a10=(Token)match(input,11,FOLLOW_11_in_parse_be_ac_vub_simplegt_Module381); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_8, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a10, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_10, 13, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_1);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_11, 13, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_1);
              	
            }
            // Simplegt.g:917:2: ( (a11_0= parse_be_ac_vub_simplegt_Rule ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=16 && LA3_0<=17)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Simplegt.g:918:3: (a11_0= parse_be_ac_vub_simplegt_Rule )
            	    {
            	    // Simplegt.g:918:3: (a11_0= parse_be_ac_vub_simplegt_Rule )
            	    // Simplegt.g:919:4: a11_0= parse_be_ac_vub_simplegt_Rule
            	    {
            	    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_Rule_in_parse_be_ac_vub_simplegt_Module404);
            	    a11_0=parse_be_ac_vub_simplegt_Rule();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
            	      					incompleteObjects.push(element);
            	      				}
            	      				if (a11_0 != null) {
            	      					if (a11_0 != null) {
            	      						Object value = a11_0;
            	      						addObjectToList(element, be.ac.vub.simplegt.SimplegtPackage.MODULE__RULES, value);
            	      						completedElement(value, true);
            	      					}
            	      					collectHiddenTokens(element);
            	      					retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_9, a11_0, true);
            	      					copyLocalizationInfos(a11_0, element);
            	      				}
            	      			
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
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_10, 14, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_1);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_11, 14, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_1);
              	
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
    // Simplegt.g:948:1: parse_be_ac_vub_simplegt_InstanceModel returns [be.ac.vub.simplegt.InstanceModel element = null] : (a0= TEXT ) a1= ':' (a2_0= parse_be_ac_vub_simplegt_Metamodel ) ;
    public final be.ac.vub.simplegt.InstanceModel parse_be_ac_vub_simplegt_InstanceModel() throws RecognitionException {
        be.ac.vub.simplegt.InstanceModel element =  null;
        int parse_be_ac_vub_simplegt_InstanceModel_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        be.ac.vub.simplegt.Metamodel a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // Simplegt.g:951:1: ( (a0= TEXT ) a1= ':' (a2_0= parse_be_ac_vub_simplegt_Metamodel ) )
            // Simplegt.g:952:2: (a0= TEXT ) a1= ':' (a2_0= parse_be_ac_vub_simplegt_Metamodel )
            {
            // Simplegt.g:952:2: (a0= TEXT )
            // Simplegt.g:953:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_InstanceModel449); if (state.failed) return element;
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
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INSTANCE_MODEL__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_1_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_12, 15);
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_be_ac_vub_simplegt_InstanceModel470); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInstanceModel();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_1_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_13, 16, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_2);
              	
            }
            // Simplegt.g:1002:2: (a2_0= parse_be_ac_vub_simplegt_Metamodel )
            // Simplegt.g:1003:3: a2_0= parse_be_ac_vub_simplegt_Metamodel
            {
            pushFollow(FOLLOW_parse_be_ac_vub_simplegt_Metamodel_in_parse_be_ac_vub_simplegt_InstanceModel488);
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
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_8, 17);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_9, 17);
              	
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
    // Simplegt.g:1031:1: parse_be_ac_vub_simplegt_Metamodel returns [be.ac.vub.simplegt.Metamodel element = null] : (a0= TEXT ) ;
    public final be.ac.vub.simplegt.Metamodel parse_be_ac_vub_simplegt_Metamodel() throws RecognitionException {
        be.ac.vub.simplegt.Metamodel element =  null;
        int parse_be_ac_vub_simplegt_Metamodel_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // Simplegt.g:1034:1: ( (a0= TEXT ) )
            // Simplegt.g:1035:2: (a0= TEXT )
            {
            // Simplegt.g:1035:2: (a0= TEXT )
            // Simplegt.g:1036:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Metamodel525); if (state.failed) return element;
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
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.METAMODEL__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_2_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_8, 18);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_9, 18);
              	
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
    // Simplegt.g:1074:1: parse_be_ac_vub_simplegt_Rule returns [be.ac.vub.simplegt.Rule element = null] : ( (a0= 'abstract' )? ) a3= 'rule' (a4= TEXT ) ( (a5= 'extends' (a6= TEXT ) ( (a7= ',' (a8= TEXT ) ) )* ) )? a9= '{' ( (a10_0= parse_be_ac_vub_simplegt_InPattern ) )? ( (a11_0= parse_be_ac_vub_simplegt_NacPattern ) )* ( (a12_0= parse_be_ac_vub_simplegt_OutPattern ) )? a13= '}' ;
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
            // Simplegt.g:1077:1: ( ( (a0= 'abstract' )? ) a3= 'rule' (a4= TEXT ) ( (a5= 'extends' (a6= TEXT ) ( (a7= ',' (a8= TEXT ) ) )* ) )? a9= '{' ( (a10_0= parse_be_ac_vub_simplegt_InPattern ) )? ( (a11_0= parse_be_ac_vub_simplegt_NacPattern ) )* ( (a12_0= parse_be_ac_vub_simplegt_OutPattern ) )? a13= '}' )
            // Simplegt.g:1078:2: ( (a0= 'abstract' )? ) a3= 'rule' (a4= TEXT ) ( (a5= 'extends' (a6= TEXT ) ( (a7= ',' (a8= TEXT ) ) )* ) )? a9= '{' ( (a10_0= parse_be_ac_vub_simplegt_InPattern ) )? ( (a11_0= parse_be_ac_vub_simplegt_NacPattern ) )* ( (a12_0= parse_be_ac_vub_simplegt_OutPattern ) )? a13= '}'
            {
            // Simplegt.g:1078:2: ( (a0= 'abstract' )? )
            // Simplegt.g:1079:3: (a0= 'abstract' )?
            {
            // Simplegt.g:1079:3: (a0= 'abstract' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Simplegt.g:1080:4: a0= 'abstract'
                    {
                    a0=(Token)match(input,16,FOLLOW_16_in_parse_be_ac_vub_simplegt_Rule570); if (state.failed) return element;
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
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
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
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_11, 19);
              	
            }
            a3=(Token)match(input,17,FOLLOW_17_in_parse_be_ac_vub_simplegt_Rule591); if (state.failed) return element;
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
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_14, 20);
              	
            }
            // Simplegt.g:1123:2: (a4= TEXT )
            // Simplegt.g:1124:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Rule609); if (state.failed) return element;
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
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_3_0_0_4, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_15, 21);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_16, 21);
              	
            }
            // Simplegt.g:1165:2: ( (a5= 'extends' (a6= TEXT ) ( (a7= ',' (a8= TEXT ) ) )* ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Simplegt.g:1166:3: (a5= 'extends' (a6= TEXT ) ( (a7= ',' (a8= TEXT ) ) )* )
                    {
                    // Simplegt.g:1166:3: (a5= 'extends' (a6= TEXT ) ( (a7= ',' (a8= TEXT ) ) )* )
                    // Simplegt.g:1167:4: a5= 'extends' (a6= TEXT ) ( (a7= ',' (a8= TEXT ) ) )*
                    {
                    a5=(Token)match(input,18,FOLLOW_18_in_parse_be_ac_vub_simplegt_Rule639); if (state.failed) return element;
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
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_17, 22);
                      			
                    }
                    // Simplegt.g:1186:4: (a6= TEXT )
                    // Simplegt.g:1187:5: a6= TEXT
                    {
                    a6=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Rule665); if (state.failed) return element;
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
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a6).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String)resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							addObjectToList(element, be.ac.vub.simplegt.SimplegtPackage.RULE__EXTENDS, value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_3_0_0_5_0_0_1, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a6, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_18, 23);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_16, 23);
                      			
                    }
                    // Simplegt.g:1228:4: ( (a7= ',' (a8= TEXT ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // Simplegt.g:1229:5: (a7= ',' (a8= TEXT ) )
                    	    {
                    	    // Simplegt.g:1229:5: (a7= ',' (a8= TEXT ) )
                    	    // Simplegt.g:1230:6: a7= ',' (a8= TEXT )
                    	    {
                    	    a7=(Token)match(input,14,FOLLOW_14_in_parse_be_ac_vub_simplegt_Rule711); if (state.failed) return element;
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
                    	      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_19, 24);
                    	      					
                    	    }
                    	    // Simplegt.g:1249:6: (a8= TEXT )
                    	    // Simplegt.g:1250:7: a8= TEXT
                    	    {
                    	    a8=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Rule745); if (state.failed) return element;
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
                    	      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a8).getStopIndex());
                    	      								}
                    	      								java.lang.String resolved = (java.lang.String)resolvedObject;
                    	      								if (resolved != null) {
                    	      									Object value = resolved;
                    	      									addObjectToList(element, be.ac.vub.simplegt.SimplegtPackage.RULE__EXTENDS, value);
                    	      									completedElement(value, false);
                    	      								}
                    	      								collectHiddenTokens(element);
                    	      								retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_3_0_0_5_0_0_2_0_0_1, resolved, true);
                    	      								copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a8, element);
                    	      							}
                    	      						
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_18, 25);
                    	      						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_16, 25);
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_18, 26);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_16, 26);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_16, 27);
              	
            }
            a9=(Token)match(input,19,FOLLOW_19_in_parse_be_ac_vub_simplegt_Rule826); if (state.failed) return element;
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
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a9, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_20, 28, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_3);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 28, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 28, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 28);
              	
            }
            // Simplegt.g:1328:2: ( (a10_0= parse_be_ac_vub_simplegt_InPattern ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Simplegt.g:1329:3: (a10_0= parse_be_ac_vub_simplegt_InPattern )
                    {
                    // Simplegt.g:1329:3: (a10_0= parse_be_ac_vub_simplegt_InPattern )
                    // Simplegt.g:1330:4: a10_0= parse_be_ac_vub_simplegt_InPattern
                    {
                    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_InPattern_in_parse_be_ac_vub_simplegt_Rule849);
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
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 29, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 29, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 29);
              	
            }
            // Simplegt.g:1363:2: ( (a11_0= parse_be_ac_vub_simplegt_NacPattern ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==33) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Simplegt.g:1364:3: (a11_0= parse_be_ac_vub_simplegt_NacPattern )
            	    {
            	    // Simplegt.g:1364:3: (a11_0= parse_be_ac_vub_simplegt_NacPattern )
            	    // Simplegt.g:1365:4: a11_0= parse_be_ac_vub_simplegt_NacPattern
            	    {
            	    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_NacPattern_in_parse_be_ac_vub_simplegt_Rule884);
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
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 30, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 30, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 30);
              	
            }
            // Simplegt.g:1398:2: ( (a12_0= parse_be_ac_vub_simplegt_OutPattern ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==34) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Simplegt.g:1399:3: (a12_0= parse_be_ac_vub_simplegt_OutPattern )
                    {
                    // Simplegt.g:1399:3: (a12_0= parse_be_ac_vub_simplegt_OutPattern )
                    // Simplegt.g:1400:4: a12_0= parse_be_ac_vub_simplegt_OutPattern
                    {
                    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_OutPattern_in_parse_be_ac_vub_simplegt_Rule919);
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
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 31);
              	
            }
            a13=(Token)match(input,20,FOLLOW_20_in_parse_be_ac_vub_simplegt_Rule945); if (state.failed) return element;
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
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a13, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_10, 32, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_1);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_11, 32, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_1);
              	
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
    // Simplegt.g:1453:1: parse_be_ac_vub_simplegt_InPattern returns [be.ac.vub.simplegt.InPattern element = null] : a0= 'from' (a1_0= parse_be_ac_vub_simplegt_InputElement ) ( (a2= ',' (a3_0= parse_be_ac_vub_simplegt_InputElement ) ) )* ;
    public final be.ac.vub.simplegt.InPattern parse_be_ac_vub_simplegt_InPattern() throws RecognitionException {
        be.ac.vub.simplegt.InPattern element =  null;
        int parse_be_ac_vub_simplegt_InPattern_StartIndex = input.index();
        Token a0=null;
        Token a2=null;
        be.ac.vub.simplegt.InputElement a1_0 = null;

        be.ac.vub.simplegt.InputElement a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }
            // Simplegt.g:1456:1: (a0= 'from' (a1_0= parse_be_ac_vub_simplegt_InputElement ) ( (a2= ',' (a3_0= parse_be_ac_vub_simplegt_InputElement ) ) )* )
            // Simplegt.g:1457:2: a0= 'from' (a1_0= parse_be_ac_vub_simplegt_InputElement ) ( (a2= ',' (a3_0= parse_be_ac_vub_simplegt_InputElement ) ) )*
            {
            a0=(Token)match(input,21,FOLLOW_21_in_parse_be_ac_vub_simplegt_InPattern974); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInPattern();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_4_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 33, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_6);
              	
            }
            // Simplegt.g:1471:2: (a1_0= parse_be_ac_vub_simplegt_InputElement )
            // Simplegt.g:1472:3: a1_0= parse_be_ac_vub_simplegt_InputElement
            {
            pushFollow(FOLLOW_parse_be_ac_vub_simplegt_InputElement_in_parse_be_ac_vub_simplegt_InPattern992);
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
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_25, 34);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 34, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 34, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 34);
              	
            }
            // Simplegt.g:1500:2: ( (a2= ',' (a3_0= parse_be_ac_vub_simplegt_InputElement ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Simplegt.g:1501:3: (a2= ',' (a3_0= parse_be_ac_vub_simplegt_InputElement ) )
            	    {
            	    // Simplegt.g:1501:3: (a2= ',' (a3_0= parse_be_ac_vub_simplegt_InputElement ) )
            	    // Simplegt.g:1502:4: a2= ',' (a3_0= parse_be_ac_vub_simplegt_InputElement )
            	    {
            	    a2=(Token)match(input,14,FOLLOW_14_in_parse_be_ac_vub_simplegt_InPattern1019); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInPattern();
            	      					incompleteObjects.push(element);
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_4_0_0_2_0_0_0, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 35, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_6);
            	      			
            	    }
            	    // Simplegt.g:1516:4: (a3_0= parse_be_ac_vub_simplegt_InputElement )
            	    // Simplegt.g:1517:5: a3_0= parse_be_ac_vub_simplegt_InputElement
            	    {
            	    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_InputElement_in_parse_be_ac_vub_simplegt_InPattern1045);
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
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_25, 36);
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 36, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 36, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 36);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_25, 37);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 37, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 37, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 37);
              	
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
    // Simplegt.g:1557:1: parse_be_ac_vub_simplegt_Type returns [be.ac.vub.simplegt.Type element = null] : (a0= TEXT ) a1= '!' (a2= TEXT ) ;
    public final be.ac.vub.simplegt.Type parse_be_ac_vub_simplegt_Type() throws RecognitionException {
        be.ac.vub.simplegt.Type element =  null;
        int parse_be_ac_vub_simplegt_Type_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }
            // Simplegt.g:1560:1: ( (a0= TEXT ) a1= '!' (a2= TEXT ) )
            // Simplegt.g:1561:2: (a0= TEXT ) a1= '!' (a2= TEXT )
            {
            // Simplegt.g:1561:2: (a0= TEXT )
            // Simplegt.g:1562:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Type1105); if (state.failed) return element;
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
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
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
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_27, 38);
              	
            }
            a1=(Token)match(input,22,FOLLOW_22_in_parse_be_ac_vub_simplegt_Type1126); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createType();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_5_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_28, 39);
              	
            }
            // Simplegt.g:1615:2: (a2= TEXT )
            // Simplegt.g:1616:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Type1144); if (state.failed) return element;
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
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.TYPE__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_5_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_29, 40);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_30, 40);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_25, 40);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 40, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 40, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 40);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_31, 40);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_32, 40);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_33, 40);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_34, 40);
              	
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
    // Simplegt.g:1662:1: parse_be_ac_vub_simplegt_InputElement returns [be.ac.vub.simplegt.InputElement element = null] : (a0= TEXT ) a1= ':' (a2_0= parse_be_ac_vub_simplegt_Type ) ( (a3= 'in' (a4= TEXT ) ) )? ( (a5= '(' (a6_0= parse_be_ac_vub_simplegt_InputBinding ) ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_InputBinding ) ) )* a9= ')' ) )? ;
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
            // Simplegt.g:1665:1: ( (a0= TEXT ) a1= ':' (a2_0= parse_be_ac_vub_simplegt_Type ) ( (a3= 'in' (a4= TEXT ) ) )? ( (a5= '(' (a6_0= parse_be_ac_vub_simplegt_InputBinding ) ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_InputBinding ) ) )* a9= ')' ) )? )
            // Simplegt.g:1666:2: (a0= TEXT ) a1= ':' (a2_0= parse_be_ac_vub_simplegt_Type ) ( (a3= 'in' (a4= TEXT ) ) )? ( (a5= '(' (a6_0= parse_be_ac_vub_simplegt_InputBinding ) ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_InputBinding ) ) )* a9= ')' ) )?
            {
            // Simplegt.g:1666:2: (a0= TEXT )
            // Simplegt.g:1667:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_InputElement1184); if (state.failed) return element;
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
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_ELEMENT__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_6_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_35, 41);
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_be_ac_vub_simplegt_InputElement1205); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputElement();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_6_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_26, 42, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_7);
              	
            }
            // Simplegt.g:1716:2: (a2_0= parse_be_ac_vub_simplegt_Type )
            // Simplegt.g:1717:3: a2_0= parse_be_ac_vub_simplegt_Type
            {
            pushFollow(FOLLOW_parse_be_ac_vub_simplegt_Type_in_parse_be_ac_vub_simplegt_InputElement1223);
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
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_29, 43);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_30, 43);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_25, 43);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 43, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 43, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 43);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_31, 43);
              	
            }
            // Simplegt.g:1748:2: ( (a3= 'in' (a4= TEXT ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Simplegt.g:1749:3: (a3= 'in' (a4= TEXT ) )
                    {
                    // Simplegt.g:1749:3: (a3= 'in' (a4= TEXT ) )
                    // Simplegt.g:1750:4: a3= 'in' (a4= TEXT )
                    {
                    a3=(Token)match(input,23,FOLLOW_23_in_parse_be_ac_vub_simplegt_InputElement1250); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputElement();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_6_0_0_3_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_36, 44);
                      			
                    }
                    // Simplegt.g:1764:4: (a4= TEXT )
                    // Simplegt.g:1765:5: a4= TEXT
                    {
                    a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_InputElement1276); if (state.failed) return element;
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
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
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
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, proxy);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_30, 45);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_25, 45);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 45, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 45, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 45);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_31, 45);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_30, 46);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_25, 46);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 46, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 46, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 46);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_31, 46);
              	
            }
            // Simplegt.g:1821:2: ( (a5= '(' (a6_0= parse_be_ac_vub_simplegt_InputBinding ) ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_InputBinding ) ) )* a9= ')' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Simplegt.g:1822:3: (a5= '(' (a6_0= parse_be_ac_vub_simplegt_InputBinding ) ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_InputBinding ) ) )* a9= ')' )
                    {
                    // Simplegt.g:1822:3: (a5= '(' (a6_0= parse_be_ac_vub_simplegt_InputBinding ) ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_InputBinding ) ) )* a9= ')' )
                    // Simplegt.g:1823:4: a5= '(' (a6_0= parse_be_ac_vub_simplegt_InputBinding ) ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_InputBinding ) ) )* a9= ')'
                    {
                    a5=(Token)match(input,24,FOLLOW_24_in_parse_be_ac_vub_simplegt_InputElement1331); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputElement();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_6_0_0_4_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_37, 47, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_8);
                      			
                    }
                    // Simplegt.g:1837:4: (a6_0= parse_be_ac_vub_simplegt_InputBinding )
                    // Simplegt.g:1838:5: a6_0= parse_be_ac_vub_simplegt_InputBinding
                    {
                    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_InputBinding_in_parse_be_ac_vub_simplegt_InputElement1357);
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
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_38, 48);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 48);
                      			
                    }
                    // Simplegt.g:1864:4: ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_InputBinding ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // Simplegt.g:1865:5: (a7= ',' (a8_0= parse_be_ac_vub_simplegt_InputBinding ) )
                    	    {
                    	    // Simplegt.g:1865:5: (a7= ',' (a8_0= parse_be_ac_vub_simplegt_InputBinding ) )
                    	    // Simplegt.g:1866:6: a7= ',' (a8_0= parse_be_ac_vub_simplegt_InputBinding )
                    	    {
                    	    a7=(Token)match(input,14,FOLLOW_14_in_parse_be_ac_vub_simplegt_InputElement1398); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (element == null) {
                    	      							element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputElement();
                    	      							incompleteObjects.push(element);
                    	      						}
                    	      						collectHiddenTokens(element);
                    	      						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_6_0_0_4_0_0_3_0_0_0, null, true);
                    	      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_37, 49, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_8);
                    	      					
                    	    }
                    	    // Simplegt.g:1880:6: (a8_0= parse_be_ac_vub_simplegt_InputBinding )
                    	    // Simplegt.g:1881:7: a8_0= parse_be_ac_vub_simplegt_InputBinding
                    	    {
                    	    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_InputBinding_in_parse_be_ac_vub_simplegt_InputElement1432);
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
                    	      						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_38, 50);
                    	      						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 50);
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_38, 51);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 51);
                      			
                    }
                    a9=(Token)match(input,25,FOLLOW_25_in_parse_be_ac_vub_simplegt_InputElement1493); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputElement();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_6_0_0_4_0_0_4, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a9, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_25, 52);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 52, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 52, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 52);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_31, 52);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_25, 53);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 53, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 53, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 53);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_31, 53);
              	
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
    // Simplegt.g:1946:1: parse_be_ac_vub_simplegt_InputBinding returns [be.ac.vub.simplegt.InputBinding element = null] : (a0= TEXT ) a1= '=' (a2_0= parse_be_ac_vub_simplegt_Expression ) ;
    public final be.ac.vub.simplegt.InputBinding parse_be_ac_vub_simplegt_InputBinding() throws RecognitionException {
        be.ac.vub.simplegt.InputBinding element =  null;
        int parse_be_ac_vub_simplegt_InputBinding_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        be.ac.vub.simplegt.Expression a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }
            // Simplegt.g:1949:1: ( (a0= TEXT ) a1= '=' (a2_0= parse_be_ac_vub_simplegt_Expression ) )
            // Simplegt.g:1950:2: (a0= TEXT ) a1= '=' (a2_0= parse_be_ac_vub_simplegt_Expression )
            {
            // Simplegt.g:1950:2: (a0= TEXT )
            // Simplegt.g:1951:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_InputBinding1545); if (state.failed) return element;
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
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_BINDING__PROPERTY), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_7_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 54);
              	
            }
            a1=(Token)match(input,26,FOLLOW_26_in_parse_be_ac_vub_simplegt_InputBinding1566); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputBinding();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_7_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_41, 55, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_42, 55, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_43, 55, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_44, 55, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_45, 55, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_46, 55, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_47, 55, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              	
            }
            // Simplegt.g:2006:2: (a2_0= parse_be_ac_vub_simplegt_Expression )
            // Simplegt.g:2007:3: a2_0= parse_be_ac_vub_simplegt_Expression
            {
            pushFollow(FOLLOW_parse_be_ac_vub_simplegt_Expression_in_parse_be_ac_vub_simplegt_InputBinding1584);
            a2_0=parse_be_ac_vub_simplegt_Expression();

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
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					Object value = a2_0;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_BINDING__EXPR), value);
              					completedElement(value, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_7_0_0_2, a2_0, true);
              				copyLocalizationInfos(a2_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_38, 56);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 56);
              	
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
    // Simplegt.g:2035:1: parse_be_ac_vub_simplegt_ElementExp returns [be.ac.vub.simplegt.ElementExp element = null] : (a0= TEXT ) ( (a1= '.' (a2= TEXT ) ) )? ;
    public final be.ac.vub.simplegt.ElementExp parse_be_ac_vub_simplegt_ElementExp() throws RecognitionException {
        be.ac.vub.simplegt.ElementExp element =  null;
        int parse_be_ac_vub_simplegt_ElementExp_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }
            // Simplegt.g:2038:1: ( (a0= TEXT ) ( (a1= '.' (a2= TEXT ) ) )? )
            // Simplegt.g:2039:2: (a0= TEXT ) ( (a1= '.' (a2= TEXT ) ) )?
            {
            // Simplegt.g:2039:2: (a0= TEXT )
            // Simplegt.g:2040:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_ElementExp1621); if (state.failed) return element;
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
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
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
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_48, 57);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_38, 57);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 57);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_49, 57);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 57);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 57);
              	
            }
            // Simplegt.g:2084:2: ( (a1= '.' (a2= TEXT ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Simplegt.g:2085:3: (a1= '.' (a2= TEXT ) )
                    {
                    // Simplegt.g:2085:3: (a1= '.' (a2= TEXT ) )
                    // Simplegt.g:2086:4: a1= '.' (a2= TEXT )
                    {
                    a1=(Token)match(input,27,FOLLOW_27_in_parse_be_ac_vub_simplegt_ElementExp1651); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createElementExp();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_8_0_0_1_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 58);
                      			
                    }
                    // Simplegt.g:2100:4: (a2= TEXT )
                    // Simplegt.g:2101:5: a2= TEXT
                    {
                    a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_ElementExp1677); if (state.failed) return element;
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
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String)resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.ELEMENT_EXP__PROPERTY), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_8_0_0_1_0_0_1, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_38, 59);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 59);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_49, 59);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 59);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 59);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_38, 60);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 60);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_49, 60);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 60);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 60);
              	
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
    // Simplegt.g:2153:1: parse_be_ac_vub_simplegt_StringLiteralExp returns [be.ac.vub.simplegt.StringLiteralExp element = null] : a0= '\\\"' (a1= TEXT ) a2= '\\\"' ;
    public final be.ac.vub.simplegt.StringLiteralExp parse_be_ac_vub_simplegt_StringLiteralExp() throws RecognitionException {
        be.ac.vub.simplegt.StringLiteralExp element =  null;
        int parse_be_ac_vub_simplegt_StringLiteralExp_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }
            // Simplegt.g:2156:1: (a0= '\\\"' (a1= TEXT ) a2= '\\\"' )
            // Simplegt.g:2157:2: a0= '\\\"' (a1= TEXT ) a2= '\\\"'
            {
            a0=(Token)match(input,28,FOLLOW_28_in_parse_be_ac_vub_simplegt_StringLiteralExp1738); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createStringLiteralExp();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_9_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_53, 61);
              	
            }
            // Simplegt.g:2171:2: (a1= TEXT )
            // Simplegt.g:2172:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_StringLiteralExp1756); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createStringLiteralExp();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.STRING_LITERAL_EXP__LITERAL), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.STRING_LITERAL_EXP__LITERAL), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_9_0_0_1, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_54, 62);
              	
            }
            a2=(Token)match(input,28,FOLLOW_28_in_parse_be_ac_vub_simplegt_StringLiteralExp1777); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createStringLiteralExp();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_9_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_38, 63);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 63);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_49, 63);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 63);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 63);
              	
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
    // Simplegt.g:2227:1: parse_be_ac_vub_simplegt_IntegerLiteralExp returns [be.ac.vub.simplegt.IntegerLiteralExp element = null] : (a0= INTEGER ) ;
    public final be.ac.vub.simplegt.IntegerLiteralExp parse_be_ac_vub_simplegt_IntegerLiteralExp() throws RecognitionException {
        be.ac.vub.simplegt.IntegerLiteralExp element =  null;
        int parse_be_ac_vub_simplegt_IntegerLiteralExp_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }
            // Simplegt.g:2230:1: ( (a0= INTEGER ) )
            // Simplegt.g:2231:2: (a0= INTEGER )
            {
            // Simplegt.g:2231:2: (a0= INTEGER )
            // Simplegt.g:2232:3: a0= INTEGER
            {
            a0=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_be_ac_vub_simplegt_IntegerLiteralExp1810); if (state.failed) return element;
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
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.Integer resolved = (java.lang.Integer)resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INTEGER_LITERAL_EXP__LITERAL), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_10_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_38, 64);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 64);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_49, 64);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 64);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 64);
              	
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
    // Simplegt.g:2273:1: parse_be_ac_vub_simplegt_DoubleLiteralExp returns [be.ac.vub.simplegt.DoubleLiteralExp element = null] : (a0= FLOAT ) ;
    public final be.ac.vub.simplegt.DoubleLiteralExp parse_be_ac_vub_simplegt_DoubleLiteralExp() throws RecognitionException {
        be.ac.vub.simplegt.DoubleLiteralExp element =  null;
        int parse_be_ac_vub_simplegt_DoubleLiteralExp_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }
            // Simplegt.g:2276:1: ( (a0= FLOAT ) )
            // Simplegt.g:2277:2: (a0= FLOAT )
            {
            // Simplegt.g:2277:2: (a0= FLOAT )
            // Simplegt.g:2278:3: a0= FLOAT
            {
            a0=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_parse_be_ac_vub_simplegt_DoubleLiteralExp1850); if (state.failed) return element;
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
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.Double resolved = (java.lang.Double)resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.DOUBLE_LITERAL_EXP__LITERAL), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_11_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_38, 65);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 65);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_49, 65);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 65);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 65);
              	
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


    // $ANTLR start "parse_be_ac_vub_simplegt_CharLiteralExp"
    // Simplegt.g:2319:1: parse_be_ac_vub_simplegt_CharLiteralExp returns [be.ac.vub.simplegt.CharLiteralExp element = null] : a0= '\\'' (a1= TEXT ) a2= '\\'' ;
    public final be.ac.vub.simplegt.CharLiteralExp parse_be_ac_vub_simplegt_CharLiteralExp() throws RecognitionException {
        be.ac.vub.simplegt.CharLiteralExp element =  null;
        int parse_be_ac_vub_simplegt_CharLiteralExp_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }
            // Simplegt.g:2322:1: (a0= '\\'' (a1= TEXT ) a2= '\\'' )
            // Simplegt.g:2323:2: a0= '\\'' (a1= TEXT ) a2= '\\''
            {
            a0=(Token)match(input,29,FOLLOW_29_in_parse_be_ac_vub_simplegt_CharLiteralExp1886); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createCharLiteralExp();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_12_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_55, 66);
              	
            }
            // Simplegt.g:2337:2: (a1= TEXT )
            // Simplegt.g:2338:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_CharLiteralExp1904); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createCharLiteralExp();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.CHAR_LITERAL_EXP__LITERAL), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.Character resolved = (java.lang.Character)resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.CHAR_LITERAL_EXP__LITERAL), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_12_0_0_1, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_56, 67);
              	
            }
            a2=(Token)match(input,29,FOLLOW_29_in_parse_be_ac_vub_simplegt_CharLiteralExp1925); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createCharLiteralExp();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_12_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_38, 68);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 68);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_49, 68);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 68);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 68);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, parse_be_ac_vub_simplegt_CharLiteralExp_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_CharLiteralExp"


    // $ANTLR start "parse_be_ac_vub_simplegt_BooleanLiteralExp"
    // Simplegt.g:2393:1: parse_be_ac_vub_simplegt_BooleanLiteralExp returns [be.ac.vub.simplegt.BooleanLiteralExp element = null] : ( (a0= 'true' | a1= 'false' ) ) ;
    public final be.ac.vub.simplegt.BooleanLiteralExp parse_be_ac_vub_simplegt_BooleanLiteralExp() throws RecognitionException {
        be.ac.vub.simplegt.BooleanLiteralExp element =  null;
        int parse_be_ac_vub_simplegt_BooleanLiteralExp_StartIndex = input.index();
        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }
            // Simplegt.g:2396:1: ( ( (a0= 'true' | a1= 'false' ) ) )
            // Simplegt.g:2397:2: ( (a0= 'true' | a1= 'false' ) )
            {
            // Simplegt.g:2397:2: ( (a0= 'true' | a1= 'false' ) )
            // Simplegt.g:2398:3: (a0= 'true' | a1= 'false' )
            {
            // Simplegt.g:2398:3: (a0= 'true' | a1= 'false' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            else if ( (LA15_0==31) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // Simplegt.g:2399:4: a0= 'true'
                    {
                    a0=(Token)match(input,30,FOLLOW_30_in_parse_be_ac_vub_simplegt_BooleanLiteralExp1963); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createBooleanLiteralExp();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_13_0_0_0, true, true);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
                      				// set value of boolean attribute
                      				Object value = true;
                      				element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.BOOLEAN_LITERAL_EXP__LITERAL), value);
                      				completedElement(value, false);
                      			
                    }

                    }
                    break;
                case 2 :
                    // Simplegt.g:2412:8: a1= 'false'
                    {
                    a1=(Token)match(input,31,FOLLOW_31_in_parse_be_ac_vub_simplegt_BooleanLiteralExp1978); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createBooleanLiteralExp();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_13_0_0_0, false, true);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
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
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_38, 69);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 69);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_49, 69);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 69);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 69);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, parse_be_ac_vub_simplegt_BooleanLiteralExp_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_BooleanLiteralExp"


    // $ANTLR start "parse_be_ac_vub_simplegt_EnumLiteralExp"
    // Simplegt.g:2438:1: parse_be_ac_vub_simplegt_EnumLiteralExp returns [be.ac.vub.simplegt.EnumLiteralExp element = null] : a0= '#' (a1= TEXT ) ;
    public final be.ac.vub.simplegt.EnumLiteralExp parse_be_ac_vub_simplegt_EnumLiteralExp() throws RecognitionException {
        be.ac.vub.simplegt.EnumLiteralExp element =  null;
        int parse_be_ac_vub_simplegt_EnumLiteralExp_StartIndex = input.index();
        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }
            // Simplegt.g:2441:1: (a0= '#' (a1= TEXT ) )
            // Simplegt.g:2442:2: a0= '#' (a1= TEXT )
            {
            a0=(Token)match(input,32,FOLLOW_32_in_parse_be_ac_vub_simplegt_EnumLiteralExp2014); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createEnumLiteralExp();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_14_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_57, 70);
              	
            }
            // Simplegt.g:2456:2: (a1= TEXT )
            // Simplegt.g:2457:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_EnumLiteralExp2032); if (state.failed) return element;
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
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.ENUM_LITERAL_EXP__LITERAL), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_14_0_0_1, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_38, 71);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 71);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_49, 71);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 71);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 71);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, parse_be_ac_vub_simplegt_EnumLiteralExp_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_EnumLiteralExp"


    // $ANTLR start "parse_be_ac_vub_simplegt_NacPattern"
    // Simplegt.g:2498:1: parse_be_ac_vub_simplegt_NacPattern returns [be.ac.vub.simplegt.NacPattern element = null] : a0= 'not' (a1_0= parse_be_ac_vub_simplegt_InputElement ) ( (a2= ',' (a3_0= parse_be_ac_vub_simplegt_InputElement ) ) )* ;
    public final be.ac.vub.simplegt.NacPattern parse_be_ac_vub_simplegt_NacPattern() throws RecognitionException {
        be.ac.vub.simplegt.NacPattern element =  null;
        int parse_be_ac_vub_simplegt_NacPattern_StartIndex = input.index();
        Token a0=null;
        Token a2=null;
        be.ac.vub.simplegt.InputElement a1_0 = null;

        be.ac.vub.simplegt.InputElement a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }
            // Simplegt.g:2501:1: (a0= 'not' (a1_0= parse_be_ac_vub_simplegt_InputElement ) ( (a2= ',' (a3_0= parse_be_ac_vub_simplegt_InputElement ) ) )* )
            // Simplegt.g:2502:2: a0= 'not' (a1_0= parse_be_ac_vub_simplegt_InputElement ) ( (a2= ',' (a3_0= parse_be_ac_vub_simplegt_InputElement ) ) )*
            {
            a0=(Token)match(input,33,FOLLOW_33_in_parse_be_ac_vub_simplegt_NacPattern2068); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createNacPattern();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_15_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 72, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_6);
              	
            }
            // Simplegt.g:2516:2: (a1_0= parse_be_ac_vub_simplegt_InputElement )
            // Simplegt.g:2517:3: a1_0= parse_be_ac_vub_simplegt_InputElement
            {
            pushFollow(FOLLOW_parse_be_ac_vub_simplegt_InputElement_in_parse_be_ac_vub_simplegt_NacPattern2086);
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
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_15_0_0_1, a1_0, true);
              				copyLocalizationInfos(a1_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_31, 73);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 73, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 73, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 73);
              	
            }
            // Simplegt.g:2545:2: ( (a2= ',' (a3_0= parse_be_ac_vub_simplegt_InputElement ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==14) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // Simplegt.g:2546:3: (a2= ',' (a3_0= parse_be_ac_vub_simplegt_InputElement ) )
            	    {
            	    // Simplegt.g:2546:3: (a2= ',' (a3_0= parse_be_ac_vub_simplegt_InputElement ) )
            	    // Simplegt.g:2547:4: a2= ',' (a3_0= parse_be_ac_vub_simplegt_InputElement )
            	    {
            	    a2=(Token)match(input,14,FOLLOW_14_in_parse_be_ac_vub_simplegt_NacPattern2113); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createNacPattern();
            	      					incompleteObjects.push(element);
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_15_0_0_2_0_0_0, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 74, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_6);
            	      			
            	    }
            	    // Simplegt.g:2561:4: (a3_0= parse_be_ac_vub_simplegt_InputElement )
            	    // Simplegt.g:2562:5: a3_0= parse_be_ac_vub_simplegt_InputElement
            	    {
            	    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_InputElement_in_parse_be_ac_vub_simplegt_NacPattern2139);
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
            	      						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_15_0_0_2_0_0_2, a3_0, true);
            	      						copyLocalizationInfos(a3_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_31, 75);
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 75, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 75, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 75);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_31, 76);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 76, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 76, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 76);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, parse_be_ac_vub_simplegt_NacPattern_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_NacPattern"


    // $ANTLR start "parse_be_ac_vub_simplegt_OutPattern"
    // Simplegt.g:2602:1: parse_be_ac_vub_simplegt_OutPattern returns [be.ac.vub.simplegt.OutPattern element = null] : a0= 'to' (a1_0= parse_be_ac_vub_simplegt_OutputElement ) ( (a2= ',' (a3_0= parse_be_ac_vub_simplegt_OutputElement ) ) )* ;
    public final be.ac.vub.simplegt.OutPattern parse_be_ac_vub_simplegt_OutPattern() throws RecognitionException {
        be.ac.vub.simplegt.OutPattern element =  null;
        int parse_be_ac_vub_simplegt_OutPattern_StartIndex = input.index();
        Token a0=null;
        Token a2=null;
        be.ac.vub.simplegt.OutputElement a1_0 = null;

        be.ac.vub.simplegt.OutputElement a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }
            // Simplegt.g:2605:1: (a0= 'to' (a1_0= parse_be_ac_vub_simplegt_OutputElement ) ( (a2= ',' (a3_0= parse_be_ac_vub_simplegt_OutputElement ) ) )* )
            // Simplegt.g:2606:2: a0= 'to' (a1_0= parse_be_ac_vub_simplegt_OutputElement ) ( (a2= ',' (a3_0= parse_be_ac_vub_simplegt_OutputElement ) ) )*
            {
            a0=(Token)match(input,34,FOLLOW_34_in_parse_be_ac_vub_simplegt_OutPattern2195); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutPattern();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_16_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_58, 77, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_10);
              	
            }
            // Simplegt.g:2620:2: (a1_0= parse_be_ac_vub_simplegt_OutputElement )
            // Simplegt.g:2621:3: a1_0= parse_be_ac_vub_simplegt_OutputElement
            {
            pushFollow(FOLLOW_parse_be_ac_vub_simplegt_OutputElement_in_parse_be_ac_vub_simplegt_OutPattern2213);
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
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_16_0_0_1, a1_0, true);
              				copyLocalizationInfos(a1_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_34, 78);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 78);
              	
            }
            // Simplegt.g:2647:2: ( (a2= ',' (a3_0= parse_be_ac_vub_simplegt_OutputElement ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==14) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // Simplegt.g:2648:3: (a2= ',' (a3_0= parse_be_ac_vub_simplegt_OutputElement ) )
            	    {
            	    // Simplegt.g:2648:3: (a2= ',' (a3_0= parse_be_ac_vub_simplegt_OutputElement ) )
            	    // Simplegt.g:2649:4: a2= ',' (a3_0= parse_be_ac_vub_simplegt_OutputElement )
            	    {
            	    a2=(Token)match(input,14,FOLLOW_14_in_parse_be_ac_vub_simplegt_OutPattern2240); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutPattern();
            	      					incompleteObjects.push(element);
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_16_0_0_2_0_0_0, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_58, 79, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_10);
            	      			
            	    }
            	    // Simplegt.g:2663:4: (a3_0= parse_be_ac_vub_simplegt_OutputElement )
            	    // Simplegt.g:2664:5: a3_0= parse_be_ac_vub_simplegt_OutputElement
            	    {
            	    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_OutputElement_in_parse_be_ac_vub_simplegt_OutPattern2266);
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
            	      						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_16_0_0_2_0_0_2, a3_0, true);
            	      						copyLocalizationInfos(a3_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_34, 80);
            	      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 80);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_34, 81);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 81);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, parse_be_ac_vub_simplegt_OutPattern_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_OutPattern"


    // $ANTLR start "parse_be_ac_vub_simplegt_OutputElement"
    // Simplegt.g:2700:1: parse_be_ac_vub_simplegt_OutputElement returns [be.ac.vub.simplegt.OutputElement element = null] : (a0= TEXT ) a1= ':' (a2_0= parse_be_ac_vub_simplegt_Type ) ( (a3= 'in' (a4= TEXT ) ) )? ( (a5= '(' (a6_0= parse_be_ac_vub_simplegt_OutputBinding ) ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_OutputBinding ) ) )* a9= ')' ) )? ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return element; }
            // Simplegt.g:2703:1: ( (a0= TEXT ) a1= ':' (a2_0= parse_be_ac_vub_simplegt_Type ) ( (a3= 'in' (a4= TEXT ) ) )? ( (a5= '(' (a6_0= parse_be_ac_vub_simplegt_OutputBinding ) ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_OutputBinding ) ) )* a9= ')' ) )? )
            // Simplegt.g:2704:2: (a0= TEXT ) a1= ':' (a2_0= parse_be_ac_vub_simplegt_Type ) ( (a3= 'in' (a4= TEXT ) ) )? ( (a5= '(' (a6_0= parse_be_ac_vub_simplegt_OutputBinding ) ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_OutputBinding ) ) )* a9= ')' ) )?
            {
            // Simplegt.g:2704:2: (a0= TEXT )
            // Simplegt.g:2705:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_OutputElement2326); if (state.failed) return element;
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
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_ELEMENT__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_17_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_59, 82);
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_be_ac_vub_simplegt_OutputElement2347); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputElement();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_17_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_26, 83, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_7);
              	
            }
            // Simplegt.g:2754:2: (a2_0= parse_be_ac_vub_simplegt_Type )
            // Simplegt.g:2755:3: a2_0= parse_be_ac_vub_simplegt_Type
            {
            pushFollow(FOLLOW_parse_be_ac_vub_simplegt_Type_in_parse_be_ac_vub_simplegt_OutputElement2365);
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
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_17_0_0_2, a2_0, true);
              				copyLocalizationInfos(a2_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_32, 84);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_33, 84);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_34, 84);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 84);
              	
            }
            // Simplegt.g:2783:2: ( (a3= 'in' (a4= TEXT ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // Simplegt.g:2784:3: (a3= 'in' (a4= TEXT ) )
                    {
                    // Simplegt.g:2784:3: (a3= 'in' (a4= TEXT ) )
                    // Simplegt.g:2785:4: a3= 'in' (a4= TEXT )
                    {
                    a3=(Token)match(input,23,FOLLOW_23_in_parse_be_ac_vub_simplegt_OutputElement2392); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputElement();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_17_0_0_3_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_60, 85);
                      			
                    }
                    // Simplegt.g:2799:4: (a4= TEXT )
                    // Simplegt.g:2800:5: a4= TEXT
                    {
                    a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_OutputElement2418); if (state.failed) return element;
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
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
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
                      						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_17_0_0_3_0_0_1, proxy, true);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, proxy);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_33, 86);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_34, 86);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 86);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_33, 87);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_34, 87);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 87);
              	
            }
            // Simplegt.g:2850:2: ( (a5= '(' (a6_0= parse_be_ac_vub_simplegt_OutputBinding ) ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_OutputBinding ) ) )* a9= ')' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // Simplegt.g:2851:3: (a5= '(' (a6_0= parse_be_ac_vub_simplegt_OutputBinding ) ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_OutputBinding ) ) )* a9= ')' )
                    {
                    // Simplegt.g:2851:3: (a5= '(' (a6_0= parse_be_ac_vub_simplegt_OutputBinding ) ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_OutputBinding ) ) )* a9= ')' )
                    // Simplegt.g:2852:4: a5= '(' (a6_0= parse_be_ac_vub_simplegt_OutputBinding ) ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_OutputBinding ) ) )* a9= ')'
                    {
                    a5=(Token)match(input,24,FOLLOW_24_in_parse_be_ac_vub_simplegt_OutputElement2473); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputElement();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_17_0_0_4_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_61, 88, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_11);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_62, 88, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_11);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_63, 88, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_11);
                      			
                    }
                    // Simplegt.g:2868:4: (a6_0= parse_be_ac_vub_simplegt_OutputBinding )
                    // Simplegt.g:2869:5: a6_0= parse_be_ac_vub_simplegt_OutputBinding
                    {
                    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_OutputBinding_in_parse_be_ac_vub_simplegt_OutputElement2499);
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
                      						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_17_0_0_4_0_0_2, a6_0, true);
                      						copyLocalizationInfos(a6_0, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_49, 89);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 89);
                      			
                    }
                    // Simplegt.g:2895:4: ( (a7= ',' (a8_0= parse_be_ac_vub_simplegt_OutputBinding ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // Simplegt.g:2896:5: (a7= ',' (a8_0= parse_be_ac_vub_simplegt_OutputBinding ) )
                    	    {
                    	    // Simplegt.g:2896:5: (a7= ',' (a8_0= parse_be_ac_vub_simplegt_OutputBinding ) )
                    	    // Simplegt.g:2897:6: a7= ',' (a8_0= parse_be_ac_vub_simplegt_OutputBinding )
                    	    {
                    	    a7=(Token)match(input,14,FOLLOW_14_in_parse_be_ac_vub_simplegt_OutputElement2540); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (element == null) {
                    	      							element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputElement();
                    	      							incompleteObjects.push(element);
                    	      						}
                    	      						collectHiddenTokens(element);
                    	      						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_17_0_0_4_0_0_3_0_0_0, null, true);
                    	      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_61, 90, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_11);
                    	      						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_62, 90, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_11);
                    	      						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_63, 90, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_11);
                    	      					
                    	    }
                    	    // Simplegt.g:2913:6: (a8_0= parse_be_ac_vub_simplegt_OutputBinding )
                    	    // Simplegt.g:2914:7: a8_0= parse_be_ac_vub_simplegt_OutputBinding
                    	    {
                    	    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_OutputBinding_in_parse_be_ac_vub_simplegt_OutputElement2574);
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
                    	      								retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_17_0_0_4_0_0_3_0_0_1, a8_0, true);
                    	      								copyLocalizationInfos(a8_0, element);
                    	      							}
                    	      						
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_49, 91);
                    	      						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 91);
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_49, 92);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 92);
                      			
                    }
                    a9=(Token)match(input,25,FOLLOW_25_in_parse_be_ac_vub_simplegt_OutputElement2635); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputElement();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_17_0_0_4_0_0_4, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a9, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_34, 93);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 93);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_34, 94);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 94);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, parse_be_ac_vub_simplegt_OutputElement_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_OutputElement"


    // $ANTLR start "parse_be_ac_vub_simplegt_SetBinding"
    // Simplegt.g:2973:1: parse_be_ac_vub_simplegt_SetBinding returns [be.ac.vub.simplegt.SetBinding element = null] : (a0= TEXT ) a1= '=' (a2_0= parse_be_ac_vub_simplegt_Expression ) ;
    public final be.ac.vub.simplegt.SetBinding parse_be_ac_vub_simplegt_SetBinding() throws RecognitionException {
        be.ac.vub.simplegt.SetBinding element =  null;
        int parse_be_ac_vub_simplegt_SetBinding_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        be.ac.vub.simplegt.Expression a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return element; }
            // Simplegt.g:2976:1: ( (a0= TEXT ) a1= '=' (a2_0= parse_be_ac_vub_simplegt_Expression ) )
            // Simplegt.g:2977:2: (a0= TEXT ) a1= '=' (a2_0= parse_be_ac_vub_simplegt_Expression )
            {
            // Simplegt.g:2977:2: (a0= TEXT )
            // Simplegt.g:2978:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_SetBinding2687); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createSetBinding();
              				incompleteObjects.push(element);
              			}
              			if (a0 != null) {
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.SET_BINDING__PROPERTY), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.SET_BINDING__PROPERTY), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_18_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_64, 95);
              	
            }
            a1=(Token)match(input,26,FOLLOW_26_in_parse_be_ac_vub_simplegt_SetBinding2708); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createSetBinding();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_18_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_41, 96, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_42, 96, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_43, 96, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_44, 96, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_45, 96, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_46, 96, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_47, 96, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              	
            }
            // Simplegt.g:3033:2: (a2_0= parse_be_ac_vub_simplegt_Expression )
            // Simplegt.g:3034:3: a2_0= parse_be_ac_vub_simplegt_Expression
            {
            pushFollow(FOLLOW_parse_be_ac_vub_simplegt_Expression_in_parse_be_ac_vub_simplegt_SetBinding2726);
            a2_0=parse_be_ac_vub_simplegt_Expression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createSetBinding();
              				incompleteObjects.push(element);
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					Object value = a2_0;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.SET_BINDING__EXPR), value);
              					completedElement(value, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_18_0_0_2, a2_0, true);
              				copyLocalizationInfos(a2_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_49, 97);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 97);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, parse_be_ac_vub_simplegt_SetBinding_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_SetBinding"


    // $ANTLR start "parse_be_ac_vub_simplegt_AddBinding"
    // Simplegt.g:3062:1: parse_be_ac_vub_simplegt_AddBinding returns [be.ac.vub.simplegt.AddBinding element = null] : (a0= TEXT ) a1= '+=' (a2_0= parse_be_ac_vub_simplegt_Expression ) ( (a3= 'before' (a4= TEXT ) ) )? ;
    public final be.ac.vub.simplegt.AddBinding parse_be_ac_vub_simplegt_AddBinding() throws RecognitionException {
        be.ac.vub.simplegt.AddBinding element =  null;
        int parse_be_ac_vub_simplegt_AddBinding_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        Token a4=null;
        be.ac.vub.simplegt.Expression a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return element; }
            // Simplegt.g:3065:1: ( (a0= TEXT ) a1= '+=' (a2_0= parse_be_ac_vub_simplegt_Expression ) ( (a3= 'before' (a4= TEXT ) ) )? )
            // Simplegt.g:3066:2: (a0= TEXT ) a1= '+=' (a2_0= parse_be_ac_vub_simplegt_Expression ) ( (a3= 'before' (a4= TEXT ) ) )?
            {
            // Simplegt.g:3066:2: (a0= TEXT )
            // Simplegt.g:3067:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_AddBinding2763); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createAddBinding();
              				incompleteObjects.push(element);
              			}
              			if (a0 != null) {
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.ADD_BINDING__PROPERTY), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.ADD_BINDING__PROPERTY), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_19_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_65, 98);
              	
            }
            a1=(Token)match(input,35,FOLLOW_35_in_parse_be_ac_vub_simplegt_AddBinding2784); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createAddBinding();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_19_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_41, 99, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_42, 99, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_43, 99, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_44, 99, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_45, 99, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_46, 99, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_47, 99, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              	
            }
            // Simplegt.g:3122:2: (a2_0= parse_be_ac_vub_simplegt_Expression )
            // Simplegt.g:3123:3: a2_0= parse_be_ac_vub_simplegt_Expression
            {
            pushFollow(FOLLOW_parse_be_ac_vub_simplegt_Expression_in_parse_be_ac_vub_simplegt_AddBinding2802);
            a2_0=parse_be_ac_vub_simplegt_Expression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createAddBinding();
              				incompleteObjects.push(element);
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					Object value = a2_0;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.ADD_BINDING__EXPR), value);
              					completedElement(value, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_19_0_0_2, a2_0, true);
              				copyLocalizationInfos(a2_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 100);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_49, 100);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 100);
              	
            }
            // Simplegt.g:3150:2: ( (a3= 'before' (a4= TEXT ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // Simplegt.g:3151:3: (a3= 'before' (a4= TEXT ) )
                    {
                    // Simplegt.g:3151:3: (a3= 'before' (a4= TEXT ) )
                    // Simplegt.g:3152:4: a3= 'before' (a4= TEXT )
                    {
                    a3=(Token)match(input,36,FOLLOW_36_in_parse_be_ac_vub_simplegt_AddBinding2829); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createAddBinding();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_19_0_0_3_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_66, 101);
                      			
                    }
                    // Simplegt.g:3166:4: (a4= TEXT )
                    // Simplegt.g:3167:5: a4= TEXT
                    {
                    a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_AddBinding2855); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createAddBinding();
                      						incompleteObjects.push(element);
                      					}
                      					if (a4 != null) {
                      						be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      						tokenResolver.setOptions(getOptions());
                      						be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.ADD_BINDING__BEFORE_ELEMENT), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
                      						}
                      						String resolved = (String) resolvedObject;
                      						be.ac.vub.simplegt.RuleElement proxy = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputElement();
                      						collectHiddenTokens(element);
                      						registerContextDependentProxy(new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtContextDependentURIFragmentFactory<be.ac.vub.simplegt.AddBinding, be.ac.vub.simplegt.RuleElement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAddBindingBeforeElementReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.ADD_BINDING__BEFORE_ELEMENT), resolved, proxy);
                      						if (proxy != null) {
                      							Object value = proxy;
                      							element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.ADD_BINDING__BEFORE_ELEMENT), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_19_0_0_3_0_0_1, proxy, true);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, proxy);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_49, 102);
                      				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 102);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_49, 103);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 103);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, parse_be_ac_vub_simplegt_AddBinding_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_AddBinding"


    // $ANTLR start "parse_be_ac_vub_simplegt_DelBinding"
    // Simplegt.g:3217:1: parse_be_ac_vub_simplegt_DelBinding returns [be.ac.vub.simplegt.DelBinding element = null] : (a0= TEXT ) a1= '-=' (a2_0= parse_be_ac_vub_simplegt_Expression ) ;
    public final be.ac.vub.simplegt.DelBinding parse_be_ac_vub_simplegt_DelBinding() throws RecognitionException {
        be.ac.vub.simplegt.DelBinding element =  null;
        int parse_be_ac_vub_simplegt_DelBinding_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        be.ac.vub.simplegt.Expression a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return element; }
            // Simplegt.g:3220:1: ( (a0= TEXT ) a1= '-=' (a2_0= parse_be_ac_vub_simplegt_Expression ) )
            // Simplegt.g:3221:2: (a0= TEXT ) a1= '-=' (a2_0= parse_be_ac_vub_simplegt_Expression )
            {
            // Simplegt.g:3221:2: (a0= TEXT )
            // Simplegt.g:3222:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_DelBinding2920); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createDelBinding();
              				incompleteObjects.push(element);
              			}
              			if (a0 != null) {
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.DEL_BINDING__PROPERTY), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.DEL_BINDING__PROPERTY), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_20_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_67, 104);
              	
            }
            a1=(Token)match(input,37,FOLLOW_37_in_parse_be_ac_vub_simplegt_DelBinding2941); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createDelBinding();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_20_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_41, 105, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_42, 105, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_43, 105, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_44, 105, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_45, 105, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_46, 105, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_47, 105, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
              	
            }
            // Simplegt.g:3277:2: (a2_0= parse_be_ac_vub_simplegt_Expression )
            // Simplegt.g:3278:3: a2_0= parse_be_ac_vub_simplegt_Expression
            {
            pushFollow(FOLLOW_parse_be_ac_vub_simplegt_Expression_in_parse_be_ac_vub_simplegt_DelBinding2959);
            a2_0=parse_be_ac_vub_simplegt_Expression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
              			}
              			if (element == null) {
              				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createDelBinding();
              				incompleteObjects.push(element);
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					Object value = a2_0;
              					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.DEL_BINDING__EXPR), value);
              					completedElement(value, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_20_0_0_2, a2_0, true);
              				copyLocalizationInfos(a2_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_49, 106);
              		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 106);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, parse_be_ac_vub_simplegt_DelBinding_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_DelBinding"


    // $ANTLR start "parse_be_ac_vub_simplegt_Expression"
    // Simplegt.g:3306:1: parse_be_ac_vub_simplegt_Expression returns [be.ac.vub.simplegt.Expression element = null] : (c0= parse_be_ac_vub_simplegt_ElementExp | c1= parse_be_ac_vub_simplegt_StringLiteralExp | c2= parse_be_ac_vub_simplegt_IntegerLiteralExp | c3= parse_be_ac_vub_simplegt_DoubleLiteralExp | c4= parse_be_ac_vub_simplegt_CharLiteralExp | c5= parse_be_ac_vub_simplegt_BooleanLiteralExp | c6= parse_be_ac_vub_simplegt_EnumLiteralExp );
    public final be.ac.vub.simplegt.Expression parse_be_ac_vub_simplegt_Expression() throws RecognitionException {
        be.ac.vub.simplegt.Expression element =  null;
        int parse_be_ac_vub_simplegt_Expression_StartIndex = input.index();
        be.ac.vub.simplegt.ElementExp c0 = null;

        be.ac.vub.simplegt.StringLiteralExp c1 = null;

        be.ac.vub.simplegt.IntegerLiteralExp c2 = null;

        be.ac.vub.simplegt.DoubleLiteralExp c3 = null;

        be.ac.vub.simplegt.CharLiteralExp c4 = null;

        be.ac.vub.simplegt.BooleanLiteralExp c5 = null;

        be.ac.vub.simplegt.EnumLiteralExp c6 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return element; }
            // Simplegt.g:3307:1: (c0= parse_be_ac_vub_simplegt_ElementExp | c1= parse_be_ac_vub_simplegt_StringLiteralExp | c2= parse_be_ac_vub_simplegt_IntegerLiteralExp | c3= parse_be_ac_vub_simplegt_DoubleLiteralExp | c4= parse_be_ac_vub_simplegt_CharLiteralExp | c5= parse_be_ac_vub_simplegt_BooleanLiteralExp | c6= parse_be_ac_vub_simplegt_EnumLiteralExp )
            int alt22=7;
            switch ( input.LA(1) ) {
            case TEXT:
                {
                alt22=1;
                }
                break;
            case 28:
                {
                alt22=2;
                }
                break;
            case INTEGER:
                {
                alt22=3;
                }
                break;
            case FLOAT:
                {
                alt22=4;
                }
                break;
            case 29:
                {
                alt22=5;
                }
                break;
            case 30:
            case 31:
                {
                alt22=6;
                }
                break;
            case 32:
                {
                alt22=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // Simplegt.g:3308:2: c0= parse_be_ac_vub_simplegt_ElementExp
                    {
                    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_ElementExp_in_parse_be_ac_vub_simplegt_Expression2988);
                    c0=parse_be_ac_vub_simplegt_ElementExp();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Simplegt.g:3309:4: c1= parse_be_ac_vub_simplegt_StringLiteralExp
                    {
                    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_StringLiteralExp_in_parse_be_ac_vub_simplegt_Expression2998);
                    c1=parse_be_ac_vub_simplegt_StringLiteralExp();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Simplegt.g:3310:4: c2= parse_be_ac_vub_simplegt_IntegerLiteralExp
                    {
                    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_IntegerLiteralExp_in_parse_be_ac_vub_simplegt_Expression3008);
                    c2=parse_be_ac_vub_simplegt_IntegerLiteralExp();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // Simplegt.g:3311:4: c3= parse_be_ac_vub_simplegt_DoubleLiteralExp
                    {
                    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_DoubleLiteralExp_in_parse_be_ac_vub_simplegt_Expression3018);
                    c3=parse_be_ac_vub_simplegt_DoubleLiteralExp();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 5 :
                    // Simplegt.g:3312:4: c4= parse_be_ac_vub_simplegt_CharLiteralExp
                    {
                    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_CharLiteralExp_in_parse_be_ac_vub_simplegt_Expression3028);
                    c4=parse_be_ac_vub_simplegt_CharLiteralExp();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c4; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 6 :
                    // Simplegt.g:3313:4: c5= parse_be_ac_vub_simplegt_BooleanLiteralExp
                    {
                    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_BooleanLiteralExp_in_parse_be_ac_vub_simplegt_Expression3038);
                    c5=parse_be_ac_vub_simplegt_BooleanLiteralExp();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c5; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 7 :
                    // Simplegt.g:3314:4: c6= parse_be_ac_vub_simplegt_EnumLiteralExp
                    {
                    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_EnumLiteralExp_in_parse_be_ac_vub_simplegt_Expression3048);
                    c6=parse_be_ac_vub_simplegt_EnumLiteralExp();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c6; /* this is a subclass or primitive expression choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 23, parse_be_ac_vub_simplegt_Expression_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_Expression"


    // $ANTLR start "parse_be_ac_vub_simplegt_OutputBinding"
    // Simplegt.g:3318:1: parse_be_ac_vub_simplegt_OutputBinding returns [be.ac.vub.simplegt.OutputBinding element = null] : (c0= parse_be_ac_vub_simplegt_SetBinding | c1= parse_be_ac_vub_simplegt_AddBinding | c2= parse_be_ac_vub_simplegt_DelBinding );
    public final be.ac.vub.simplegt.OutputBinding parse_be_ac_vub_simplegt_OutputBinding() throws RecognitionException {
        be.ac.vub.simplegt.OutputBinding element =  null;
        int parse_be_ac_vub_simplegt_OutputBinding_StartIndex = input.index();
        be.ac.vub.simplegt.SetBinding c0 = null;

        be.ac.vub.simplegt.AddBinding c1 = null;

        be.ac.vub.simplegt.DelBinding c2 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return element; }
            // Simplegt.g:3319:1: (c0= parse_be_ac_vub_simplegt_SetBinding | c1= parse_be_ac_vub_simplegt_AddBinding | c2= parse_be_ac_vub_simplegt_DelBinding )
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==TEXT) ) {
                switch ( input.LA(2) ) {
                case 35:
                    {
                    alt23=2;
                    }
                    break;
                case 26:
                    {
                    alt23=1;
                    }
                    break;
                case 37:
                    {
                    alt23=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // Simplegt.g:3320:2: c0= parse_be_ac_vub_simplegt_SetBinding
                    {
                    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_SetBinding_in_parse_be_ac_vub_simplegt_OutputBinding3069);
                    c0=parse_be_ac_vub_simplegt_SetBinding();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Simplegt.g:3321:4: c1= parse_be_ac_vub_simplegt_AddBinding
                    {
                    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_AddBinding_in_parse_be_ac_vub_simplegt_OutputBinding3079);
                    c1=parse_be_ac_vub_simplegt_AddBinding();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Simplegt.g:3322:4: c2= parse_be_ac_vub_simplegt_DelBinding
                    {
                    pushFollow(FOLLOW_parse_be_ac_vub_simplegt_DelBinding_in_parse_be_ac_vub_simplegt_OutputBinding3089);
                    c2=parse_be_ac_vub_simplegt_DelBinding();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 24, parse_be_ac_vub_simplegt_OutputBinding_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_be_ac_vub_simplegt_OutputBinding"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_Module_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_parse_be_ac_vub_simplegt_Module115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Module133 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_be_ac_vub_simplegt_Module154 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_parse_be_ac_vub_simplegt_Module177 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Module203 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_be_ac_vub_simplegt_Module236 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_13_in_parse_be_ac_vub_simplegt_Module269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_InstanceModel_in_parse_be_ac_vub_simplegt_Module287 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_14_in_parse_be_ac_vub_simplegt_Module314 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_InstanceModel_in_parse_be_ac_vub_simplegt_Module340 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_11_in_parse_be_ac_vub_simplegt_Module381 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_Rule_in_parse_be_ac_vub_simplegt_Module404 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_InstanceModel449 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_be_ac_vub_simplegt_InstanceModel470 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_Metamodel_in_parse_be_ac_vub_simplegt_InstanceModel488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Metamodel525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_parse_be_ac_vub_simplegt_Rule570 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_be_ac_vub_simplegt_Rule591 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Rule609 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_parse_be_ac_vub_simplegt_Rule639 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Rule665 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_14_in_parse_be_ac_vub_simplegt_Rule711 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Rule745 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_19_in_parse_be_ac_vub_simplegt_Rule826 = new BitSet(new long[]{0x0000000600300000L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_InPattern_in_parse_be_ac_vub_simplegt_Rule849 = new BitSet(new long[]{0x0000000600100000L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_NacPattern_in_parse_be_ac_vub_simplegt_Rule884 = new BitSet(new long[]{0x0000000600100000L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_OutPattern_in_parse_be_ac_vub_simplegt_Rule919 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_parse_be_ac_vub_simplegt_Rule945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_parse_be_ac_vub_simplegt_InPattern974 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_InputElement_in_parse_be_ac_vub_simplegt_InPattern992 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_parse_be_ac_vub_simplegt_InPattern1019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_InputElement_in_parse_be_ac_vub_simplegt_InPattern1045 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Type1105 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_be_ac_vub_simplegt_Type1126 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_Type1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_InputElement1184 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_be_ac_vub_simplegt_InputElement1205 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_Type_in_parse_be_ac_vub_simplegt_InputElement1223 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_23_in_parse_be_ac_vub_simplegt_InputElement1250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_InputElement1276 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_parse_be_ac_vub_simplegt_InputElement1331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_InputBinding_in_parse_be_ac_vub_simplegt_InputElement1357 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_14_in_parse_be_ac_vub_simplegt_InputElement1398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_InputBinding_in_parse_be_ac_vub_simplegt_InputElement1432 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_25_in_parse_be_ac_vub_simplegt_InputElement1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_InputBinding1545 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_parse_be_ac_vub_simplegt_InputBinding1566 = new BitSet(new long[]{0x00000001F0000070L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_Expression_in_parse_be_ac_vub_simplegt_InputBinding1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_ElementExp1621 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_parse_be_ac_vub_simplegt_ElementExp1651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_ElementExp1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_parse_be_ac_vub_simplegt_StringLiteralExp1738 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_StringLiteralExp1756 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_parse_be_ac_vub_simplegt_StringLiteralExp1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_parse_be_ac_vub_simplegt_IntegerLiteralExp1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_parse_be_ac_vub_simplegt_DoubleLiteralExp1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_parse_be_ac_vub_simplegt_CharLiteralExp1886 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_CharLiteralExp1904 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_parse_be_ac_vub_simplegt_CharLiteralExp1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_parse_be_ac_vub_simplegt_BooleanLiteralExp1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_parse_be_ac_vub_simplegt_BooleanLiteralExp1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_parse_be_ac_vub_simplegt_EnumLiteralExp2014 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_EnumLiteralExp2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_parse_be_ac_vub_simplegt_NacPattern2068 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_InputElement_in_parse_be_ac_vub_simplegt_NacPattern2086 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_parse_be_ac_vub_simplegt_NacPattern2113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_InputElement_in_parse_be_ac_vub_simplegt_NacPattern2139 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_34_in_parse_be_ac_vub_simplegt_OutPattern2195 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_OutputElement_in_parse_be_ac_vub_simplegt_OutPattern2213 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_parse_be_ac_vub_simplegt_OutPattern2240 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_OutputElement_in_parse_be_ac_vub_simplegt_OutPattern2266 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_OutputElement2326 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_be_ac_vub_simplegt_OutputElement2347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_Type_in_parse_be_ac_vub_simplegt_OutputElement2365 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_23_in_parse_be_ac_vub_simplegt_OutputElement2392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_OutputElement2418 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_parse_be_ac_vub_simplegt_OutputElement2473 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_OutputBinding_in_parse_be_ac_vub_simplegt_OutputElement2499 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_14_in_parse_be_ac_vub_simplegt_OutputElement2540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_OutputBinding_in_parse_be_ac_vub_simplegt_OutputElement2574 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_25_in_parse_be_ac_vub_simplegt_OutputElement2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_SetBinding2687 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_parse_be_ac_vub_simplegt_SetBinding2708 = new BitSet(new long[]{0x00000001F0000070L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_Expression_in_parse_be_ac_vub_simplegt_SetBinding2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_AddBinding2763 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_parse_be_ac_vub_simplegt_AddBinding2784 = new BitSet(new long[]{0x00000001F0000070L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_Expression_in_parse_be_ac_vub_simplegt_AddBinding2802 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_parse_be_ac_vub_simplegt_AddBinding2829 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_AddBinding2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_be_ac_vub_simplegt_DelBinding2920 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_parse_be_ac_vub_simplegt_DelBinding2941 = new BitSet(new long[]{0x00000001F0000070L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_Expression_in_parse_be_ac_vub_simplegt_DelBinding2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_ElementExp_in_parse_be_ac_vub_simplegt_Expression2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_StringLiteralExp_in_parse_be_ac_vub_simplegt_Expression2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_IntegerLiteralExp_in_parse_be_ac_vub_simplegt_Expression3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_DoubleLiteralExp_in_parse_be_ac_vub_simplegt_Expression3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_CharLiteralExp_in_parse_be_ac_vub_simplegt_Expression3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_BooleanLiteralExp_in_parse_be_ac_vub_simplegt_Expression3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_EnumLiteralExp_in_parse_be_ac_vub_simplegt_Expression3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_SetBinding_in_parse_be_ac_vub_simplegt_OutputBinding3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_AddBinding_in_parse_be_ac_vub_simplegt_OutputBinding3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_be_ac_vub_simplegt_DelBinding_in_parse_be_ac_vub_simplegt_OutputBinding3089 = new BitSet(new long[]{0x0000000000000002L});

}