package com.exerciciosjava.StartCapgemini.POO.Exercicios.Ex01;

import java.util.Date;

public class Pessoa {
    private String nome;
    private int dataNascimento;
    private float altura;

    public void imprimirDados(){
        System.out.format("Dados da pessoa: %s\n%s\n%.2f\n%d", this.nome,this.dataNascimento,this.altura,calcularIdade());
    }

    public int calcularIdade(){
        return 2023 - this.dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
