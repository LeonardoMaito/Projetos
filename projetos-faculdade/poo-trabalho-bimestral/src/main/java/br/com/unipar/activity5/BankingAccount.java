/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.activity5;

import java.time.LocalDate;

/**
 *
 * @author phtar
 */
public abstract class BankingAccount {

    public abstract void cashOut(Double value);

    public abstract void cashDeposit(Double value);

    public abstract void extractByPeriod(LocalDate initialDate, LocalDate finalDate);

    public abstract void getBankBalanceByDate(LocalDate date);

}
