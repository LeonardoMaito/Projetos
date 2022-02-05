/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardomaito.prova2aare.poo;

import java.util.*;

/**
 *
 * @author Leonardo Maito
 */
public class Flavors {

    List<String> flavorListOrder = new ArrayList();
    List<String> flavorList = new ArrayList();

    List<String> printflavorListOrder() {
        return flavorListOrder;
    }

    List<String> compareFlavor() {
        flavorList.add("5 Queijos");
        flavorList.add("Frango");
        flavorList.add("Catupiry");
        flavorList.add("Cheddar");
        flavorList.add("Calabresa");
        flavorList.add("Prestígio");
        flavorList.add("Salmão com alcaparras");
        flavorList.add("Camarão");
        flavorList.add("Abacaxi com Canela");

        return flavorList;
    }
}
