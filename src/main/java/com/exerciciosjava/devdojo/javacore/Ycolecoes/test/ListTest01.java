package com.exerciciosjava.devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(); //Listas são ordenadas
        nomes.add("William");
        nomes.add("DevDojo Academy");
        nomes.remove("William");//Irá remover através do equals

        //foreach irá funcionar com loops "pré estabelecidos" de acordo com a Lista do nomes, se esse valor for ultrapassado
        //Irá ocorrer uma exceção, que nesse caso é: ConcurrentModificationException
        for (Object nome: nomes) {
            System.out.println(nome);
            //nomes.add("Suane");
        }

        System.out.println("--------------------");

        int size = nomes.size();
        for (int i = 0; i < size; i++) {
            System.out.println(nomes.get(i));
            nomes.add("Suane");
        }
    }
}
