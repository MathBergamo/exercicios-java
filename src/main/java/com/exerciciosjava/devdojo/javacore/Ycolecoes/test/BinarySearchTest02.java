package com.exerciciosjava.devdojo.javacore.Ycolecoes.test;

import com.exerciciosjava.devdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {//Binary search é a busca do index de um array ordenado
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9));
        mangas.add(new Manga(1L, "Berserk", 9.5));
        mangas.add(new Manga(4L, "Pokemon", 3.2));
        mangas.add(new Manga(3L, "Attack on Titan", 11.20));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99));

        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangatoSearch = (new Manga(2L, "Dragon ball Z", 2.99));//procurando objeto por binary search
        //Não utiliza equals para fazer comparações
        System.out.println(Collections.binarySearch(mangas,mangatoSearch));

    }
}
