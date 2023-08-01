package com.exerciciosjava.devdojo.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "aba";
        //String texto = "abaaba";
        String texto2 = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("Texto:  " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Psocições encontradas");

        while (matcher.find()){//Enquanto o matcher encontrar o pattern.
            System.out.print(matcher.start() + " ");//Ele irá printar aonde começou o match (podendo ter vários matchs, pode se ter várias posições)

        }
    }
}
