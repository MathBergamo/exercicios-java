package com.exerciciosjava.devdojo.javacore.Ycolecoes.test;

import com.exerciciosjava.devdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) { //Remover todos objetos com quantidade 0
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9,0));
        mangas.add(new Manga(1L, "Berserk", 9.5,5));
        mangas.add(new Manga(4L, "Pokemon", 3.2,0));
        mangas.add(new Manga(3L, "Attack on Titan", 11.20,2));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99,0));

        Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()){//hasNext retorna valor booleano
            Manga manga = mangaIterator.next();
            if (manga.getQuantidade() == 0){
                mangaIterator.remove();//mangaIterator está responsável pela iteração, logo, também está responsável pelas alterações e a própria remoção dos objetos.
            }
        }

        System.out.println(mangas);

        mangas.removeIf(manga -> manga.getQuantidade() == 0);//forma de remover com condição,mas simplificado. Código acima simplficado!
    }
}
