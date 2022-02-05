/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.activity6;

import java.util.Scanner;

/**
 *
 * @author Leonardo Maito
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual a quantidade de Pessoas na Agenda");
        int qtdPessoas = input.nextInt();

        Agenda agenda = new Agenda(qtdPessoas);
        agenda.addInformacoes();
        //agenda.printarAgenda();
       // agenda.imprimeAniversario();
        //agenda.imprimeEmail();
        //agenda.getAmountOfFriends();
        //agenda.getAmountOfAcquaintances();
    }

}
