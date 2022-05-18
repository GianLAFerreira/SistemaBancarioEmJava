package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TesteLambdas {
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

        /**
         * ForEach com classe anonima
         */
        lista.forEach(new Consumer<Veiculo>() {
            @Override
            public void accept(Veiculo veiculo) {
                System.out.println(veiculo);
            }
        });
        System.out.println("------------");

        /**
         * Função lambda
         */
        lista.sort((Veiculo o1, Veiculo o2)                ->  o1.getModelo().compareTo(o2.getModelo())
        );

        /**
         * Classe anonima
         */
        Comparator<Veiculo> comp = (Veiculo o1, Veiculo o2)-> {
                return Double.compare(o1.getValor(), o2.getValor());
        };

        /**
         * forEach com Lambda
         */
        lista.forEach(System.out::println);
    }
}
