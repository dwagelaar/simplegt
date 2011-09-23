grammar Simplegt;

options {
	superClass = SimplegtANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package be.ac.vub.simplegt.resource.simplegt.mopp;
}

@lexer::members {
	public java.util.List<org.antlr.runtime3_3_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_3_0.RecognitionException>();
	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
	
	public void reportError(org.antlr.runtime3_3_0.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionsPosition.add(((org.antlr.runtime3_3_0.ANTLRStringStream) input).index());
	}
}
@header{
	package be.ac.vub.simplegt.resource.simplegt.mopp;
}

@members{
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
		int followSetID = 102;
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
	
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_0, 0);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_be_ac_vub_simplegt_Module{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_be_ac_vub_simplegt_Module returns [be.ac.vub.simplegt.Module element = null]
@init{
}
:
	a0 = 'module' {
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
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_1, 1);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_2, 2);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_3, 2);
	}
	
	(
		(
			a2 = 'debug' {
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
		)?	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_3, 3);
	}
	
	a5 = ';' {
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
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_4, 4);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_5, 4);
	}
	
	(
		(
			a6 = 'import' {
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
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_6, 5);
			}
			
			(
				a7 = TEXT				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_7, 6);
			}
			
			a8 = ';' {
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
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_4, 7);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_5, 7);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_4, 8);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_5, 8);
	}
	
	a9 = 'transform' {
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
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_8, 9, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_0);
	}
	
	(
		a10_0 = parse_be_ac_vub_simplegt_InstanceModel		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_9, 10);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_10, 10);
	}
	
	(
		(
			a11 = ',' {
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
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_8, 11, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_0);
			}
			
			(
				a12_0 = parse_be_ac_vub_simplegt_InstanceModel				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_9, 12);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_10, 12);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_9, 13);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_10, 13);
	}
	
	a13 = ';' {
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
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_11, 14, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_1);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_12, 14, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_1);
	}
	
	(
		(
			a14_0 = parse_be_ac_vub_simplegt_Rule			{
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
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_11, 15, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_1);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_12, 15, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_1);
	}
	
;

parse_be_ac_vub_simplegt_InstanceModel returns [be.ac.vub.simplegt.InstanceModel element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_13, 16);
	}
	
	a1 = ':' {
		if (element == null) {
			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInstanceModel();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_1_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_14, 17, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_2);
	}
	
	(
		a2_0 = parse_be_ac_vub_simplegt_Metamodel		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_9, 18);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_10, 18);
	}
	
;

parse_be_ac_vub_simplegt_Metamodel returns [be.ac.vub.simplegt.Metamodel element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_9, 19);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_10, 19);
	}
	
;

parse_be_ac_vub_simplegt_Rule returns [be.ac.vub.simplegt.Rule element = null]
@init{
}
:
	(
		(
			a0 = 'abstract' {
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
		)?	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_12, 20);
	}
	
	a3 = 'rule' {
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
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_15, 21);
	}
	
	(
		a4 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_16, 22);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_17, 22);
	}
	
	(
		(
			a5 = 'extends' {
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
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_18, 23);
			}
			
			(
				a6 = TEXT				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_19, 24);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_17, 24);
			}
			
			(
				(
					a7 = ',' {
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
					{
						// expected elements (follow set)
						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_20, 25);
					}
					
					(
						a8 = TEXT						
						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_19, 26);
						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_17, 26);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_19, 27);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_17, 27);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_17, 28);
	}
	
	a9 = '{' {
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
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 29, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_3);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 29, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 29, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 29);
	}
	
	(
		(
			a10_0 = parse_be_ac_vub_simplegt_InPattern			{
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
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 30, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 30, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 30);
	}
	
	(
		(
			a11_0 = parse_be_ac_vub_simplegt_NacPattern			{
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
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 31, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 31, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 31);
	}
	
	(
		(
			a12_0 = parse_be_ac_vub_simplegt_OutPattern			{
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
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 32);
	}
	
	a13 = '}' {
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
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_11, 33, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_1);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_12, 33, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_1);
	}
	
;

parse_be_ac_vub_simplegt_InPattern returns [be.ac.vub.simplegt.InPattern element = null]
@init{
}
:
	a0 = 'from' {
		if (element == null) {
			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInPattern();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_4_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_25, 34, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_6);
	}
	
	(
		a1_0 = parse_be_ac_vub_simplegt_InputElement		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_26, 35);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 35, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 35, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 35);
	}
	
	(
		(
			a2 = ',' {
				if (element == null) {
					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInPattern();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_4_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_25, 36, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_6);
			}
			
			(
				a3_0 = parse_be_ac_vub_simplegt_InputElement				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_26, 37);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 37, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 37, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 37);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_26, 38);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 38, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 38, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 38);
	}
	
