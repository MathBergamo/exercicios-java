package com.exerciciosjava.Outros.AcademiaDosDevs.POO.IntroClasses;

public class Main {
    public static void main(String[] args) {
        Celular celularA = new Celular();// Declarando um objeto do tipo celular = Instânciar um objeto (criar um novo objeto)
        celularA.nome = "Iphone 12";
        celularA.tamanhoTela = 6.1f;
        celularA.espaçoArmazenamento = 256;
        celularA.sistemaOperacional = "iOS";

        Celular celularB = new Celular();//Instânciando um novo objeto ( new Celular )
        celularB.nome = "Galaxy Note 20 Ultra";
        celularB.tamanhoTela = 6.9f;
        celularB.espaçoArmazenamento = 256;
        celularB.sistemaOperacional = "Android";

        Celular celularC = new Celular();
        celularC.nome = "Xiaomi 11 Pro";
        celularC.tamanhoTela = 6.81f;
        celularC.espaçoArmazenamento = 128;
        celularC.sistemaOperacional = "Android";


        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\n", celularA.nome, celularA.tamanhoTela, celularA
                .espaçoArmazenamento, celularA.sistemaOperacional);
        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\n", celularB.nome, celularB.tamanhoTela, celularB
                .espaçoArmazenamento, celularB.sistemaOperacional);
        System.out.format("Celular %s com tela de %.2f, com %dgb e SO %s", celularC.nome, celularC.tamanhoTela, celularC
                .espaçoArmazenamento, celularC.sistemaOperacional);
    }
}
