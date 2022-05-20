package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteSets {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Gian");
        alunos.add("Lucas");
        alunos.add("Alves");
        alunos.add("Ferreira");

        alunos.forEach(System.out::println);

        List<String> alunosList = new ArrayList<>(alunos);
        System.out.println(alunosList.get(3));
    }
}
