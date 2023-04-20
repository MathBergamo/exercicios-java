package com.exerciciosjava.devdojo.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Levi1Eren2Mikasa3true4200";
        String[] nomes = texto.split("\\d");//Splitando por números

        for (String nome : nomes) {
            System.out.println(nome.trim());
        }

    }
}
