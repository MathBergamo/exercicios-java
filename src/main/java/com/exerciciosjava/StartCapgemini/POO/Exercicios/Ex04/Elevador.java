package com.exerciciosjava.StartCapgemini.POO.Exercicios.Ex04;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoas;

    public void Entra(){
        if (pessoas < capacidade){
            pessoas += 1;
            System.out.println("Pessoa entrando... Total: " + pessoas);
        } else {
            System.out.println("Elevador lotado!");
        }
    }

    public void Sai(){
        if (pessoas > 0){
            pessoas -= 1;
            System.out.println("Pessoa saindo... Total: " + pessoas);
        } else {
            System.out.println("Elevador vazio!");
        }
    }

    public void Sobe(){
        if (andarAtual != totalAndares){
            andarAtual += 1;
            System.out.println("Subindo para o " + andarAtual);
        } else {
            System.out.println("Não há mais andares para subir");
        }
    }

    public void Desce(){
        if (andarAtual > 0){
            andarAtual -= 1;
            System.out.println("Descendo para o " + andarAtual);
        }else {
            System.out.println("Não há mais andares para descer.");
        }
    }

    public Elevador(int andarAtual, int totalAndares, int capacidade, int pessoas) {
        this.andarAtual = andarAtual;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.pessoas = pessoas;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }
}
