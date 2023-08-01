package com.exerciciosjava.devdojo.Exercicios.Intro;

public class EstruturadeRepeticao02{
    //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
    //Condição é que o valorParcela >= 10000
    public static void main(String[] args) {
        double valorCarro = 30000;
        for(int parcela = 1; parcela < valorCarro ; parcela++){
            double valorParcela = valorCarro / parcela;
            if (valorParcela >= 1000){
                System.out.println("Parcela "+ parcela +" Valor: R$"+ valorParcela);
            }else{
                break;
            }
        }
        //Segunda forma mais simples
        System.out.println("\n2º Forma");
        for(int parcela = 1; parcela < valorCarro ; parcela++){
            double valorParcela = valorCarro / parcela;
            if(valorParcela < 1000){
                break;
            }
            System.out.println("Parcela: " + parcela +" R$"+ valorParcela);
        }
    }
}
