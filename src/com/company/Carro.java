package com.company;

public class Carro {
    String tipo;
    String cor;
    String placa;
    int numPortas;
    Pessoa dona;

    public Carro() {
    }

    public Carro(String placa, String cor) {
        this.placa = placa;
        this.cor = cor;
    }

    public Carro(String tipo, String cor, String placa, int numPortas) {
        this.tipo = tipo;
        this.cor = cor;
        this.placa = placa;
        this.numPortas = numPortas;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public Pessoa getDona() {
        return dona;
    }

    public void setDona(Pessoa dona) {
        this.dona = dona;
    }

    public void ligar() {
        System.out.println("Carro ligado!!!");
    }

    public void desligar() {
        System.out.println("Carro desligado");
    }

    public int dobroPortas(){
        return numPortas * 2;
    }
}





