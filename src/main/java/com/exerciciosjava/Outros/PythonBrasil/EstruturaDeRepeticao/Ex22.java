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

        System.out.print("Digite um numero: ");
        num = scanner.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                System.out.println("O número " + num + " é divisível por " + i);
                primo = false;
            }
        }

        if(primo){
            System.out.println("O número " + num + " é primo!");
        }
    }
}
