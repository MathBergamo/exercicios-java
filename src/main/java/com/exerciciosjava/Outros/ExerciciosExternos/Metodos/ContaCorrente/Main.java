package com.exerciciosjava.Outros.ExerciciosExternos.Metodos.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        System.out.println("BANCO TiTAN");

        conta.definirSaldoInicial(500);
        conta.depositar(200);
        conta.sacar(700);
        conta.sacar(10);
        conta.depositar(200);
        conta.sacar(156.22f);
        conta.sacar(43.78f);

        System.out.println("\nSEGUNDO PROCESSO");

        conta.definirSaldoInicial(1000);
        conta.sacar(500);
        conta.depositar(50);
        conta.sacar(600);
        System.out.println(conta.saldo);
    }
}
