/*******************************************************************************
 * Copyright (c) 2011 Dennis Wagelaar, Vrije Universiteit Brussel.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dennis Wagelaar, Vrije Universiteit Brussel
 *******************************************************************************/
package be.ac.vub.simplegt.resource.simplegt.mopp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import be.ac.vub.emftvm.EmftvmFactory;
import be.ac.vub.emftvm.ExecEnv;
import be.ac.vub.emftvm.Metamodel;
import be.ac.vub.emftvm.Model;
import be.ac.vub.emftvm.util.DefaultModuleResolver;
import be.ac.vub.emftvm.util.EMFTVMLogger;
import be.ac.vub.emftvm.util.ModuleResolver;
import be.ac.vub.emftvm.util.TimingData;
import be.ac.vub.emftvm.util.VMException;
import be.ac.vub.simplegt.SimplegtPackage;
import be.ac.vub.simplegt.resource.simplegt.ISimplegtProblem;
import be.ac.vub.simplegt.resource.simplegt.ISimplegtTextDiagnostic;
import be.ac.vub.simplegt.resource.simplegt.SimplegtEProblemSeverity;
import be.ac.vub.simplegt.resource.simplegt.SimplegtEProblemType;

/**
 * Compiles SimpleGT files to EMFTVM
 * @author <a href="mailto:dennis.wagelaar@vub.ac.be">Dennis Wagelaar</a>
 */
public class SimplegtBuilder implements be.ac.vub.simplegt.resource.simplegt.ISimplegtBuilder {

	protected static final String PBMM_URI = "http://soft.vub.ac.be/simplegt/2011/Problem";

	protected final ResourceSet rs = new ResourceSetImpl();
	protected final Metamodel simplegtmm = EmftvmFactory.eINSTANCE.createMetamodel();
	protected final Metamodel pbmm = EmftvmFactory.eINSTANCE.createMetamodel();
	protected final ModuleResolver mr = new DefaultModuleResolver("platform:/plugin/" + SimplegtPlugin.PLUGIN_ID + "/transformations/", rs);

	/**
	 * Creates a new {@link SimplegtBuilder}.
	 * @throws CoreException 
	 */
	public SimplegtBuilder() throws CoreException {
		super();
		simplegtmm.setResource(SimplegtPackage.eINSTANCE.eResource());
		EPackage pack = Registry.INSTANCE.getEPackage(PBMM_URI);
		if (pack != null) {
			pbmm.setResource(pack.eResource());
		} else {
			throw new CoreException(new Status(
					Status.ERROR, SimplegtPlugin.PLUGIN_ID, 
					String.format("Cannot find Problem metamodel (%s)", PBMM_URI)));
		}
	}

