## Módulo: **[BE-JV-001]** Lógica de Programação I

### Aulas, Carga Horária e Duração

|          |2x na semana| 3x na semana|
|----------|:----------:|:-----------:|
|Aulas     |8           |9            |
|Carga     |24h         |27h          |
|Duração   |4 semanas   |3 semanas    |

## Sobre o Módulo

Neste módulo, espera-se que os alunos adquiram uma base sólida de lógica de programação, de modo a capacitá-los na resolução de problemas construindo algoritmos na linguagem Java. Além da parte técnica, desejamos desenvolver aspectos comportamentais dos alunos, como a autonomia (mediante pesquisas e desafios individuais), colaboração (mediante exercícios e projetos em grupo) e comunicação (encorajando a participação nas aulas).

## Planejamento:

Módulo: [BE-JV-001] Lógica de programação I

<table>
   <tr>
      <th>Objetivos</th>
      <th>Conteúdos</th>
      <th>Bibliografia</th>
      <th>Metodologia</th>
      <th>Avaliação</th>
      <th>Observações</th>
   </tr>
   <tr>
      <td>
         Compreensão básica e introdutória sobre o conceito de paradigmas de programação, orientação a objetos e história do Java<br /><br />
         Entendimento do funcionamento da JDK, realização da configuração do ambiente de desenvolvimento e construção do primeiro programa<br /><br />
         Entendimento do conceito de linguagem fortemente tipada<br /><br />
         Apropriação das técnicas e aplicação de convenções na criação de variáveis, constantes e enumeradores<br /><br />
         Apropriação das técnicas de aritmética computacional (operadores) e funções básicas e suas assinaturas<br /><br />
         Apropriação das técnicas de input e output das informações em console<br /><br />
         Entendimento de princípios e apropriação de técnicas para reaproveitamento e modularização de código<br /><br /> 
         Apropriação das técnicas de uso de condicionais e quebras de fluxos<br /><br />
         Apropriação das técnicas de uso de laços de repetição condicionais e numéricos<br /><br />
         Apropriação das técnicas de endereçamento de variáveis e constantes com múltiplos valores (vetores / matrizes)<br /><br />
         Apropriação das técnicas de uso de laços de repetição para percorrer vetores e matrizes<br /><br />
         Entendimento de segregação de responsabilidades e sua aplicação em programas estruturados<br /><br />
         Entendimento e apropriação de uso de softwares de versionamento (GIT) para desenvolvimento em times 
         <br/><br/>
      </td>
      <td>
         Paradigmas de Programação e breve conceituação de POO<br /><br />
         Breve história do Java<br /><br />
         JDK, JRE e JVM<br /><br />
         Tipos primitivos do Java<br /><br />
         Constantes e Variáveis (valores únicos) e sua relação com o conceito matemático<br /><br />
         Enumeradores e Estados<br /><br />
         Operadores e aritmética<br /><br />
         Entradas de valores em console utilizando Scanner<br /><br />
         Saídas e apresentação de valores em console utilizando print(), println() e printf()<br /><br />
         Funções simples e suas assinaturas<br /><br />
         Organização de código e segregação de responsabilidades em classes<br /><br />
         Condicionais: retornos true, false e tabela verdade<br /><br />
         Condicionais: if / else if / else<br /><br />
         Condicionais: if braceless<br /><br />
         Condicionais: if ternário<br /><br />
         Condicionais: operadores lógicos (&&, || e !)<br /><br />
         Estruturas de repetição: for<br /><br />
         Estruturas de repetição: while e do while<br /><br />
         Vetores e Matrizes (valores múltiplos) e sua relação com o conceito matemático<br /><br />
         Estruturas de repetição para percorrer vetores e matrizes<br /><br />
         Versionamento de código (Git)
      </td>
      <td>
         Links:<br /><br />
         Índice documentações Java: https://docs.oracle.com/en/java/javase/index.html<br /><br />
         Documentação Java 17: https://docs.oracle.com/en/java/javase/17/docs/api/index.html
      </td>
      <td>
         Listas de exercícios individuais<br/><br/>
         Estudos de Caso em duplas (mini-projeto)<br/><br/>
         Pesquisa individual na documentação<br/><br/>
      </td>
      <td>
         Listas de exercícios<br/><br/>
         Prova teórico-prática<br/><br/>
         Projeto<br/><br/>
         Participações e interações nas aulas
      </td>
      <td>
         Ao tratar de paradigmas de programação e orientação a objetos no início do módulo, a ideia é apenas contextualizar os alunos sobre o conceito de paradigma e mencionar que o Java é orientado a objetos, mas sem se aprofundar nestes assuntos<br /><br />
         Nesta fase, o foco é a construção de aplicações a serem executadas em console<br /><br /> 
         Pode-se optar por apresentar, além da classe Scanner e das funções print() / println() e printf (que são itens obrigatórios), JOptionPane para as entradas e saídas
      </td>
   </tr>
