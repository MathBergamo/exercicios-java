package com.exerciciosjava.devdojo.javacore.Csobrecargametodos.test;

import com.exerciciosjava.devdojo.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Yu Yu Hakysho 2","TV",24,"ação");
        anime.imprime();
    }
}