package com.exerciciosjava.devdojo.javacore.Zgenerics.test;

import com.exerciciosjava.devdojo.javacore.Zgenerics.dominio.Carro;
import com.exerciciosjava.devdojo.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando carro por um mês...");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
