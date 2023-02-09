package com.exerciciosjava.Outros.PythonBrasil.ArraysUnidimensionais;

import java.util.ArrayList;
import java.util.Scanner;

//Faça um Programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.
public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Character>vetor = new ArrayList<Character>();
        int qntConsoantes = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite uma letra: ");
            vetor.add(scanner.next().charAt(0));
        }

        for (char consoante: vetor) {
            if (consoante != 'a' && consoante != 'e' && consoante != 'i' && consoante != 'o' && consoante != 'u'){
                System.out.println(consoante);
                qntConsoantes++;
            }
        }
        System.out.println("Temos " + qntConsoantes + " consoantes");
    }
}
