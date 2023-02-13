package com.exerciciosjava.Outros.PythonBrasil.ArraysUnidimensionais;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Faça um programa que leia um número indeterminado de valores, correspondentes a notas, encerrando a entrada de dados
quando for informado um valor igual a -1 (que não deve ser armazenado).
Após esta entrada de dados, faça:
Mostre a quantidade de valores que foram lidos;
Exiba todos os valores na ordem em que foram informados, um ao lado do outro;
Exiba todos os valores na ordem inversa à que foram informados, um abaixo do outro;
Calcule e mostre a soma dos valores;
Calcule e mostre a média dos valores;
Calcule e mostre a quantidade de valores acima da média calculada;
Calcule e mostre a quantidade de valores abaixo de sete;
Encerre o programa com uma mensagem;
 */
public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Float> valores = new ArrayList<>();

        float somaValores = 0, mediaValores;

        while (true) {
            System.out.println("Digite um número: [-1 finaliza o programa]");
            float numero = scanner.nextFloat();
            if (numero == -1){
                mediaValores = somaValores / valores.size();
                break;
            }else{
                valores.add(numero);
                somaValores += numero;
            }
        }

        System.out.println("Foram digitados" + valores.size() + " valores");
        System.out.println("Sendo eles: " + valores);
        Collections.reverse(valores);
        System.out.println("Ordem inversa: " + valores);
        Collections.reverse(valores);
        System.out.println("Soma de todos os valores: " + somaValores);
        System.out.println("Média dos valores: " + mediaValores);
        System.out.print("Valores acima da média: ");
        for (float valor: valores) {
            if (valor > mediaValores){
                System.out.print(valor + " / ");
            }
        }
        System.out.println();

        System.out.print("Valores menores que 7: ");
        for (float valor: valores) {
            if (valor < 7){
                System.out.print(valor + " / ");
            }
        }

    }
}
