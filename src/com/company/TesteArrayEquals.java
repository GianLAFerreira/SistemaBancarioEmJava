package com.company;

import java.util.ArrayList;

public class TesteArrayEquals {
    public static void main(String[] args) {
        ArrayList<Veiculo> lista = new ArrayList<Veiculo>();

        Veiculo carro = new Carro("Gol", "PIK469", 2000, 9000);
        lista.add(carro);
        Veiculo moto  = new Moto ("Biz", "KHJ658", 2020, 5000);
        lista.add(moto);

        
        for (Veiculo obj : lista){
            System.out.println(obj);
        }
    }
}
