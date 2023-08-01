package com.exerciciosjava.devdojo.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Wlliam Suane";
        nome.concat(" DevDojo");
        nome = nome.substring(0,3);

        System.out.println(nome);

        StringBuilder sb = new StringBuilder("William Suane ");//Há um método "ToString" dentro do StringBuilder, tornando a String dentro desse objeto em uma String para o console
        sb.append("DevDojo").append(" Academy");//Aqui ele concatena
        sb.substring(0,2);//substring retorna uma string, logo, ele não irá realizar alterações no valor do StrinBuilder
        //Só haverá alteração no StringBuilder caso o método tenha como retorno um StringBuilder também.
        sb.reverse();//reverse retorna um StringBuilder, logo, ele alterá o valor.
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
