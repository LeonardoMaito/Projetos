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
public enum DrinkSizeEnum {

    Small {
        @Override
        public double getDrinkSize() {
            return 1;
        }

    },
    Medium {
        @Override
        public double getDrinkSize() {
            return 1.20;
        }

    },
    Large {
        @Override
        public double getDrinkSize() {
            return 1.35;
        }

    };

    public abstract double getDrinkSize();

}
