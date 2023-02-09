package com.exerciciosjava.Outros.PythonBrasil.ArraysUnidimensionais;
/*
Faça um Programa que leia 20 números inteiros e armazene-os num vetor.
Armazene os números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> vetor = new ArrayList<Integer>();
        List<Integer> vetorPar = new ArrayList<Integer>();
        List<Integer> vetorImpar = new ArrayList<Integer>();
        int count = 0;

        while (count < 20){
            System.out.print("Digite um número: ");
            vetor.add(scanner.nextInt());

            if (vetor.get(count) % 2 == 0){
                vetorPar.add(vetor.get(count));
            }else{
                vetorImpar.add(vetor.get(count));
            }
            count++;
        }

        System.out.println("Vetor: " + vetor);
        System.out.println("Vetor Par: " + vetorPar);
        System.out.println("Vetor Impar: " + vetorImpar);
    }
}
