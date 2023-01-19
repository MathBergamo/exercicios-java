package com.exerciciosjava.devdojo.Pratica;

public class Teste {
    public static void main(String[] args) {
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario > 3381;
        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorContaCorrente = 200;
        double valorContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorContaCorrente > valorPlaystation || valorContaPoupanca > valorPlaystation;
        System.out.println(isPlaystationCincoCompravel);
    }
}
