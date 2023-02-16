package com.exerciciosjava.Outros.ExerciciosExternos.Metodos.Funcionario;

public class Funcionario {
    String nome, sobrenome;
    int horasTrabalhadas;
    float valorPorHora;

    String nomeCompleto() {
        return this.nome + " " + this.sobrenome;
    }

    float calcularSalario() {
        return horasTrabalhadas * valorPorHora;
    }

    void incrementarHora(int valor) {
        horasTrabalhadas += valor;
    }
}
