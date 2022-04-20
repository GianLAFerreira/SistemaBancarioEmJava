package com.company;

public class Main {

    public static void main(String[] args) {

     //Funcionario paulao = new Funcionario();
     Funcionario carlos = new Gerente();

     carlos.setNome("Carlos gerente");
     carlos.setCPF("056.967.319-45");
     carlos.setSalario(1000);

     System.out.println(carlos.toString());


     Moto moto   = new Moto("CG", "ZIK2516", 2015, 300);
     moto.setAno(2016);

     Carro carro = new Carro("Gol", "PIK469", 2000, 1000);
     carro.setModelo("Corsa");

     System.out.println(moto.toString());
     System.out.println(carro.toString());

     Concerto valor = new Concerto();
     valor.somaConcerto(moto);
     System.out.println(valor.getSoma());

    }
}
