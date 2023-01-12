package com.example.exerciciosjava.operadores;

public class ternario {
    public static void main(String[]args){
        int a, b;
        String resultado = "";
        a = 5;
        b = 6;

        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        System.out.println("O valor na estrutura condicional: " + resultado);

        //Operador ternário
        resultado = (a==b) ? "Verdadeiro" : "Falso";
        System.out.println("Ternário: " + resultado);
    }
}
