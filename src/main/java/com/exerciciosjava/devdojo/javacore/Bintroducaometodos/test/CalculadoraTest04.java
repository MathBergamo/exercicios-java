package com.exerciciosjava.devdojo.javacore.Bintroducaometodos.test;

import com.exerciciosjava.devdojo.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;

        calculadora.alteraDoisNumeros(num1,num2);
        System.out.println("Fora da alteraDoisNumeros");
        System.out.println(num1);
        System.out.println(num2);

    }
}
