package com.exerciciosjava.StartCapgemini.POO.Exercicios.Ex04;

public class Main {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(0,5,7,0);

        System.out.println("Inicializando o elevador!");

        elevador.Entra();
        elevador.Entra();
        elevador.Entra();
        elevador.Entra();
        elevador.Entra();
        elevador.Entra();
        elevador.Entra();
        elevador.Entra();

        elevador.Sobe();
        elevador.Sobe();
        elevador.Sobe();
        elevador.Sobe();
        elevador.Sobe();
        elevador.Sobe();

        elevador.Sai();
        elevador.Sai();
        elevador.Sai();
        elevador.Sai();
        elevador.Sai();
        elevador.Sai();
        elevador.Sai();
        elevador.Sai();

        elevador.Desce();
        elevador.Desce();
        elevador.Desce();
        elevador.Desce();
        elevador.Desce();
        elevador.Desce();
    }
}
