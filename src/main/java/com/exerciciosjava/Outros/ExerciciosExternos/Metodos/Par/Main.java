package com.exerciciosjava.Outros.ExerciciosExternos.Metodos.Par;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Par par = new Par();

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        System.out.println("O valor é par?");
        System.out.println(par.isPar(num));


    }
}
