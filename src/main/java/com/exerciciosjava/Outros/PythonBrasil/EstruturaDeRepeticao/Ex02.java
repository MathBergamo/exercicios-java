package com.exerciciosjava.Outros.PythonBrasil.EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String nome, senha = "";

        System.out.print("Usuário: ");
        nome = scan.next();

        System.out.print("senha:");
        senha = scan.next();

        while (senha.equalsIgnoreCase(nome)){
            System.out.print("ERRO! Digite novamente\nsenha: ");
            senha = scan.next();
        }

        System.out.println("Cadastro concluído com sucesso");
    }
}
