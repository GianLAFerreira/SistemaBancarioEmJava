package com.company;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {

        Veiculo carro1 = new Carro("Gol",   "PIK469", 2000, 9000);
        Veiculo carro2 = new Carro("Golf",  "PIK469", 2000, 9000);
        Veiculo carro3 = new Carro("Corsa", "PIK469", 2000, 9000);
        Veiculo carro4 = new Carro("Honda", "PIK469", 2000, 9000);

        List<Veiculo> lista = new ArrayList<>();
        lista.add(carro1);
        lista.add(carro2);
        lista.add(carro3);
        lista.add(carro4);

        lista.sort();
    }
}
