/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.ui;

public class SimplegtCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private org.eclipselabs.simplegt.resource.simplegt.ISimplegtResourceProvider resourceProvider;
	private org.eclipselabs.simplegt.resource.simplegt.ui.ISimplegtBracketHandlerProvider bracketHandlerProvider;
	
	public SimplegtCompletionProcessor(org.eclipselabs.simplegt.resource.simplegt.ISimplegtResourceProvider resourceProvider, org.eclipselabs.simplegt.resource.simplegt.ui.ISimplegtBracketHandlerProvider bracketHandlerProvider) {
		this.resourceProvider = resourceProvider;
		this.bracketHandlerProvider = bracketHandlerProvider;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		org.eclipselabs.simplegt.resource.simplegt.ISimplegtTextResource textResource = resourceProvider.getResource();
		if (textResource == null) {
			return new org.eclipse.jface.text.contentassist.ICompletionProposal[0];
		}
		String content = viewer.getDocument().get();
		org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtCodeCompletionHelper helper = new org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtCodeCompletionHelper();
		org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtCompletionProposal[] computedProposals = helper.computeCompletionProposals(textResource, content, offset);
		
		// call completion proposal post processor to allow for customizing the proposals
		org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtProposalPostProcessor proposalPostProcessor = new org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtProposalPostProcessor();
		java.util.List<org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtCompletionProposal> computedProposalList = java.util.Arrays.asList(computedProposals);
		java.util.List<org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtCompletionProposal> extendedProposalList = proposalPostProcessor.process(computedProposalList);
		if (extendedProposalList == null) {
			extendedProposalList = java.util.Collections.emptyList();
		}
		java.util.List<org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtCompletionProposal> finalProposalList = new java.util.ArrayList<org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtCompletionProposal>();
		for (org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtCompletionProposal proposal : extendedProposalList) {
			if (proposal.getMatchesPrefix()) {
				finalProposalList.add(proposal);
			}
		}
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[finalProposalList.size()];
		int i = 0;
		for (org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtCompletionProposal proposal : finalProposalList) {
			String proposalString = proposal.getInsertString();
			String displayString = proposal.getDisplayString();
			String prefix = proposal.getPrefix();
			org.eclipse.swt.graphics.Image image = proposal.getImage();
			org.eclipse.jface.text.contentassist.IContextInformation info;
			info = new org.eclipse.jface.text.contentassist.ContextInformation(image, proposalString, proposalString);
			int begin = offset - prefix.length();
			int replacementLength = prefix.length();
			// if a closing bracket was automatically inserted right before, we enlarge the
			// replacement length in order to overwrite the bracket.
			org.eclipselabs.simplegt.resource.simplegt.ui.ISimplegtBracketHandler bracketHandler = bracketHandlerProvider.getBracketHandler();
			String closingBracket = bracketHandler.getClosingBracket();
			if (bracketHandler.addedClosingBracket() && proposalString.endsWith(closingBracket)) {
				replacementLength += closingBracket.length();
			}
			result[i++] = new org.eclipse.jface.text.contentassist.CompletionProposal(proposalString, begin, replacementLength, proposalString.length(), image, displayString, info, proposalString);
		}
		return result;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformation[] computeContextInformation(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		return null;
	}
	
	public char[] getCompletionProposalAutoActivationCharacters() {
		return null;
	}
	
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformationValidator getContextInformationValidator() {
		return null;
	}
	
	public String getErrorMessage() {
		return null;
	}
}
