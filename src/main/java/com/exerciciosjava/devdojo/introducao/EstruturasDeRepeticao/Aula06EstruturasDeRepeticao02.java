package com.exerciciosjava.devdojo.introducao.EstruturasDeRepeticao;

public class Aula06EstruturasDeRepeticao02 {
    //Imprima os primeiros 25 numeros de um dado valor. Exemplo: 50
    public static void main(String[] args) {
        for(int i=0;i<50;i++){
            System.out.println(i);
            if(i == 25){
                break;
            }
        }
    }
}
