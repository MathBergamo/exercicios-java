package com.exerciciosjava.Outros.PythonBrasil.ArraysUnidimensionais;

import java.util.ArrayList;
import java.util.Scanner;

/*
Faça um Programa que leia um vetor A com 10 números inteiros, calcule e mostre a soma dos quadrados dos elementos do vetor.
 */
public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> vetor = new ArrayList<>();

        int count = 0,soma = 0 ,n;
        double num;

        while (count < 10){
            System.out.println(1+count+"º Número:");
            n = scanner.nextInt();
            num = Math.pow(n, 2);
            soma += num;
            vetor.add(num);
            count++;
        }
        System.out.println(vetor);
        System.out.println(soma);
    }
}
