
# **Conceito**

Árvores binárias são nada mais que `estrutura de dados hierárquicos`, utilizadas para facilitar a busca de dados. 
Essas árvores são formadas de `nós`, em que os valores da subárvore à esquerda da raiz são menores que o nó, e os à direita, maiores.

- Vale notar que um nó pode segurar qualquer tipo de valor.

<img src="https://tutswiki.com/images/DSA/N-ary%20tree.png?width=30pc" width=50% height=50%>

***

### **Raíz**
A raiz da árvore pode ser considerada um nó especial, pois é a partir dela que podemos ter um ponto de referência para acessar os demais nós da árvore.
A raiz na figura exemplificada acima está denominada como `Root`, mas também poderia ser qualquer valor, como 1, 56, 90, etc.

***

### **Nós**
Os nós de uma árvore, como exemplo o `A`, `B` e `C` entre os demais, possuem graus que vão de 0 a 2. Esse grau é determinado pelo número de filhos que um nó possui. 
Por exemplo, o nó `A` tem grau 0 (folha), enquanto o `B` possui grau 2. Quando todos nós são de grau 2, então se tem uma `árvore completa`.

***

### **Sucessor e predecessor**

Cada elemento de uma árvore possui um `predecessor` e um `sucessor`. 
Basicamente, seu sucessor é o `menor número superior` ao elemento, e o predecessor é o `maior número inferior` ao elemento.

***

### **Altura**

A altura de uma árvore é baseada no `máximo nível de nós`. No exemplo anteriormente citado, a árvore tem uma altura 3.

***
# **Balanceada e não balanceada**

Os conceitos anteriormente discutidos são os básicos de uma árvore binária. A partir disso, é possível começar a classificar árvores binárias em `balanceada` e `não balanceada`.

## **Balanceada**

O conceito de uma árvore `binária balanceada` é simples: para todo nó da árvore, os números de nós das suas duas subárvores diferem no máximo em um.
Isso permite com que a árvore seja percorrida de maneira rápida e eficiente através de equações matemáticas, mesmo que a quantia de dados seja na casa dos milhares.


<img src="https://tutswiki.com/images/DSA/BST_2.png?width=30pc" width=50% height=50%>


## **Não Balanceada**

O conceito de uma árvore ` binária  não balanceada` é simples: para todo nó da árvore, os números de nós das suas duas subárvores diferem mais do que um.

Em termos práticos, não existe a necessidade de utilizar uma árvore não balanceada ao invés de uma balanceada, pois seria similar ao utilizar uma lista encadeada.

<img src="https://i.stack.imgur.com/W0Ldv.png" width=50% height=50%>

***

# **Performance**

A diferença entre a performance de uma árvore binária balanceada e não balanceada está relacionado à fórmulas matemáticas semelhantes as vistas em `algoritmos de ordenação`.
Issos e dá pelo fato que uma árvore binária é bem semelhante no quesito de ordenar e buscar os dados.

Em listas pequenas, a diferença entre as duas árvores e seu desempenho não é grande, mas quando existem milhares de nós, a diferença começa a ser grande.
Em uma lista balanceada, a complexidade de busca de dados é determinada pela fórmula` O(log(n))`, e em uma desbalanceada, `O(n)`.

Isso significa que em uma árvore desbalanceada, a complexidade, e consequentemente a performance, é similar ao de uma `lista encadeada`. Isso se dá ao fato
que uma árvore desbalanceada precisa percorrer todos os seus nós, até o último, para encontrar o valor necessário.

Do contrário, uma árvore balanceada não precisa percorrer todos seus nós até encontrar o valor necessário, pois como seus valores estão divididos em nós balanceados,
não há necessidade de percorrer toda ela, já que cada nó "indica" qual será seu `sucessor`, e a partir disso, se torna mais eficiente em procurar o valor. Em termos simples de programação,
seriam vários `"ifs"` dizendo aonde que é preciso buscar esse valor.

***

# **Usos práticos**

- Árvore de pesquisa binária: Usada em muitos aplicativos de pesquisa em que os dados estão constantemente entrando / saindo, como os objetos maps e sets bibliotecas de vários idiomas.
- Partição de espaço binário: Usada em quase todos os videogames 3D para determinar quais objetos precisam ser renderizados.
- Tentativas binárias: Usado em quase todos os roteadores de alta largura de banda para armazenar tabelas de roteadores.
- Árvores de hash: Usadas em programas p2p e assinaturas de imagem especializadas nas quais um hash precisa ser verificado, mas o arquivo inteiro não está disponível.
- Heaps: Usado na implementação de filas prioritárias eficientes, que por sua vez são usadas para agendar processos em muitos sistemas operacionais, qualidade de serviço em roteadores, entre outros.
- Árvore de codificação Huffman ( Chip Uni ): Usada em algoritmos de compactação, como os usados nos formatos de arquivo .jpeg e .mp3.
- Árvores GGM: Usado em aplicativos criptográficos para gerar uma árvore de números pseudo-aleatórios.
- Árvore de sintaxe: Construída por compiladores e calculadoras para analisar expressões.
- Árvore T: Embora a maioria dos bancos de dados use alguma forma de árvore B para armazenar dados na unidade, os bancos de dados que mantêm todos (a maioria) seus dados na memória geralmente usam árvores T para fazer isso












