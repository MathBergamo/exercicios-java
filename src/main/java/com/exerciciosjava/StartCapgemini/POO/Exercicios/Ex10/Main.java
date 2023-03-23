package com.exerciciosjava.StartCapgemini.POO.Exercicios.Ex10;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Jogador atacante = new Jogador();
        Jogador meioCampo = new Jogador();
        Jogador zagueiro = new Jogador();
        ArrayList<Jogador> Jogadores = new ArrayList<>(3);
        Jogadores.add(atacante);
        Jogadores.add(meioCampo);
        Jogadores.add(zagueiro);

        atacante.setNome("Tévis");
        atacante.setDataNascimento(LocalDate.of(1980,4,22));
        atacante.setNacionalidade("Brasileiro");
        atacante.setAltura(1.78F);
        atacante.setPeso(79.8F);

        meioCampo.setNome("Xavier");
        meioCampo.setDataNascimento(LocalDate.of(1988,7,4));
        meioCampo.setNacionalidade("Brasileiro");
        meioCampo.setAltura(1.83F);
        meioCampo.setPeso(87.3F);

        zagueiro.setNome("Petrovisk");
        zagueiro.setDataNascimento(LocalDate.of(1994,2,2));
        zagueiro.setNacionalidade("Russo");
        zagueiro.setAltura(1.89F);
        zagueiro.setPeso(96.1F);

        System.out.println("------ Informações dos jogadores ------\n");

        for (Jogador jogador: Jogadores) {
            jogador.ImprimirDados();
            System.out.format("Idade: %d\n",jogador.calcularIdade(jogador.getDataNascimento()));
            if (jogador.calcularIdade(jogador.getDataNascimento()) > 35 && jogador.equals(atacante)){
                System.out.println("Aposentado!");
            } else if (jogador.calcularIdade(jogador.getDataNascimento()) > 38 && jogador.equals(meioCampo)){
                System.out.println("Aposentado!");
            } else if (jogador.calcularIdade(jogador.getDataNascimento()) > 40 && jogador.equals(zagueiro)){
                System.out.println("Aposentado!");
            } else {
                System.out.println("Não aposentado!");
            }
        }

    }
}
