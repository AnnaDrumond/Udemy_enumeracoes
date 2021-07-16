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

Como classes, todos os tipos enum são tipos por referência.

Em uma declaração enum, é um erro de sintaxe declarar constantes enum após construtores, campos e métodos do tipo enum.

As instâncias dos tipos enum são criadas e nomeadas junto com a declaração da classe, sendo fixas e imutáveis (o valor é fixo).;
Não é permitido criar novas instâncias com a palavra chave new;
O construtor é declarado private, embora não precise de modificador private explícito;

Seguindo a convenção, por serem objetos constantes e imutáveis (static final), os nomes declarados recebem todas as letras em MAIÚSCULAS;
As instâncias dos tipos enum devem obrigatoriamente ter apenas um nome;
Opcionalmente, a declaração da classe pode incluir variáveis de instância, construtor, métodos de instância, de classe, etc.
