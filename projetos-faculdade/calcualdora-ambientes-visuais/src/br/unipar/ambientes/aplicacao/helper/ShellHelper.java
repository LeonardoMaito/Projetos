package br.unipar.ambientes.aplicacao.helper;

import org.eclipse.jface.window.IShellProvider;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

public class ShellHelper {

	private ShellHelper() {
		throw new IllegalStateException("Utility class");
	}
	
	public static Shell getActiveShell(){
		try {
			return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		} catch (Exception e) {
			e.printStackTrace();
			return Display.getDefault().getActiveShell();
		}
	}
	
	public static Shell getModalShell(){
		return PlatformUI.getWorkbench().getModalDialogShellProvider().getShell();
	}
	
	public static IShellProvider getShellProvider() {
		return new IShellProvider() {
			@Override
			public Shell getShell() {
				return getActiveShell();
			}
		};
	}
}
