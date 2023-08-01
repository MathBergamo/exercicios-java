package com.exerciciosjava.devdojo.Exercicios.Associacao.dominio;

public class Estudante {
    private String nome;
    private int idade;
    private Seminario seminario;

    public void imprime(){
        System.out.println("Aluno: "+ this.nome +"\nIdade: " + this.idade + "\nSeminário: " + seminario.getTitulo() + "\n");
    }

    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
