package com.exerciciosjava.StartCapgemini.POO.Exercicios.Ex01;
/*
Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e
altura. Crie os métodos públicos necessários para getters e setters e também um método para imprimir
todos dados de uma pessoa. Crie um método para calcular a idade da pessoa.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seus dados");

        System.out.println("Nome: ");
        pessoa1.setNome(scanner.next());

        System.out.println("Ano de nascimento: ");
        pessoa1.setDataNascimento(scanner.nextInt());

        System.out.println("Altura: ");
        pessoa1.setAltura(scanner.nextFloat());

        pessoa1.calcularIdade();
        pessoa1.imprimirDados();
    }
}
