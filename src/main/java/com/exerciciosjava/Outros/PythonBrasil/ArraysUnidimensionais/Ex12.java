package com.exerciciosjava.Outros.PythonBrasil.ArraysUnidimensionais;

import java.util.ArrayList;
import java.util.Scanner;

/*
Foram anotadas as idades e alturas de 30 alunos.
Faça um Programa que determine quantos alunos com mais de 13 anos possuem altura inferior à média de altura desses alunos.
 */
public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> idades = new ArrayList<>();
        ArrayList<Float> alturas = new ArrayList<>();

        float mediaALtura = 0, somaAltura = 0;
        int count = 0, menorQueMedia = 0;

        for (int i = 0; i < 30; i++) {
            System.out.println(i + 1 + "º ALUNO");
            for (int j = 0; j < 1; j++) {
                System.out.print("Idade: ");
                idades.add(scanner.nextInt());

                System.out.print("Altura: ");
                float altura = scanner.nextFloat();
                alturas.add(altura);
                somaAltura += altura;
            }

            if (i == 29){
                mediaALtura = somaAltura / 30;
            }
        }
        System.out.println(mediaALtura);

        for (float idade : idades) {
            if (idade > 13) {
                Float altura = alturas.get(count);
                count++;
                if (altura < mediaALtura){
                    menorQueMedia++;
                }
            }
        }

        System.out.println(idades);
        System.out.println(alturas);
        System.out.println("Temos: " + menorQueMedia + " alunos maiores de 13 anos menores que a média de altura dos alunos.");
    }
}
