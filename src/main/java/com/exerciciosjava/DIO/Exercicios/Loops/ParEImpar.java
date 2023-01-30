package com.exerciciosjava.DIO.Exercicios.Loops;

import java.util.Scanner;
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int par = 0, impar = 0, count = 0, numero = 0 ,quantidade;

        System.out.println("Quantos números quer digitar? ");
        quantidade = scan.nextInt();

        do {
            System.out.print(numero+1 +"º Número: ");
            numero = scan.nextInt();
            if (numero % 2 == 0){
                par ++;
            }else{
                impar ++;
            }
            count ++;
        } while (count < quantidade);

        System.out.println("Temos " + par + " pares, e " + impar + " ímpares");
    }
}
