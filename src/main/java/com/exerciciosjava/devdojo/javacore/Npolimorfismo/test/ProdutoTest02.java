package com.exerciciosjava.devdojo.javacore.Npolimorfismo.test;

import com.exerciciosjava.devdojo.javacore.Npolimorfismo.dominio.Computador;
import com.exerciciosjava.devdojo.javacore.Npolimorfismo.dominio.Produto;
import com.exerciciosjava.devdojo.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        Produto produto2 = new Tomate("Verde", 10);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("-----------------------------------");
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
