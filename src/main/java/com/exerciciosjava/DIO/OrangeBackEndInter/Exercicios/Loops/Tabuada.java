package com.exerciciosjava.DIO.OrangeBackEndInter.Exercicios.Loops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Tabuada\nDigite um número:");
        int numero = scan.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(numero + " x " + i + " = " + numero*i);
        }
    }
}
