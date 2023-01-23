package com.exerciciosjava.devdojo.introducao.EstruturasDeRepeticao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args){
        double valorTotal = 30000;
        for (int parcela = (int)valorTotal; parcela >= 1; parcela--){//Decrementando
            double valorParcela = valorTotal / parcela;//Lembrar: parcela e valorTotal valem 30000 no primeiro loop.
            if(valorParcela < 1000){//Até o resultado da divisão entre o valor total e a parcela ser menor que 1.
                continue;
            }
            System.out.println("Parcela "+parcela+" R$"+valorParcela);
        }
    }
}
