package com.exerciciosjava.devdojo.Exercicios;

public class EstruturadeRepeticao01 {
    public static void main(String[] args) {
        //Imprima todos os números pares de 0 até 1000000
        int num = 0;
        for(int i=0;i<1000001;i+=2){
            if(i % 2 == 0)
            System.out.println("Indice = " + i);
        }
        while(num < 1000001){
            ++num;
            if(num % 2 == 0)
            System.out.println("Num = " + num);
        }
    }
}
