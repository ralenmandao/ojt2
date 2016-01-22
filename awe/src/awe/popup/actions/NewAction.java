package awe.popup.actions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class NewAction implements IObjectActionDelegate {

	private Shell shell;

	/**
	 * Constructor for Action1.
	 */
	public NewAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (window != null) {
			IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
			Object firstElement = selection.getFirstElement();
			if (firstElement instanceof IAdaptable) {
				IProject project = (IProject) ((IAdaptable) firstElement).getAdapter(IProject.class);
				try {
					IPackageFragment[] packages = JavaCore.create(project).getPackageFragments();
					for (IPackageFragment fr : packages) {
						if (fr.getKind() == IPackageFragmentRoot.K_SOURCE) {
							for (ICompilationUnit unit : fr.getCompilationUnits()) {
								check(unit);
							}
						}
					}
				} catch (JavaModelException e) {
					e.printStackTrace();
				}

			}
		}
	}

	public void check(ICompilationUnit unit) throws JavaModelException {
		String error = "";
		String source = unit.getSource();

//		String newSource = Pattern.compile("(\\w+|\\W+)\\+(\\w+|\\W+)").matcher(source).replaceAll("$1 + $2");
//		newSource = Pattern.compile("(\\w+),(\\w+)").matcher(newSource).replaceAll("$1, $2");
//
//		for (IType type : unit.getTypes()) {
//			for (IField field : type.getFields()) {
//				if (field.getElementName().contains("_")) {
//					error += "Error field " + field.getElementName() + " contains (underscore) at "
//							+ unit.getElementName() + "\n";
//				}
//			}
//		}

//		newSource = newSource.replaceAll("(?m)[\\s+&&[^\\n]]+$", "");

		source = Pattern.compile("[ \t]int ").matcher(source).replaceAll("Integer");
		
		unit.getBuffer().setContents(source);
		unit.commit(true, null);
		
		System.out.println("awe");
//
//		error += "Finished fixing...";
//
//		if (error.length() > 0) {
//			MessageDialog.openInformation(shell, "Fixed", error);
//		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		
	}

}
