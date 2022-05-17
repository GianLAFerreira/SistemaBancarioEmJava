package com.company;

import java.util.ArrayList;

public class TesteArray {
    public static void main(String[] args) {
        ArrayList<Veiculo> lista = new ArrayList<Veiculo>();

        Veiculo carro = new Carro("Gol", "PIK469", 2000, 9000);
        lista.add(carro);
        Veiculo moto  = new Moto ("Biz", "KHJ658", 2020, 5000);
        lista.add(moto);


        System.out.println(lista.size());

        Object ref = (Veiculo) lista.get(0);

      //  System.out.println(ref);
        lista.remove(1);
        Veiculo carro2 = new Carro("Golf", "PIK1469", 20200, 90100);
        lista.add(carro2);
        Veiculo moto2  = new Moto ("Pop100", "KHJ658", 20320, 50300);
        lista.add(moto2);

        for (int i = 0; i < lista.size(); i++){

            System.out.println(lista.get(i));
        }
        /**
         * for simplificado
         */
        for (Veiculo obj : lista){
            System.out.println(obj);
        }
    }
}
