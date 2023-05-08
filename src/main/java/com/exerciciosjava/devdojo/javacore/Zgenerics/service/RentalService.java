package com.exerciciosjava.devdojo.javacore.Zgenerics.service;

import com.exerciciosjava.devdojo.javacore.Zgenerics.dominio.Carro;

import java.util.List;

public class RentalService<T> {//T é type, que é representado para o generics
    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis){
        this.objetosDisponiveis = objetosDisponiveis;
    }
    public T buscarObjetoDisponivel() {
        System.out.println("Busncando objeto disponível...");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando carro: " + t);
        System.out.println("Carros disponíveis para alugar:");
        System.out.println(objetosDisponiveis);
        ;
        return t;
    }

    public void retornarObjetoAlugado(T t) {
        System.out.println("Devolvendo carro " + t);
        objetosDisponiveis.add(t);
        System.out.println("Carros disponíveis para alugar:");
        System.out.println(objetosDisponiveis);
    }
}
