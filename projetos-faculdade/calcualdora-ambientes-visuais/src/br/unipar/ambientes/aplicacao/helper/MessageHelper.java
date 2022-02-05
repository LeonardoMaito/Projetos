package br.unipar.ambientes.aplicacao.helper;

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.MessageDialogWithToggle;

import br.unipar.ambientes.aplicacao.interno.Activator;

public abstract class MessageHelper {

	public static final String TITULO_NOME_SISTEMA = "Ambientes Visuais - UNIPAR";
	private static final String TITULO_PADRAO = "Ocorreu um erro durante a execução";
	
	private MessageHelper() {
		throw new IllegalStateException("Utility class");
	}
	
	public static boolean openConfirm(String mensagem){
		return MessageDialog.openConfirm(ShellHelper.getActiveShell(), "O sistema necessita da sua confirmação", mensagem);
	}
	
	public static void openError(String mensagem){
		MessageDialog.openError(ShellHelper.getActiveShell(), TITULO_PADRAO, mensagem);
	}
	
	public static void openError(String title, String mensagem){
		MessageDialog.openError(ShellHelper.getActiveShell(), title, mensagem);
	}

	public static void openInformation(String string) {
		MessageDialog.openInformation(ShellHelper.getActiveShell(), TITULO_NOME_SISTEMA, string);
	}
	
	public static void openWarning(String string) {
		MessageDialog.openWarning(ShellHelper.getActiveShell(), TITULO_NOME_SISTEMA, string);
	}
	
	public static void openErrorStatus(String mensagem, String motivo){
		ErrorDialog.openError(ShellHelper.getActiveShell(), TITULO_PADRAO, mensagem, createErrorStatus(motivo));
	}
	
	public static void openErrorMultiStatus(String mensagem, List<String> mensagens){
		openMultiStatus(IStatus.ERROR, TITULO_PADRAO, mensagem, mensagens.toArray(new String[mensagens.size()]));
	}
	
	public static void openErrorMultiStatus(String mensagem, String... mensagens){
		openMultiStatus(IStatus.ERROR, TITULO_PADRAO, mensagem, mensagens);
	}
	
	public static void openInfoMultiStatus(String titulo, String mensagem, String... mensagens){
		openMultiStatus(IStatus.INFO, titulo, mensagem, mensagens);
	}
	
	public static void openWarningMultiStatus(String titulo, String mensagem, String... mensagens){
		openMultiStatus(IStatus.WARNING, titulo, mensagem, mensagens);
	}
	
	public static void openWarningMultiStatus(String titulo, String mensagem, List<String> messages){
		openWarningMultiStatus(titulo, mensagem, messages.toArray(new String[messages.size()]));
	}
	
	public static void openInfoMultiStatus(String titulo, String mensagem, List<String> messages){
		openInfoMultiStatus(titulo, mensagem, messages.toArray(new String[messages.size()]));
	}
	
	public static MessageDialogWithToggle openToggle(String message){
		String toggleMessage = "Utilizar esta ação como padrão e não perguntar mais";
		return new MessageDialogWithToggle(ShellHelper.getModalShell(), TITULO_NOME_SISTEMA, null, message, MessageDialog.QUESTION, new String[]{"Sim","Não"}, 0, toggleMessage, false);
	}
	
	public static IStatus createStatus(int status, String mensagem){
		return new Status(status, Activator.PLUGIN_ID, mensagem);
	}
	
	public static IStatus createErrorStatus(String mensagem){
		return new Status(IStatus.ERROR, Activator.PLUGIN_ID, mensagem);
	}
	
	public static IStatus createWarningStatus(String mensagem){
		return new Status(IStatus.WARNING, Activator.PLUGIN_ID, mensagem);
	}
	
	public static IStatus createExceptionStatus(String mensagem, Throwable exception){
		return new Status(IStatus.ERROR, Activator.PLUGIN_ID, mensagem, exception);
	}
	
	public static void openMultiStatus(int codigoStatus, String titulo, String mensagem, String... mensagens) {
		MultiStatus status = new MultiStatus(Activator.PLUGIN_ID, 1,mensagem, null);
		for (String string : mensagens) {
			status.add(createStatus(codigoStatus, string));
		}
		
		ErrorDialog.openError(ShellHelper.getActiveShell(), titulo, null, status);
	}
	
}
