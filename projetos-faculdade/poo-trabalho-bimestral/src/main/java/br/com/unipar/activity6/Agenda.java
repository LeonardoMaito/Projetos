/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.activity6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author Leonardo Maito
 */
public class Agenda {

    private int amountOfFriends;
    private int amountOfAcquaintances;
    private ArrayList<Pessoa> agendaList = new ArrayList<Pessoa>();
    private Scanner input = new Scanner(System.in);

    public Agenda(int amountOfPeople) {

        for (int i = 1; i <= amountOfPeople; i++) {
//            double random = 1 + (int) (Math.random() * 2);
            double random = 1;
            if (random == 1) {
                agendaList.add(new Amigo());
                amountOfFriends++;
            } else {
                agendaList.add(new Conhecido());
                amountOfAcquaintances++;
            }
        }
    }

    public void addInformacoes() {
        ListIterator<Pessoa> iterator = agendaList.listIterator();
        while (iterator.hasNext()) {
            Pessoa p = iterator.next();
            if (p instanceof Amigo) {

                System.out.println("Qual o nome do amigo: ");
                String userName = input.nextLine();

                System.out.println("Qual a data de nascimento (Use '/'): ");
                String userDate = input.nextLine();

                System.out.println("Qual a idade: ");
                int userAge = input.nextInt();

                DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("D/m/yyyy");
                LocalDate date = LocalDate.parse(userDate, dateFormat);

                Amigo a = (Amigo) p;
                a.setName(userName);
                a.setBirthday(date);
                a.setAge(userAge);
                input.nextLine();

            } else {
                System.out.println("Qual o nome do Conhecido: ");
                String userName = input.nextLine();

                System.out.println("Qual o email: ");
                String userEmail = input.nextLine();

                System.out.println("Qual a idade: ");
                int userAge = input.nextInt();

                Conhecido c = (Conhecido) p;
                c.setName(userName);
                c.setAge(userAge);
                c.setEmail(userEmail);
                input.nextLine();
            }
        }
    }

    public void imprimeAniversario() {
        ListIterator<Pessoa> iterator = agendaList.listIterator();
        while (iterator.hasNext()) {
            Pessoa p = iterator.next();
            if (p instanceof Amigo) {
                Amigo a = (Amigo) p;
                System.out.println(a.getBirthday());
            }
        }
    }

    public void imprimeEmail() {
        ListIterator<Pessoa> iterator = agendaList.listIterator();
        while (iterator.hasNext()) {
            Pessoa p = iterator.next();
            if (p instanceof Conhecido) {
                Conhecido c = (Conhecido) p;
                System.out.println(c.getEmail());
            }
        }
    }

    public void printarAgenda() {
        System.out.println(agendaList);
    }

    public int getAmountOfFriends() {
        return amountOfFriends;
    }

    public int getAmountOfAcquaintances() {
        return amountOfAcquaintances;
    }

    public ArrayList<Pessoa> getAgendaList() {
        return agendaList;
    }

    @Override
    public String toString() {
        return "Agenda{" + "agendaList=" + agendaList + '}';
    }
}
