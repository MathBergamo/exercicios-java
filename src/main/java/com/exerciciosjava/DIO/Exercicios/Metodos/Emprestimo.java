package com.exerciciosjava.DIO.Exercicios.Metodos;

public class Emprestimo {
    public double emprestimo(double valorEmprestimo, double parcelas){
        double resultado = 0;
        if (valorEmprestimo <= 1000){
            resultado = valorEmprestimo + valorEmprestimo * 0.1;
        } else if (valorEmprestimo <= 2000) {
            resultado = valorEmprestimo + valorEmprestimo * 0.2;
        } else {
            resultado = valorEmprestimo + valorEmprestimo * 0.3;
        }

        if (parcelas <= 4){
            resultado += resultado *0.05;
        }else{
            resultado += resultado * 0.1;
        }

        return resultado;
    }
}
