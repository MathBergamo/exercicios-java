package com.exerciciosjava.devdojo.javacore.Npolimorfismo.test;

import com.exerciciosjava.devdojo.javacore.Npolimorfismo.dominio.Computador;
import com.exerciciosjava.devdojo.javacore.Npolimorfismo.dominio.Produto;
import com.exerciciosjava.devdojo.javacore.Npolimorfismo.dominio.Tomate;
import com.exerciciosjava.devdojo.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        Tomate tomate = new Tomate("Verde", 20);

        tomate.setDataValidade("11/12/2021");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------------------------");
        CalculadoraImposto.calcularImposto(produto); //-> esse código iria resultar em ClassCast exception, O java está esperando apenas Tomate.
    }
}
