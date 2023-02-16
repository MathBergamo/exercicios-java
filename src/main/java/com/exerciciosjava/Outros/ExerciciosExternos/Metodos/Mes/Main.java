package com.exerciciosjava.Outros.ExerciciosExternos.Metodos.Mes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mes mes = new Mes();

        System.out.print("Digite o mês que deseja ver: ");
        int numeroMes = scanner.nextInt();

        System.out.print("Você digitou o mês de: ");
        mes.exibirmes(numeroMes);
    }
}
