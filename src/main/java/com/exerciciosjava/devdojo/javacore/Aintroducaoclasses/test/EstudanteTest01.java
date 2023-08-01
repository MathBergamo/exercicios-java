package com.exerciciosjava.devdojo.javacore.Aintroducaoclasses.test;

import com.exerciciosjava.devdojo.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Katrina";
        estudante.idade = 19;
        estudante.sexo = 'F';

        System.out.println(estudante);
    }
}
