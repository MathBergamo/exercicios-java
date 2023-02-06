package com.exerciciosjava.Outros.PythonBrasil.EstruturaDeRepeticao;

import java.util.Scanner;

/*
A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,...
 Faça um programa capaz de gerar a série até o n−ésimo termo.
 */
public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num, num1 = 1, num2 = 0, proximo = 0;

        System.out.print("Quantas sequências do Fibonacci você quer?");
        num = scan.nextInt();
        System.out.println();
        for (int i = 0; i < num; i++) {
            System.out.println(proximo);
            proximo = num1 + num2;
            num1 = num2;
            num2 = proximo;
        }
    }
}
