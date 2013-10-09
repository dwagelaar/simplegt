/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.eclipselabs.simplegt.resource.simplegt.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class SimplegtProposalPostProcessor {
	
	public java.util.List<org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtCompletionProposal> process(java.util.List<org.eclipselabs.simplegt.resource.simplegt.ui.SimplegtCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
