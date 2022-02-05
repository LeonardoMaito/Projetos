/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.activity7.Exceptions;

/**
 *
 * @author Leonardo Maito
 */
public class ContaInexistente  extends RuntimeException {

    public ContaInexistente() {
        super("A conta não existe");
    } 
    
}
