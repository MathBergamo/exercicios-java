package com.exerciciosjava.devdojo.Exercicios.Intro.test;

import com.exerciciosjava.devdojo.Exercicios.Intro.dominio.Funcionario;

public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Sanji");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{1200,987.32,2000});
        funcionario.imprimeDados();
    }
}
