/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardomaito.prova2aare.poo;

import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Maito
 */
public class Order {

    int number;
    String inputSize, inputBorder, inputDrinkChoice;

    void orderPizza(Pizza pizza) {
        inputSize = JOptionPane.showInputDialog("Escolha um tamanho para a pizza: ");
        pizza.setSize(inputSize);
        if (!inputSize.equals("Broto")) {
            inputBorder = JOptionPane.showInputDialog("Gostaria de bordas?: ");
            pizza.setBorder(inputBorder);
        }
    }

    void orderFlavor(Flavors flavor, Pizza pizza) {

        for (int i = 0; i < pizza.getMaxFlavor(); i++) {
            String inputFlavor = JOptionPane.showInputDialog("Escolha um sabor para a pizza: " + flavor.compareFlavor());
            if (flavor.compareFlavor().contains(inputFlavor)) {
                flavor.flavorListOrder.add(inputFlavor);
            } else {
                System.out.println("Sabor não existe");
            }
        }
    }

    void orderBorder(BorderFlavor borderFlavor) {
        if (!inputSize.equals("Broto") && !inputBorder.equals("Nao")) {
            String inputBorderFlavor = JOptionPane.showInputDialog("Escolha um sabor de borda para a pizza: " + borderFlavor.compareBorder());
            if (borderFlavor.compareBorder().contains(inputBorderFlavor)) {
                borderFlavor.borderFlavorListOrder.add(inputBorderFlavor);
            } else {
                System.out.println("Sabor não existe");
            }
        }
    }

    void orderDrinks(Drinks drinkChoice) {
        String inputNumberDrinks = JOptionPane.showInputDialog("Você deseja pedir bebidas? [Sim] [Não]");
        if (inputNumberDrinks.equals("Sim")) {
            inputDrinkChoice = JOptionPane.showInputDialog("Quantas bebidas?");
            number = Integer.parseInt(inputDrinkChoice);
        }
        for (int i = 0; i < number; i++) {
            String inputDrinks = JOptionPane.showInputDialog("Escolha sua(s) bebidas");
            if (drinkChoice.compareDrinks().contains(inputDrinks)) {
                drinkChoice.drinkListOrder.add(inputDrinks);
            } else {
                JOptionPane.showMessageDialog(null, "Bebida não existe no sistema");
            }
        }
    }
}
