package com.exerciciosjava.StartCapgemini.POO.Exercicios.Ex14;

public class Fatura {
    private String numero;
    private String descricao;
    private int quantidadeCompradaDeUmItem;
    private double precoPorItem;

    public Fatura(String numero, String descricao, int quantidadeCompradaDeUmItem, double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidadeCompradaDeUmItem = quantidadeCompradaDeUmItem;
        this.precoPorItem = precoPorItem;
    }

    public double getTotalFatura(){
        if (this.quantidadeCompradaDeUmItem < 0 || this.precoPorItem < 0){
            return 0;
        }
        return this.quantidadeCompradaDeUmItem * precoPorItem;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeCompradaDeUmItem() {
        return quantidadeCompradaDeUmItem;
    }

    public void setQuantidadeCompradaDeUmItem(int quantidadeCompradaDeUmItem) {
        if (quantidadeCompradaDeUmItem < 0){
            this.quantidadeCompradaDeUmItem = 0;
        }else {
            this.quantidadeCompradaDeUmItem = quantidadeCompradaDeUmItem;
        }
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        if (precoPorItem < 0){
            this.precoPorItem = 0;
        }else {
            this.precoPorItem = precoPorItem;
        }
    }
}
