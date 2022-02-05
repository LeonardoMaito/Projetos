# **Análises**

## **Performance** :chart_with_downwards_trend:

O `Selection Sort` possui uma complexidade de `O(n^2)`, semelhante ao do  `Bubble Sort`, ou seja, sua performance em listas grandes deixa a desejar, além de ser
, em geral, inferior ao  `Insertion Sort`. Suas vantagens são a simplicidade e a performance sobre outros métodos em casos específicos, especialmente quando a 
memória auxiliar é um fator limitante.

Em termos de eficiência de tempo, o `Selection Sort` é quadrático, então existem outros métodos melhores que esse para aumentar a eficiência no tempo. Apesar disso,
uma das maiores vantagens do `Selection Sort` é que em seu pior caso, o número de trocas ainda é `n - 1`.

| Performance em | Pior caso  |  Caso padrão  | Melhor caso |
| ------------------- | ------------------- | ------------------- | ------------------- |
|  Comparações |  O(n^2) | O(n^2) |  O(n^2) | 
|  Trocas |  O(n) |  O(n) |  O(1) |  


***

## **Implementação** :computer:
```
void selectionSort()
    {
        int n = arr.length;
 
        for (int i = 0; i < n-1; i++)
        {
            
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
  
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

```

### **Exemplificando**

- Considere o array [5,1,2,4,8]
- Encontrando o menor valor, 1 , ele é colocado na primeira posição do array (int min_idx = 1)
- E então, procura-se o próximo menor valor do array [5,2,4,8], o número 2 
- Então, ele é colocado na segunda posição do array, tendo-se [1,2,5,4,8], 
  e assim é feito até que todos valores estejam na ordem correta.
  [1,2,4,5,8] → [1,2,4,5,8].


<img src="https://upload.wikimedia.org/wikipedia/commons/b/b0/Selection_sort_animation.gif" width=35% height=100%>

