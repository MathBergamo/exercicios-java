package com.exerciciosjava.devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {//Binary search é a busca do index de um array ordenado
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);

        // (-(ponto de inserção) -1) - Se colocar o valor 1 nesse array, ele irá retornar -1 (ponto de inserção) e -1, ou seja, -2
        //Dessa forma, é mais fácil identificar aonde o valor que não existe supostamente deveria estar inserido no array ordenado.
        //index 0,1,2,3
        //value 0,2,3,4
        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros,5));//retorna o index
    }
}
