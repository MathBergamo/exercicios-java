package com.exerciciosjava.StartCapgemini.POO.Exercicios.Ex13;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica();
        float num1 = 3, num2 = 3;

        System.out.println("NÚMEROS ESCOLHIDOS:" + num1 + " e " + num2);

        System.out.println("Soma:" + calculadora.soma(num1,num2));
        System.out.println("Subtração:" + calculadora.subtracao(num1,num2));
        System.out.println("Multiplicação:" + calculadora.multiplicacao(num1,num2));
        System.out.println("Divisão:" + calculadora.divisao(num1,num2));
        System.out.println("Raiz quadrada:" + calculadoraCientifica.raizQuadrada(num1));
        System.out.println("Potência:" + calculadoraCientifica.potencia(num1,num2));
    }
}
