package com.exerciciosjava.devdojo.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("----------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima:: " + this.velocidadeMaxima);
        // System.out.println("Velocidade Limite: " + this.velocidadeLimite); > o atributo não deve ser acessado dessa forma, this se refere a uma instância de objeto
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite); //> forma certa de obter um atributo com static
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }
}
