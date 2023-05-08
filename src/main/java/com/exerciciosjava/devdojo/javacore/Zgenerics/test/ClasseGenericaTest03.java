package com.exerciciosjava.devdojo.javacore.Zgenerics.test;

import com.exerciciosjava.devdojo.javacore.Zgenerics.dominio.Barco;
import com.exerciciosjava.devdojo.javacore.Zgenerics.dominio.Carro;
import com.exerciciosjava.devdojo.javacore.Zgenerics.service.BarcoRentavelService;
import com.exerciciosjava.devdojo.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);//Aqui você pode colocar qualquer tipo de lista no rentalService por conta do generics que foi colocado nessa classe
        Carro carro = rentalService.buscarObjetoDisponivel();
        rentalService.retornarObjetoAlugado(carro);
    }
}
