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
public class OrderCalc {

    private double additionalPriceFlavor;
    private double additionalPriceBorder;
    private double additionalDrinks;
    private double price;

    void printOrderCost(Flavors listFlavor, BorderFlavor listBorder, Drinks listDrink, Pizza listSize) {       
        JOptionPane.showMessageDialog(null, "Tamanho: " + listSize.getSize() + " Preço: R$" + price);
        JOptionPane.showMessageDialog(null, "Sabores escolhidos: " + listFlavor.flavorListOrder + " Preço: R$" + additionalPriceFlavor);
        JOptionPane.showMessageDialog(null, "Sabor da borda: " + listBorder.borderFlavorListOrder + " Preço: R$" + additionalPriceBorder);
        JOptionPane.showMessageDialog(null, "Bebidas escolhidas: " + listDrink.drinkListOrder + " Preço: R$" + additionalDrinks);   
    }

    void checkCostlyFlavor(Flavors flavor) {
        for (String read: flavor.flavorListOrder ) {
            if (read.contains("Cheddar")) {
                additionalPriceFlavor += 3.50;
            }
            if (read.contains("Salmão com alcaparra")) {
                additionalPriceFlavor += 4.00;
            }
            if (read.contains("Camarão")) {
                additionalPriceFlavor += 4.50;
            }
        }
    }

    void checkCostlyBorder(BorderFlavor borderFlavor) {
        for (String readBorder: borderFlavor.borderFlavorListOrder) {
            if (readBorder.contains("½ Nutella ½ Doce de Leite")) {
                additionalPriceBorder += 3.00;
            }
            if (readBorder.contains("Nutella")) {
                additionalPriceBorder += 2.00;
            }
        }
    }
    
    void checkDrinksCost(Drinks drinkChoice) {
        for (String readDrinks: drinkChoice.drinkListOrder) {

            if (readDrinks.contains("Coca Cola 2 LT")) {                
                additionalDrinks += 9.50;
            }
            if (readDrinks.contains("Cerveja Heineken 330 ML")) {
                additionalDrinks += 6.50;
            }
            if (readDrinks.contains("Suco Pratz 900 ML")) {
                additionalDrinks += 12.50;
            }
            if (readDrinks.contains("Água Mineral 600 ML")) {
                additionalDrinks += 3.50;
            }
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
