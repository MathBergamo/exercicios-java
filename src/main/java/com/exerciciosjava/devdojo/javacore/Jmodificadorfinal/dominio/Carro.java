package com.exerciciosjava.devdojo.javacore.Jmodificadorfinal.dominio;

public class Carro { //Quando uma classe é "final", ela não pode ser estendida, ou seja, impossível usar "extends" em outras classes com ela.
    public String nome;
    public static final double VELOCIDADE_LIMITE;
    public final Comprador COMPRADOR = new Comprador(); //Variáveis do tipo reference quando são finais só podem alterar o valor, não a sua referência.

    static {
        VELOCIDADE_LIMITE = 250;
    }

    public void imprime() {
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
