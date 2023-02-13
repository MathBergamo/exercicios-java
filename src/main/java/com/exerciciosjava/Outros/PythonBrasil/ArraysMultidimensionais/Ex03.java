package com.exerciciosjava.Outros.PythonBrasil.ArraysMultidimensionais;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int pares = 0, impares = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Valor " + i + j + ": ");
                matriz[i][j] = scanner.nextInt();

                if (matriz[i][j] % 2 == 0){
                    pares++;
                }else if (matriz[i][j] % 2 == 1){
                    impares++;
                }
            }
        }

        System.out.println("--Matriz--");
        for (int[] linha: matriz) {
            for (int coluna: linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

        System.out.println("Números pares: " + pares);
        System.out.println("Números impares: " + impares);
    }
}
