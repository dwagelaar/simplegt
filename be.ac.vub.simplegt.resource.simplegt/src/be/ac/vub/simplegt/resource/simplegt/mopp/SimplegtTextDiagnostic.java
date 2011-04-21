package be.ac.vub.simplegt.resource.simplegt.mopp;

import org.eclipse.emf.ecore.EObject;

import be.ac.vub.simplegt.resource.simplegt.ISimplegtProblem;
import be.ac.vub.simplegt.resource.simplegt.ISimplegtTextDiagnostic;

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
	 * @see be.ac.vub.simplegt.resource.simplegt.ISimplegtTextDiagnostic#getCharEnd()
	 */
	@Override
	public int getCharEnd() {
		return charEnd;
	}

	/*
	 * (non-Javadoc)
	 * @see be.ac.vub.simplegt.resource.simplegt.ISimplegtTextDiagnostic#getCharStart()
	 */
	@Override
	public int getCharStart() {
		return charStart;
	}

	/*
	 * (non-Javadoc)
	 * @see be.ac.vub.simplegt.resource.simplegt.ISimplegtTextDiagnostic#getColumn()
	 */
	@Override
	public int getColumn() {
		return column;
	}

	/*
	 * (non-Javadoc)
	 * @see be.ac.vub.simplegt.resource.simplegt.ISimplegtTextDiagnostic#getLine()
	 */
	@Override
	public int getLine() {
		return line;
	}

	/*
	 * (non-Javadoc)
	 * @see be.ac.vub.simplegt.resource.simplegt.ISimplegtTextDiagnostic#getProblem()
	 */
	@Override
	public ISimplegtProblem getProblem() {
		return problem;
	}

	/*
	 * (non-Javadoc)
	 * @see be.ac.vub.simplegt.resource.simplegt.ISimplegtTextDiagnostic#wasCausedBy(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public boolean wasCausedBy(final EObject element) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.Resource.Diagnostic#getLocation()
	 */
	@Override
	public String getLocation() {
		return location;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.Resource.Diagnostic#getMessage()
	 */
	@Override
	public String getMessage() {
		return getProblem().getMessage();
	}

}
