/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardomaito.prova2aare.poo;

/**
 *
 * @author Leonardo Maito
 */
public class Main {

    public static void main(String[] args) {

        Pizza pizza = new Pizza();
        Flavors flavor = new Flavors();
        BorderFlavor borderFlavor = new BorderFlavor();
        Drinks drinks = new Drinks();
        Order order = new Order();
        OrderCalc price = new OrderCalc();
        PizzaPrice get = new PizzaPrice();

        order.orderPizza(pizza);
        get.determinePizzaPrice(pizza, price);
        order.orderFlavor(flavor, pizza);
        order.orderBorder(borderFlavor);
        order.orderDrinks(drinks);

        price.checkCostlyFlavor(flavor);
        price.checkCostlyBorder(borderFlavor);
        price.checkDrinksCost(drinks);
        price.printOrderCost(flavor, borderFlavor, drinks, pizza);
    }
}
