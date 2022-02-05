/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.activity5;

import br.com.unipar.activity5.exception.InsufficientFundsException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phta
 */
public class SavingsAccount extends BankingAccount {

    private double checkingTotal;
    private List<Transaction> checkingTransactions = new ArrayList<Transaction>();
    private List<Transaction> checkingResult = new ArrayList<Transaction>();

    @Override
    public void cashOut(Double value) {
        if (value > checkingTotal || value < 0) {
            throw new InsufficientFundsException();
        }
        this.checkingTransactions.add(new Transaction(LocalDate.of(1998, 5, 5), value, "Saque"));
        checkingTotal -= value;
    }

    @Override
    public void cashDeposit(Double value) {
        if (value < 0) {
            throw new InsufficientFundsException();
        }
        this.checkingTransactions.add(new Transaction(LocalDate.now(), value, "Deposito"));
        checkingTotal += value;
    }

    @Override
    public void extractByPeriod(LocalDate initialDate, LocalDate finalDate) {
        for (Transaction op : this.checkingTransactions) {
            if (op.getDate().isAfter(initialDate) && op.getDate().isBefore(finalDate)) {
                checkingResult.add(op);
            }
        }
        print();
    }

    @Override
    public void getBankBalanceByDate(LocalDate date) {
        for (Transaction op : this.checkingTransactions) {
            if (op.getDate().equals(date)) {
                checkingResult.add(op);
            }
        }
        print();
    }
    
    public void print() {
        for (int i = 0; i < checkingResult.size(); i++) {
            System.out.println(checkingResult.get(i));
        }
        System.out.println("Valor na conta:" + checkingTotal);
    }
}
