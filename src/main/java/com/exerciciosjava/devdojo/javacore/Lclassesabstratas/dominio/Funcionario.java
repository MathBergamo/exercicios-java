package com.exerciciosjava.devdojo.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    public abstract void calculaBonus();

    @Override
    public void imprime() { //É necessário implementar o método da classe "avo" (Pessoa) para não dar erros nas classes filha.
        //Caso contrário, será necessário implementar os métodos da classe "avo" nas classes filha.
        System.out.println("Imprimindo");
    }
}
