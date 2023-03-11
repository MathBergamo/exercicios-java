package com.exerciciosjava.Outros.PythonBrasil.EstruturaDeRepeticao;
/*
A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,...

 Faça um programa que gere a série até que o valor seja maior que 500.
 */
public class Ex16 {
    public static void main(String[] args) {
        int num1, num2 = 1, num3 = 0;

        for (int i = 0; i < 16; i++) {
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
            num3 = num1 + num2;
        }
    }
}
