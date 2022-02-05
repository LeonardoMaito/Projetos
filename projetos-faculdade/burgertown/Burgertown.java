package brcom.leonardo.aulaClasses;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Leonardo Maito
 */
import java.util.Scanner;

public class Burgertown {

    String date;
    String promotionDate = "Sexta";
    String burgerChoice;
    double promotionValue = 0.5;
    double totalPrice;
    double smallHamburguerPrice = 5;
    double mediumHamburguerPrice = 10;
    double largeHamburguerPrice = 15;
    double sodaPrice = 2;
    double extrasPrice = 1.50;

    void order() {
        Scanner choice = new Scanner(System.in);

        System.out.println("O que gostaria de fazer? Pedido ou checkout?");
        burgerChoice = choice.nextLine();

        if (burgerChoice.equalsIgnoreCase("Checkout")) {
            checkout();
        } else {
            takeOrder();
        }
    }

    void takeOrder() {
        Scanner choice = new Scanner(System.in);
        System.out.println("Que pedido gostaria de fazer? Hamburguer, Soda ou Extras?");
        burgerChoice = choice.nextLine();
        if (burgerChoice.equalsIgnoreCase("Hamburguer")) {
            hamburguer();
        }
        if (burgerChoice.equalsIgnoreCase("Soda")) {
            soda();
            System.out.println("Valor adicionado: " + sodaPrice);
            order();
        }
        if (burgerChoice.equalsIgnoreCase("Extras")) {
            extras();
            System.out.println("Valor adicionado: " + extrasPrice);
            order();
        }
    }

    double soda() {
        return totalPrice += sodaPrice;
    }

    double extras() {
        System.out.println("Valor dos extras (batata e molho) adicionados ao total");
        return totalPrice += extrasPrice;
    }

    void hamburguer() {
        Scanner choice = new Scanner(System.in);
        System.out.println("Gostaria de hamburguer small, medium ou large?");
        burgerChoice = choice.nextLine();
        if (burgerChoice.equalsIgnoreCase("Small")) {
            small();
            System.out.println("Valor adicionado: " + smallHamburguerPrice);
            order();
        }
        if (burgerChoice.equalsIgnoreCase("Medium")) {
            medium();
            System.out.println("Valor adicionado: " + mediumHamburguerPrice);
            order();
        }
        if (burgerChoice.equalsIgnoreCase("Large")) {
            large();
            System.out.println("Valor adicionado: " + largeHamburguerPrice);
            order();
        }
    }

    double small() {
        return totalPrice += smallHamburguerPrice;
    }

    double medium() {
        return totalPrice += mediumHamburguerPrice;
    }

    double large() {
        return totalPrice += largeHamburguerPrice;
    }

    void checkout() {
        Scanner weekDay = new Scanner(System.in);
        System.out.println("Insira o dia da semana");
        date = weekDay.nextLine();

        if (date.equals(promotionDate)) {
            totalPrice = totalPrice * promotionValue;
            System.out.println("Valor total do pedido: " + totalPrice);
        } else {
            System.out.println("Valor total do pedido: " + totalPrice);
        }
    }

    public static void main(String[] args) {
        Burgertown orders = new Burgertown();
        orders.order();
    }
}
