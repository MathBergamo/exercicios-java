package com.exerciciosjava.devdojo.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Luffy";
        String numeros = "012345";

        System.out.println(nome.charAt(2));
        System.out.println(nome.length());
        System.out.println(nome.replace("f","l"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0,numeros.length()));//ponto de partida e ponto final dos valores que você quer pegar da Strng
        System.out.println(numeros.substring(0));//substring é um método sobrecarregado, logo, não há necessidade de colocar o ponto final.
        System.out.println(numeros.trim());//remove os valores em branco no começo e no fim da String
    }
}
