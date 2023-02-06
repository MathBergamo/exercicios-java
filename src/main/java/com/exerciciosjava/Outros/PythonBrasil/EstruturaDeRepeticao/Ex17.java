package com.exerciciosjava.Outros.PythonBrasil.EstruturaDeRepeticao;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 Ex.: 5!=5.4.3.2.1=120
 */
public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, resultado;
        System.out.println("----- FATORIAL -----");
        System.out.print("Diga um número:");
        num = scanner.nextInt();

        System.out.print(num+"! = ");
        for (int i = num; i > 1; i--) {
            num *= (i-1);
        }
        System.out.print(num);
    }
}
