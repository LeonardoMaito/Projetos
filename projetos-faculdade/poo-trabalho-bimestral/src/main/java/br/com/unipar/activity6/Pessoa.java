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
public class Pessoa {

    private String name;
    private int age;

    public Pessoa(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Pessoa() {
        this.name = "indefinido";
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
