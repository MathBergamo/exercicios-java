package com.exerciciosjava.StartCapgemini.POO.Exercicios.Ex03;

public class Main {
    public static void main(String[] args) {
        BombaCombustivel bomba1 = new BombaCombustivel("Gasolina",5f,0f);

        System.out.println("=== Verificador da bomba de combustível ===\n");

        System.out.println("Tipo de combustível: "+bomba1.getTipoCombustivel());
        System.out.println("Valor do combustível: R$" + bomba1.getValorPorLitro());
        System.out.println("Quantidade de combustível na bomba: "+bomba1.getQuantidadeCombustivel()+"l\n");

        System.out.format("Valor a ser pago: R$%.2f\n",bomba1.abastecerPorLitro(5));
        System.out.println("Quantidade de combustível na bomba: "+bomba1.getQuantidadeCombustivel() + "l\n");

        System.out.format("Valor pago: R$%.2f\n",bomba1.abastecerPorValor(10f));
        System.out.println("Quantidade de combustível na bomba: "+bomba1.getQuantidadeCombustivel() + "l\n");

        System.out.println("Alterando combustível para: " + bomba1.alterarCombustivel());
        bomba1.alterarValor(2.5f);
        bomba1.alterarQuantidadeCombustivel(10f);

        System.out.println("Tipo de combustível: "+bomba1.getTipoCombustivel());
        System.out.println("Valor do combustível: R$" + bomba1.getValorPorLitro());
        System.out.println("Quantidade de combustível na bomba: "+bomba1.getQuantidadeCombustivel()+"l\n");

        System.out.format("Valor a ser pago: R$%.2f\n",bomba1.abastecerPorLitro(7));
        System.out.println("Quantidade de combustível na bomba: "+bomba1.getQuantidadeCombustivel() + "l\n");

        System.out.format("Valor pago: R$%.2f\n",bomba1.abastecerPorValor(12f));
        System.out.println("Quantidade de combustível na bomba: "+bomba1.getQuantidadeCombustivel() + "l\n");
    }
}
