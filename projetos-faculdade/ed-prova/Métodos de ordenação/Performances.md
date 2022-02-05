# **Análise**

## **Performance** :chart_with_downwards_trend:

É difícil dizer com exatidão e precisão total qual dos algoritmos é o mais rápido ou eficiente, pois isso depende muito do fato de como a lista é passada. Por um lado,
ela pode estar ordenada, facilitando para alguns métodos, por outro, ela pode estar desordenada, deixando o método mais lento. Além disso, há também o caso de listas grandes ou
pequenas.

Para fins comparativos e de fácil visualização, abaixo há uma tabela de comparação de performance com dados baseados em testes realizados pelo website: 
https://www.devmedia.com.br/algoritmos-de-ordenacao-analise-e-comparacao/28261.

## **Listas Ordenadas**

### **Primeiro caso**:

- Lista ordenada em ordem crescente;
- Vetor de tamanho 100 (n = 100);

| Algoritmo | Tempo (ms)   |  Comparações  | Movimentações|
| ------------------- | ------------------- | ------------------- | ------------------- |
|  Bubble Sort | 0,0988 | 5050 |  0 | 
|  Selection Sort | 0,0602 | 4950 | 297 | 
|  Insertion Sort | 0,0038 | 	99 | 198 | 
|  Quick Sort |  0,0141 |  	606 | 189 |

***

### **Segundo caso**:

- Lista ordenada em ordem crescente;
- Vetor de tamanho 1000 (n = 1000);

| Algoritmo | Tempo (ms)   |  Comparações  | Movimentações|
| ------------------- | ------------------- | ------------------- | ------------------- |
|  Bubble Sort | 9,5415 |	500500 |  0 | 
|  Selection Sort | 5,4587 | 499500 |	29997 | 
|  Insertion Sort | 0,0359 | 9999 |	19998 | 
|  Quick Sort | 0,1602 | 125439 |	17712 |

***

## **Listas Desordenadas**

### **Primeiro caso**:

- Lista desordenada com números aleatórios;
- Vetor de tamanho 100 (n = 100);

| Algoritmo | Tempo (ms)   |  Comparações  | Movimentações|
| ------------------- | ------------------- | ------------------- | ------------------- |
|  Bubble Sort | 0,2045 | 5050 | 14850 | 
|  Selection Sort | 0,0750 | 4950 | 297 | 
|  Insertion Sort | 0,1173 | 99 | 5148 | 
|  Quick Sort | 0,0147 | 610 | 336 |

### **Segundo caso**:

- Lista desordenada com números aleatórios;
- Vetor de tamanho 1000 (n = 1000);

| Algoritmo | Tempo (ms)   |  Comparações  | Movimentações|
| ------------------- | ------------------- | ------------------- | ------------------- |
|  Bubble Sort | 20,3377 | 500500 | 1498500 | 
|  Selection Sort | 6,9038 | 499500 | 2997 | 
|  Insertion Sort | 11,4277 | 999 | 501498 | 
|  Quick Sort | 0,1622 | 9016 | 3030 |

***
# **Resultados**

### **Bubble Sort**:

Se mostrou ineficiente na maioria dos casos, apesar de que em listas ordenadas não houveram movimentações. Seu tempo e número de comparações são grandes em todos os casos.

### **Selection Sort**:

Apesar de não ser muito melhor que o `Bubble Sort` nas comparações realizadas acima, em listas ordenadas de forma decrescente, ele pode ser mais rápido que o `Insertion Sort`.
Dessa forma fica em segundo pior lugar em termos de performance geral.

### **Insertion Sort**:

Na primeira lista, se mostrou mais eficiente do que os outros algoritmos em termos de tempo e comparações realizadas. Em listas de ordem decrescente, foi pior que `Selection Sort`.
Na última lista, ficou quase empatado com o `Selection Sort`.

### **Insertion Sort**:

Sem dúvida o algoritmo mais eficiente nessas comparações, seu tempo de execução possui uma enorme diferença entre os outros, principalmente em lsitas desordenadas.

# **Considerações finais**

No geral, é possível dizer que o `Quick Sort` é o algoritmo de maior eficiência em basicamente todos os casos, apesar de sua implementação não for das mais fáceis ou de
não ser um algoritmo considerado estável. Mesmo assim, se o diferencial é baseado em performance, o `Quick Sort` fica na frente de todos os outros métodos comparados nessa lista.
