package com.exerciciosjava.devdojo.javacore.Npolimorfismo.test;

import com.exerciciosjava.devdojo.javacore.Npolimorfismo.dominio.Computador;
import com.exerciciosjava.devdojo.javacore.Npolimorfismo.dominio.Televisao;
import com.exerciciosjava.devdojo.javacore.Npolimorfismo.dominio.Tomate;
import com.exerciciosjava.devdojo.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao tv = new Televisao("Samsung 50\" ", 5000);//A barra invertida identifica algo como executável
        //nesse caso, ele identificará as aspas duplas, e irá considera-las para serem executadas no console.


        CalculadoraImposto.calcularImposto(computador);//Não precisou instanciar essa classe, pois ela não acessa seus atributos
        System.out.println("------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
