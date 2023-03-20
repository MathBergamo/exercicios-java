package com.exerciciosjava.StartCapgemini.POO.Exercicios.Ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seus dados");

        System.out.println("Nome: ");
        pessoa1.setNome(scanner.next());

        System.out.println("Ano de nascimento: ");
        pessoa1.setDataNascimento(scanner.nextInt());

        System.out.println("Altura: ");
        pessoa1.setAltura(scanner.nextFloat());

        pessoa1.calcularIdade();
        pessoa1.imprimirDados();
    }
}
