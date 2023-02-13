package com.exerciciosjava.Outros.PythonBrasil.ArraysMultidimensionais;
/*
Jogo da velha
 */
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] jogoDaVelha = new String[3][3];

        System.out.println("JOGO DA VELHA!");

        for (int i = 0; i < jogoDaVelha.length; i++) {
            for (int j = 0; j < jogoDaVelha[i].length; j++) {
                System.out.print("Digite a linha: ");
                int linha = scanner.nextInt();

                System.out.print("Digite a coluna: ");
                int coluna = scanner.nextInt();

                if (jogoDaVelha[linha][coluna ] != null){
                    System.out.println("Local já preenchido!");
                    for (String[] linhas: jogoDaVelha) {
                        for (String colunas: linhas) {
                            System.out.print("["+colunas + "] ");
                        }
                        System.out.println();
                    }
                }else {
                    jogoDaVelha[linha][coluna] = "x";
                }
            }
        }
    }
}
