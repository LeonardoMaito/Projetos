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
public class PizzaPrice {

    private double giantPrice = 75;
    private double familyPrice = 66;
    private double mediumPrice = 52;
    private double smallPrice = 42;
    private double tinyPrice = 28;

    void determinePizzaPrice(Pizza pizza, OrderCalc order) {
        switch (pizza.getSize()) {

            case "Gigante":
                pizza.setMaxFlavor(5);
                if (pizza.getBorder().equalsIgnoreCase("Sim")) {
                    order.setPrice(giantPrice + 5);
                } else {
                    order.setPrice(giantPrice);
                }
                break;

            case "Família":
                pizza.setMaxFlavor(4);
                if (pizza.getBorder().equalsIgnoreCase("Sim")) {
                    order.setPrice(familyPrice + 4.50);
                } else {
                    order.setPrice(familyPrice);
                }
                break;

            case "Media":
                pizza.setMaxFlavor(3);
                if (pizza.getBorder().equalsIgnoreCase("Sim")) {
                    order.setPrice(mediumPrice + 4.50);
                } else {
                    order.setPrice(mediumPrice);
                }
                break;

            case "Pequena":
                pizza.setMaxFlavor(3);
                if (pizza.getBorder().equalsIgnoreCase("Sim")) {
                    order.setPrice(smallPrice + 2.50);
                } else {
                    order.setPrice(mediumPrice);
                }
                break;

            case "Broto":
                pizza.setMaxFlavor(2);

                System.out.println("Não há opção para bordas nesse tamanho");
                order.setPrice(tinyPrice);

                break;
        }
    }
}
