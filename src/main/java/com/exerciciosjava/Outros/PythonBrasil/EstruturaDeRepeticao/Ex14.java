package com.exerciciosjava.Outros.PythonBrasil.EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int par = 0,impar = 0;

        for (int i = 1; i < 11; i++) {
            System.out.print("Número: ");
            int num = scanner.nextInt();
            if (num % 2 == 0){
                par++;
            }else if(num % 2 == 1){
                impar++;
            }
        }
        System.out.println("Temos " + par + " pares e " + impar + " ímpares");
    }
}
