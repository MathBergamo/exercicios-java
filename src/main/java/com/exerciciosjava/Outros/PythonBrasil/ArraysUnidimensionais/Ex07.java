package com.exerciciosjava.Outros.PythonBrasil.ArraysUnidimensionais;
/*
Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação e os números.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        int num, somaNum = 0, multiplicaNum = 1;

        for (int i = 0; i < 5; i++) {
            System.out.print(i+1+"º Número: ");
            num = scanner.nextInt();
            somaNum += num;
            multiplicaNum *= num;
            numeros.add(num);
        }

        System.out.println("Números: " + numeros);
        System.out.println("Soma : " + somaNum);
        System.out.println("Multiplicação: " + multiplicaNum);
    }
}