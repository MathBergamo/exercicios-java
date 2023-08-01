package com.exerciciosjava.StartCapgemini.POO.Testes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa objetoPessoa = new Pessoa(80.0f,1.77f);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso da pessoa: ");
        objetoPessoa.setPeso(scanner.nextFloat());
        System.out.println("Digite a altura: ");
        objetoPessoa.setAltura(scanner.nextFloat());
    }
}
