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
public class QuickSort {

    /*Função de utilidade para alterar dois elementos
    Mesma ideia dos demais algoritmos feitos*/
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /* Essa função pega o ultimo elemento como pivô, coloca o pivô 
    em sua correta posição dentro do array ordenado,
    e coloca todos elementos menores que o pivô para a sua esquerda
    e todos os maiores para a direita*/
    static int partition(int[] arr, int low, int high) {

        // pivo assume o valor do index mais alto
        int pivot = arr[high];

        // Index do menor elemento
        // indica a posição direita 
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // Se o elemento atual é menor que o pivô
            if (arr[j] < pivot) {

                //incrementa o index do menor elemento
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    /*A função principal que implementa o algoritmo QuickSort
          arr[] --> Array para ser ordenado,
          low --> Index inicial,
          high -->  Index final
     */
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            /*Divisão e conquista, o array vai ser quebrado em dois,
            a metade menor, e a metade maior, e então,
            essas duas metades, ou subarrays, são ordenados*/
            int pi = partition(arr, low, high);

            // Separadamente ordena elementos antes e depois da partição
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    //Método para printar o array
    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        QuickSort array = new QuickSort();
        int[] arr = {10, 7, 8, 9, 1, 5};
        //1,5,7,8,9,10
        int arr2[] = {1, 4, 21, 85, 20, 55};
        //1,4,20,21,55,85
        int n = arr.length;

        array.quickSort(arr, 0, n - 1);//chamando o método para realizar o algoritmo
        System.out.println("Sorted array: ");
        printArray(arr, n);//chamando o método para printar o algoritmo

        array.quickSort(arr2, 0, n - 1);//chamando o método para realizar o algoritmo
        System.out.println("Sorted array: ");
        printArray(arr2, n);//chamando o método para printar o algoritmo
    }
}
