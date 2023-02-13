package com.exerciciosjava.Outros.PythonBrasil.ArraysMultidimensionais;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ex01 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] arrayMult = new int[4][4];
        int maior = 0, linha = 0, coluna = 0;

        for (int i = 0; i < arrayMult.length; i++) {
            for (int j = 0; j < arrayMult[i].length; j++) {
                arrayMult[i][j] = random.nextInt(10);
                if (arrayMult[i][j] > maior) {
                    maior = arrayMult[i][j];
                    linha = i+1;
                    coluna = j+1;
                }
            }
        }
        System.out.println("MATRIZ");
        for (int[] linhaMatriz : arrayMult) {
            for (int colunaMatriz : linhaMatriz) {
                System.out.print(colunaMatriz + " ");

            }
            System.out.println();
        }
        System.out.println("O maior número da matriz é: " + maior);
        System.out.println("Linha: " + linha);
        System.out.println("Coluna: " + coluna);
    }
}
