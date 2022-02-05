# **Análises**

## **Performance** :chart_with_downwards_trend:

O `Quick Sort` é um dos mais rápidos métodos de ordenação utilizado, apesar de não ser o mais estável. O elemento chave do seu algoritmo é a `partição()`. Logo, muito de sua
performance depende da forma em que esse método é realizado.

O pior caso de particionamento ocorre quando o elemento pivô divide a lista de forma desbalanceada, ou seja, divide a lista em duas sub listas: 
uma com `tamanho 0` e outra com `tamanho n - 1` (no qual n se refere ao tamanho da lista original).

O melhor caso de particionamento acontece quando ele produz duas listas de tamanho não maior que` n/2`, uma vez que uma lista terá tamanho `[n/2]` e outra tamanho `[n/2] - 1`.
Nesse caso, o quicksort é executado com maior rapidez.

| Performance em | Pior caso  |  Caso padrão  | Melhor caso |
| ------------------- | ------------------- | ------------------- | ------------------- |
|  Comparações |  O(n^2) | O(n log n) |  O(n log n) | 
|  Trocas |  O(n^2) |  O(n log n) |  O(n log n) |  


***

## **Implementação** :computer:
```
static int partition(int[] arr, int low, int high)
{

    int pivot = arr[high];

    int i = (low - 1);
 
    for(int j = low; j <= high - 1; j++)
    {
       
        if (arr[j] < pivot)
        {
            i++;
            swap(arr, i, j);
        }
    }
    swap(arr, i + 1, high);
    return (i + 1);
}

static void quickSort(int[] arr, int low, int high)
{
    if (low < high)
    {         
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}
```

### **Exemplificando**

- Considere o array [10, 80, 30, 90, 40, 50, 70], sendo 70 o pivô.
- Quando J = 2, I será igual a 1, e serão trocados os valores 80 e 30.
- Quando J = 4, e I = 2, os valores 80 e 40 serão trocados.
- Quando J = 5 e I = 3, os valores 90 e 50 serão trocados.
- Saímos do loop, visto que J = High - 1, e então trocamos o pivô do array pelo valor arrar[i+1], no caso, o 80.
- Por fim temos que o array se tornou [10, 30, 40, 50, 70 , 90 ,80]. Dessa forma, os menores valores que 70 estão na esquerda e os maiores na direita.

<img src="https://upload.wikimedia.org/wikipedia/commons/6/6a/Sorting_quicksort_anim.gif" width=35% height=100%>
