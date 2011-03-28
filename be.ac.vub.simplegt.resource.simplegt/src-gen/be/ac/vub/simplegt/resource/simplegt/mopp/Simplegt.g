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
	public java.util.List<org.antlr.runtime3_2_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_2_0.RecognitionException>();
	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
	
	public void reportError(org.antlr.runtime3_2_0.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionsPosition.add(((org.antlr.runtime3_2_0.ANTLRStringStream) input).index());
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
		int followSetID = 78;
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
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_2, 2);
	}
	
	a2 = ';' {
		if (element == null) {
			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_3, 3);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_4, 3);
	}
	
	(
		(
			a3 = 'import' {
				if (element == null) {
					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_5, 4);
			}
			
			(
				a4 = TEXT				
				{
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
						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_3_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_6, 5);
			}
			
			a5 = ';' {
				if (element == null) {
					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_3_0_0_2, null, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_3, 6);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_4, 6);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_3, 7);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_4, 7);
	}
	
	a6 = 'transform' {
		if (element == null) {
			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_7, 8, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_0);
	}
	
	(
		a7_0 = parse_be_ac_vub_simplegt_InstanceModel		{
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
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_5, a7_0, true);
				copyLocalizationInfos(a7_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_8, 9);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_9, 9);
	}
	
	(
		(
			a8 = ',' {
				if (element == null) {
					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_6_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_7, 10, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_0);
			}
			
			(
				a9_0 = parse_be_ac_vub_simplegt_InstanceModel				{
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
						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_6_0_0_1, a9_0, true);
						copyLocalizationInfos(a9_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_8, 11);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_9, 11);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_8, 12);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_9, 12);
	}
	
	a10 = ';' {
		if (element == null) {
			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createModule();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_10, 13, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_1);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_11, 13, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_1);
	}
	
	(
		(
			a11_0 = parse_be_ac_vub_simplegt_Rule			{
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
					retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_0_0_0_8, a11_0, true);
					copyLocalizationInfos(a11_0, element);
				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_10, 14, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_1);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_11, 14, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_1);
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_12, 15);
	}
	
	a1 = ':' {
		if (element == null) {
			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInstanceModel();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_1_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_13, 16, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_2);
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
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_8, 17);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_9, 17);
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_8, 18);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_9, 18);
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
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_3_0_0_0, true, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
				// set value of boolean attribute
				Object value = true;
				element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__ABSTRACT), value);
				completedElement(value, false);
			}
		)?	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_11, 19);
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
		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_3_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_14, 20);
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
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.RULE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_3_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_15, 21);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_16, 21);
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
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_3_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_17, 22);
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
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a6).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, be.ac.vub.simplegt.SimplegtPackage.RULE__EXTENDS, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_3_0_0_3_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a6, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_18, 23);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_16, 23);
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
						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_3_0_0_3_0_0_2_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_19, 24);
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
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a8).getStopIndex());
								}
								java.lang.String resolved = (java.lang.String)resolvedObject;
								if (resolved != null) {
									Object value = resolved;
									addObjectToList(element, be.ac.vub.simplegt.SimplegtPackage.RULE__EXTENDS, value);
									completedElement(value, false);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_3_0_0_3_0_0_2_0_0_1, resolved, true);
								copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a8, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_18, 25);
						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_16, 25);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_18, 26);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_16, 26);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_16, 27);
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
		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_3_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_20, 28, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_3);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 28, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 28, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 28);
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
					retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_3_0_0_5, a10_0, true);
					copyLocalizationInfos(a10_0, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 29, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 29, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 29);
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
					retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_3_0_0_6, a11_0, true);
					copyLocalizationInfos(a11_0, element);
				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 30, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 30, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 30);
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
					retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_3_0_0_7, a12_0, true);
					copyLocalizationInfos(a12_0, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 31);
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
		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_3_0_0_8, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a13, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_10, 32, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_1);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_11, 32, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_1);
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
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 33, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_6);
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
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_25, 34);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 34, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 34, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 34);
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
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 35, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_6);
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
						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_4_0_0_2_0_0_1, a3_0, true);
						copyLocalizationInfos(a3_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_25, 36);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 36, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 36, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 36);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_25, 37);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 37, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 37, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 37);
	}
	
;

