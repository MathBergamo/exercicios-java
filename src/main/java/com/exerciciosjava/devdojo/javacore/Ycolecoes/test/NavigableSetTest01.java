package com.exerciciosjava.devdojo.javacore.Ycolecoes.test;

import com.exerciciosjava.devdojo.javacore.Ycolecoes.dominio.Manga;
import com.exerciciosjava.devdojo.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123","Nokia");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        //Treeset irá ordernar pelo que foi definido no método compareTo da classe.
        //Set não permite elementos duplicados
        //TreeSet não utiliza o equals para verificar se dois elementos são iguais, se baseia no método compareTo ou Comparator
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9,0));
        mangas.add(new Manga(1L, "Berserk", 9.5,5));
        mangas.add(new Manga(4L, "Pokemon", 3.2,0));
        mangas.add(new Manga(3L, "Attack on Titan", 11.20,2));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99,0));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99,0));

        for (Manga manga : mangas.descendingSet()) {//descendingSet inverte a ordem natural Ex: invés de A-Z, vai de Z-A.
            System.out.println(manga);
        }

        Manga yuyu = new Manga(21L,"Yu Yu Hakusho",3.2,5);
        /* métodos para comparação
        * lower: trará o menor
        * floor: menor ou igual
        * higher: maior
        * ceiling: maior ou igual
        * */

        System.out.println("----------------");
        System.out.println(mangas.lower(yuyu));//irá trazer o menor preço antes do yuyu
        System.out.println(mangas.floor(yuyu));//irá trazer um valor igual ao yuyu ( ou menor )
        System.out.println(mangas.higher(yuyu));//irá trazer um valor maior depois do yuyu
        System.out.println(mangas.ceiling(yuyu));//irá trazer um valor igual ( ou maior )

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());//retorna e remove o primeiro elemento da lista
        System.out.println(mangas.pollLast());//retorna e remove o ultimo elemento da lista
        System.out.println(mangas.size());
    }
}
