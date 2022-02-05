package br.unipar.ambientes.telas.dialog;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;

public class CalculadoraDialog extends Dialog {

	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public CalculadoraDialog(Shell parentShell) {
		super(parentShell);
		setShellStyle(SWT.CLOSE | SWT.MIN | SWT.TITLE);
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new GridLayout(4, false));
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Label lblResult = new Label(container, SWT.BORDER | SWT.CENTER);
		lblResult.setFont(SWTResourceManager.getFont("Segoe UI", 21, SWT.NORMAL));
		lblResult.setAlignment(SWT.CENTER);
		lblResult.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 4, 1));
		lblResult.setText("New Label");
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Button btnClear = new Button(container, SWT.NONE);
		btnClear.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		btnClear.setText("C");
		
		Button btnClearAll = new Button(container, SWT.NONE);
		btnClearAll.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		btnClearAll.setText("CE");
		new Label(container, SWT.NONE);
		
		Button btnSeven = new Button(container, SWT.NONE);
		btnSeven.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		btnSeven.setText("7");
		
		Button btnEight = new Button(container, SWT.NONE);
		btnEight.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnEight.setText("8");
		
		Button btnNine = new Button(container, SWT.NONE);
		btnNine.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnNine.setText("9");
		
		Button btnDivide = new Button(container, SWT.NONE);
		btnDivide.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnDivide.setText("/");
		
		Button btnFour = new Button(container, SWT.NONE);
		btnFour.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnFour.setText("4");
		
		Button btnFive = new Button(container, SWT.NONE);
		btnFive.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnFive.setText("5");
		
		Button btnSix = new Button(container, SWT.NONE);
		btnSix.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnSix.setText("6");
		
		Button btnMultiply = new Button(container, SWT.NONE);
		btnMultiply.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnMultiply.setText("X");
		
		Button btnOne = new Button(container, SWT.NONE);
		btnOne.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnOne.setText("1");
		
		Button btnTwo = new Button(container, SWT.NONE);
		btnTwo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnTwo.setText("2");
		
		Button btnThree = new Button(container, SWT.NONE);
		btnThree.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnThree.setText("3");
		
		Button btnMinus = new Button(container, SWT.NONE);
		btnMinus.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnMinus.setText("-");
		
		Button btnZero = new Button(container, SWT.NONE);
		btnZero.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnZero.setText("0");
		
		Button btnComma = new Button(container, SWT.NONE);
		btnComma.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnComma.setText(",");
		
		Button btnEqual = new Button(container, SWT.NONE);
		btnEqual.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnEqual.setText("=");
		
		Button btnSum = new Button(container, SWT.NONE);
		btnSum.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		btnSum.setText("+");

		return container;
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(334, 337);
	}

}
