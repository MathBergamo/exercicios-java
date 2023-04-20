package com.exerciciosjava.devdojo.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        //Quantificadores
        //? = Zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // () = agrupamento
        // | o(v|c)o = irá dar match em ovo ou oco
        // . 1.3 = 123, 133, 1@3, 1A3 - Irá considerar qualquer valor entre 1 e 3
        String regex = "0[xX]([\\da-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Psocições encontradas");

        while (matcher.find()){
            System.out.print(matcher.start() + " "+ matcher.group()+ "\n ");
        }
    }
}
