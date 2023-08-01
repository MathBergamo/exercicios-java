package com.exerciciosjava.devdojo.javacore.Fmodificadorestatico.test;

import com.exerciciosjava.devdojo.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    static String test = "teste";//Essa variável só é acessível no psvm POIS ela é static, igual o psvm, caso contrário, não
    //seria possível.
    public static void main(String[] args) {
        System.out.println("Tamanho de teste: " + test.length());
        Carro carro1 = new Carro("BMW",280);
        Carro carro2 = new Carro("Mercedes",275);
        Carro carro3 = new Carro("Audi",290);
        Carro.setVelocidadeLimite(180); //O atributo VelocidadeLimite é static, logo, ele é atribuido a classe, não a instância
        //Pelo atributo ser da classe, logo, todas as instâncias irão receber o valor definido nesse atributo.
        //Não há como definir valores individuais nas instâncias quando se coloca static, ele é define o valor para todos.
        //Esse trecho de Carro.velocidadeLimite = 180 irá funcionar independente se houver objetos/instâncias ou não.

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
