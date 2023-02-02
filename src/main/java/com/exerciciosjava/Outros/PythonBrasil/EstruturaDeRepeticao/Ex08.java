package com.exerciciosjava.Outros.PythonBrasil.EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float numero = 0, soma = 0, media = 0;
        for (int i = 1; i < 6; i++) {
            System.out.print("Nº"+ i +": ");
            numero = scanner.nextInt();
            soma += numero;
        }
        media = soma;
        media /= 5;

        System.out.println("Soma:" + soma);
        System.out.println("Média:" + media);
    }
}
