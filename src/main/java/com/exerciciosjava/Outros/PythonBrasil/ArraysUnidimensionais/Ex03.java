package com.exerciciosjava.Outros.PythonBrasil.ArraysUnidimensionais;

import java.util.ArrayList;
import java.util.Scanner;

//Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Float> notas = new ArrayList<>();

        float total = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print(i+1+"º Nota: ");
            notas.add(scanner.nextFloat());
            total += notas.get(i);
        }

        System.out.println("Notas: "+ notas);
        System.out.println("Media: "+ total/notas.size());
    }
}
