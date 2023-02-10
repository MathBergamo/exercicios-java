package com.exerciciosjava.Outros.PythonBrasil.ArraysUnidimensionais;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Faça um Programa que peça a idade e a altura de 5 pessoas, armazene cada informação no seu respectivo vetor.
Imprima a idade e a altura na ordem inversa a ordem lida.
 */
public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> idades = new ArrayList<>();
        ArrayList<Float> alturas = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println(i+1+"º PESSOA-----");
            System.out.print("º Idade: ");
            idades.add(scanner.nextInt());
            System.out.print("º Altura: ");
            alturas.add(scanner.nextFloat());
        }

        Collections.reverse(idades);
        Collections.reverse(alturas);

        System.out.println(idades);
        System.out.println(alturas);
    }
}
