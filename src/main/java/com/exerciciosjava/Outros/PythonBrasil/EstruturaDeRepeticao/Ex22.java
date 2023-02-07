package com.exerciciosjava.Outros.PythonBrasil.EstruturaDeRepeticao;
/*
Altere o programa de cálculo dos números primos,
informando, caso o número não seja primo, por quais número ele é divisível
 */
import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        boolean primo = true;

        System.out.println("Digite um número: ");
        num = scanner.nextInt();

        int array[] = new int[num];

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                array[i] = i;
                primo = false;
            }
        }

        if (primo) {
            System.out.println("O número " + num + " é primo");
        } else {
            System.out.println("O número " + num + " não é primo");
            System.out.println("Números divisíveis: " + array);
        }
    }
}
