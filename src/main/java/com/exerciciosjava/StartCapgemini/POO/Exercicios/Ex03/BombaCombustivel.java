package com.exerciciosjava.StartCapgemini.POO.Exercicios.Ex03;

public class BombaCombustivel {
    private String tipoCombustivel;
    private float valorPorLitro;
    private float quantidadeCombustivel;

    public float abastecerPorValor(float valor){;
        quantidadeCombustivel = valor / valorPorLitro;
        return valor;
    }

    public float abastecerPorLitro(float litro){
        float valorParaPagar = litro * valorPorLitro;
        quantidadeCombustivel = litro;
        return valorParaPagar;
    }

    public void alterarValor(float valor){
        System.out.println("Alterando valor de R$" + this.valorPorLitro + " para R$" + valor + " por litro");
        valorPorLitro = valor;
    }

    public String alterarCombustivel(){
        if (tipoCombustivel.equalsIgnoreCase("Gasolina")){
            tipoCombustivel = "Etanol";
        } else if (tipoCombustivel.equalsIgnoreCase("Etanol")) {
            tipoCombustivel = "Gasolina";
        }
        return tipoCombustivel;
    }

    public float alterarQuantidadeCombustivel(float combustivel){
        System.out.println("Alterando quantidade de combustível de: " + this.quantidadeCombustivel + " para " + combustivel + "\n");
        return quantidadeCombustivel = combustivel;
    }

    public BombaCombustivel(String tipoCombustivel, float valorPorLitro, float quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorPorLitro = valorPorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public float getValorPorLitro() {
        return valorPorLitro;
    }

    public void setValorPorLitro(float valorPorLitro) {
        this.valorPorLitro = valorPorLitro;
    }

    public float getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void setQuantidadeCombustivel(float quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }
}
