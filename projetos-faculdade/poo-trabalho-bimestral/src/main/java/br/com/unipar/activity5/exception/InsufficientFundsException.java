/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.activity5.exception;

/**
 *
 * @author phtar
 */
public class InsufficientFundsException extends RuntimeException{

    public InsufficientFundsException() {
        super("Problema com a quantidade de dinheiros");
    }
    
    
}
