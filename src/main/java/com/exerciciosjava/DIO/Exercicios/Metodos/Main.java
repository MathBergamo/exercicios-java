package com.exerciciosjava.DIO.Exercicios.Metodos;

public class Main {
    public static void main(String[] args) {
        Mensagem mensagem = new Mensagem();
        Emprestimo emprestimo = new Emprestimo();

        Calculadora.soma(3,7);
        Calculadora.subtracao(10,3);
        Calculadora.divisao(20,5);
        Calculadora.multiplicacao(5,6);

        System.out.println(mensagem.mensagem(20));
        System.out.println(mensagem.mensagem(10));
        System.out.println(mensagem.mensagem(14));
        System.out.println(emprestimo.emprestimo(2000,4));
    }
}
