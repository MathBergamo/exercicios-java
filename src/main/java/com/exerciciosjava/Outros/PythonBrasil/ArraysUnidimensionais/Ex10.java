package com.exerciciosjava.Outros.PythonBrasil.ArraysUnidimensionais;

import java.util.ArrayList;
import java.util.Scanner;

/*
Faça um Programa que leia dois vetores com 10 elementos cada.
Gere um terceiro vetor de 20 elementos, cujos valores deverão ser compostos pelos elementos intercalados dos dois outros vetores.
 */
public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> vetorA = new ArrayList<>(10);
        ArrayList<Integer> vetorB = new ArrayList<>(10);
        ArrayList<Integer> vetorC = new ArrayList<>(20);

        int num = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("VetorA: ");
            num = scanner.nextInt();
            vetorA.add(num);
            vetorC.add(num);

            System.out.print("VetorB: ");
            num = scanner.nextInt();
            vetorB.add(num);
            vetorC.add(num);
        }
        System.out.println(vetorA);
        System.out.println(vetorB);
        System.out.print(vetorC);
    }
}
