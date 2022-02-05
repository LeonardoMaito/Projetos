/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.activity7;

import br.com.unipar.activity7.Interfaces.Imprimivel;
import br.com.unipar.activity7.Exceptions.SaldoInsuficiente;

/**
 *
 * @author Leonardo Maito
 */
public class ContaPoupança extends ContaBancaria implements Imprimivel {

    private double taxaOperacao = 5;

    @Override
    public void sacar(double value) {
        compararSaldoTaxa();
        if (this.saldoConta >= value) {
            this.saldoConta -= value;
            this.saldoConta -= taxaOperacao;
        } else {
            throw new SaldoInsuficiente();
        }
    }

    @Override
    public void depositar(double value) {
        if (this.saldoConta + value < taxaOperacao) {
            throw new SaldoInsuficiente();
        } else {
            this.saldoConta += value;
            this.saldoConta -= taxaOperacao;
        }
    }

    public void compararSaldoTaxa() {
        if (this.saldoConta < taxaOperacao) {
            throw new SaldoInsuficiente();
        }
    }

    @Override
    public void mostrarDados() {
        System.out.println("Saldo Conta Poupança: " + this.saldoConta
                + "\nTaxa de Operação: " + taxaOperacao);
    }

    @Override
    public void transferir(double value, ContaBancaria contaBancaria) {
        sacar(value);
        contaBancaria.depositar(value);
    }
}
