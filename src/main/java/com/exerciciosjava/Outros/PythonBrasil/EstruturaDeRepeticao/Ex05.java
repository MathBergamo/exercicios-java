package com.exerciciosjava.Outros.PythonBrasil.EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double paisA, paisB, aumentoPaisA, aumentoPaisB;
        int anos = 0;
        boolean toContinue = true;
        char sair = '.';

        while (toContinue){
        System.out.print("Diga a populão do Pais A:");
        paisA = scanner.nextDouble();
        aumentoPaisA = paisA * 0.03;

        System.out.print("Diga a populão do Pais B:");
        paisB = scanner.nextDouble();
        aumentoPaisB = paisB * 0.015;

            while (paisA < paisB){
                aumentoPaisA = paisA * 0.03;
                aumentoPaisB = paisB * 0.015;
                paisA += aumentoPaisA;
                paisB += aumentoPaisB;

                anos ++;
            }

            System.out.println("A população final dos paises foi:\nPaisA: "+ paisA + "\nPaisB: " + paisB);
            System.out.println("Foi necessário " + anos + " anos para os países se igualarem");

            while (sair != 'S' && sair != 'N'){
            System.out.print("Deseja sair? [S/N]");
            sair = scanner.next().charAt(0);
            if (sair == 'S'){
                toContinue = false;
            }else if (sair == 'N'){
                System.out.println("Voltando...");
                anos = 0;
                break;
            }else{
                System.out.println("INVÁLIDO");
            }
            }
        }
    }
}
