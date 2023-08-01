package com.exerciciosjava.StartCapgemini.POO.Exercicios.Ex05;

public class Aluno {
    private String nome;
    private int matricula;
    private float prova1;
    private float prova2;
    private float trabalho;

    public float Media(){
        return (this.prova1 + this.prova2 + this.trabalho) / 3;
    }

    public float Final(float media){
        return 10 - (this.prova1 + this.prova2 + this.trabalho);
    }

    public Aluno(String nome, int matricula, float prova1, float prova2, float trabalho) {
        this.nome = nome;
        this.matricula = matricula;
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.trabalho = trabalho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getProva1() {
        return prova1;
    }

    public void setProva1(float prova1) {
        this.prova1 = prova1;
    }

    public float getProva2() {
        return prova2;
    }

    public void setProva2(float prova2) {
        this.prova2 = prova2;
    }

    public float getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(float trabalho) {
        this.trabalho = trabalho;
    }
}
