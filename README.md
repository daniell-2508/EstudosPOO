Estudos de Programação Orientada a Objetos em Java





Este repositório reúne meus estudos e exercícios de Programação Orientada a Objetos (POO) em Java, desenvolvidos durante minha formação em Engenharia de Software na PUC Minas.

O objetivo é registrar minha evolução na linguagem Java, praticar a criação de sistemas orientados a objetos e consolidar conceitos importantes para o desenvolvimento de software.

Conteúdos estudados:

-Classes e objetos;
-Atributos e métodos;
-Modificadores de acesso, especialmente private e public;
-Encapsulamento;
-Getters e setters;
-Construtores;
-Referências para objetos;
-Abstração;
-Coesão e acoplamento;
-Associação, agregação e composição;
-Multiplicidades em diagramas UML;
-Coleções com ArrayList;
-Estruturas de chave e valor com HashMap;
-Laços for-each para percorrer coleções;
-Comparação de textos com .equals();
-Organização das responsabilidades entre classes.
-Práticas desenvolvidas

Os exercícios deste repositório envolvem situações como:

criação de classes a partir de requisitos;

elaboração de diagramas de classes UML;

armazenamento de objetos em coleções;

adição e remoção de elementos;

pesquisa e verificação de objetos;

contagem de objetos que atendem a determinadas condições;

impressão de informações;

comunicação entre classes por meio de métodos públicos;

utilização de getters e setters sem acessar diretamente atributos privados.

Entre os exemplos desenvolvidos estão as classes Exercicio e Plano, usadas para gerenciar planos de treinamento, e as classes Aula e Trilha, utilizadas para organizar trilhas de estudo.

Estrutura do repositório

EstudosPOO/
└── AulaYTJava/
    └── src/
        ├── POO/
        ├── POO1/
        ├── POO2/
        ├── POO3/
        ├── POO4/
        ├── POO5/
        └── POO6/

Cada pacote contém exercícios utilizados para praticar e revisar diferentes conceitos de POO.

Exemplo de encapsulamento

public class Aula {

    private String titulo;
    private int tempo;
    private String dificuldade;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}

Os atributos permanecem privados e são acessados de maneira controlada por métodos públicos.

Exemplo com ArrayList

import java.util.ArrayList;

public class Trilha {

    private ArrayList<Aula> aulas = new ArrayList<>();

    public void adicionarAula(Aula aula) {
        aulas.add(aula);
    }

    public boolean verificarAula(Aula aula) {
        return aulas.contains(aula);
    }
}

Nesse exemplo, a própria classe Trilha controla sua coleção, preservando o encapsulamento.

Como executar

Clone o repositório:

git clone https://github.com/daniell-2508/EstudosPOO.git

Abra a pasta do projeto:

cd EstudosPOO/AulaYTJava

Abra o projeto no VS Code:

code .

Abra uma classe Main.java e utilize a opção Run Java.

Para executar manualmente o exercício do pacote POO6:

javac -d out src/POO6/Aula.java src/POO6/Trilha.java src/POO6/Main.java
java -cp out POO6.Main

Objetivos de aprendizagem

Compreender classes e objetos;

Aplicar encapsulamento;

Criar getters e setters;

Trabalhar com referências para objetos;

Utilizar ArrayList;

Percorrer coleções com for-each;

Modelar relacionamentos em UML;

Diferenciar associação, agregação e composição;

Entender coesão e acoplamento;

Aprofundar o uso de HashMap;

Estudar herança e polimorfismo;

Trabalhar com classes abstratas e interfaces;

Criar testes automatizados;

Aplicar os conceitos em projetos com Spring Boot.

Aprendizados importantes

Durante os exercícios, venho aprendendo que POO não significa apenas dividir o código em classes. É necessário definir corretamente a responsabilidade de cada classe, proteger os dados e permitir que os objetos colaborem sem criar dependências desnecessárias.

Este repositório será atualizado conforme eu avançar nos estudos e desenvolver novos exercícios.

Autor

Daniell Oliveira Cardoso
Estudante de Engenharia de Software na PUC Minas
