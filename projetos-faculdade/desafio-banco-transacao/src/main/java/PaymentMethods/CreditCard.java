/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
                //double CF = (INTEREST_PRICE) / 1 - (1 / (1 + Math.pow(INTEREST_PRICE, installments)));
                //installmentPrice = value * CF;

                //
                //
 */
package PaymentMethods;

import Interfaces.PaymentInterface;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Maito
 */
public class CreditCard implements PaymentInterface {

    private final double MINIMUM_INSTALLMENT = 30;
    private final double INTEREST_PRICE = 0.89;
    private double installmentPrice;

    @Override
    public double paymentWithInstallments(double value, int installments) {
        if (value / installments >= MINIMUM_INSTALLMENT) {
            if (installments < 6) {
                JOptionPane.showMessageDialog(null, "O Valor de cada parcela é: " + paymentWithoutInterest(value, installments));
            } else {
                JOptionPane.showMessageDialog(null, "O valor do produto parcelado, com juros, é: " + calculateInterest(value, installments));
            }
        }
        return 0;
    }

    public double calculateInterest(double value, int installments) {
        double multiplicador = Math.pow(1.0 + INTEREST_PRICE / 100.0, installments) - 1.0;
        double resultado = value + multiplicador * value;
        return resultado;
    }

    public double paymentWithoutInterest(double value, int installments) {
        return installmentPrice = value / installments;
    }

    @Override
    public double payment(double value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
