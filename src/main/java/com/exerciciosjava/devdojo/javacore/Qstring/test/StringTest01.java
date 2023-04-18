package com.exerciciosjava.devdojo.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "William";//String constant pool, essas variáveis estão no pool
        String nome2 = "William";//Strings no pool são Strings literais
        nome = nome.concat("Suane");// nome precisa receber a nome.concat para ter um valor de referência para "William Suane"

        System.out.println(nome);
        System.out.println(nome == nome2);//Utilizar o "==" ao invés do equals para comparar referências ao invés do valor da referência em si (para ignorar o case)

        String nome3 = new String("William");//Essa variável foi criada de forma a ser um objeto, então, logo ela faz referência para uma outra parte da memória, a parte "Heap"
        //Por fazer parte do Heap, ao ser comparada com um local de memória em "pool", essa comparação será falsa.

        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());//Aqui ele retorna o valor canônico, ou seja, o valor dentro do "pool"
    }
}
