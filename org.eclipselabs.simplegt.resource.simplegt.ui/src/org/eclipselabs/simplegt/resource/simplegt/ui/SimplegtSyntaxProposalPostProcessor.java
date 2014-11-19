/**
 * <copyright>
 * (C) 2013, 2014 Dennis Wagelaar.
 * </copyright>
 */
package org.eclipselabs.simplegt.resource.simplegt.ui;

import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.util.EMFTVMUtil;
import org.eclipselabs.simplegt.RuleElement;
import org.eclipselabs.simpleocl.OclModelElement;
import org.eclipselabs.simpleocl.OclType;
import org.eclipselabs.simpleocl.resource.simpleocl.ui.SimpleoclUIPlugin;
import org.eclipselabs.simpleocl.resource.simpleocl.ui.SyntaxCompletionProposal;
import org.eclipselabs.simpleocl.resource.simpleocl.ui.SyntaxProposalPostProcessor;

/**
 * Syntax completion post-processor for SimpleGT.
 * 
 * @author <a href="dwagelaar@gmail.com">Dennis Wagelaar</a>
 */
public class SimplegtSyntaxProposalPostProcessor extends
		SyntaxProposalPostProcessor {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipselabs.simpleocl.resource.simpleocl.ui.SyntaxProposalPostProcessor
	 * #process(java.util.List)
	 */
	@Override
	public List<SyntaxCompletionProposal> process(
			List<SyntaxCompletionProposal> proposals) {
		final List<SyntaxCompletionProposal> additionalProposals = super
				.process(proposals);
		for (SyntaxCompletionProposal proposal : proposals) {
			final EObject container = proposal.getContainer();
			final EObject expectedTerminalContainer = proposal
					.getExpectedTerminalContainer();
			OclType type = null;
			if (expectedTerminalContainer instanceof RuleElement) {
				type = ((RuleElement) expectedTerminalContainer).getType();
			} else if (container instanceof RuleElement) {
				type = ((RuleElement) container).getType();
			}
			if (type instanceof OclModelElement) {
				additionalProposals.addAll(getEStructuralFeatureProposals(
						proposal.getPrefix(), proposal.getRoot(),
						(OclModelElement) type));
				break;
			}
		}
		return additionalProposals;
	}

	/**
	 * Returns the {@link EStructuralFeature} syntax completion proposals for
	 * the given prefix and root.
	 * 
	 * @param prefix
	 *            the syntax prefix
	 * @param root
	 *            the root AST node
	 * @param type
	 *            the type of the element to complete
	 * @return the syntax completion proposals
	 */
	protected List<SyntaxCompletionProposal> getEStructuralFeatureProposals(
			final String prefix, final EObject root, final OclModelElement type) {
		if (!(root instanceof org.eclipselabs.simpleocl.Module)) {
			return Collections.<SyntaxCompletionProposal> emptyList();
		}
		final String strippedPrefix = stripPropertyCallPrefix(prefix);
		final SortedSet<String> features = new TreeSet<String>();
		final Map<String, URL> images = new HashMap<String, URL>();
		final Map<String, String> displayStrings = new HashMap<String, String>();
		final org.eclipselabs.simpleocl.Module module = (org.eclipselabs.simpleocl.Module) root;
		final ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		loadMetamodels(module, env);
		final Object eType;
		try {
			eType = env.findType(type.getModel().getName(), type.getName());
		} catch (ClassNotFoundException e) {
			SimpleoclUIPlugin.logError(e.getLocalizedMessage(), e);
			return Collections.<SyntaxCompletionProposal> emptyList();
		}
		if (eType instanceof EClass) {
			final EClass eClass = (EClass) eType;
			for (EStructuralFeature feature : eClass
					.getEAllStructuralFeatures()) {
				String name = feature.getName();
				if (strippedPrefix.isEmpty() || name.startsWith(strippedPrefix)) {
					StringBuilder sb = new StringBuilder(name);
					StringBuilder displayString = new StringBuilder(name);
					displayString
							.append(" : ")
							.append(toPrettyString(feature, env))
							.append(" - ")
							.append(EMFTVMUtil.toPrettyString(
									feature.eContainer(), env));
					features.add(sb.toString());
					ItemProviderAdapter itemProviderAdapter = (ItemProviderAdapter) ecoreItemProviderFactory
							.createAdapter(feature);
					images.put(sb.toString(),
							getItemProviderImageURL(itemProviderAdapter
									.getImage(feature)));
					displayStrings.put(sb.toString(), displayString.toString());
				}
			}
		}
		return buildProposals(prefix, root, features, images, displayStrings);
	}

}
