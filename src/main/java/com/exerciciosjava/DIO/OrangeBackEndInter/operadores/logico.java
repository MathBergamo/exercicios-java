package com.exerciciosjava.DIO.OrangeBackEndInter.operadores;

public class logico {
    public static void main (String[]args){
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }else{
            System.out.println("As condições são diferentes");
        }

        if(condicao1 || condicao2){
            System.out.println("Alguma das condições é verdadeira");
        }
    }
}
