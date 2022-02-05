
# **Conceito**

O conceito de ordenação de dados é basicamente um conjunto de algoritmos ou métodos cujo objetivo é organizar e armazenar dados obedecendo uma determinada ordem. 
Do ponto da memória do computador, os algoritmos de ordenação podem ser classificados em: 

Ordenação Interna (quando os dados a serem ordenados estão na memória principal).
Ordenação Externa (quando os dados a serem ordenados necessitam de armazenamento em memória auxiliar como por exemplo o disco HD). 

Os métodos de ordenação mais conhecidos são:

- `Bubble Sort`
- `Selection Sort`
- `Insertion Sort`
- `Quick Sort`

***

### **Bubble Sort**
O `bubble sort` realiza múltiplas passagens por uma lista. Em cada passagem, ele compara o valor atual com o próximo da lista, 
fazendo a troca se for necessário, colocando o maior valor na sua posição correta. 
Em essência, cada item se desloca como uma “bolha” para a posição à qual pertence.

<img src="https://www.programmersought.com/images/132/c41b58503c110e2f6b425d5f2d91b04c.gif" width=50% height=50%>

***

### **Selection Sort**
O `selection sort` escolhe (daí o nome) o menor número de um vetor ou lista e joga ele para a primeira posição. 
Em seguida, ele repete o processo e escolhe o próximo número menor, repetindo isso até que a lista esteja ordenada.

<img src="https://www.programmersought.com/images/193/6587fa98c51ea1c4812112833ea19c79.gif" width=50% height=50%>

***

### **Insertion Sort**

O `insertion sort` escolhe um índice do array e verifica se o número na frente dele é maior, 
se for, então o número escolhido está na posição correta, e em tese, em um “subarray” ordenado. 
Logo, ele verifica se o número à sua frente e o próximo número estão corretos, fazendo a mudança se necessário. 
Se houver mudança, então esses dois números estão ordenados no “subarray”. Faz isso até que a lista esteja ordenada.

<img src="https://www.programmersought.com/images/987/21dd5e7dea202418de0b2a0e5ff4c9b3.gif" width=50% height=50%>

***

### **Quick Sort**

O método `quick sort` escolhe um número pivô e usa uma tática de divisão e conquista. 
É escolhido um número P, pivô, e a lista é separada em duas. 
Para a esquerda, todos elementos menores que P, e direita, todos maiores. 
Essas sub listas são ordenadas baseadas na posição do pivô, e então é feita quantas passagens necessárias até que a lista inteira esteja ordenada.

<img src="https://www.programmersought.com/images/264/01a23e68cbfdb1b088e355bcfde19300.gif" width=50% height=50%>





