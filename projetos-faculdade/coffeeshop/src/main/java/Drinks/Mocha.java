/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drinks;

import Interface.BasicDrink;

/**
 *
 * @author Leonardo Maito
 */
public class Mocha implements BasicDrink {

    private double price = 4;

    @Override
    public double getPrice() {
        return price;
    }
}
