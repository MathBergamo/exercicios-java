package com.exerciciosjava.devdojo.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        //META CARACTERES:
        // \d = Todos os digitos
        // \D = tudo que não for digito
        // \s = Espaços em branco
        // \S = Todos os caracteres excluindo os brancos.
        // \w = Tudo de a-z ou A-Z, todos os digitos e "_"
        // \W = Tudo que não estiver no \w
        //(precisa usar dois contra-barras para não considerar apenas o contra-barra de escape)
        String regex = "\\W";
        //String texto = "abaaba";
        String texto2 = "jio2_ .2\tj13oi2ji2io31oi2";
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
