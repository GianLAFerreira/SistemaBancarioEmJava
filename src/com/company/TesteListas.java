package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteListas{
    public static void main(String[] args) {

        Cursos curso1 = new Cursos("Java e Orientação a Objetos", 21);
        Cursos curso2 = new Cursos("SQL com PostgreSQL", 50);
        Cursos curso3 = new Cursos("Java moderno: tire proveito dos novos recursos do Java 8", 12);


        ArrayList<Cursos> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);

       // System.out.println(cursos);
       // cursos.remove(0);
       // System.out.println(aulas);
        /**
         * Ordena 2 poarametros
         */
        Collections.sort(cursos, Comparator.comparing(Cursos::getTempo));
        cursos.forEach(System.out::println);
    }


}
class Cursos implements Comparable <Cursos>{
    private String titulo;
    private int    tempo;


    public Cursos(String titulo, int tempo) {
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
    public int compareTo(Cursos o1) {
        return this.titulo.compareTo(o1.titulo);
    }
}