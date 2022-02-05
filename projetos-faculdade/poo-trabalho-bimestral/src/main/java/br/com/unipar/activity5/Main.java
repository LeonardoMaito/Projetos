/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.activity5;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;

/**
 *
 * @author Leonardo Maito
 */
public class Main {

    public static void main(String[] args) {
        CheckingAccount cc = new CheckingAccount();
        SavingsAccount cp = new SavingsAccount();

        cc.cashDeposit(200.0);
        cc.cashOut(125.0);
//        cc.getBankBalanceByDate(LocalDate.now());
        
        DateTimeFormatter dte = new DateTimeFormatterBuilder().appendPattern("").toFormatter();
        ZonedDateTime parsed = ZonedDateTime.parse("10/10/2010", dte);
        parsed.toLocalDate();
        
        cc.extractByPeriod(parsed.toLocalDate(), parsed.toLocalDate());

    }

}
