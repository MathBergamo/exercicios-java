package com.exerciciosjava.devdojo.javacore.Eblocosinicializacao.test;

import com.exerciciosjava.devdojo.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        System.out.print(anime.getEpisodios());

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
