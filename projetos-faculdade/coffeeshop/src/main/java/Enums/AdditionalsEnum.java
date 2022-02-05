/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

/**
 *
 * @author Leonardo Maito
 */
public enum AdditionalsEnum {

    LemonZest {
        @Override
        public double getAdditionalPrice() {
          return 0.50;
        }
    },
    CinnamonPowder {
        @Override
        public double getAdditionalPrice() {
           return 0.75;
        }
    },
    MilkPowder {
        @Override
        public double getAdditionalPrice() {
         return 1.40;
        }
    },
    IceCreamMilk {
        @Override
        public double getAdditionalPrice() {
           return 1.75;
        }
    },
    CondensedMilk {
        @Override
        public double getAdditionalPrice() {
           return 1.85;
        }
    },
    ChocolatePowder {
        @Override
        public double getAdditionalPrice() {
           return 1.50;
        }
    },
    Cookie {
        @Override
        public double getAdditionalPrice() {
          return 0.90;
        }
    };

    public abstract double getAdditionalPrice();
}
