/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

import Interfaces.PaymentInterface;
import PaymentMethods.Cash;
import PaymentMethods.CreditCard;
import PaymentMethods.DebitPayment;
import PaymentMethods.PaymentSlip;
import PaymentMethods.Pix;

/**
 *
 * @author Leonardo Maito
 */
public enum PaymentEnum {
    CASH {
        @Override
        public PaymentInterface getPaymentType(double value) {
            return new Cash();
        }
    },
    DEBIT {
        @Override
        public PaymentInterface getPaymentType(double value) {
            return new DebitPayment();
        }
    },
    PAYMENTSLIP {
        @Override
        public PaymentInterface getPaymentType(double value) {
            return new PaymentSlip();
        }
    },
    PIX {
        @Override
        public PaymentInterface getPaymentType(double value) {
            return new Pix();
        }
    },
    CREDITCARD {
        @Override
        public PaymentInterface getPaymentType(double value) {
            return new CreditCard();
        }
    };

    public abstract PaymentInterface getPaymentType(double value);
}
