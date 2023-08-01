package com.exerciciosjava.devdojo.javacore.Bintroducaometodos.test;

import com.exerciciosjava.devdojo.javacore.Bintroducaometodos.dominio.Estudante;
import com.exerciciosjava.devdojo.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante.nome = "Mathias";
        estudante.idade = 22;
        estudante.sexo = 'M';

        estudante2.nome = "Maria";
        estudante2.idade = 25;
        estudante2.sexo = 'F';

        impressora.imprime(estudante);
        System.out.println("-----------------------------------");
        impressora.imprime(estudante);
        System.out.println("\n");
        impressora.imprime(estudante2);
        System.out.println("-----------------------------------");
        impressora.imprime(estudante2);

    }
}