</table>

## Plano de aula:

<table>
   <tr>
      <th>Aula</th>
      <th>Problema Gerador</th>
      <th>Conceitos</th>
      <th>Metodologia</th>
   </tr>
   <tr>
      <td>Aula 1</td>
      <td>Configuração de ambiente e execução de primeiro programa</td>
      <td>
         Paradigmas de Programação e breve conceituação de POO<br /><br />
         Breve história do Java<br /><br />
         JDK, JRE e JVM<br /><br />
         Primeiro programa Java
      </td>
      <td>
         Estudo de caso:<br />
         Como baixar a JDK, configurar o JAVA_HOME e fazer o setup do IntelliJ?<br /><br />
         Expositiva:<br />
         Breve explicação sobre paradigmas de programação e orientação a objetos<br /><br />
         Breve explicação sobre a história do Java<br /><br />
         Download e instalação da JDK, configuração e exibição da variável JAVA_HOME<br /><br />
         Contextualização sobre o que é JDK, JRE e JVM<br /><br />
         Configuração do IntelliJ e criação do primeiro projeto<br /><br />
         Pesquisa individual:<br />
         Desobrir como escrever um "Hello World" em Java<br /><br />
         Prático:<br />
         Exercícios de fixação (JDK, JRE e JVM)
      </td>
   </tr>
   <tr>
      <td>Aula 2</td>
      <td>Médias e Médias Ponderadas</td>
      <td>
         Tipos primitivos do Java<br /><br />
         Constantes e Variáveis (valores únicos) e sua relação com o conceito matemático<br /><br />
         Operadores e aritmética
      </td>
      <td>
         Estudo de caso:<br />
         Como fazer um programa que calcule médias e médias ponderadas, de três notas a partir de valores que nós mesmos atribuímos no código?
         <br /><br />
         Expositiva:<br />
         Tipos primitivos, criação de variáveis, constantes e enumeradores, atribuição de valores e operadores aritméticos<br /><br />
         Pesquisa individual:<br />
         Descobrir na documentação / fóruns quais são os tipos primitivos de variáveis numéricas<br /><br />
         Prático:<br />
         Exercícios de fixação (Variáveis, Contantes e Operadores)
      </td>
   </tr>
   <tr>
      <td>Aula 3</td>
      <td>Médias e Médias Ponderadas (a partir da entrada do usuário)</td>
      <td>
         Entradas de valores em console utilizando Scanner<br /><br />
         Saídas e apresentação de valores em console utilizando print(), println() e printf()
      </td>
      <td>
         Estudo de Caso 1:<br />
         Como atribuir valores em variáveis a partir de um valor digitado pelo usuário em console?
         <br /><br />
         Estudo de Caso 2:<br />
         Quais são as diferentes formas que são possíveis de serem utilizadas para imprimir os valores em console?
         <br /><br />
         Expositiva:<br />
         Conceito e aplicação de Scanner e impressões utilizando print(), println() e printf()
         <br /><br />
         Prático:<br />
         Exercícios de fixação (Entradas e Saídas).
      </td>
   </tr>
   <tr>
      <td>
         Aula 4
      </td>
      <td>Organizando o código e segregando responsabilidades no projeto das Médias</td>
      <td>
         Funções simples e suas assinaturas<br /><br />
         Organização de código e segregação de responsabilidades em classes
      </td>
      <td>
         Estudo de Caso 1:<br />
         Como separar cada implementação do projeto que calcula as médias ponderadas?
         <br /><br />
         Estudo de Caso 2:<br />
         Como adicionar tipos de retorno nas funções e invoncá-las a partir do método main?
         <br /><br />
         Estudo de Caso 3:<br />
         Como segregar as responsabilidades em diferentes classes e packages?
         <br /><br />
         Expositiva:<br />
         Separar a lógica do programa para criar uma função que calcula a média, outra que lê os valores em console e outra que imprime os valores em console (a princípio, todas as funções podem ser estáticas. Criar os packages para os utilitários e para a classe principal.<br /><br />
         Prático:<br />
         Exercícios de fixação (funções simples e suas assinaturas, organização de código).
      </td>
   </tr>
   <tr>
      <td>
         Aula 5
      </td>
      <td>Médias que dizem "passou" ou "não passou"</td>
      <td>
         Condicionais: retornos true, false e tabela verdade<br /><br />
         Condicionais: if / else if / else<br /><br />
         Condicionais: if braceless<br /><br />
         Condicionais: if ternário<br /><br />
         Condicionais: operadores lógicos (&&, || e !)<br /><br />
         Enumeradores e Estados<br /><br />
         <br /><br />
      </td>
      <td>
         Estudo de Caso:<br />
         Como fazer um programa que calcule médias e diga se o aluno passou ou não a partir de uma nota de corte pré-estabelecida. E se adicionarmos presenças?
         <br /><br />
         Expositiva:<br />
         Operadores condicionais, Lógicos e Ternários<br /><br />
         Uso de enumerador para indicar se o aluno está APROVADO ou REPROVADO<br /><br />
         Pesquisa individual:<br />
         Pesquisar sobre o tipo boolean e conceito de true / false no Java<br /><br />
         Prático:<br />
         Exercícios de fixação (if/else e switch).
      </td>
   </tr>
   <tr>
      <td>
         Aula 6
      </td>
      <td>
         Jogo da adivinhação (responder até acertar o número sorteado)
         <br /><br />
         Criando um menu para o projeto das médias aritméticas
      </td>
      <td>
         Estruturas de repetição: while e do while<br /><br />
         <br /><br />
      </td>
      <td>
         Estudo de Caso 1:<br />
         Como fazer um programa que sorteia um número entre 1 e 100 e mantém o usuário respondendo até que ele acerte, provendo um feedback se o número chutado foi maior ou menor que o sorteado?
         <br /><br />
         Estudo de Caso 2:<br />
         Como criar um menu para o projeto das médias, de modo que o usuário digite se ele gostaria de cadastrar as notas, consultar se o aluno está APROVADO ou REPROVADO ou sair da aplicação
         <br /><br />
         Expositiva:<br />
         While e do while<br /><br />
         Pesquisa individual:<br />
         Quando usar o while e quando usar o do while?<br /><br />
         Prático:<br />
         Exercícios de fixação (while e do while).
      </td>
   </tr>
   <tr>
      <td>
         Aula 7
      </td>
      <td>
         Médias e Médias Ponderadas (usando listas)
      </td>
      <td>
         Vetores e Matrizes (valores múltiplos) e sua relação com o conceito matemático.<br /><br />
         Estruturas de repetição para percorrer vetores e matrizes<br /><br />
      </td>
      <td>
         Estudo de Caso 1:<br />
         Como calcular médias e médias ponderadas, de três notas a partir das entradas do usuário? Como percorrer essas notas para calcular a média?
         <br /><br />
         Estudo de Caso 2:<br />
         Como utilizar uma matriz para considerar que cada linha é um aluno que possui um conjunto de notas em suas colunas? Como percorrer essa matriz e calcular as médias?
         <br /><br />
         Expositiva:<br />
         Vetores e Matrizes<br /><br />
         Estrutura de repetição for
         Prático:<br />
         Exercícios de fixação (Vetores, Matrizes e for).
      </td>
   </tr>
   <tr>
      <td>
         Aula 8
      </td>
      <td>
         Como versionar meu código e subí-lo no Git?<br /><br />
      </td>
      <td>
         Introdução ao Versionamento de código (Git)
      </td>
      <td>
         Estudo de Caso 1:<br />
         Criar um repositório novo no Github e subir o código da versão final das médias.
         <br /><br />
         Estudo de Caso 2:<br />
         Clonar um projeto, realizar alguma manutenção e fazer o push no Github.
         <br /><br />
         Expositiva:<br />
         Conceito de versionamento<br /><br />
         Comandos git: config, init, status, add, commit, push, clone, restore, reset<br /><br />
         Pesquisa individual:<br />
         O que são branchs e como criar uma branch?<br /><br />
         Prático:<br />
         Exercícios de fixação (versionamento de código e git).
      </td>
   </tr>
   <tr>
      <td>Aula 9</td>
      <td colspan="3">Aula dedicada à devolutiva da avaliação por rubrica / auto-avaliação</td>
   </tr>
</table>

## Avaliação Por Rubricas:

As habilidades e competências a serem desenvolvidas no módulo **[BE-JV-001] Lógica de programação I** são as descritas a seguir:

- Setup de ambiente de desenvolvimento Java
- Compreensão sobre as funções da JDK, JRE e JVM
- Variáveis, Constantes, Operadores e Enums
- Estruturas de condição
- Estruturas de repetição
- Reutilização, modularização e organização de código
- Coleções de dados com Arrays e Matrizes
- Autonomia
- Colaboração
- Comunicação