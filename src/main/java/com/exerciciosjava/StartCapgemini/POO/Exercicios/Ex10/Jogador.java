package com.exerciciosjava.StartCapgemini.POO.Exercicios.Ex10;

import java.time.LocalDate;
import java.time.Period;

public class Jogador {
    private String nome;
    private LocalDate dataNascimento;
    private String nacionalidade;
    private float altura;
    private float peso;

    public void ImprimirDados(){
        System.out.println("------ Dados do jogador ------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de nascimento: " + this.dataNascimento);
        System.out.println("Nacionalidade: " + this.nacionalidade);
        System.out.println("Altura: " + this.altura);
        System.out.println("Peso: " + this.peso);
    }

    public int calcularIdade(LocalDate dataNascimento){
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dataNascimento, hoje); //Irá ser o resultado do periodo entre a data de nascimento e Hoje.
        return periodo.getYears();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
