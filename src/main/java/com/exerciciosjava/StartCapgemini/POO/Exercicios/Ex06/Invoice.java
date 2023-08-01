package com.exerciciosjava.StartCapgemini.POO.Exercicios.Ex06;

public class Invoice {
    private int numero;
    private String descricao;
    private int quantidadeComprada;
    private float preco;

    public Invoice(int numero, String descricao, int quantidadeComprada, float preco) {
        this.setQuantidadeComprada(quantidadeComprada);
        this.setPreco(preco);
        this.setNumero(numero);
        this.setDescricao(descricao);
    }

    public double getInvoiceAmount() {
        return this.quantidadeComprada * preco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        if (quantidadeComprada < 0) {
            this.quantidadeComprada = 0;
        } else {
            this.quantidadeComprada = quantidadeComprada;
        }
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if (preco < 0) {
            this.preco = 0;
        } else {
            this.preco = preco;
        }
    }
}

