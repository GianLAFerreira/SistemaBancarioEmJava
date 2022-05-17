package com.company;
public abstract class Veiculo {

    private String modelo;
    private String placa;
    private int    ano;
    private double valor;

    /**
     * Não pode intsanciar, pois não existe um veiculo que que só é veiculo.
     * @param modelo
     * @param placa
     * @param ano
     * @param valor
     */

    public Veiculo(String modelo, String placa, int ano, double valor){
        this.modelo = modelo;
        this.placa  = placa;
        this.ano    = ano;
        this.valor  = valor;
    }

    public abstract double getConcerto();

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='"  + modelo + '\'' +
                ", placa='" + placa  + '\'' +
                ", ano="    + ano    +
                ", valor="  + valor  +
                '}';
    }
}
