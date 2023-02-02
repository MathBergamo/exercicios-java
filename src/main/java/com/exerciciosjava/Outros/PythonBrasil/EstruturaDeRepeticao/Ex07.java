package com.exerciciosjava.Outros.PythonBrasil.EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0, maior = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Nº");
            System.out.print(i+1+": ");
            numero = scanner.nextInt();
            if (numero > maior){
                maior = numero;
            }
        }
        System.out.println("O maior numero digitado foi: " + maior);
    }
}
