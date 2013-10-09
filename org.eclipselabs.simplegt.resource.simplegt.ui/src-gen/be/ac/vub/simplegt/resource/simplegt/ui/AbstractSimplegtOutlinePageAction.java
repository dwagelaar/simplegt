/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.ui;

public abstract class AbstractSimplegtOutlinePageAction extends org.eclipse.jface.action.Action {
	
	private String preferenceKey = this.getClass().getSimpleName() + ".isChecked";
	
	private be.ac.vub.simplegt.resource.simplegt.ui.SimplegtOutlinePageTreeViewer treeViewer;
	
	public AbstractSimplegtOutlinePageAction(be.ac.vub.simplegt.resource.simplegt.ui.SimplegtOutlinePageTreeViewer treeViewer, String text, int style) {
		super(text, style);
		this.treeViewer = treeViewer;
	}
	
	public void initialize(String imagePath) {
		org.eclipse.jface.resource.ImageDescriptor descriptor = be.ac.vub.simplegt.resource.simplegt.ui.SimplegtImageProvider.INSTANCE.getImageDescriptor(imagePath);
		setDisabledImageDescriptor(descriptor);
		setImageDescriptor(descriptor);
		setHoverImageDescriptor(descriptor);
		boolean checked = be.ac.vub.simplegt.resource.simplegt.ui.SimplegtUIPlugin.getDefault().getPreferenceStore().getBoolean(preferenceKey);
		valueChanged(checked, false);
	}
	
	@Override	
	public void run() {
		if (keepState()) {
			valueChanged(isChecked(), true);
		} else {
			runBusy(true);
		}
	}
	
	public void runBusy(final boolean on) {
		org.eclipse.swt.custom.BusyIndicator.showWhile(org.eclipse.swt.widgets.Display.getCurrent(), new Runnable() {
			public void run() {
				runInternal(on);
			}
		});
	}
	
	public abstract void runInternal(boolean on);
	
	private void valueChanged(boolean on, boolean store) {
		setChecked(on);
		runBusy(on);
		if (store) {
			be.ac.vub.simplegt.resource.simplegt.ui.SimplegtUIPlugin.getDefault().getPreferenceStore().setValue(preferenceKey, on);
		}
	}
	
	public boolean keepState() {
		return true;
	}
	
	public be.ac.vub.simplegt.resource.simplegt.ui.SimplegtOutlinePageTreeViewer getTreeViewer() {
		return treeViewer;
	}
	
	public be.ac.vub.simplegt.resource.simplegt.ui.SimplegtOutlinePageTreeViewerComparator getTreeViewerComparator() {
		return (be.ac.vub.simplegt.resource.simplegt.ui.SimplegtOutlinePageTreeViewerComparator) treeViewer.getComparator();
	}
	
}
