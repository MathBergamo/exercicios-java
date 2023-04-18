package com.exerciciosjava.devdojo.javacore.Pwrappers.test;

import java.lang.Boolean;

public class WrapperTest01 {//P = primitivo -- W = Wrapper
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 1;
        float floatP = 1;
        double doubleP = 1;
        char charP = 'W';
        boolean booleanP = false;

        //Wrappers são responsáveis por encapsular os tipos primitivos e transforma-los em objetos.
        //Wrappers agem com polimorfismo, não com valor em memória igual ao tipo primitivo.
        //Boxing e unboxing é a transformação do tipo primitivo para wrapper e vice-versa.

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; //boxing
        Long longW = 1L;
        Float floatW = 1f;
        Double doubleW = 1d;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; //unboxing
        Integer intW2 = Integer.parseInt("1"); //Convertendo uma string para um objeto
        boolean verdadeiro = Boolean.parseBoolean("TruE");//Não considera o case (Letra maiúscula ou minúscula)
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }
}
