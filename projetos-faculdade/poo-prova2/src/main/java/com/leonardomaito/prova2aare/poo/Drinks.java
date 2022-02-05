/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardomaito.prova2aare.poo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leonardo Maito
 */
public class Drinks {

    public List<String> drinkList = new ArrayList();
    public List<String> drinkListOrder = new ArrayList();

    List<String> printDrinksListOrder() {
        return drinkListOrder;
    }

    List<String> compareDrinks() {
        drinkList.add("Coca Cola 2 LT");
        drinkList.add("Cerveja Heineken 330 ML");
        drinkList.add("Suco Pratz 900 ML");
        drinkList.add("Água Mineral 600 ML");

        return drinkList;
    }
}
