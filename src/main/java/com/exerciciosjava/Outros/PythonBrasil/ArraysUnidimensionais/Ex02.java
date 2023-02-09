package com.exerciciosjava.Outros.PythonBrasil.ArraysUnidimensionais;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.
 */
public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Float>vetor = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            vetor.add(scanner.nextFloat());
        }

        Collections.reverse(vetor);
        System.out.println(vetor);
    }
}
