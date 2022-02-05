/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardomaito.prova2aare.poo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Maito
 */
public class BorderFlavor {

    List<String> borderFlavorListOrder = new ArrayList();
    List<String> borderFlavorList = new ArrayList();

    List<String> printBorderFlavorListOrder() {
        return borderFlavorListOrder;
    }

    List<String> compareBorder() {
        borderFlavorList.add("Cheddar");
        borderFlavorList.add("½ Nutella ½ Doce de Leite");
        borderFlavorList.add("Nutella");
        borderFlavorList.add("Catupiry");

        return borderFlavorList;
    }
}
