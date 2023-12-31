# Arquitetura do projeto

## :earth_americas: Pacotes instalados no projeto

+ Jackson Databind --
+
+
+
+
+
+
+

## Interface CommandLineRunner

A interface CommandLineRunner é um recurso poderoso dentro do universo do Spring Framework, amplamente utilizado no
desenvolvimento de aplicações Java. Ela permite que executemos alguma ação logo após a inicialização de nossa aplicação.
Pode ser muito útil, por exemplo, se quisermos carregar alguns dados em nosso banco de dados logo na inicialização de
nossa aplicação.

A interface CommandLineRunner representa uma tarefa a ser executada após a inicialização do Spring Boot, ou seja,
permite definir código para ser executado automaticamente quando o aplicativo é iniciado.

## Por que devemos desserializar os dados para uma classe java?

A desserialização de dados para uma classe Java é importante porque permite que os dados sejam convertidos de um formato
externo, como JSON, XML ou binário, de volta para um formato interno que possa ser manipulado e utilizado dentro do
código Java. Isso é útil quando precisamos recuperar dados armazenados ou receber dados de uma fonte externa, como uma
API. A desserialização permite que os dados sejam transformados em objetos Java, facilitando o acesso e a manipulação
desses dados em nosso código.

Essa resposta te ajudou?
Ícone do polegar para cima, indicando que a resposta te ajudou
Sim
Ícone do polegar para baixo, indicando que a resposta não te ajudou
Não muito

## Notação @JsonIgnoreProperties

O @JsonIgnoreProperties é uma anotação fornecida pela biblioteca Jackson utilizada para ignorar propriedades
desconhecidas durante a desserialização de um objeto JSON. Ela permite que você especifique quais propriedades devem ser
ignoradas ao converter o JSON em um objeto Java. Isso é útil quando você tem um JSON com propriedades adicionais que não
estão presentes na classe Java correspondente.

## "method reference"

O "::" é uma sintaxe especial em Java chamada de "method reference" que permite referenciar um método existente. No
caso, estamos referenciando o método println da classe System.

Ele é dividido em três partes:

+ Seu tipo (nome da classe)
+ Seu delimitador (::)
+ Referência ao método

````
carroList.stream().filter(c -> c.getAno() > 2000)
                .forEach(Carro::getPreco);// usando a referência ao método
````

## Constantes

As constantes desempenham um papel importante na programação, permitindo que valores fixos e imutáveis sejam armazenados
e utilizados ao longo do código. Elas são especialmente úteis quando temos valores que não devem ser alterados durante a
execução do programa.

Ao declarar uma constante, é importante seguir algumas boas práticas. A nomenclatura das constantes deve ser clara e
descritiva, utilizando letras maiúsculas e separando as palavras por underscore (_), seguindo o padrão conhecido como "
snake_case". Isso torna o código mais legível e compreensível para outros desenvolvedores.

Em Java, podemos declarar uma constante utilizando a palavra-chave ``final``.

**Exemplo:**

````
final String ENDERECO = "https://www.omdbapi.com/?t="

````

## Qual a diferença de um array para uma lista?

Um array é uma estrutura de dados fixa que armazena um conjunto de elementos do mesmo tipo, com um tamanho pré-definido.
Os elementos do array são acessados por meio de um índice numérico.

Uma lista, por outro lado, é uma estrutura de dados dinâmica que pode armazenar elementos de qualquer tipo e seu tamanho
pode ser alterado durante a execução do programa. Os elementos da lista são acessados por meio de métodos, como get() e
set(), e não por índices numéricos.

A principal diferença entre um array e uma lista é que um array tem tamanho fixo e requer um novo array para ser
redimensionado, enquanto uma lista pode crescer ou diminuir dinamicamente, sem a necessidade de criar uma nova estrutura
de dados.

Além disso, as listas oferecem uma variedade de métodos e funcionalidades adicionais, como adicionar, remover, pesquisar
e ordenar elementos, que facilitam a manipulação e o processamento dos dados armazenados.

## stream() o que é?

No contexto do Java, um Stream é uma sequência de elementos que pode ser processada de forma encadeada. Ele permite
realizar operações em coleções de dados de maneira mais eficiente e concisa.

Um Stream é uma abstração que representa uma sequência de elementos e permite realizar operações sobre esses elementos.
Essas operações podem ser divididas em duas categorias:

+ 1 - Operações intermediárias: são operações que retornam um novo Stream. Elas podem ser encadeadas em sequência e
  permitem
  filtrar, mapear, ordenar, limitar, entre outras transformações nos elementos do Stream.

+ 2 - Operações terminais: são operações que encerram o processamento do Stream e retornam um resultado final, como um
  valor
  único, uma lista, um conjunto, ou até mesmo uma ação de saída. Exemplos de operações terminais
  são ``forEach``, ``collect``,
  ``count``, ``min``, ``max``, entre outras.

## Classe wrapper

A classe wrapper é uma classe que encapsula um tipo primitivo em um objeto. Ela fornece métodos e funcionalidades
adicionais para trabalhar com esse tipo de dado. Por exemplo, a classe Integer é um wrapper para o tipo primitivo int.
Ela permite realizar operações como conversão de tipos, comparação e manipulação de valores inteiros de forma mais
conveniente.

## Utilizando um container de dados - Explorando o Optional

A programação Java usa Containers para armazenar, acessar e manipular dados. Um exemplo particularmente útil é o
Optional - um container especial que pode conter ou não um valor.

O Optional é um único valor de container introduzido no Java 8. Ele pode conter um valor único ou nenhum valor. O
principal uso do Optional é fornecer um tipo de retorno alternativo quando um método pode não retornar um valor.

Usar null é uma prática comum, mas pode levar a erros como NullPointerException. O Optional ajuda a evitar esses erros
fornecendo uma maneira mais segura de lidar com valores que podem ou não estar presentes.

## O que é um mapa em java?

Em Java, um mapa é uma estrutura de dados que associa chaves a valores. Ele permite armazenar e recuperar informações
com base em uma chave específica. No contexto do código apresentado, o mapa é utilizado para associar cada temporada de
uma série com a média de avaliação correspondente. Isso permite que as avaliações por temporada sejam facilmente
acessadas e exibidas no aplicativo.

## Operações com streams

### Intermediárias:

- distinct
- filter
- map
- peek
- sorted
- skip

### Short Circuit

- limit
- skip

### Terminais

- toArray
- collect
- count
- reduce
- forEach
- forEachOrdered
- min
- max
- anyMatch
- allMatch
- noneMatch
- findAny
- findFirst
 
## Diferença entre Collection e List

![collection_vs_list.png](collection_vs_list.png)

## Divisão de uma assinatura de um método

![assinaturaMetodo.png](assinaturaMetodo.png)