/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

import Interface.BasicDrink;
import Drinks.ChocoaMilk;
import Drinks.Coffee;
import Drinks.CoffeeMilk;
import Drinks.EspressoPanna;
import Drinks.Mocha;

/**
 *
 * @author Leonardo Maito
 */
public enum DrinkTypeEnum {

    Coffee {
        @Override
        public double getDrinkTypePrice() {
            return new Coffee().getPrice();
        }

    },
    CoffeeMilk {
        @Override
        public double getDrinkTypePrice() {
            return new CoffeeMilk().getPrice();
        }

    },
    ChocoaMilk {
        @Override
        public double getDrinkTypePrice() {
            return new ChocoaMilk().getPrice();

        }
    },
    EspressoPanna {
        @Override
        public double getDrinkTypePrice() {
            return new EspressoPanna().getPrice();

        }
    },
    Mocha {
        @Override
        public double getDrinkTypePrice() {
            return new Mocha().getPrice();

        }
    };

    public abstract double getDrinkTypePrice();
}