;

parse_be_ac_vub_simplegt_Type returns [be.ac.vub.simplegt.Type element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_28, 39);
	}
	
	a1 = '!' {
		if (element == null) {
			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_5_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_29, 40);
	}
	
	(
		a2 = TEXT		
		{
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
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_5_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_30, 41);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_31, 41);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_26, 41);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 41, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 41, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 41);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_32, 41);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_33, 41);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_34, 41);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_35, 41);
	}
	
;

parse_be_ac_vub_simplegt_InputElement returns [be.ac.vub.simplegt.InputElement element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_36, 42);
	}
	
	a1 = ':' {
		if (element == null) {
			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputElement();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_6_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_27, 43, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_7);
	}
	
	(
		a2_0 = parse_be_ac_vub_simplegt_Type		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_30, 44);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_31, 44);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_26, 44);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 44, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 44, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 44);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_32, 44);
	}
	
	(
		(
			a3 = 'in' {
				if (element == null) {
					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputElement();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_6_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_37, 45);
			}
			
			(
				a4 = TEXT				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_31, 46);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_26, 46);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 46, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 46, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 46);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_32, 46);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_31, 47);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_26, 47);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 47, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 47, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 47);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_32, 47);
	}
	
	(
		(
			a5 = '(' {
				if (element == null) {
					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputElement();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_6_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_38, 48, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_8);
			}
			
			(
				a6_0 = parse_be_ac_vub_simplegt_InputBinding				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 49);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 49);
			}
			
			(
				(
					a7 = ',' {
						if (element == null) {
							element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputElement();
							incompleteObjects.push(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_6_0_0_4_0_0_3_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a7, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_38, 50, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_8);
					}
					
					(
						a8_0 = parse_be_ac_vub_simplegt_InputBinding						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 51);
						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 51);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 52);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 52);
			}
			
			a9 = ')' {
				if (element == null) {
					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputElement();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_6_0_0_4_0_0_4, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_26, 53);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 53, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 53, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 53);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_32, 53);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_26, 54);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 54, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 54, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 54);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_32, 54);
	}
	
;

parse_be_ac_vub_simplegt_InputBinding returns [be.ac.vub.simplegt.InputBinding element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_41, 55);
	}
	
	(
		(
			a1 = '=~|' {
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
			|			a2 = '=~' {
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
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_42, 56, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_43, 56, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_44, 56, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_45, 56, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_46, 56, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_47, 56, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_48, 56, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
	}
	
	(
		a4_0 = parse_be_ac_vub_simplegt_Expression		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 57);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 57);
	}
	
;

parse_be_ac_vub_simplegt_ElementExp returns [be.ac.vub.simplegt.ElementExp element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_49, 58);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 58);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 58);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 58);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 58);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 58);
	}
	
	(
		(
			a1 = '.' {
				if (element == null) {
					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createElementExp();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_8_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_53, 59);
			}
			
			(
				a2 = TEXT				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 60);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 60);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 60);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 60);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 60);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 61);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 61);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 61);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 61);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 61);
	}
	
;

