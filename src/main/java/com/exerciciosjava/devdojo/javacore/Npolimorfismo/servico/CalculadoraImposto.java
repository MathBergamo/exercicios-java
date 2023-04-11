package com.exerciciosjava.devdojo.javacore.Npolimorfismo.servico;

import com.exerciciosjava.devdojo.javacore.Npolimorfismo.dominio.Produto;

public class CalculadoraImposto {
    //Está classe não está acessando nenhum atributo de classe, ou seja, ela pode ter seus métodos colocados em static.
    //Método com o mesmo nome do método das classes que serão recebidas no parâmetro desse método. (irá executar os dois, preferência para a classe)
    public static void calcularImposto(Produto produto){
        double imposto = produto.calcularImposto();
        System.out.println("Relatório de imposto");
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }
}
