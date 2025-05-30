# Sistema de Controle de Pedágio 🚗💨

## Descrição do Projeto

Este projeto implementa um sistema simples em Java 21 para simular o controle de pagamentos em praças de pedágio. Ele calcula o valor do pedágio para diferentes tipos de veículos (Carro, Caminhão, Moto) com base em suas características específicas, como número de eixos para caminhões.

O sistema também rastreia o número total de veículos que passaram pelas praças e o montante total arrecadado, gerando um relatório consolidado ao final do processamento.

## Funcionalidades Principais

* Cálculo de pedágio individualizado para:
    * **Carro:** Valor base fixo.
    * **Caminhão:** Valor base mais um adicional por eixo.
    * **Moto:** Valor base fixo.
* Contabilização do número total de veículos processados.
* Contabilização do valor total arrecadado.
* Geração de um relatório resumido com os totais.
* Estrutura de código organizada com interfaces, classes e pacotes.

## Contexto Acadêmico

Este projeto foi desenvolvido como parte de uma atividade/trabalho prático para a disciplina de Organização e Abstração na Programação do curso de **Ciência da Computação**.

O objetivo principal foi aplicar conceitos de programação orientada a objetos, interfaces, classes, encapsulamento e manipulação de dados em Java.

## Tecnologias Utilizadas

* Java 21
* IDE (Ex: IntelliJ IDEA, VS Code)

## Como Executar (Exemplo Básico)

1.  Clone o repositório:
    ```bash
    git clone [URL_DO_SEU_REPOSITORIO_AQUI]
    ```
2.  Navegue até o diretório do projeto:
    ```bash
    cd [NOME_DA_PASTA_DO_PROJETO]
    ```
3.  Compile os arquivos Java (a partir do diretório `src`, por exemplo):
    ```bash
    javac br/com/pedagio/Main.java br/com/pedagio/relatorio/RelatorioPedagio.java br/com/pedagio/veiculos/*.java -d out
    ```
4.  Execute a classe principal (a partir do diretório raiz do projeto, se usou `-d out`):
    ```bash
    java -cp out br.com.pedagio.Main
    ```
    Ou, se compilou diretamente nos pacotes dentro de `src`:
    ```bash
    java br.com.pedagio.Main
    ```

## Colaboradores

* Gustavo Pan Machado da Silva - 1136850
* Daniel Machado Borges - 1135956 
* Felipe Molz - 1136074
 
---

*Este README foi gerado para auxiliar na documentação do projeto.*
