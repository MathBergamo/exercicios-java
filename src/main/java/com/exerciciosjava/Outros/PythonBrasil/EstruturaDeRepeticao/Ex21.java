package com.exerciciosjava.Outros.PythonBrasil.EstruturaDeRepeticao;

import java.util.Scanner;

/*
Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
Um número primo é aquele que é divisível somente por ele mesmo e por 1.
 */
public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------NÚMERO PRIMO-----------");
        System.out.println("Digite um número:");
        int num = scanner.nextInt();

        for (int i = 2; i <= num; i++) {
            if(num % i == 0 && num > 2){
                System.out.println("O número " + num + " não é primo");
                break;
            }else{
                System.out.println("O número " + num + " é primo");
                break;
            }
        }
    }
}
