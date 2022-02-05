/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaymentMethods;

import Enums.PaymentEnum;
import Interfaces.PaymentInterface;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Maito
 */
public class Main {

    public static void main(String[] args) {
        String[] buttons = {"A vista", "Débito", "Boleto", "Pix", "Cartao de Credito", "Cancel"};
        int returnValue = JOptionPane.showOptionDialog(null, "Escolha um tipo de pagamento para prosseguir: ", "Escolha pagamento", JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[0]);

        PaymentEnum paymentType = PaymentEnum.values()[returnValue];
        PaymentInterface paymentDebitType = paymentType.getPaymentType(returnValue);

        if (returnValue == 4) {
            double total = paymentDebitType.paymentWithInstallments(1000, 10);
        } else {
            try {
                double total = paymentDebitType.payment(700);
                JOptionPane.showMessageDialog(null, "O Valor do pagamento é: " + total);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
}
