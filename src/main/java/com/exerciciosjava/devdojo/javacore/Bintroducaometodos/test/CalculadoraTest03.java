package com.exerciciosjava.devdojo.javacore.Bintroducaometodos.test;

import com.exerciciosjava.devdojo.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20,2);
        System.out.println(resultado);
        System.out.println("-------------");
        calculadora.imprimeDoisNumeros(86,0);
    }
}
