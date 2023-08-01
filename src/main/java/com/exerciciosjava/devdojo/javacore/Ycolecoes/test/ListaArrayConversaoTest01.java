package com.exerciciosjava.devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Integer[] integersArray = numeros.toArray(new Integer[0]);//Colocar o Integer[0] para desempenho

        System.out.println(Arrays.toString(integersArray));
        System.out.println("-------------------------");

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numerosArray);//Conversão de array para list. arrayToList e numerosArray estão linkados, a alteração em um irá valer para ambos.

        arrayToList.set(0,12);
        //arrayToList.add(19); -- Não é possível realizar essa operação por conta do link que foi criando entre arrayToList e Arrays.asList
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);

        System.out.println("------------------");
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));//Isso permite a alteração
        numerosList.add(15);
        System.out.println(numerosList);

        List<String> strings = Arrays.asList("1", "2");
    }
}
