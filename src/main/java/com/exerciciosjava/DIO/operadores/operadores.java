package com.exerciciosjava.DIO.operadores;

public class operadores {//Aritmeticos
    public static void main(String[]args){
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao ="?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1); //A operação de adição está funcionando por conta da prioridade dada pelos parenteses.
        System.out.println(concatenacao); //fazendo com que a operação aritmética seja realizada primeiro

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao); //O resultado a partir daqui será apenas baseado na concatenação de texto.
        //Quando ele detecta texto, ele não realiza mais a adição, apenas a concatenação.

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
    }
}
