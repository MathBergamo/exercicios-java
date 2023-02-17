package com.exerciciosjava.DIO.OrangeBackEndInter.Exercicios.Loops;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Fatorial\nDigite um número: ");
        int fatorial = scan.nextInt();
        for (int i = fatorial; i >= 1; i--) {
            if (i >= 2){
                fatorial *= i - 1;
                System.out.print(i + " x ");
            }else{
                System.out.print(i + " = ");
            }
        }
        System.out.print(fatorial);
    }
}
