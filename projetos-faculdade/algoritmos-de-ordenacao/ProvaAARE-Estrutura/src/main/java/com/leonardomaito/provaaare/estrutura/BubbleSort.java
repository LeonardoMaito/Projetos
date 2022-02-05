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
public class BubbleSort {

    void bubbleSort(int arr[]) {
        int n = arr.length;//Armazena o tamanho do array na variável n
        for (int i = 0; i < n - 1; i++) {//Os dois loops percorrem o array
            for (int j = 0; j < n - i - 1; j++) {//Os ultimos valores i já estão no seu lugar, logo, esse laço não precisa ir até a ultima posição
                if (arr[j] > arr[j + 1]) {/* Se a posição lida for maior que a posição seguinte
                    a ordem dos números é alterada, e então o maior número assume a posição seguinte.*/

                    int temp = arr[j];//Variavel temp para auxiliar a troca de posição dos números,e assim ajudar na ordenação do array
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /*Método para printar o array*/
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        BubbleSort array = new BubbleSort();

        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        //11,12,22,25,34,64,90
        int arr2[] = {32, 54, 20, 10, 3, 70};
        //3,10,20,32,54,70

        array.bubbleSort(arr);//chamando o método para realizar o algoritmo
        System.out.println("Sorted array");
        array.printArray(arr);//chamando o método para printar o algoritmo

        array.bubbleSort(arr2);
        System.out.println("Sorted array");
        array.printArray(arr2);

    }
}
