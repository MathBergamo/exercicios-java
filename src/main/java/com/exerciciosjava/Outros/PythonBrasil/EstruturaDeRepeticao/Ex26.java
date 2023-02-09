package com.exerciciosjava.Outros.PythonBrasil.EstruturaDeRepeticao;

import java.util.Scanner;

/*
Numa eleição existem três candidatos. Faça um programa que peça o número total de eleitores.
Peça para cada eleitor votar e ao final mostrar o número de votos de cada candidato.
 */
public class Ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int candidato1 = 0, candidato2 = 0, candidato3 = 0, eleitores, voto = 0;

        System.out.print("Quantos eleitores temos?");
        eleitores = scanner.nextInt();

        System.out.println("--- VOTAÇÃO ---");

        for (int i = 0; i < eleitores; i++) {
            while (true) {
                System.out.print("Qual candidato deseja votar? [1/2/3]");
                voto = scanner.nextInt();

                if (voto == 1){
                    candidato1++;
                    break;
                } else if (voto == 2) {
                    candidato2++;
                    break;
                }else if (voto == 3) {
                    candidato3++;
                    break;
                }else {
                    System.out.println("VOTO INVÁLIDO!");
                }
            }
        }
        System.out.println("OS VOTOS TOTAIS FORAM:");
        System.out.println(candidato1 + " para o Candidato1");
        System.out.println(candidato2 + " para o Candidato2");
        System.out.println(candidato3 + " para o Candidato3");
    }
}
