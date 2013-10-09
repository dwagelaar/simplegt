/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.ui;

public class SimplegtOutlinePageTypeSortingAction extends org.eclipselabs.simplegt.resource.simplegt.ui.AbstractSimplegtOutlinePageAction {
	
	public SimplegtOutlinePageTypeSortingAction(org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Group types", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/group_types_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setGroupTypes(on);
		getTreeViewer().refresh();
	}
	
}
