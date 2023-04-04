package com.exerciciosjava.devdojo.javacore.Fmodificadorestatico.dominio;

public class Anime {
    /*Etapas da inicialização da classe:
    * 0 - Bloco de inicialização é executando quando a JVM carregar classe ( por isso static não pode acessar instância, pq vem antes de tudo)
    * 1 - Alocado espaço em memória pro objeto
    * 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for definido
    * 3 - Bloco de incialização é executado
    * 4 - Construtor é executado
    * */
    private String nome;
    private static int[] episodios;

    //Bloco de inicialização estático \/
    //Será executado antes do construtor, apenas 1x
    //O bloco de instância é executado após o estático. O estático tem preferência por ser executado antes de tudo.
    //São executados de acordo com sua ordem, o bloco 2 será executado depois do primeiro bloco.
    {
        System.out.println("Dentro do bloco de incialização de instância");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    static {
        System.out.println("Dentro do bloco de incialização estático");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    static {
        System.out.println("Dentro do bloco de incialização estático 2");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio: Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
