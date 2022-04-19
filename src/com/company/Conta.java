package com.company;

public class Conta {
    private double saldo;
    private int    agencia;
    private int    numero;
    private Pessoa titular;
    private static int total;


    public Conta(int agencia, int numero){
        Conta.total++;
        this.agencia = agencia;
        this.numero  = numero;
        System.out.println("Criando a conta " + this.numero);
    }


    public void depositar(double valor){
        if (valor > 0 ){
            this.saldo += valor;
        }else{
            System.out.println("Valor de deposito não pode ser menor ou igual a 0");
            return;
        }
    }

    public boolean sacar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else{
        return false;
        }
    }
    public boolean transferir(double valor, Conta conta){
        if (this.saldo >= valor){
            this.saldo -=valor;
            conta.depositar(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public int getAgencia() {
        return this.agencia;
    }


    public Pessoa getTitular() {
        return this.titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}


