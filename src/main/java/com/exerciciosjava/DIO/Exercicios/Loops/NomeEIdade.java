package com.exerciciosjava.DIO.Exercicios.Loops;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
public class NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;

        System.out.println("Olá, seja bem vinde");
        while (true) {
            System.out.print("Digite seu nome:");
            nome = scan.next();
            if (nome.equals("0")) {
                break;
            }
            System.out.print("Digite sua idade:");
            idade = scan.nextInt();
        }

//        Tentativa de forma alternativa

//        while(!nome.equals("0")) {
//            System.out.println("Digite seu nome:");
//            nome = scan.next();
//            System.out.println("digite sua idade:");
//            idade = scan.nextInt();
    }
}