parse_be_ac_vub_simplegt_StringLiteralExp returns [be.ac.vub.simplegt.StringLiteralExp element = null]
@init{
}
:
	a0 = '\"' {
		if (element == null) {
			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createStringLiteralExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_9_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_54, 62);
	}
	
	(
		a1 = TEXT		
		{
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
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.STRING_LITERAL_EXP__LITERAL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_9_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_55, 63);
	}
	
	a2 = '\"' {
		if (element == null) {
			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createStringLiteralExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_9_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 64);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 64);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 64);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 64);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 64);
	}
	
;

parse_be_ac_vub_simplegt_IntegerLiteralExp returns [be.ac.vub.simplegt.IntegerLiteralExp element = null]
@init{
}
:
	(
		a0 = INTEGER		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 65);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 65);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 65);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 65);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 65);
	}
	
;

parse_be_ac_vub_simplegt_DoubleLiteralExp returns [be.ac.vub.simplegt.DoubleLiteralExp element = null]
@init{
}
:
	(
		a0 = FLOAT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 66);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 66);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 66);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 66);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 66);
	}
	
;

parse_be_ac_vub_simplegt_CharLiteralExp returns [be.ac.vub.simplegt.CharLiteralExp element = null]
@init{
}
:
	a0 = '\'' {
		if (element == null) {
			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createCharLiteralExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_12_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_56, 67);
	}
	
	(
		a1 = TEXT		
		{
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
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
				}
				java.lang.Character resolved = (java.lang.Character) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.CHAR_LITERAL_EXP__LITERAL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_12_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_57, 68);
	}
	
	a2 = '\'' {
		if (element == null) {
			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createCharLiteralExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_12_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 69);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 69);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 69);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 69);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 69);
	}
	
;

parse_be_ac_vub_simplegt_BooleanLiteralExp returns [be.ac.vub.simplegt.BooleanLiteralExp element = null]
@init{
}
:
	(
		(
			a0 = 'true' {
				if (element == null) {
					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createBooleanLiteralExp();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_13_0_0_0, true, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
				// set value of boolean attribute
				Object value = true;
				element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.BOOLEAN_LITERAL_EXP__LITERAL), value);
				completedElement(value, false);
			}
			|			a1 = 'false' {
				if (element == null) {
					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createBooleanLiteralExp();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_13_0_0_0, false, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
				// set value of boolean attribute
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.BOOLEAN_LITERAL_EXP__LITERAL), value);
				completedElement(value, false);
			}
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 70);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 70);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 70);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 70);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 70);
	}
	
;

parse_be_ac_vub_simplegt_EnumLiteralExp returns [be.ac.vub.simplegt.EnumLiteralExp element = null]
@init{
}
:
	a0 = '#' {
		if (element == null) {
			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createEnumLiteralExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_14_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_58, 71);
	}
	
	(
		a1 = TEXT		
		{
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
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_14_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 72);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 72);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 72);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 72);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 72);
	}
	
;

parse_be_ac_vub_simplegt_NacPattern returns [be.ac.vub.simplegt.NacPattern element = null]
@init{
}
:
	a0 = 'not' {
		if (element == null) {
			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createNacPattern();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_15_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_25, 73, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_6);
	}
	
	(
		a1_0 = parse_be_ac_vub_simplegt_InputElement		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_32, 74);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 74, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 74, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 74);
	}
	
	(
		(
			a2 = ',' {
				if (element == null) {
					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createNacPattern();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_15_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_25, 75, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_6);
			}
			
			(
				a3_0 = parse_be_ac_vub_simplegt_InputElement				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_32, 76);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 76, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 76, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 76);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_32, 77);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 77, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 77, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 77);
	}
	
;

parse_be_ac_vub_simplegt_OutPattern returns [be.ac.vub.simplegt.OutPattern element = null]
@init{
}
:
	a0 = 'to' {
		if (element == null) {
			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutPattern();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_16_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_59, 78, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_10);
	}
	
	(
		a1_0 = parse_be_ac_vub_simplegt_OutputElement		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_35, 79);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 79);
	}
	
	(
		(
			a2 = ',' {
				if (element == null) {
					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutPattern();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_16_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_59, 80, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_10);
			}
			
			(
				a3_0 = parse_be_ac_vub_simplegt_OutputElement				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_35, 81);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 81);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_35, 82);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 82);
	}
	
