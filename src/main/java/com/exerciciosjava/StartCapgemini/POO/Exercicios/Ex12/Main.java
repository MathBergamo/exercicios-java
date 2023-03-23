package com.exerciciosjava.StartCapgemini.POO.Exercicios.Ex12;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.armazenarPessoa("Anderson",19,1.78F);
        agenda.armazenarPessoa("Estevan",17,1.74F);
        agenda.armazenarPessoa("Maria",15,1.58F);

        agenda.imprimirAgenda();

        System.out.println("Indice da pessoa: " + agenda.buscarPessoa("Estevan"));
        agenda.imprimirPessoa(agenda.buscarPessoa("Estevan"));
    }
}
