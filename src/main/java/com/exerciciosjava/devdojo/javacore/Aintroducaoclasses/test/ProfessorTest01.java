package com.exerciciosjava.devdojo.javacore.Aintroducaoclasses.test;

import com.exerciciosjava.devdojo.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Claudio";
        professor.idade = 38;
        professor.sexo = 'M';

        System.out.println(professor.nome+ " " + professor.idade+ " " + professor.sexo);
    }
}
