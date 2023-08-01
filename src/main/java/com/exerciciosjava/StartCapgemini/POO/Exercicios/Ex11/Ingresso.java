package com.exerciciosjava.StartCapgemini.POO.Exercicios.Ex11;

public class Ingresso {
    private float valor;

    public Ingresso(float valor) {
        this.valor = valor;
    }

    public String imprimeValor(float valor){
        return "Valor do ingresso: R$" + valor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
