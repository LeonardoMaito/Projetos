/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.activity6;

import java.time.LocalDate;

/**
 *
 * @author Leonardo Maito
 */
public class Amigo extends Pessoa {

    private LocalDate birthday;

    public Amigo() {
        this.birthday = null;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Amigo{" +" Nome = "+ getName() +" birthday = " + birthday + " Idade = " + getAge()+'}';
    }
    
    

}
