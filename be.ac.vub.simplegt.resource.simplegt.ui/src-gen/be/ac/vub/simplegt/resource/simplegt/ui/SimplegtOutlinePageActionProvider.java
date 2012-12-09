/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.ui;

public class SimplegtOutlinePageActionProvider {
	
	public java.util.List<org.eclipse.jface.action.IAction> getActions(be.ac.vub.simplegt.resource.simplegt.ui.SimplegtOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		java.util.List<org.eclipse.jface.action.IAction> defaultActions = new java.util.ArrayList<org.eclipse.jface.action.IAction>();
		defaultActions.add(new be.ac.vub.simplegt.resource.simplegt.ui.SimplegtOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new be.ac.vub.simplegt.resource.simplegt.ui.SimplegtOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new be.ac.vub.simplegt.resource.simplegt.ui.SimplegtOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new be.ac.vub.simplegt.resource.simplegt.ui.SimplegtOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new be.ac.vub.simplegt.resource.simplegt.ui.SimplegtOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new be.ac.vub.simplegt.resource.simplegt.ui.SimplegtOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
