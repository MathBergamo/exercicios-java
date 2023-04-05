package com.exerciciosjava.devdojo.javacore.Gassociacao.test;

import com.exerciciosjava.devdojo.javacore.Gassociacao.dominio.Jogador;
import com.exerciciosjava.devdojo.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador,jogador2};

        jogador.setTime(time); //Jogador2 não foi adicionado ao time, por tanto, não irá aparecer o Pelé no Jogador
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprime();

        System.out.println("--- Time ---");
        time.imprime();
    }
}