package com.exerciciosjava.Outros.PythonBrasil.EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num ;

        System.out.print("Digite uma nota de 0 a 10:");
        num = scanner.nextInt();

        while (num > 10 || num < 0){
            System.out.print("ERRO!\n Digite um valor válido entre 0 e 10:");
            num = scanner.nextInt();
        }

        System.out.println("Nota: " + num);
    }
}
