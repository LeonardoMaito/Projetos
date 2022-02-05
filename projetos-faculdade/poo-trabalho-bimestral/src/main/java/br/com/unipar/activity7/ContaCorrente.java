/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.activity7;

import br.com.unipar.activity7.Interfaces.Imprimivel;
import br.com.unipar.activity7.Exceptions.LimiteEstourado;

/**
 *
 * @author Leonardo Maito
 */
public class ContaCorrente extends ContaBancaria implements Imprimivel {

    private double limiteConta;

    @Override
    public void sacar(double value) {
        if (this.saldoConta >= value) {
            this.saldoConta -= value;
        } else {
            withdrawWithLimit(value);
        }
    }

    public void withdrawWithLimit(double value) {
        System.out.println("Realizando saque com limite");
        if (this.saldoConta + limiteConta >= value) {
            double result = this.saldoConta - value;
            this.saldoConta = result;
            //accountLimit += result;
        } else {
            throw new LimiteEstourado();
        }
    }

    @Override
    public void depositar(double value) {
        this.saldoConta += value;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Saldo Conta Corrente: " + this.saldoConta
                + "\nLimite da Conta: " + limiteConta);

    }

    @Override
    public void transferir(double value, ContaBancaria contaBancaria) {
        sacar(value);
        contaBancaria.depositar(value);

    }

    public double getLimiteConta() {
        return limiteConta;
    }

    public void setLimiteConta(double limiteConta) {
        this.limiteConta = limiteConta;
    }
    
    

}
