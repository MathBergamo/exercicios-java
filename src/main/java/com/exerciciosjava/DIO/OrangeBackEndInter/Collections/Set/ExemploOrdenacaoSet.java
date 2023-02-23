package com.exerciciosjava.DIO.OrangeBackEndInter.Collections.Set;

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("GoT","fantasia",60));
            add(new Serie("Dark","drama",60));
            add(new Serie("The Office","comédia",25));
        }};

        System.out.println("Ordem aleatória");
        for (Serie serie: minhasSeries) {
            System.out.format("Nome: %s  /Genêro: %s  /Tempo EP: %d \n",serie.getNome(),serie.getGenero(),serie.getTempoEpisodio());
        }

        Set<Serie> minhasSeries2 = new LinkedHashSet<>(){{
            add(new Serie("GoT","fantasia",60));
            add(new Serie("Dark","drama",60));
            add(new Serie("The Office","comédia",25));
        }};

        System.out.println("\nOrdem de inserção:");
        for (Serie serie: minhasSeries2) {
            System.out.format("Nome: %s  /Genêro: %s  /Tempo EP: %d \n",serie.getNome(),serie.getGenero(),serie.getTempoEpisodio());
        }

        System.out.println("\nOrdem natural (Tempo de EP)");
        Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries2);
        for (Serie serie: minhasSeries3) {
            System.out.format("Nome: %s  /Genêro: %s  /Tempo EP: %d \n",serie.getNome(),serie.getGenero(),serie.getTempoEpisodio());
        }

        System.out.println("\nOrdem Nome/Gênero/Tempo EP");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries4.addAll(minhasSeries);
        for (Serie serie: minhasSeries4) {
            System.out.format("Nome: %s  /Genêro: %s  /Tempo EP: %d \n",serie.getNome(),serie.getGenero(),serie.getTempoEpisodio());
        }
    }
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;

        return this.getGenero().compareTo(serie.getGenero());
    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}