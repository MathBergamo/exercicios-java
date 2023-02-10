package com.exerciciosjava.Outros.PythonBrasil.ArraysUnidimensionais;
/*
Altere o programa anterior, intercalando 3 vetores de 10 elementos cada.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayA = new ArrayList<Integer>();
        ArrayList<Integer> arrayB = new ArrayList<Integer>();
        ArrayList<Integer> arrayC = new ArrayList<Integer>();
        ArrayList<Integer> arrayD = new ArrayList<Integer>();

        int num = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("ArrayA: ");
            num = scanner.nextInt();
            arrayA.add(num);
            arrayD.add(num);

            System.out.println("ArrayB: ");
            num = scanner.nextInt();
            arrayB.add(num);
            arrayD.add(num);

            System.out.println("ArrayC:");
            num = scanner.nextInt();
            arrayC.add(num);
            arrayD.add(num);
        }

        System.out.println(arrayA);
        System.out.println(arrayB);
        System.out.println(arrayC);
        System.out.println(arrayD);
    }

}
