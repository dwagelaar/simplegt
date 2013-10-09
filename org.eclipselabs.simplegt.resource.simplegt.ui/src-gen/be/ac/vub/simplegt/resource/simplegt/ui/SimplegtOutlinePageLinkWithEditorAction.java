/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.ui;

public class SimplegtOutlinePageLinkWithEditorAction extends be.ac.vub.simplegt.resource.simplegt.ui.AbstractSimplegtOutlinePageAction {
	
	public SimplegtOutlinePageLinkWithEditorAction(be.ac.vub.simplegt.resource.simplegt.ui.SimplegtOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Link with Editor", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/link_with_editor_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setLinkWithEditor(on);
	}
	
}
