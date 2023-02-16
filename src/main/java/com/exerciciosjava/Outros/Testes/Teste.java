package com.exerciciosjava.Outros.Testes;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();

        if (velocidadeAtual <= 60){
            System.out.println("Não foi multado")
        } else {
            System.out.println("Foi multado")
        }
    }
}
