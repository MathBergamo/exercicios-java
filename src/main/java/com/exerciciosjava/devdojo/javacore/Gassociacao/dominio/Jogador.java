package com.exerciciosjava.devdojo.javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public void imprime(){
        System.out.println(this.nome);
        if (this.time != null){
            System.out.println(time.getNome());
        } else {
            System.out.println("Jogador não está em um time");
        }
    }

    public Jogador(String nome) { //Já que não foi definido um parâmetro e uma troca de valores para o "Time", ele não é obrigatório.
        this.nome = nome;         //Valores obrigatórios para a classe precisam ser colocados no construtor.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
