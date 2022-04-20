package com.company;

public abstract class Veiculo {

    private String modelo;
    private String placa;
    private int    ano;

    public Veiculo(String modelo, String placa, int ano){
        this.modelo = modelo;
        this.placa  = placa;
        this.ano    = ano;
    }

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

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='"  + modelo + '\'' +
                ", placa='" + placa  + '\'' +
                ", ano="    + ano    +
                '}';
    }
}
