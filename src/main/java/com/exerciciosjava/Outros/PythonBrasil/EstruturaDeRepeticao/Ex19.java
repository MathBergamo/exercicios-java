package com.exerciciosjava.Outros.PythonBrasil.EstruturaDeRepeticao;

import java.util.Scanner;

/*
Faça um programa que, dado um conjunto de N números, determine o menor valor, o maior valor e a soma dos valores.
Ps: só pode ser aceito valores entre 0 e 1000
 */
public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, n = -1, maior = 0, menor = 0, soma = 0;

        while (n > 1000 || n < 0){
            System.out.print("Digite um valor entre 0 e 1000:");
            n = scanner.nextInt();
        }

        for (int i = 1; i < n+1; i++) {
            System.out.print(i + "º N: ");
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
        System.out.print("A media dos valores foi: " + soma/n);
    }
}
