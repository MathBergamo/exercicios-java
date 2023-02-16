package com.exerciciosjava.Outros.ExerciciosExternos.Metodos.Vetor;

import java.util.Scanner;

public class Vetor {
    Scanner scanner = new Scanner(System.in);

    void lerVetor(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um valor para o vetor: ");
            vetor[i] = scanner.nextInt();
        }
    }

    int somarNumeros(int[] vet){
        int resultado = 0;
        for (int j : vet) {
            resultado += j;
        }
        return resultado;
    }

    float calcularMedia(int[] vet){
        float media;

        media = somarNumeros(vet) / vet.length;
        return media;
    }
}
