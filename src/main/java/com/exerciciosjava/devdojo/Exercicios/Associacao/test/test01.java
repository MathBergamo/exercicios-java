package com.exerciciosjava.devdojo.Exercicios.Associacao.test;

import com.exerciciosjava.devdojo.Exercicios.Associacao.dominio.Estudante;
import com.exerciciosjava.devdojo.Exercicios.Associacao.dominio.Local;
import com.exerciciosjava.devdojo.Exercicios.Associacao.dominio.Professor;
import com.exerciciosjava.devdojo.Exercicios.Associacao.dominio.Seminario;

public class test01 {
    public static void main(String[] args) {
        Local enderecoRaimundos = new Local("Avenida Raimundos 666");

        Estudante alunoEduardo = new Estudante("Eduardo", 14);
        Estudante alunoFabricio = new Estudante("Fabricio", 17);
        Estudante alunoLucas = new Estudante("Lucas", 16);
        Estudante[] estudantes = new Estudante[]{alunoEduardo, alunoFabricio, alunoLucas};

        Seminario seminarioCiencias = new Seminario("Ciências", estudantes, enderecoRaimundos);
        Seminario seminarioHistoria = new Seminario("História",enderecoRaimundos);
        Seminario[] seminarios = new Seminario[]{seminarioHistoria, seminarioCiencias};
        Professor professorPaulo = new Professor("Paulo", "Ciencias", seminarios);

        alunoEduardo.setSeminario(seminarioCiencias);
        alunoFabricio.setSeminario(seminarioCiencias);
        alunoLucas.setSeminario(seminarioCiencias);

        professorPaulo.imprime();
    }
}
