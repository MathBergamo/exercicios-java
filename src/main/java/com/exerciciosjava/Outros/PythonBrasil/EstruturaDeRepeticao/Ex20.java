package com.exerciciosjava.Outros.PythonBrasil.EstruturaDeRepeticao;

import java.util.Scanner;
import java.util.TreeMap;

/*
Altere o programa de cálculo do fatorial, permitindo ao usuário calcular o fatorial várias vezes
e limitando o fatorial a números inteiros positivos e menores que 16.
 */
public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = -1, fatorial = 0;
        char usuario = 'c';
        boolean stop = false;

        System.out.println("----- FATORIAL -----");

        while (!stop) {
            while (n > 16 || n <= 0) {
                System.out.print("Escolha um número de 1 a 16: ");
                n = scanner.nextInt();
                fatorial = n;
            }

            for (int i = n; i >= 2; i--) {
                n *= (i - 1);
            }
            System.out.println(fatorial + "! = " + n);

            while (usuario != 'n' || usuario != 's' || usuario != 'S' || usuario != 'N') {
                System.out.println("Deseja continuar? [S/N]");
                usuario = scanner.next().charAt(0);

                if (usuario == 'N' || usuario == 'n') {
                    System.out.println("Até mais!");
                    stop = true;
                    break;
                }else if (usuario == 'S' || usuario == 's'){
                    System.out.println("Continuando...");
                    n = 0;
                    break;
                }
            }
        }
    }
}
