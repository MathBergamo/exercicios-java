package com.exerciciosjava.Outros.PythonBrasil.EstruturaDeRepeticao;

public class Ex04 {
    public static void main(String[] args) {
        double paisA = 80000, paisB = 200000, aumentoAnualPaisA, aumentoAnualPaisB;
        int ano = 0;

        while (paisA < paisB){
            aumentoAnualPaisA = paisA * 0.03;
            aumentoAnualPaisB = paisB * 0.015;
            paisA += aumentoAnualPaisA;
            paisB += aumentoAnualPaisB;

            ano ++;
        }
        System.out.println("PaisA = " + paisA);
        System.out.println("PaisB = " + paisB);

        System.out.println("Foram necessários " + ano + " anos para os países se igualarem de população");
    }
}
