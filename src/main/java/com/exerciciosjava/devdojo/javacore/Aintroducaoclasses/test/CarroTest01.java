package com.exerciciosjava.devdojo.javacore.Aintroducaoclasses.test;

import com.exerciciosjava.devdojo.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Citroen";
        carro.modelo = "C3";
        carro.ano = 2011;

        carro2.nome = "BMW";
        carro2.modelo = "Mini-cooper";
        carro2.ano = 2022;

        carro2 = carro;

        System.out.println("Carro 1: "+ carro.nome +" "+ carro.modelo +" "+ carro.ano);
        System.out.println("Carro 2: "+ carro2.nome +" "+ carro2.modelo +" "+ carro2.ano);
    }
}
