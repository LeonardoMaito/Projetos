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
public class InsertionSort {

    void insertionSort(int arr[]) {
        int n = arr.length;//Armazena o tamanho do array na variável n
        for (int i = 1; i < n; ++i) {//Os dois loops percorrem o array
            int key = arr[i];//O numero indice/pivo/chave escolhido para o array
            int j = i - 1;//J começa na ultima posição

            /*O objetivo aqui é percorrer o array definindo a chave como posição 0, 1, 2...
            Sempre que um elemento do array for maior que a chave (essa que será determinada pela posição do i)
            Esse numero é jogado uma posição a frente da sua posição atual*/
            while (j >= 0 && arr[j] > key) {//O laço para se o indice se torna 0 ou quando a posição que queremos ordenar ja esta ordenada
                arr[j + 1] = arr[j];//O numero tem sua posição alterada se for maior que a chave
                j = j - 1;//O número percorre o restante do array para verificar outros números
            }
            arr[j + 1] = key;//A posição chave se torna o elemento do array que foi alterado uma posição pra frente.
        }
    }

    //Método para printar o array
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String args[]) {
        InsertionSort array = new InsertionSort();

        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        //11,12,22,25,34,64,90
        int arr2[] = {1, 4, 21, 85, 20, 55};
        //1,4,20,21,55,85

        array.insertionSort(arr);//chamando o método para realizar o algoritmo
        System.out.println("Sorted array");
        InsertionSort.printArray(arr);//chamando o método para printar o algoritmo

        array.insertionSort(arr2);
        System.out.println("Sorted array");
        InsertionSort.printArray(arr2);
    }
}
