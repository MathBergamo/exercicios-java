package com.exerciciosjava.StartCapgemini.POO.Exercicios.Ex12;

import java.util.LinkedList;

public class Agenda {

    private Pessoa[] pessoas;
    private int contador;

    public Agenda() {
        this.pessoas = new Pessoa[10];
        this.contador = 0;
    }

    public void armazenarPessoa(String nome, int idade, float altura) {
        if(contador < 10) {
            Pessoa novaPessoa = new Pessoa(nome, idade, altura);
            this.pessoas[contador] = novaPessoa;
            contador++;
        } else {
            System.out.println("Agenda cheia!");
        }
    }

    public void removerPessoa(String nome) {
        for(int i = 0; i < contador; i++) {
            if(pessoas[i].getNome().equals(nome)) {
                for(int j = i; j < contador - 1; j++) {
                    pessoas[j] = pessoas[j+1];
                }
                contador--;
                break;
            }
        }
    }

    public int buscarPessoa(String nome) {
        for(int i = 0; i < contador; i++) {
            if(pessoas[i].getNome().equals(nome)) {
                return i;
            }
        }
        return -1;
    }

    public void imprimirAgenda() {
        for(int i = 0; i < contador; i++) {
            System.out.println("Nome: " + pessoas[i].getNome());
            System.out.println("Idade: " + pessoas[i].getIdade());
            System.out.println("Altura: " + pessoas[i].getAltura());
            System.out.println("-----------------------");
        }
    }

    public void imprimirPessoa(int index) {
        System.out.println("Nome: " + pessoas[index].getNome());
        System.out.println("Idade: " + pessoas[index].getIdade());
        System.out.println("Altura: " + pessoas[index].getAltura());
        System.out.println("-----------------------");
    }
}
