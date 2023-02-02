package com.exerciciosjava.Outros.PythonBrasil.EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("----------TABUADA----------");
        System.out.print("Digite um número:");
        num = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
