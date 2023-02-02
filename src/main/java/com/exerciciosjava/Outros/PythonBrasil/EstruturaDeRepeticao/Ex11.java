package com.exerciciosjava.Outros.PythonBrasil.EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0, soma = 0;

        System.out.print("Número iniciante: ");
        num1 = scanner.nextInt();

        System.out.print("Número final: ");
        num2 = scanner.nextInt();

        if (num1 < num2){
            for (int i = num1+1; i < num2; i++) {
                soma += i;
                System.out.println(i);
            }
        } else if (num1 > num2) {
            for (int i = num1-1; i > num2; i--) {
                System.out.println(i);
                soma += i;
            }
        }
        System.out.print("A soma do interalo dos números é: "+ soma);
    }
}
