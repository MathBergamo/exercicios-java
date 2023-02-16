package com.exerciciosjava.Outros.AcademiaDosDevs.POO.Metodos;

public class Main {
    public static void main(String[] args) {
        Personagem personagemA = new Personagem();
        personagemA.nome = "Lietch";
        personagemA.forca = 12;
        personagemA.level = 5;

        System.out.println("LISTA DE PERSONAGENS:");
        personagemA.mostrarStatus();

        System.out.println("\nLISTA DE AÇÕES");
        personagemA.ataque("Hydra","Golpe duplo");
    }
}
