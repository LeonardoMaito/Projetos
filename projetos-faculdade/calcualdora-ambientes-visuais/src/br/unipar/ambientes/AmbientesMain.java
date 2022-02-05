package br.unipar.ambientes;

import org.eclipse.swt.widgets.Display;

import br.unipar.ambientes.telas.dialog.CalculadoraDialog;


public class AmbientesMain {

	public static void main(String[] args) {

		CalculadoraDialog calculadoraDialog = new CalculadoraDialog(Display.getDefault().getActiveShell());
        calculadoraDialog.open();  
	}

}
