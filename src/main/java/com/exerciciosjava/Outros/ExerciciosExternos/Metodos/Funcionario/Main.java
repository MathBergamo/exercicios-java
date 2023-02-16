package com.exerciciosjava.Outros.ExerciciosExternos.Metodos.Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Luis";
        funcionario.sobrenome = "Silva";
        funcionario.horasTrabalhadas = 10;
        funcionario.valorPorHora = 25.50f;

        funcionario.nomeCompleto();
        System.out.println(funcionario.nomeCompleto());

        funcionario.calcularSalario();
        System.out.println(funcionario.calcularSalario());

        funcionario.incrementarHora(10);
        System.out.println(funcionario.calcularSalario());



    }
}
