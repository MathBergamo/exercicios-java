package com.exerciciosjava.Outros.PythonBrasil.ArraysUnidimensionais;

import java.util.ArrayList;
import java.util.Scanner;

/*
Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene num vetor a média de cada aluno,
imprima o número de alunos com média maior ou igual a 7.0
 */
public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Float> medias = new ArrayList<>();
        float somaNotas = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1 + "º Aluno ");
            for (int j = 0; j < 4; j++) {
                System.out.print(j + 1 + "º nota: ");
                somaNotas += scanner.nextFloat();
            }
            medias.add(somaNotas / 4);
            somaNotas = 0;
        }
        System.out.println("MÉDIAS");
        System.out.println(medias+"\n");
        System.out.println("---Médias maiores que 7---");
        for (float media : medias) {
            if (media >= 7) {
                System.out.println(media);
            }
        }
    }
}
