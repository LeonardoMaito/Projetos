/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.activity5;

import java.time.LocalDate;

/**
 *
 * @author Leonardo Maito
 */
public class Transaction {

    private LocalDate date;
    private double value;
    private String transactionType;

    public Transaction(LocalDate date, double value, String transactionType) {
        this.date = date;
        this.value = value;
        this.transactionType = transactionType;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Transaction{" + "date=" + date + ", value=" + value + ", transactionType=" + transactionType + '}';
    }

}
