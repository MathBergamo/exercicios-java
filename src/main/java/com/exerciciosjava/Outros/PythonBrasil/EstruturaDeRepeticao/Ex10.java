package com.exerciciosjava.Outros.PythonBrasil.EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        System.out.print("Digite o número iniciante: ");
        num1 = scanner.nextInt();

        System.out.print("Digite o número final: ");
        num2 = scanner.nextInt();

        System.out.println("Números dos intervalos");

        if (num1 < num2){
            for (int i = num1+1; i < num2; i++) {
                System.out.print(i+" ");
            }
        } else if (num1 > num2) {
            for (int i = num1-1; i > num2; i--) {
                System.out.print(i+" ");
            }
        }
    }
}
