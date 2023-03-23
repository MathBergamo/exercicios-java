package com.exerciciosjava.StartCapgemini.POO.Exercicios.Ex11;

public class Main {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(100);
        IngressoVIP ingressoVIP = new IngressoVIP(ingresso.getValor());

        /*ingresso.setValor(120); Se esse valor for utilizado, o valor adicional do IngressoVIP não irá considerar.
        A alteração no valor só será realizada considerando o valor inicializado recebido pelo construtor na classe Ingresso*/

        System.out.println("--- VALORES DE INGRESSOS ---");
        System.out.println(ingresso.imprimeValor(ingresso.getValor()));
        System.out.println(ingresso.imprimeValor(ingressoVIP.valorVIP()));
    }
}
