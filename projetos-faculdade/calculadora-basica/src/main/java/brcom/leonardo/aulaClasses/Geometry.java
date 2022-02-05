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

public class Geometry {

    int area, perimeter, b, h, r, smallBase;
    String choice;
    double pi = 3.14, side, areap;

    void start() {
        Scanner height = new Scanner(System.in);
        Scanner base = new Scanner(System.in);

        System.out.println("Qual a altura da figura?");
        h = height.nextInt();

        System.out.println("Qual a base da figura?");
        b = base.nextInt();

        System.out.println("Qual figura geométrica você quer utilizar?");
        shapes();

    }

    void shapes() {
        Scanner typeFigure = new Scanner(System.in);
        choice = typeFigure.nextLine();

        if (choice.equalsIgnoreCase("Quadrado")) {
            square();
            System.out.println("Area: " + areap);
        }

        if (choice.equalsIgnoreCase("Circulo")) {
            circle();
            System.out.println("Area: " + areap);
        }
        if (choice.equalsIgnoreCase("Triangulo")) {
            triangle();
            System.out.println("Area: " + area);
        }
        if (choice.equalsIgnoreCase("Retangulo")) {
            rectangle();
            System.out.println("Area: " + area);
        }
        if (choice.equalsIgnoreCase("Trapezio")) {
            trapezoid();
            System.out.println("Area: " + area);
        }
    }

    double square() {
        Scanner squareSide = new Scanner(System.in);
        System.out.println("Qual o lado do quadrado?");
        side = squareSide.nextInt();
        return areap = Math.pow(side, 2);
    }

    int triangle() {
        return area = (b * h) / 2;
    }

    int rectangle() {
        return area = b * h;
    }

    double circle() {
        System.out.println("Qual o raio do círculo?");
        Scanner radius = new Scanner(System.in);
        r = radius.nextInt();
        return areap = pi * r;
    }

    double trapezoid() {
        System.out.println("Qual a base menor do trapézio?");
        Scanner smallB = new Scanner(System.in);
        smallBase = smallB.nextInt();

        return area = (b + smallBase) * h / 2;
    }

    public static void main(String[] args) {
        Geometry figure = new Geometry();
        figure.start();
    }
}
