package com.exerciciosjava.devdojo.introducao.EstruturaCondicionais;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulta
        String categoria;
        int idade = 12;
        if(idade < 15){
            categoria = "Categoria infantil";
        }else if(idade >= 15 && idade < 18){
            categoria = "Categoria juvenil";
        }else{
            categoria = "Categoria adulta";
        }
        System.out.println(categoria);
    }
}
