package com.exerciciosjava.Outros.ExerciciosExternos.Metodos.Vetor;

public class Main {
    public static void main(String[] args) {
        Vetor vetorClasse = new Vetor();
        int[] vetor = new int[10];


        vetorClasse.lerVetor(vetor);
        for (int numero: vetor) {
            System.out.print("["+numero + "] ");
        }

        int soma = vetorClasse.somarNumeros(vetor);
        System.out.println("\nA soma dos valores é: "+ soma);

        float media = vetorClasse.calcularMedia(vetor);
        System.out.println("A média dos valores é: "+ media);
    }
}
