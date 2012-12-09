/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.ui;

public class SimplegtOutlinePageAutoExpandAction extends be.ac.vub.simplegt.resource.simplegt.ui.AbstractSimplegtOutlinePageAction {
	
	public SimplegtOutlinePageAutoExpandAction(be.ac.vub.simplegt.resource.simplegt.ui.SimplegtOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Auto expand", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/auto_expand_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setAutoExpand(on);
		getTreeViewer().refresh();
	}
	
}
