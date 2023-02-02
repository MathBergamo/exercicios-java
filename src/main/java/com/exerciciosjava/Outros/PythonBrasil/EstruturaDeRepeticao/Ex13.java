package com.exerciciosjava.Outros.PythonBrasil.EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0, expoente = 0, resultado = 1;

        System.out.print("Base: ");
        base = scanner.nextInt();

        System.out.print("Expoente: ");
        expoente = scanner.nextInt();

        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }
        System.out.print("Resultado: " + resultado);
    }
}
