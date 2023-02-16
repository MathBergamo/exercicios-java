package com.exerciciosjava.Outros.AcademiaDosDevs.POO.Metodos;

import java.util.Random;

public class Personagem {
    String nome;
    int level;
    int forca;

    void mostrarStatus(){
        System.out.format("Nome: %s\n",nome);
        System.out.format("Força: %d\n",forca);
        System.out.format("Level: %d\n",level);
    }

    int calcularDano(){
        Random random = new Random();
        int dado20Faces = 1 + random.nextInt(19);
        int dano = forca + dado20Faces;
        return dano;
    }

    void ataque(String alvo, String habilidade) {
        int danoCausado = calcularDano();
        if (habilidade.length() == 0) {
            System.out.format("%s causou %d de dano em %s\n", nome, danoCausado, alvo);
        } else {
            System.out.format("%s usou %s em %s e causou %d de dano.\n",nome ,habilidade, alvo, danoCausado);
        }
    }

}
