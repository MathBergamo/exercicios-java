package com.exerciciosjava.devdojo.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {//Dentro do map há um set (alguns métodos set inclusos)
        //Values são represenados em Strings
        Map<String, String> map = new HashMap<>();
        map.put("teklado","teclado");
        map.put("mouze","mouse");
        map.put("vc","você");
        map.put("vc","você2");//reescrevendo o valor

        System.out.println(map);

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));//Há duas formas de pegar os valores do map, map.get(key), e map.values()
        }

        System.out.println("------------------");

        for (Map.Entry<String,String> entry: map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());//outra forma de apresentar os resultados do Map
        }
    }
}
