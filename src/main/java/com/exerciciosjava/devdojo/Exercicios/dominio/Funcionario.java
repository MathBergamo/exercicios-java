package com.exerciciosjava.devdojo.Exercicios.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimeDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }
            for (double salario : salarios) {
                System.out.print(salario + " / ");
            }

        mediaSalarios();
    }

    public void mediaSalarios() {
        if (salarios == null) {
            return;
        }
        double media = 0;

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia Salarial: " + media);
    }
}
