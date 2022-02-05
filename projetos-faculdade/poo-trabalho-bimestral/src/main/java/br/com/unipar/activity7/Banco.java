/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.activity7;

import br.com.unipar.activity7.Interfaces.Imprimivel;
import br.com.unipar.activity7.Exceptions.ContaInexistente;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author Leonardo Maito
 */
public class Banco implements Imprimivel {

    private HashMap<Double, ContaBancaria> contasBancarias = new HashMap<Double, ContaBancaria>();

    public void inserirConta(double accountId, ContaBancaria contaBancaria) {
        contasBancarias.put(accountId, contaBancaria);
        contaBancaria.setIdConta(accountId);
    }

    public void removerConta(double accountId) {
        contasBancarias.remove(accountId);
    }

    public ContaBancaria procurarConta(double accountId) {
        if (contasBancarias.containsKey(accountId)) {
            System.out.println(contasBancarias.get(accountId));
            return contasBancarias.get(accountId);
        }
        else{
            throw new ContaInexistente();
        }
    }

    @Override
    public void mostrarDados() {
        Collection<ContaBancaria> values = contasBancarias.values();
        for (ContaBancaria value : values) {
            System.out.println(value);
        }
    }

    @Override
    public String toString() {
        return "Banco{" + "contasBancarias=" + contasBancarias + '}';
    }

}
