package com.exerciciosjava.StartCapgemini.POO.Exercicios.Ex11;

public class IngressoVIP extends Ingresso{

    public IngressoVIP(float valor) {
        super(valor);
    }

    public float valorVIP(){
        float valorAdicional = 100;
        return getValor() + valorAdicional;
    }
}
