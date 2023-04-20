package com.exerciciosjava.devdojo.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // . 1.3 = 123, 133, 1@3, 1A3 - Irá considerar qualquer valor entre 1 e 3
        String regex = "([a-zA-Z\\d\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; //Modelo para dar match em e-mail.
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, @#!zoro@mail.br, teste@gmail.com.br, sakura@mail";

        System.out.println("Validação de email:");
        System.out.println("zoro@mail.br".matches(regex));//Utilizar o matches em uma String.
        System.out.println(texto.split(",")[1].trim());//trim remove os espaços em branco no final e no começo da String

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
