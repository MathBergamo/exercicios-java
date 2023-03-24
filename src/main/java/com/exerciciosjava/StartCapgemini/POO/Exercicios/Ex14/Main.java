package com.exerciciosjava.StartCapgemini.POO.Exercicios.Ex14;

public class Main {
    public static void main(String[] args) {
        Fatura fatura = new Fatura("1234","MousePad FF XII-2",5,500.20);

        System.out.println("Número:" + fatura.getNumero());
        System.out.println("Descrição:" + fatura.getDescricao());
        System.out.println("Quantidade:" + fatura.getQuantidadeCompradaDeUmItem());
        System.out.println("Preço: R$" + fatura.getPrecoPorItem());
        System.out.println("\nTotal da fatura:" + fatura.getTotalFatura());
    }
}
