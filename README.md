# Udemy_enumeracoes

Enumerações

Em Java, uma enum é um tipo no qual declaramos um conjunto de valores constantes pré-definidos.
Por serem os campos de uma enum constantes, seus nomes são escritos em letras maiúsculas.
Ao utilizar enums limitamos os valores que podem ser atribuídos a uma variável.

Fontes: https://www.devmedia.com.br/enums-no-java/38764
https://www.devmedia.com.br/tipos-enum-no-java/25729

• É um tipo especial que serve para especificar de forma literal um conjunto de constantes relacionadas

• Palavra chave em Java: enum

• Vantagem: melhor semântica, código mais legível e auxiliado pelo 
compilador

Cada declaração enum declara uma classe enum com 
as seguintes restrições:
1. constantes enum são implicitamente final.
2. constantes enum são implicitamente static.
3. Qualquer tentativa de criar um objeto de um tipo enum com um operador new resulta em um erro de compilação.

Como classes, todos os tipos enum são tipos por referência.

Em uma declaração enum, é um erro de sintaxe declarar constantes enum após construtores, campos e métodos do tipo enum.
