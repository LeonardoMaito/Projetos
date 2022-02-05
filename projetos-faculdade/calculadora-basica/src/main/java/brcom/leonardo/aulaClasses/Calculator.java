/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brcom.leonardo.aulaClasses;

/**
 *
 * @author Leonardo Maito
 */
import java.util.Scanner;

public class Calculator {

    double num1, num2, result;
    String operation;
    String choice;

    void operators() {

        Scanner inputTwo = new Scanner(System.in);
        Scanner operator = new Scanner(System.in);

        System.out.println("Informe a operação: ");
        operation = operator.nextLine();
        if (operation.equalsIgnoreCase("Potencia")) {
            power();
            System.out.println("Resultado: " + result);
            start();
        }
        System.out.println("Informe o 2º número: ");
        num2 = inputTwo.nextDouble();

        if (operation.equalsIgnoreCase("Somar")) {
            sum();
            System.out.println("Resultado: " + result);

        }

        if (operation.equalsIgnoreCase("Subtrair")) {
            subtract();
            System.out.println("Resultado: " + result);

        }
        if (operation.equalsIgnoreCase("Multiplicar")) {
            multiply();
            System.out.println("Resultado: " + result);

        }
        if (operation.equalsIgnoreCase("Dividir")) {
            divide();
            System.out.println("Resultado: " + result);

        }
        if (operation.equalsIgnoreCase("Raiz Quadrada")) {
            squareRoot();
            System.out.println("Resultado: " + result);

        }

        start();
    }

    double sum() {
        return result = num1 + num2;
    }

    double subtract() {
        return result = num1 - num2;
    }

    double multiply() {
        return result = num1 * num2;
    }

    double divide() {
        return result = num1 / num2;
    }

    double squareRoot() {
        num2 = 0;
        return result = Math.sqrt(num1);
    }

    double power() {
        System.out.println("Por quanto deseja elevar o primeiro número?");
        Scanner inputTwo = new Scanner(System.in);
        num2 = inputTwo.nextDouble();

        return result = Math.pow(num1, num2);

    }

    void start() {

        Scanner input = new Scanner(System.in);

        Scanner newOp = new Scanner(System.in);

        System.out.println("Deseja fazer alguma operação? ");
        choice = newOp.nextLine();

        if (choice.equalsIgnoreCase("Sim")) {

            System.out.println("Informe o 1º número: ");
            num1 = input.nextDouble();

            operators();

        } else {

        }
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.start();
    }
}
