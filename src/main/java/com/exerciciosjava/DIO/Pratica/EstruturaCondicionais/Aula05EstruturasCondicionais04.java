package com.exerciciosjava.DIO.Pratica.EstruturaCondicionais;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        //Imprima o dia da semana considerando 1 como domingo.
        //switch suporta: char, int, yte, short, enum, String
        char sexo = 'O';
        byte dia = 8;
        switch(dia){
            default://O default é mais comum no final do case com um break, no intuito de ser a última alternativa
                System.out.println("Opção inválida");//caso o restante dos cases não funcione.
            case 1:
                System.out.println("Domingo");
            case 2:
                System.out.println("Segunda");
            case 3:
                System.out.println("Terça");
            case 4:
                System.out.println("Quarta");
            case 5:
                System.out.println("Quinta");//Ele ira realizar todas as funções a partir daqui
                break;
            case 6:                          //Se ele não receber a ordem de parada, ele irá realizar os outros cases também.
                System.out.println("Sexta");
            case 7:
                System.out.println("Sábado");
        }
        switch(sexo){
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
            default:
                System.out.println("Sexo não identificado");
        }
    }
}
