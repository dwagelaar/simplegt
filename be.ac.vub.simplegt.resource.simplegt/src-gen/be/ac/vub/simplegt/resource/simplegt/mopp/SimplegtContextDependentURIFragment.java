/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.mopp;

/**
 * Standard implementation of <code>IContextDependentURIFragment</code>.
 * 
 * @param <ContainerType> the type of the object that contains the reference which
 * shall be resolved by this fragment.
 * @param <ReferenceType> the type of the reference which shall be resolved by
 * this fragment.
 */
public abstract class SimplegtContextDependentURIFragment<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> implements be.ac.vub.simplegt.resource.simplegt.ISimplegtContextDependentURIFragment<ReferenceType> {
	
	protected String identifier;
	protected ContainerType container;
	protected org.eclipse.emf.ecore.EReference reference;
	protected int positionInReference;
	protected org.eclipse.emf.ecore.EObject proxy;
	protected be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceResolveResult<ReferenceType> result;
	
	private boolean resolving;
	
	public SimplegtContextDependentURIFragment(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		this.identifier = identifier;
		this.container = container;
		this.reference = reference;
		this.positionInReference = positionInReference;
		this.proxy = proxy;
	}
	
	public boolean isResolved() {
		return result != null;
	}
	
	public synchronized be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceResolveResult<ReferenceType> resolve() {
		if (resolving) {
			return null;
		}
		resolving = true;
		if (result == null || !result.wasResolved()) {
			result = new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtReferenceResolveResult<ReferenceType>(false);
			// set an initial default error message
			result.setErrorMessage(getStdErrorMessage());
			
			be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceResolver<ContainerType, ReferenceType> resolver = getResolver();
			// do the actual resolving
			resolver.resolve(getIdentifier(), getContainer(), getReference(), getPositionInReference(), false, result);
			
			// EMFText allows proxies to resolve to multiple objects. The first one is
			// returned, the others are added here to the reference.
			if (result.wasResolvedMultiple()) {
				handleMultipleResults();
			}
		}
		resolving = false;
		return result;
	}
	
	public abstract be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceResolver<ContainerType, ReferenceType> getResolver();
	
	private void handleMultipleResults() {
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> list = null;
		Object temp = container.eGet(reference);
		if (temp instanceof org.eclipse.emf.common.util.EList<?>) {
			list = be.ac.vub.simplegt.resource.simplegt.util.SimplegtCastUtil.cast(temp);
		}
		
		boolean first = true;
		for (be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceMapping<ReferenceType> mapping : result.getMappings()) {
			if (first) {
				first = false;
			} else if (list != null) {
				addResultToList(mapping, proxy, list);
			} else {
				be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtPlugin.logError(container.eClass().getName() + "." + reference.getName() + " has multiplicity 1 but was resolved to multiple elements", null);
			}
		}
	}
	
	private void addResultToList(be.ac.vub.simplegt.resource.simplegt.ISimplegtReferenceMapping<ReferenceType> mapping, org.eclipse.emf.ecore.EObject proxy, org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> list) {
		org.eclipse.emf.ecore.EObject target = null;
		int proxyPosition = list.indexOf(proxy);
		
		if (mapping instanceof be.ac.vub.simplegt.resource.simplegt.ISimplegtElementMapping<?>) {
			target = ((be.ac.vub.simplegt.resource.simplegt.ISimplegtElementMapping<ReferenceType>) mapping).getTargetElement();
		} else if (mapping instanceof be.ac.vub.simplegt.resource.simplegt.ISimplegtURIMapping<?>) {
			target = org.eclipse.emf.ecore.util.EcoreUtil.copy(proxy);
			org.eclipse.emf.common.util.URI uri = ((be.ac.vub.simplegt.resource.simplegt.ISimplegtURIMapping<ReferenceType>) mapping).getTargetIdentifier();
			((org.eclipse.emf.ecore.InternalEObject) target).eSetProxyURI(uri);
		} else {
			assert false;
		}
		try {
			// if target is an another proxy and list is "unique" add() will try to resolve
			// the new proxy to check for uniqueness. There seems to be no way to avoid that.
			// Until now this does not cause any problems.
			if (proxyPosition + 1 == list.size()) {
				list.add(target);
			} else {
				list.add(proxyPosition + 1, target);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	private String getStdErrorMessage() {
		String typeName = this.getReference().getEType().getName();
		String msg = typeName + " '" + identifier + "' not declared";
		return msg;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public ContainerType getContainer() {
		return container;
	}
	
	public org.eclipse.emf.ecore.EReference getReference() {
		return reference;
	}
	
	public int getPositionInReference() {
		return positionInReference;
	}
	
	public org.eclipse.emf.ecore.EObject getProxy() {
		return proxy;
	}
	
}
