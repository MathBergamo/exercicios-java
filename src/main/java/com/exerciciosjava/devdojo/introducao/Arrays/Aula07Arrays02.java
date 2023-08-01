package com.exerciciosjava.devdojo.introducao.Arrays;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //Valores de inicialização padrão da array.
        //byte, short, int, long, float e double: 0
        // char '\u0000' ' '
        // boolean false
        // String null
        String[] nomes = new String[3];
        nomes[0] = "Carlos";
        nomes[1] = "Alvaro";
        nomes[2] = "Cesar";

        for(int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
