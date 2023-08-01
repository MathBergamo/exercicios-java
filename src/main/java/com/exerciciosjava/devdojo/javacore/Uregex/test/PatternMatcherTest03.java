package com.exerciciosjava.devdojo.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        //Range - []
        String regex = "0[xX][\\da-fA-F]";
        String texto2 = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("Texto:  " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Psocições encontradas");

        while (matcher.find()){
            System.out.print(matcher.start() + " "+ matcher.group()+ "\n ");//matcher.group() irá mostrar o conteúdo que o matcher encontrou
        }
    }
}
