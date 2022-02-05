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
public class Pizza {

    private String size;
    private String border;
    private double maxFlavor;

    public String getBorder() {
        return border;
    }

    public String getSize() {
        return size;
    }

    public double getMaxFlavor() {
        return maxFlavor;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setMaxFlavor(double maxFlavor) {
        this.maxFlavor = maxFlavor;
    }

    public void setBorder(String border) {
        this.border = border;
    }
}