;

parse_be_ac_vub_simplegt_OutputElement returns [be.ac.vub.simplegt.OutputElement element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
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
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_17_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_60, 83);
	}
	
	a1 = ':' {
		if (element == null) {
			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputElement();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_17_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_27, 84, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_7);
	}
	
	(
		a2_0 = parse_be_ac_vub_simplegt_Type		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_33, 85);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_34, 85);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_35, 85);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 85);
	}
	
	(
		(
			a3 = 'in' {
				if (element == null) {
					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputElement();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_17_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_61, 86);
			}
			
			(
				a4 = TEXT				
				{
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
						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_17_0_0_3_0_0_1, proxy, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, element);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_34, 87);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_35, 87);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 87);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_34, 88);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_35, 88);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 88);
	}
	
	(
		(
			a5 = '(' {
				if (element == null) {
					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputElement();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_17_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_62, 89, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_11);
			}
			
			(
				a6_0 = parse_be_ac_vub_simplegt_OutputBinding				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 90);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 90);
			}
			
			(
				(
					a7 = ',' {
						if (element == null) {
							element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputElement();
							incompleteObjects.push(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_17_0_0_4_0_0_3_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a7, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_62, 91, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_11);
					}
					
					(
						a8_0 = parse_be_ac_vub_simplegt_OutputBinding						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 92);
						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 92);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 93);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 93);
			}
			
			a9 = ')' {
				if (element == null) {
					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputElement();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_17_0_0_4_0_0_4, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_35, 94);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 94);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_35, 95);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 95);
	}
	
;

parse_be_ac_vub_simplegt_OutputBinding returns [be.ac.vub.simplegt.OutputBinding element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
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
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_18_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_63, 96);
	}
	
	a1 = '=~' {
		if (element == null) {
			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputBinding();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_18_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_42, 97, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_43, 97, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_44, 97, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_45, 97, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_46, 97, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_47, 97, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_48, 97, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
	}
	
	(
		a2_0 = parse_be_ac_vub_simplegt_Expression		{
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
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_18_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_50, 98);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 98);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 98);
	}
	
	(
		(
			a3 = 'before' {
				if (element == null) {
					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputBinding();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_18_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_64, 99);
			}
			
			(
				a4 = TEXT				
				{
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
						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_18_0_0_3_0_0_1, proxy, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, element);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 100);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 100);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_51, 101);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_52, 101);
	}
	
;

parse_be_ac_vub_simplegt_Expression returns [be.ac.vub.simplegt.Expression element = null]
:
	c0 = parse_be_ac_vub_simplegt_ElementExp{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_be_ac_vub_simplegt_StringLiteralExp{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_be_ac_vub_simplegt_IntegerLiteralExp{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_be_ac_vub_simplegt_DoubleLiteralExp{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_be_ac_vub_simplegt_CharLiteralExp{ element = c4; /* this is a subclass or primitive expression choice */ }
	|	c5 = parse_be_ac_vub_simplegt_BooleanLiteralExp{ element = c5; /* this is a subclass or primitive expression choice */ }
	|	c6 = parse_be_ac_vub_simplegt_EnumLiteralExp{ element = c6; /* this is a subclass or primitive expression choice */ }
	
;

COMMENT:
	('--'(~('\n'|'\r'|'\uffff'))*)
	{ _channel = 99; }
;
FLOAT:
	('-'?(('0'..'9'))+'.'(('0'..'9'))+)
;
INTEGER:
	('-'?(('0'..'9'))+)
;
TEXT:
	(('A'..'Z'|'a'..'z')(('A'..'Z'|'a'..'z')|('0'..'9')|'-'|'_')*)
;
LINEBREAK:
	(('\r\n'|'\'r'|'\n'))
	{ _channel = 99; }
;
WHITESPACE:
	((' '|'\t'|'\f'))
	{ _channel = 99; }
;

