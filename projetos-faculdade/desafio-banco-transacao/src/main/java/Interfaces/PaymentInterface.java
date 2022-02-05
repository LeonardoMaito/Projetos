/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Leonardo Maito
 */
public interface PaymentInterface {

    public double payment(double value);
    
    default double paymentWithInstallments(double value, int installments){
        return value/installments;
    }
}
