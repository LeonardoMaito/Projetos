/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.activity7;

/**
 *
 * @author Leonardo Maito
 */
public abstract class ContaBancaria {

    protected double idConta;
    protected double saldoConta;

    public abstract void sacar(double value);

    public abstract void depositar(double value);

    public abstract void transferir(double value, ContaBancaria contaBancaria);

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public double getIdConta() {
        return idConta;
    }

    public void setIdConta(double idConta) {
        this.idConta = idConta;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" + "accountId=" + idConta + ", accountBalance=" + saldoConta + '}';
    }

}
