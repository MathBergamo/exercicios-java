package com.exerciciosjava.Outros.PythonBrasil.EstruturaDeRepeticao;

import java.util.Scanner;

/*
Faça um programa que, dado um conjunto de N números, determine o menor valor, o maior valor e a soma dos valores.
 */
public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, num, soma = 0, menor = Integer.MIN_VALUE, maior = Integer.MAX_VALUE; // Verificar o funcionamento dos Integer posteriormente

        System.out.print("Quantos números quer digitar? ");
        n = scanner.nextInt();

        for (int i = 1; i < n+1; i++) {
            System.out.print(i+ "º N: ");
            num = scanner.nextInt();
            soma += num;
            if (i == 1){
                maior = num;
                menor = num;
            } else if (num > maior){
                maior = num;
            } else if (num < menor){
                menor = num;
            }
        }
        System.out.println("O maior valor foi " + maior);
        System.out.println("O menor valor foi " + menor);
        System.out.println("A soma dos valores foi: " + soma);
        System.out.println("A media dos valores foi: " + soma/n);

    }
}
