package com.company;

public class Carro extends Veiculo {
    public Carro(String modelo, String placa, int ano, double valor){
        super(modelo, placa, ano, valor);
    }

    @Override
    public double getConcerto() {
        return 0;
    }
}
