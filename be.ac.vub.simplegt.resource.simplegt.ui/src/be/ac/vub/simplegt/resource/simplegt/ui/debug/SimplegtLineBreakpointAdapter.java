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
package be.ac.vub.simplegt.resource.simplegt.ui.debug;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.ILineBreakpoint;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.m2m.atl.debug.core.AtlDebugModelConstants;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.texteditor.ITextEditor;

import be.ac.vub.simplegt.resource.simplegt.debug.SimplegtLineBreakpoint;

/**
 * SimpleGT breakpoint adapter.
 * @author <a href="mailto:dennis.wagelaar@vub.ac.be">Dennis Wagelaar</a>
 */
public class SimplegtLineBreakpointAdapter implements org.eclipse.debug.ui.actions.IToggleBreakpointsTarget {
	
	/**
	 * {@inheritDoc}
	 */
	public void toggleLineBreakpoints(final IWorkbenchPart part, final ISelection selection) throws CoreException {
		ITextEditor textEditor = getEditor(part);
		if (textEditor != null) {
			IResource resource = (IResource)textEditor.getEditorInput().getAdapter(IResource.class);
			ITextSelection textSelection = (ITextSelection)selection;
			int lineNumber = textSelection.getStartLine();
			IBreakpoint[] breakpoints = DebugPlugin.getDefault().getBreakpointManager().getBreakpoints(AtlDebugModelConstants.ATL_DEBUG_MODEL_ID);
			for (int i = 0; i < breakpoints.length; i++) {
				IBreakpoint breakpoint = breakpoints[i];
				if (resource.equals(breakpoint.getMarker().getResource())) {
					if (((ILineBreakpoint)breakpoint).getLineNumber() == (lineNumber + 1)) {
						// remove
						breakpoint.delete();
						return;
					}
				}
			}
			// create line breakpoint (document line numbers start at 0)
			SimplegtLineBreakpoint lineBreakpoint = new SimplegtLineBreakpoint(resource, lineNumber + 1);
			DebugPlugin.getDefault().getBreakpointManager().addBreakpoint(lineBreakpoint);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean canToggleLineBreakpoints(org.eclipse.ui.IWorkbenchPart part, org.eclipse.jface.viewers.ISelection selection) {
		org.eclipse.ui.texteditor.ITextEditor editor = getEditor(part);
		return editor != null;
	}
	
	/**
	 * Returns the editor being used, associated with the given part, or
	 * <code>null</code> if none.
	 * 
	 * @param part workbench part
	 */
	private org.eclipse.ui.texteditor.ITextEditor getEditor(org.eclipse.ui.IWorkbenchPart part) {
		if (part instanceof org.eclipse.ui.texteditor.ITextEditor) {
			org.eclipse.ui.texteditor.ITextEditor editorPart = (org.eclipse.ui.texteditor.ITextEditor) part;
			org.eclipse.core.resources.IResource resource = (org.eclipse.core.resources.IResource) editorPart.getEditorInput().getAdapter(org.eclipse.core.resources.IResource.class);
			if (resource != null) {
				String extension = resource.getFileExtension();
				if (extension != null && extension.equals(new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtMetaInformation().getSyntaxName())) {
					return editorPart;
				}
			}
		}
		return null;
	}
	
	public void toggleMethodBreakpoints(org.eclipse.ui.IWorkbenchPart part, org.eclipse.jface.viewers.ISelection selection) throws org.eclipse.core.runtime.CoreException {
	}
	
	public boolean canToggleMethodBreakpoints(org.eclipse.ui.IWorkbenchPart part, org.eclipse.jface.viewers.ISelection selection) {
		return false;
	}
	
	public void toggleWatchpoints(org.eclipse.ui.IWorkbenchPart part, org.eclipse.jface.viewers.ISelection selection) throws org.eclipse.core.runtime.CoreException {
	}
	
	public boolean canToggleWatchpoints(org.eclipse.ui.IWorkbenchPart part, org.eclipse.jface.viewers.ISelection selection) {
		return false;
	}
	
}
