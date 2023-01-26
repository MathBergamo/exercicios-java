package com.exerciciosjava.devdojo.javacore.Bintroducaometodos.test;

import com.exerciciosjava.devdojo.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        estudante.nome = "Mathias";
        estudante.idade = 22;
        estudante.sexo = 'M';

        estudante2.nome = "Maria";
        estudante2.idade = 25;
        estudante2.sexo = 'F';

        estudante.imprime();
        estudante2.imprime();
    }
}
