package com.company;

import java.util.*;

public class TesteSets {
    private String nome;
    private int numeroMatricula;

    public TesteSets(String nome, int numeroMatricula) {
        if (nome == null){
            throw new NullPointerException("Nome não pode ser null");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public String toString() {
        return "TesteSets{" +
                "Nome= '" + nome + '\'' +
                ", Numero da Matricula= " + numeroMatricula +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        TesteSets obj1 = (TesteSets) o;
        return this.nome.equals(obj1.nome);
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }
}
class CursoComAluno{
    public static void main(String[] args) {
        Curso javaColecoes  = new Curso("Collections", "Paulo Silveira");
        javaColecoes.adiciona(new Aulas("Java e Orientação a Objetos", 21));
        javaColecoes.adiciona(new Aulas("SQL com PostgreSQL", 50));
        javaColecoes.adiciona(new Aulas("Java moderno: tire proveito dos novos recursos do Java 8", 12));

        TesteSets aluno1 = new TesteSets("Rodrigo", 345544);
        TesteSets aluno2 = new TesteSets("Carluxo", 444472);
        TesteSets aluno3 = new TesteSets("Vini Jr", 782327);
        javaColecoes.matricula(aluno1);
        javaColecoes.matricula(aluno2);
        javaColecoes.matricula(aluno3);

        System.out.println("Alunos matriculados");
        javaColecoes.getAlunos().forEach(System.out::println);



        TesteSets rodrigola = new TesteSets("Rodrigo", 345544);
        System.out.println(javaColecoes.estaMatriculado(rodrigola));
        System.out.println(aluno1.equals(rodrigola));
    }
}
