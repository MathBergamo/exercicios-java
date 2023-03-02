package com.exerciciosjava.DIO.OrangeBackEndInter.Collections.StreamAPI;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class ExercicioStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1","0","4","1","2","3","9","9","6","5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");

        Set<String> collectSet = numerosAleatorios.stream().limit(5).collect(Collectors.toSet());

        System.out.println("Transforme esta lista de String em uma lista de números inteiros");
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .toList();
        System.out.println(collectList);

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
        List<Integer> ListParesMaioresQue2 = numerosAleatorios.stream().map(Integer::parseInt).filter( num -> num % 2 == 0 && num > 2)
                .toList();

        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

        System.out.println("Remova os valores ímpares");
        List<Integer> inteirosList = new ArrayList<>(numerosAleatorios.stream().map(Integer::parseInt).toList());

        inteirosList.removeIf(num -> num % 2 == 1);
        System.out.println(inteirosList);
    }
}

