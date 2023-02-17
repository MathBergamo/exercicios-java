package com.exerciciosjava.DIO.OrangeBackEndInter.Exercicios.Loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[5];
        int media = 0;
        int maior = 0;
        int quantidadeDeNotas = array.length;

        for (int i = 0; i < array.length; i++) {
            System.out.print(i+1 + "º número:");
            array[i] = scan.nextInt();
            media += array[i];
            if (i >= 1 && array[i] > array[i-1]){
                maior = array[i];
            }
        }
        media /= quantidadeDeNotas;
        System.out.println("A média do Aluno foi de: " + media);
        System.out.println("A maior nota foi de: " + maior);
    }
}