	/*
	 * (non-Javadoc)
	 * @see be.ac.vub.simplegt.resource.simplegt.ISimplegtBuilder#isBuildingNeeded(org.eclipse.emf.common.util.URI)
	 */
	public boolean isBuildingNeeded(final URI uri) {
		if (uri.isPlatformResource()) {
			final IPath simplegtPath = new Path(uri.toPlatformString(true));
			final IFile simplegtFile = ResourcesPlugin.getWorkspace().getRoot().getFile(simplegtPath);
			assert simplegtFile.exists();
			final URI emftvmURI = uri.trimFileExtension().appendFileExtension("emftvm");
			final IPath emftvmPath = new Path(emftvmURI.toPlatformString(true));
			final IFile emftvmFile = ResourcesPlugin.getWorkspace().getRoot().getFile(emftvmPath);
			return !emftvmFile.exists() || emftvmFile.getLocalTimeStamp() < simplegtFile.getLocalTimeStamp();
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see be.ac.vub.simplegt.resource.simplegt.ISimplegtBuilder#build(be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtResource, org.eclipse.core.runtime.IProgressMonitor)
	 */
	public org.eclipse.core.runtime.IStatus build(final SimplegtResource resource, final IProgressMonitor monitor) {
		final List<EObject> pbs = new ArrayList<EObject>();

		final Model simplegtm = EmftvmFactory.eINSTANCE.createModel();
		simplegtm.setResource(resource);

		final Resource pr = rs.createResource(URI.createFileURI("problems.xmi"));
		final Model pbm = EmftvmFactory.eINSTANCE.createModel();
		pbm.setResource(pr);
		
		final Resource r = rs.createResource(URI.createFileURI("out.emftvm"), "be.ac.vub.emftvm");
		final Model emftvmm = EmftvmFactory.eINSTANCE.createModel();
		emftvmm.setResource(r);
		
		final URI riURI = resource.getURI().trimFileExtension().appendFileExtension("emftvm");
		final Resource ri = rs.createResource(riURI, "be.ac.vub.emftvm");
		final Model emftvmmi = EmftvmFactory.eINSTANCE.createModel();
		emftvmmi.setResource(ri);
		
		try {
			ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
			env.getMetaModels().put("SimpleGT", simplegtmm);
			env.getMetaModels().put("Problem", pbmm);
			env.getInputModels().put("IN", simplegtm);
			env.getOutputModels().put("OUT", emftvmm);
			env.getOutputModels().put("PBS", pbm);
			env.loadModule(mr, "SimpleGTtoEMFTVM");
			env.run(new TimingData());
			
			if (getProblems(pbm, pbs) == 0) {
				env = EmftvmFactory.eINSTANCE.createExecEnv();
				env.getInputModels().put("IN", emftvmm);
				env.getOutputModels().put("OUT", emftvmmi);
				env.loadModule(mr, "InlineCodeblocks");
				env.run(new TimingData());
					
				ri.save(Collections.emptyMap());
				if (ri.getURI().isPlatformResource()) {
					final IPath riPath = new Path(ri.getURI().toPlatformString(true));
					final IFile riFile = ResourcesPlugin.getWorkspace().getRoot().getFile(riPath);
					riFile.setDerived(true);
				}
			}
		} catch (VMException e) {
			EMFTVMLogger.log(Level.SEVERE, e.getLocalizedMessage(), e);
		} catch (IOException e) {
			EMFTVMLogger.log(Level.SEVERE, e.getLocalizedMessage(), e);
		} catch (CoreException e) {
			EMFTVMLogger.log(Level.SEVERE, e.getLocalizedMessage(), e);
		} finally {
			rs.getResources().remove(pr); // unload
			rs.getResources().remove(r); // unload
			rs.getResources().remove(ri); // unload
		}

		final String location = resource.getURI().toString();
		for (EObject pb : pbs) {
			ISimplegtTextDiagnostic diag = createDiagnostic(location, pb);
			SimplegtMarkerHelper.mark(resource, diag);
		}

		return Status.OK_STATUS;
	}
	
	/**
	 * Retrieves problem elements from <code>problems</code>.
	 * @param problems the problems model
	 * @param pbElements the collection of problem elements to augment
	 * @return the number of error problems
	 */
	protected int getProblems(final Model problems, final Collection<EObject> pbElements) {
		final Collection<EObject> pbs = (Collection<EObject>) problems.allInstancesOf(
				(EClass) pbmm.findType("Problem")); //$NON-NLS-1$

		int nbErrors = 0;
		if (pbs != null) {
			for (EObject pb : pbs) {
				EStructuralFeature severityFeature = pb.eClass().getEStructuralFeature("severity"); //$NON-NLS-1$
				if (severityFeature != null && "error".equals(((EEnumLiteral)pb.eGet(severityFeature)).getName())) { //$NON-NLS-1$
					nbErrors++;
				}
			}
			pbElements.addAll(pbs);
		}

		return nbErrors;
	}
	
	/**
	 * Creates a diagnostic object for <code>pb</code>.
	 * @param pb a problem element from the problem model
	 * @return the created diagnostic object
	 */
	protected ISimplegtTextDiagnostic createDiagnostic(final String location, final EObject pb) {
		EStructuralFeature severityFeature = pb.eClass().getEStructuralFeature("severity");
		EStructuralFeature descriptionFeature = pb.eClass().getEStructuralFeature("description");
		EStructuralFeature lineFeature = pb.eClass().getEStructuralFeature("line");
		EStructuralFeature columnFeature = pb.eClass().getEStructuralFeature("column");
		EStructuralFeature charStartFeature = pb.eClass().getEStructuralFeature("charStart");
		EStructuralFeature charEndFeature = pb.eClass().getEStructuralFeature("charEnd");
		
		SimplegtEProblemSeverity severity = SimplegtEProblemSeverity.ERROR;
		if (severityFeature != null && "warning".equals(((EEnumLiteral)pb.eGet(severityFeature)).getName())) {
			severity = SimplegtEProblemSeverity.WARNING;
		}
		
		String message = descriptionFeature == null ? "" : (String) pb.eGet(descriptionFeature);
		int line = lineFeature == null ? -1 : (Integer) pb.eGet(lineFeature);
		int column = columnFeature == null ? -1 : (Integer) pb.eGet(columnFeature);
		int charStart = charStartFeature == null ? -1 : (Integer) pb.eGet(charStartFeature);
		int charEnd = charEndFeature == null ? -1 : (Integer) pb.eGet(charEndFeature);

		ISimplegtProblem problem = new SimplegtProblem(message, 
				SimplegtEProblemType.BUILDER_ERROR, severity);
		return new SimplegtTextDiagnostic(
				problem, location, line, column, charStart, charEnd);
	}

}
