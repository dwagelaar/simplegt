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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import be.ac.vub.simplegt.resource.simplegt.ISimplegtBuilder;
import be.ac.vub.simplegt.resource.simplegt.SimplegtEProblemType;

/**
 * Adapter class for {@link ISimplegtBuilder}.
 * @author Dennis Wagelaar <dennis.wagelaar@vub.ac.be>
 */
public class SimplegtBuilderAdapter extends IncrementalProjectBuilder {
	
	/**
	 * the ID of the default, generated builder
	 */
	public final static String BUILDER_ID = "be.ac.vub.simplegt.resource.simplegt.builder";

	/**
	 * the builder object
	 */
	protected be.ac.vub.simplegt.resource.simplegt.ISimplegtBuilder builder;

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.resources.IncrementalProjectBuilder#build(int, java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@SuppressWarnings({ "rawtypes" })
	@Override
	protected IProject[] build(int kind, java.util.Map args, final org.eclipse.core.runtime.IProgressMonitor monitor) throws org.eclipse.core.runtime.CoreException {
		if (builder==null) builder = new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtBuilder();
		return build(kind, args, monitor, builder, getProject());
	}

	/**
	 * Builds <code>project</code> using <code>builder</code>.
	 * @param kind
	 * @param args
	 * @param monitor
	 * @param builder
	 * @param project
	 * @return <code>null</code>
	 * @throws CoreException
	 */
	public IProject[] build(int kind, java.util.Map<?,?> args, final IProgressMonitor monitor, 
			final ISimplegtBuilder builder, final IProject project) throws CoreException {
		if (kind == CLEAN_BUILD || kind == FULL_BUILD) {
			project.accept(new IResourceVisitor() {
				public boolean visit(final IResource resource) throws CoreException {
					return buildResource(monitor, resource, builder);
				}
			});
			return null;
		}
		final IResourceDelta delta = getDelta(project);
		if (delta == null) {
			return null;
		}
		delta.accept(new IResourceDeltaVisitor() {
			public boolean visit(final IResourceDelta delta) throws CoreException {
				if (delta.getKind() == IResourceDelta.REMOVED) {
					return false;
				}
				return buildResource(monitor, delta.getResource(), builder);
			}
		});
		return null;
	}

	/**
	 * Builds <code>resource</code> using <code>builder</code>, if necessary.
	 * @param monitor the progress monitor
	 * @param resource the resource to build
	 * @param builder the builder
	 * @return <code>true</code> if the resource's members should be visited; <code>false</code> if they should be skipped
	 */
	public boolean buildResource(final IProgressMonitor monitor, final IResource resource,
			final ISimplegtBuilder builder) {
		if (monitor.isCanceled()) {
			return false;
		}
		if (resource instanceof IFile && "simplegt".equals(resource.getFileExtension())) {
			final URI uri = URI.createPlatformResourceURI(resource.getFullPath().toString(), true);
			if (builder.isBuildingNeeded(uri)) {
				final SimplegtResource customResource = (SimplegtResource) new ResourceSetImpl().getResource(uri, true);
				SimplegtMarkerHelper.unmark(customResource, SimplegtEProblemType.BUILDER_ERROR);
				final IStatus status = builder.build(customResource, monitor);
				if (!status.isOK()) {
					SimplegtPlugin.getDefault().getLog().log(status);
				}
			}
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.resources.IncrementalProjectBuilder#clean(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected void clean(final IProgressMonitor monitor) throws CoreException {
		super.clean(monitor);
		clean(monitor, getProject());
	}

	/**
	 * Cleans <code>project</code>.
	 * @param monitor
	 * @param project
	 */
	public void clean(final IProgressMonitor monitor, final IProject project) {
		try {
			project.accept(new IResourceVisitor() {
				public boolean visit(final IResource resource) throws CoreException {
					if (monitor.isCanceled()) {
						return false;
					}
					if (resource instanceof IFile && "simplegt".equals(resource.getFileExtension())) {
						final String name = resource.getName();
						final IFile emftvmFile = resource.getParent().getFile(
								new Path(name.substring(0, name.lastIndexOf('.')).concat(".emftvm")));
						if (emftvmFile.exists()) {
							emftvmFile.delete(true, monitor);
						}
						return false;
					}
					return true;
				}
			});
		} catch (CoreException e) {
			SimplegtPlugin.getDefault().getLog().log(e.getStatus());
		}
	}
	
}
