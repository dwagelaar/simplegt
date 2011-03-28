/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.ui;

public class SimplegtCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private be.ac.vub.simplegt.resource.simplegt.ui.SimplegtEditor editor;
	
	public SimplegtCompletionProcessor(be.ac.vub.simplegt.resource.simplegt.ui.SimplegtEditor editor) {
		this.editor = editor;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		
		org.eclipse.emf.ecore.resource.Resource resource = editor.getResource();
		be.ac.vub.simplegt.resource.simplegt.ISimplegtTextResource textResource = (be.ac.vub.simplegt.resource.simplegt.ISimplegtTextResource) resource;
		String content = viewer.getDocument().get();
		be.ac.vub.simplegt.resource.simplegt.ui.SimplegtCodeCompletionHelper helper = new be.ac.vub.simplegt.resource.simplegt.ui.SimplegtCodeCompletionHelper();
		be.ac.vub.simplegt.resource.simplegt.ui.SimplegtCompletionProposal[] computedProposals = helper.computeCompletionProposals(textResource, content, offset);
		
		// call completion proposal post processor to allow for customizing the proposals
		be.ac.vub.simplegt.resource.simplegt.ui.SimplegtProposalPostProcessor proposalPostProcessor = new be.ac.vub.simplegt.resource.simplegt.ui.SimplegtProposalPostProcessor();
		java.util.List<be.ac.vub.simplegt.resource.simplegt.ui.SimplegtCompletionProposal> computedProposalList = java.util.Arrays.asList(computedProposals);
		java.util.List<be.ac.vub.simplegt.resource.simplegt.ui.SimplegtCompletionProposal> extendedProposalList = proposalPostProcessor.process(computedProposalList);
		if (extendedProposalList == null) {
			extendedProposalList = java.util.Collections.emptyList();
		}
		java.util.List<be.ac.vub.simplegt.resource.simplegt.ui.SimplegtCompletionProposal> finalProposalList = new java.util.ArrayList<be.ac.vub.simplegt.resource.simplegt.ui.SimplegtCompletionProposal>();
		for (be.ac.vub.simplegt.resource.simplegt.ui.SimplegtCompletionProposal proposal : extendedProposalList) {
			if (proposal.getMatchesPrefix()) {
				finalProposalList.add(proposal);
			}
		}
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[finalProposalList.size()];
		int i = 0;
		for (be.ac.vub.simplegt.resource.simplegt.ui.SimplegtCompletionProposal proposal : finalProposalList) {
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
			be.ac.vub.simplegt.resource.simplegt.ui.ISimplegtBracketHandler bracketHandler = editor.getBracketHandler();
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
