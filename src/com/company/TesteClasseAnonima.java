package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteClasseAnonima {
    public static void main(String[] args) {

        Veiculo carro1 = new Carro("Gol",   "PIK469", 2000, 9000);
        Veiculo carro2 = new Carro("Golf",  "PIK469", 2000, 8000);
        Veiculo carro3 = new Carro("Corsa", "PIK469", 2000, 7000);
        Veiculo carro4 = new Carro("Honda", "PIK469", 2000, 6000);

        List<Veiculo> lista = new ArrayList<>();
        lista.add(carro1);
        lista.add(carro2);
        lista.add(carro3);
        lista.add(carro4);

        for (Veiculo obj: lista){
            System.out.println(obj);
        }
        System.out.println("------------");

        lista.sort(new Comparator<Veiculo>() {
            @Override
            public int compare(Veiculo o1, Veiculo o2){
                return o1.getModelo().compareTo(o2.getModelo());
            }}
        );

        Comparator comp = new Comparator<Veiculo>(){
            @Override
            public int compare(Veiculo o1, Veiculo o2) {
                return Double.compare(o1.getValor(), o2.getValor());
            }};

        for (Veiculo obj: lista){
            System.out.println(obj);
        }
    }
}