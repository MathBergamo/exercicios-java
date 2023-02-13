package com.exerciciosjava.Outros.PythonBrasil.ArraysMultidimensionais;

import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {

        Random random = new Random();
        int maiorLinha5 = 0, menorLinha5 = 0, maiorColuna7 = 0, menorColuna7 = 0;

        int[][] matriz = new int[10][10];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10);
                if (i == 5 && j == 0){
                    maiorLinha5 = matriz[i][j];
                    menorLinha5 = matriz[i][j];
                }
                if (i == 5 && matriz[i][j] > maiorLinha5){
                    maiorLinha5 = matriz[i][j];
                }else if(i == 5 && matriz[i][j] < menorLinha5){
                    menorLinha5 = matriz[i][j];
                }

                if (j == 7 && i == 0){
                    maiorColuna7 = matriz[i][j];
                    menorColuna7 = matriz[i][j];
                }
                if (j == 7 && matriz[i][j] > maiorColuna7){
                    maiorColuna7 = matriz[i][j];
                }else if(j == 7 && matriz[i][j] < menorColuna7){
                    menorColuna7 = matriz[i][j];
                }
        }
    }
        System.out.println("MATRIZ");
        for (int[] linha : matriz) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");

            }
            System.out.println();
        }

        System.out.println("Linha 5");
        System.out.println("Maior número: " + maiorLinha5);
        System.out.println("Menor número: " + menorLinha5);

        System.out.println();

        System.out.println("Coluna 7");
        System.out.println("Maior número: " + maiorColuna7);
        System.out.println("Menor número: " + menorColuna7);

}
}
