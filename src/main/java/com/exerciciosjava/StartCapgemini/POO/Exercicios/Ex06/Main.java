package com.exerciciosjava.StartCapgemini.POO.Exercicios.Ex06;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(102,"Mouse RGB POWER 3000",2,137.50f);

        System.out.println("INVOICE: Produtos de informática");
        System.out.println("FATURA");
        System.out.println("Descrição do produto: " + invoice.getDescricao());
        System.out.println("Número: " + invoice.getNumero());
        System.out.println("Quantidade: " + invoice.getQuantidadeComprada());
        System.out.println("Preço unitário: R$" + invoice.getPreco());

        System.out.println("\nPREÇO FINAL: R$" + invoice.getInvoiceAmount());
    }
}
