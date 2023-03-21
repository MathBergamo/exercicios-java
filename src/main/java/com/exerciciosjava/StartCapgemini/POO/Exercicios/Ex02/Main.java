package com.exerciciosjava.StartCapgemini.POO.Exercicios.Ex02;

import java.util.Scanner;

/*
Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos:
número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e
saque; no construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaCorrente conta1 = new ContaCorrente(0, "", 0f);
        boolean continuar = true;

        System.out.print("BEM-VINDO AO BANCO LIM\nQual seu nome?");
        conta1.setNomeCorrentista(scanner.next());

        System.out.print("Registre o número da conta: ");
        conta1.setNumeroConta(scanner.nextInt());

        System.out.format("Seu saldo atual é de: R$%.1f", conta1.getSaldo());

        while (continuar) {
            int decisao = 0;
            boolean saqueOuDeposito = true;

            while (saqueOuDeposito) {
                System.out.println("O que você deseja fazer?\n1- Saque\n2- Depósito\n3- Informações\n4- Alterar nome\n5- Finalizar");
                decisao = scanner.nextInt();
                if (decisao != 1 && decisao != 2 && decisao != 3 && decisao != 4 && decisao != 5) {
                    System.out.println("Digite uma opção válida!");
                } else {
                    saqueOuDeposito = false;
                }
            }

            switch (decisao) {
                case 1 -> {
                    System.out.println("Qual valor deseja sacar?");
                    conta1.saque(scanner.nextFloat());
                }
                case 2 -> {
                    System.out.println("Qual valor deseja depositar?");
                    conta1.deposito(scanner.nextFloat());
                }
                case 3 ->
                        System.out.format("Nome: %s\nConta: %d\nSaldo: R$%.1f\n", conta1.getNomeCorrentista(), conta1.getNumeroConta(), conta1.getSaldo());
                case 4 -> {
                    System.out.println("Qual nome deseja colocar?");
                    conta1.alterarNome(scanner.next());
                    System.out.println("Nome alterado com sucesso!");
                }
                case 5 -> {
                    System.out.println("Finlizando....");
                    continuar = false;
                }
            }
        }
    }
}
