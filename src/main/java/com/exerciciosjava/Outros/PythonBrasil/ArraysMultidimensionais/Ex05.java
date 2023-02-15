package com.exerciciosjava.Outros.PythonBrasil.ArraysMultidimensionais;
/*
Jogo da velha
 */
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] jogoDaVelha = new char[3][3];

        System.out.println("JOGO DA VELHA!");
        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        int jogada = 1, linha = 0, coluna = 0;
        char sinal;

        while (!ganhou) {
            if (jogada % 2 == 1) {
                System.out.println("Jogador 1");
                System.out.println("Escolha a linha e coluna (0 - 2)");
                sinal = 'X';
            } else {
                System.out.println("Jogador 2");
                System.out.println("Escolha a linha e coluna (0 - 2)");
                sinal = 'O';
            }

            boolean linhaValida = false;
            while (!linhaValida) {
                System.out.println("Entre com a linha (0, 1 ou 2)");
                linha = scanner.nextInt();
                if (linha >= 0 && linha <= 2) {
                    linhaValida = true;
                } else {
                    System.out.println("Entrada inválida, tente novamente");
                }
            }
            boolean colunaValida = false;
            while (!colunaValida) {
                System.out.println("Entre com a coluna(0, 1 ou 2)");
                coluna = scanner.nextInt();
                if (coluna >= 0 && coluna <= 2) {
                    colunaValida = true;
                } else {
                    System.out.println("Entrada inválida, tente novamente");
                }
            }

            if (jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O') {
                System.out.println("Posição já preenchida, tente novamente.");
            } else {
                jogoDaVelha[linha][coluna] = sinal;
                jogada++;
            }

            for (int i = 0; i < jogoDaVelha.length; i++) {
                for (int j = 0; j < jogoDaVelha[i].length; j++) {
                    System.out.print(jogoDaVelha[i][j] + " | ");
                }
                System.out.println();
            }

            if ((jogoDaVelha[0][0] == 'X' && jogoDaVelha[0][1] == 'X' && jogoDaVelha[0][2] == 'X') ||
                    (jogoDaVelha[1][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[1][2] == 'X') ||
                    (jogoDaVelha[2][0] == 'X' && jogoDaVelha[2][1] == 'X' && jogoDaVelha[2][2] == 'X') ||
                    (jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][0] == 'X' && jogoDaVelha[2][0] == 'X') ||
                    (jogoDaVelha[0][1] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][1] == 'X') ||
                    (jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][2] == 'X' && jogoDaVelha[2][2] == 'X') ||
                    (jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][2] == 'X') ||
                    (jogoDaVelha[2][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[0][2] == 'X')) {
                ganhou = true;
                System.out.println("Paraéns, o jogador 1 ganhou!");

            } else if ((jogoDaVelha[0][0] == 'O' && jogoDaVelha[0][1] == 'O' && jogoDaVelha[0][2] == 'O') ||
                    (jogoDaVelha[1][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[1][2] == 'O') ||
                    (jogoDaVelha[2][0] == 'O' && jogoDaVelha[2][1] == 'O' && jogoDaVelha[2][2] == 'O') ||
                    (jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][0] == 'O' && jogoDaVelha[2][0] == 'O') ||
                    (jogoDaVelha[0][1] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][1] == 'O') ||
                    (jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][2] == 'O' && jogoDaVelha[2][2] == 'O') ||
                    (jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][2] == 'O') ||
                    (jogoDaVelha[2][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[0][2] == 'O')) {
                ganhou = true;
                System.out.println("Paraéns, o jogador 2 ganhou!");
            } else if (jogada > 9){
                System.out.println("Deu empate!");
            }
        }
    }
}

