package com.exerciciosjava.Outros.PythonBrasil.EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;
        float salario;
        char sexo, estadoCivil;

        do {
            System.out.print("nome: ");
            nome = scan.next();
        } while (nome.length() <= 3);

        do {
            System.out.print("Idade: ");
            idade = scan.nextInt();
        } while(idade < 0 || idade > 150);

        do {
            System.out.print("Salário: ");
            salario = scan.nextFloat();
        } while (salario <= 0);

        do {
            System.out.print("Sexo: ");
            sexo = scan.next().charAt(0);
        } while (sexo != 'm' && sexo != 'f' && sexo != 'M' && sexo != 'F');

        do {
            System.out.print("Estado civil:");
            estadoCivil = scan.next().charAt(0);
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd'
        && estadoCivil != 'S' && estadoCivil != 'C' && estadoCivil != 'V' && estadoCivil != 'D' );

        System.out.println("Cadastro concluído com sucesso!");
    }
}
