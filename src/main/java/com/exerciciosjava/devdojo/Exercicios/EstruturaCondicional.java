package com.exerciciosjava.devdojo.Exercicios;

public class EstruturaCondicional {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double salarioFinal;

        if(salarioAnual <= 34712){
            salarioFinal = salarioAnual * 0.097;
        }else if(salarioAnual <= 68507){
            salarioFinal = salarioAnual * 0.3735;
        }else{
            salarioFinal = salarioAnual * 0.4950;
        }
        System.out.println("Salário anual: "+ salarioFinal);
    }
}
