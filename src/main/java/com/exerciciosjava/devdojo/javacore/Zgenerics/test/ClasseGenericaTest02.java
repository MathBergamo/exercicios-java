package com.exerciciosjava.devdojo.javacore.Zgenerics.test;

import com.exerciciosjava.devdojo.javacore.Zgenerics.dominio.Barco;
import com.exerciciosjava.devdojo.javacore.Zgenerics.service.BarcoRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando barco por um mês...");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
