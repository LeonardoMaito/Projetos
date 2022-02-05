/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardomaito.provaaare.estrutura;

/**
 *
 * @author Leonardo Maito
 */
public class SelectionSort {

    void selectionSort(int arr[]) {
        int n = arr.length;

        /*Um por um é percorrido o array*/
        for (int i = 0; i < n - 1; i++) {
            /*Para encontrar o menor numero no array, 
            coloca-se uma variavel e a atribui o valor de i, 
            no caso inicial, 0 */
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                /*Se o valor lido for menor que o valor da primeira
                posição, então esse se torna o novo valor lido*/
 /*Dessa forma, o menor valor assume a posição array[0]*/
 /*E assim, o proximo menor valor assume a posição arra[1]*/
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            /*Troca o valor minimo encontrado pelo valor minimo original
            Dessa forma, um por um, o array é ordenado*/

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    //Método para printar o array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        SelectionSort array = new SelectionSort();

        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        //11,12,22,25,34,64,90
        int arr2[] = {1, 4, 21, 85, 20, 55};
        //1,4,20,21,55,85

        array.selectionSort(arr);//chamando o método para realizar o algoritmo
        System.out.println("Sorted array");
        InsertionSort.printArray(arr);//chamando o método para printar o algoritmo

        array.selectionSort(arr2);
        System.out.println("Sorted array");
        InsertionSort.printArray(arr2);
    }
}
