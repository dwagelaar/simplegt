/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.ui;

public class SimplegtOutlinePageLexicalSortingAction extends org.eclipselabs.simplegt.resource.simplegt.ui.AbstractSimplegtOutlinePageAction {
	
	public SimplegtOutlinePageLexicalSortingAction(org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Sort alphabetically", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/sort_lexically_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setSortLexically(on);
		getTreeViewer().refresh();
	}
	
}
