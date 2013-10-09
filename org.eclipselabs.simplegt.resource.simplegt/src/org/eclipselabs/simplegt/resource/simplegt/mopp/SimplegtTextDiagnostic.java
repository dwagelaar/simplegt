/*******************************************************************************
 * Copyright (c) 2011 Dennis Wagelaar, Vrije Universiteit Brussel.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dennis Wagelaar, Vrije Universiteit Brussel
 *******************************************************************************/
package org.eclipselabs.simplegt.resource.simplegt.mopp;

import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.simplegt.resource.simplegt.ISimplegtProblem;
import org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextDiagnostic;

/**
 * Default implementation of {@link ISimplegtTextDiagnostic}.
 * @author Dennis Wagelaar <dennis.wagelaar@vub.ac.be>
 */
public class SimplegtTextDiagnostic implements ISimplegtTextDiagnostic {
	
	private final ISimplegtProblem problem;
	private final String location;
	private final int line;
	private final int column;
	private final int charStart;
	private final int charEnd;

	/**
	 * Creates a new {@link SimplegtTextDiagnostic}.
	 * @param problem
	 * @param location
	 * @param line
	 * @param column
	 * @param charStart
	 * @param charEnd
	 */
	public SimplegtTextDiagnostic(ISimplegtProblem problem, String location,
			int line, int column, int charStart, int charEnd) {
		super();
		this.problem = problem;
		this.location = location;
		this.line = line;
		this.column = column;
		this.charStart = charStart;
		this.charEnd = charEnd;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextDiagnostic#getCharEnd()
	 */
	public int getCharEnd() {
		return charEnd;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextDiagnostic#getCharStart()
	 */
	public int getCharStart() {
		return charStart;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextDiagnostic#getColumn()
	 */
	public int getColumn() {
		return column;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextDiagnostic#getLine()
	 */
	public int getLine() {
		return line;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextDiagnostic#getProblem()
	 */
	public ISimplegtProblem getProblem() {
		return problem;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextDiagnostic#wasCausedBy(org.eclipse.emf.ecore.EObject)
	 */
	public boolean wasCausedBy(final EObject element) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.Resource.Diagnostic#getLocation()
	 */
	public String getLocation() {
		return location;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.Resource.Diagnostic#getMessage()
	 */
	public String getMessage() {
		return getProblem().getMessage();
	}

}
