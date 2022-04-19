package com.company;

public class Main {

    public static void main(String[] args) {

 //    Conta conta1 = new Conta();
     Conta conta2 = new Conta(115,383899);
     Conta conta3 = new Conta(155,383849);
     Conta conta7 = new Conta(155,383849);

 //    conta1.depositar(1000);


     conta2.depositar(1);
     conta2.sacar(30);
     Pessoa pessoaTeste = new Pessoa();

     conta2.setTitular(pessoaTeste);
     pessoaTeste.setNome("Gian Lucas");
     System.out.println("Dono da conta:    " + conta2.getTitular().getNome());
     System.out.println("Saldo da conta:   " + conta2.getSaldo());
     System.out.println("Numero da conta:  " + conta2.getNumero());
     System.out.println("Agencia da conta: " + conta2.getAgencia());
     System.out.println("Total de contas:  " + Conta.getTotal());


/*
     if (conta1.transferir(200, conta2)){
         System.out.println("Transferencia concluida!");
     }else
     System.out.println("Saldo insuficiente");
*/
    }
}
