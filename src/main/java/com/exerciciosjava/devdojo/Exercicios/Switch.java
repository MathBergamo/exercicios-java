package com.exerciciosjava.devdojo.Exercicios;

public class Switch {
    public static void main(String[] args) {
        //Dados os valroes de 1 a 7, imprima se é dia útil ou final de semana
        //Considerado 1 como domingo.
        byte dia = 5;

        System.out.println("---Dia da semana---");
        switch (dia){
            case 1:
            case 7:
                System.out.println("FDS");
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
