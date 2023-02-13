package com.exerciciosjava.Outros.PythonBrasil.ArraysUnidimensionais;

import java.util.ArrayList;
import java.util.Scanner;

/*
Em uma competição de salto em distância cada atleta tem direito a cinco saltos.
O resultado do atleta será determinado pela média dos cinco valores restantes.
Você deve fazer um programa que receba o nome e as cinco distâncias alcançadas pelo atleta em seus saltos
e depois informe o nome, os saltos e a média dos saltos. O programa deve ser encerrado quando não for informado
o nome do atleta. A saída do programa deve ser conforme o exemplo abaixo
 */
public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> saltos = new ArrayList<>();

        Double salto, somaSaltos = 0D;

        System.out.print("Nome do Atleta: ");
        String nome = scanner.next();

        for (int i = 0; i < 5; i++) {
            System.out.print(1+i+"º salto: ");
            salto = scanner.nextDouble();
            somaSaltos += salto;
            saltos.add(salto);
        }
        System.out.println();

        System.out.println("Atleta: " + nome);
        for (int i = 0; i < 5; i++) {
            System.out.println(1+i+"º salto: " + saltos.get(i) + " m");
        }
        System.out.println("Média dos saltos: " + somaSaltos / saltos.size());
    }
}
