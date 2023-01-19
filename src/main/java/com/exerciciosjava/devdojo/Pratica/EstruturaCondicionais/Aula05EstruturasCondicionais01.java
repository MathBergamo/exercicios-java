package com.exerciciosjava.devdojo.Pratica.EstruturaCondicionais;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args){
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if(isAutorizadoComprarBebida){
            System.out.println("Pode comprar bebida alcoolica");
        }else{
            System.out.println("Não pode comprar");
        }

        if(!isAutorizadoComprarBebida){
            System.out.println("Não autorizado");
        }
    }
}
