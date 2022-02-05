/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.activity6;

/**
 *
 * @author Leonardo Maito
 */
public class Conhecido extends Pessoa {

    private String email;

    public Conhecido() {
        this.email = "indefinido";
    }

    @Override
    public String toString() {
        return "Conhecido{" +" Nome = "+getName()+" Idade = "+getAge()+ "Email = " + email + '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