parse_be_ac_vub_simplegt_Type returns [be.ac.vub.simplegt.Type element = null]
@init{
}
:
	(
		(
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
						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_5_0_0_0_0_0_0, proxy, true);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_27, 38);
			}
			
			a1 = '!' {
				if (element == null) {
					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createType();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_5_0_0_0_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_28, 39);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_28, 40);
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
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.TYPE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_5_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_29, 41);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_25, 41);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 41, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 41, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 41);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_30, 41);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_31, 41);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_32, 41);
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_33, 42);
	}
	
	a1 = ':' {
		if (element == null) {
			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputElement();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_6_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_26, 43, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_7);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_28, 43, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_7);
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
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_29, 44);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_25, 44);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 44, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 44, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 44);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_30, 44);
	}
	
	(
		(
			a3 = '=' {
				if (element == null) {
					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputElement();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_6_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_34, 45, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_8);
			}
			
			(
				a4_0 = parse_be_ac_vub_simplegt_InputBinding				{
					if (terminateParsing) {
						throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
					}
					if (element == null) {
						element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputElement();
						incompleteObjects.push(element);
					}
					if (a4_0 != null) {
						if (a4_0 != null) {
							Object value = a4_0;
							element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_ELEMENT__BINDING), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_6_0_0_3_0_0_1, a4_0, true);
						copyLocalizationInfos(a4_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_25, 46);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 46, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 46, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 46);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_30, 46);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_25, 47);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 47, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 47, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 47);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_30, 47);
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
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_BINDING__ELEMENT), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				be.ac.vub.simplegt.InputElement proxy = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputElement();
				collectHiddenTokens(element);
				registerContextDependentProxy(new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtContextDependentURIFragmentFactory<be.ac.vub.simplegt.Binding, be.ac.vub.simplegt.InputElement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getBindingElementReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_BINDING__ELEMENT), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_BINDING__ELEMENT), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_7_0_0_0, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_35, 48);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_25, 48);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 48, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 48, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 48);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_30, 48);
	}
	
	(
		(
			a1 = '.' {
				if (element == null) {
					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputBinding();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_7_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_36, 49);
			}
			
			(
				a2 = TEXT				
				{
					if (terminateParsing) {
						throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
					}
					if (element == null) {
						element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputBinding();
						incompleteObjects.push(element);
					}
					if (a2 != null) {
						be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_BINDING__FEATURE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.INPUT_BINDING__FEATURE), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_7_0_0_1_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_25, 50);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 50, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 50, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 50);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_30, 50);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_25, 51);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 51, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 51, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 51);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_30, 51);
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
		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_8_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 52, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
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
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_8_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_30, 53);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 53, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 53, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 53);
	}
	
	(
		(
			a2 = ',' {
				if (element == null) {
					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createNacPattern();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_8_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_24, 54, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_9);
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
						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_8_0_0_2_0_0_1, a3_0, true);
						copyLocalizationInfos(a3_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_30, 55);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 55, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 55, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 55);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_30, 56);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_21, 56, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_4);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_22, 56, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_5);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 56);
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
		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_9_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_37, 57, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_10);
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
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_9_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_32, 58);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 58);
	}
	
	(
		(
			a2 = ',' {
				if (element == null) {
					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutPattern();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_9_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_37, 59, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_10);
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
						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_9_0_0_2_0_0_1, a3_0, true);
						copyLocalizationInfos(a3_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_32, 60);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 60);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_32, 61);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 61);
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
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_ELEMENT__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_10_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_38, 62);
	}
	
	a1 = ':' {
		if (element == null) {
			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputElement();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_10_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_26, 63, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_7);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_28, 63, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_7);
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
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_10_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_31, 64);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_32, 64);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 64);
	}
	
	(
		(
			a3 = '(' {
				if (element == null) {
					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputElement();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_10_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 65, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_11);
			}
			
			(
				a4_0 = parse_be_ac_vub_simplegt_OutputBinding				{
					if (terminateParsing) {
						throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
					}
					if (element == null) {
						element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputElement();
						incompleteObjects.push(element);
					}
					if (a4_0 != null) {
						if (a4_0 != null) {
							Object value = a4_0;
							addObjectToList(element, be.ac.vub.simplegt.SimplegtPackage.OUTPUT_ELEMENT__BINDINGS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_10_0_0_3_0_0_1, a4_0, true);
						copyLocalizationInfos(a4_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 66);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_41, 66);
			}
			
			(
				(
					a5 = ',' {
						if (element == null) {
							element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputElement();
							incompleteObjects.push(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_10_0_0_3_0_0_2_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_39, 67, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.FEATURE_11);
					}
					
					(
						a6_0 = parse_be_ac_vub_simplegt_OutputBinding						{
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
								retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_10_0_0_3_0_0_2_0_0_1, a6_0, true);
								copyLocalizationInfos(a6_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 68);
						addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_41, 68);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 69);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_41, 69);
			}
			
			a7 = ')' {
				if (element == null) {
					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputElement();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_10_0_0_3_0_0_3, null, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_32, 70);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 70);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_32, 71);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_23, 71);
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
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_BINDING__TARGET_FEATURE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_BINDING__TARGET_FEATURE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_11_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_42, 72);
	}
	
	a1 = ':=' {
		if (element == null) {
			element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputBinding();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_11_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_43, 73);
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTerminateParsingException();
			}
			if (element == null) {
				element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputBinding();
				incompleteObjects.push(element);
			}
			if (a2 != null) {
				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_BINDING__ELEMENT), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				be.ac.vub.simplegt.InputElement proxy = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createInputElement();
				collectHiddenTokens(element);
				registerContextDependentProxy(new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtContextDependentURIFragmentFactory<be.ac.vub.simplegt.Binding, be.ac.vub.simplegt.InputElement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getBindingElementReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_BINDING__ELEMENT), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_BINDING__ELEMENT), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_11_0_0_2, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_44, 74);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 74);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_41, 74);
	}
	
	(
		(
			a3 = '.' {
				if (element == null) {
					element = be.ac.vub.simplegt.SimplegtFactory.eINSTANCE.createOutputBinding();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_11_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_45, 75);
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
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_BINDING__FEATURE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(be.ac.vub.simplegt.SimplegtPackage.OUTPUT_BINDING__FEATURE), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtGrammarInformationProvider.SIMPLEGT_11_0_0_3_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 76);
				addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_41, 76);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_40, 77);
		addExpectedElement(be.ac.vub.simplegt.resource.simplegt.grammar.SimplegtFollowSetProvider.TERMINAL_41, 77);
	}
	
;

TEXT:
	(('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+)
;
WHITESPACE:
	((' ' | '\t' | '\f'))
	{ _channel = 99; }
;
LINEBREAK:
	(('\r\n' | '\r' | '\n'))
	{ _channel = 99; }
;

