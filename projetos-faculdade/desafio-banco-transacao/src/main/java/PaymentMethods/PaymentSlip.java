/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaymentMethods;

import Interfaces.PaymentInterface;

/**
 *
 * @author Leonardo Maito
 */
public class PaymentSlip implements PaymentInterface{
    
    private final double DISCOUNT_VALUE = 0.1;

    @Override
    public double payment(double value) {
        return value - (value*DISCOUNT_VALUE);
    }
     
}
