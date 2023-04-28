package com.exerciciosjava.devdojo.javacore.Ycolecoes.test;

import com.exerciciosjava.devdojo.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        /*
        String nome = "Matheus Bergamo";
        String nome2 = new String("Matheus Bergamo");
        System.out.println(nome == nome2);     // false - pool de string
        System.out.println(nome.equals(nome2));//true - utiliza o valor da String
        */

        Smartphone s1 = new Smartphone("1ABC","Iphone");//Valores alocado em lugar A por exmeplo
        Smartphone s2 = new Smartphone("1ABC","Pixel");//Valores alocados em lugar B por exemplo

        //Aqui o resultado é falso pois cada objeto está fazendo referência para um valor que está alocado em um lugar diferente na memória.
        //Para essa situação ser "true", os dois objetos precisariam estar fazendo referência para o mesmo lugar e mesmo valor alocado na memoria
        System.out.println(s1.equals(s2));//Ele se torna true por conta do equals na classe

        s1 = s2;//Isso faz com que os dois objetos façam referência para o mesmo lugar e valor alocado na memória.
        System.out.println(s1.equals(s2));
    }
}
