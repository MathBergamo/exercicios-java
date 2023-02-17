package com.exerciciosjava.DIO.OrangeBackEndInter.Exercicios.Arrays;

import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String vetor[] = new String[5];
        char letra;
        int consoantes = 0, count = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite uma letra:");
            letra = scan.next().charAt(0);
            if (letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u') {
                consoantes++;
            }
        }
        System.out.println("Temos o total de: " + consoantes + " consoantes");

        consoantes = 0;

        while (count < vetor.length) {
            System.out.print("Digite uma letra: ");
            letra = scan.next().charAt(0);
            count++;
            if (letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u') {
                consoantes++;
            }
        }
        System.out.println("Temos o total de: " + consoantes + " consoantes");
    }
}
