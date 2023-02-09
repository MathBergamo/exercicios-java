package com.exerciciosjava.Outros.PythonBrasil.EstruturaDeRepeticao;

import java.util.Scanner;

/*
Faça um programa que peça para n pessoas a sua idade, ao final o programa devera verificar se
a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou idosa,
 conforme a média calculada.
 */
public class Ex25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pessoas, count = 0;
        float media = 0;

        System.out.print("Digite a quantidade de pessoas: ");
        pessoas = scanner.nextInt();

        while (count < pessoas){
            count++;
            System.out.print("Digite a idade da " + count + "º pessoa: ");
            media += scanner.nextInt();
        }

        media /= count;

        if (media > 0 && media <= 25){
            System.out.print("A média da idade da turma é de: " + media + ". Portanto, a média da sala é jovem.");
        }else if (media > 25 && media <= 60){
            System.out.print("A média da idade da turma é de: " + media + ". Portanto, a média da sala é adulta.");
        }else{
            System.out.print("A média da idade da turma é de: " + media + ". Portanto, a média da sala é idosa.");
        }
    }
}
