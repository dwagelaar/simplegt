/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.ui;

public class SimplegtOutlinePageExpandAllAction extends be.ac.vub.simplegt.resource.simplegt.ui.AbstractSimplegtOutlinePageAction {
	
	public SimplegtOutlinePageExpandAllAction(be.ac.vub.simplegt.resource.simplegt.ui.SimplegtOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Expand all", org.eclipse.jface.action.IAction.AS_PUSH_BUTTON);
		initialize("icons/expand_all_icon.gif");
	}
	
	public void runInternal(boolean on) {
		if (on) {
			getTreeViewer().expandAll();
		}
	}
	
	public boolean keepState() {
		return false;
	}
	
}
