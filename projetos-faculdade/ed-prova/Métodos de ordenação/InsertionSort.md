# **Análises**

## **Performance** :chart_with_downwards_trend:

O `Insertion Sort` é um algoritmo lento porém com muitas vantagens sobre seus semelhantes como `Selection Sort`  e `Bubble Sort`. Na verdade, só é lento de fato em listas
grandes e desordenadas, perdendo para `Quick Sort` ou `Heap Sort`.

Apesar disso, suas vantagens são implementação fácil, eficiência em listas pequenas, até mais que outros algoritmos quadráticos `(O(n^2))`, adaptativo, estável, e sua capacidade
de ordenar uma lista conforme a vai recebendo.


| Performance em | Pior caso  |  Caso padrão  | Melhor caso |
| ------------------- | ------------------- | ------------------- | ------------------- |
|  Comparações |  O(n^2) | O(n^2) |  O(n) | 
|  Trocas |  O(n^2) |  O(n^2) |  O(1) |  


***

## **Implementação** :computer:
```
void insertionSort()
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 
                while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
```

### **Exemplificando**

- Considere o array [12, 11, 13, 5, 6]
- Veja que como 11 é menor do que 12, haverá uma troca de lugar →[11,12,13,5,6]
- Como o 13 é o maior valor do array, ele permanecerá fixo, e [11,12,13] se torna o subarray ordenado.
-O valor 5, sendo o menor do array, será movido para o início, e todos os valores de 11 a 13 irão mover uma posição para frente.
- O valor 6 será movido uma posição para frente do 5, e todos os valores de 11 a 13 irão mover uma posição para frente, criando espaço.


<img src="https://upload.wikimedia.org/wikipedia/commons/2/25/Insertion_sort_animation.gif" width=35% height=100%>
