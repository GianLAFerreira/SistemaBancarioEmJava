package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteListas{
    public static void main(String[] args) {

        Aulas curso1 = new Aulas("Java e Orientação a Objetos", 21);
        Aulas curso2 = new Aulas("SQL com PostgreSQL", 50);
        Aulas curso3 = new Aulas("Java moderno: tire proveito dos novos recursos do Java 8", 12);

        Curso javaColecoes = new Curso("Collections", "Paulo Silveira");
        javaColecoes.adiciona(new Aulas("Aula de sexo", 1));
        System.out.println(javaColecoes.getAulas());


        ArrayList<Aulas> aulas = new ArrayList<>();
        aulas.add(curso1);
        aulas.add(curso2);
        aulas.add(curso3);

       // System.out.println(aulas);
       // aulas.remove(0);
       // System.out.println(aulas);
        /**
         * Ordena 2 poarametros
         */
        Collections.sort(aulas, Comparator.comparing(Aulas::getTempo));
        aulas.forEach(System.out::println);
    }


}
class Aulas implements Comparable <Aulas>{
    private String titulo;
    private int    tempo;


    public Aulas(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo  = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return "Curso: " +
                "titulo= " + titulo +
                ", tempo= " + tempo;
    }

    @Override
    public int compareTo(Aulas o1) {
        return this.titulo.compareTo(o1.titulo);
    }
}
class Curso{
    private String nome;
    private String instrutor;
    private List<Aulas> aulas = new ArrayList<Aulas>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return this.nome;
    }

    public String getInstrutor() {
        return this.instrutor;
    }

    public List<Aulas> getAulas() {
        return Collections.unmodifiableList(aulas);
    }
    public void adiciona(Aulas aula){
        this.aulas.add(aula);
    }
}