package com.exerciciosjava.devdojo.javacore.Jmodificadorfinal.test;

import com.exerciciosjava.devdojo.javacore.Jmodificadorfinal.dominio.Carro;
import com.exerciciosjava.devdojo.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Ferrari ferrari = new Ferrari();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Audi GT");
        System.out.println(carro.COMPRADOR);
        ferrari.imprime();
        ferrari.setNome("Ferrarona");
        ferrari.imprime();
    }
}