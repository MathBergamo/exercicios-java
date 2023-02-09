package com.exerciciosjava.Outros.PythonBrasil.ArraysUnidimensionais;

import java.util.ArrayList;
import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 5 números inteiros e mostre-os
 */
public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer>vetor = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            vetor.add(scanner.nextInt());
        }

        System.out.println(vetor);

        for (int numero: vetor) {
            System.out.println(numero);
        }
    }
}