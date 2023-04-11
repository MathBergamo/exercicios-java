package com.exerciciosjava.devdojo.javacore.Lclassesabstratas.test;

import com.exerciciosjava.devdojo.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import com.exerciciosjava.devdojo.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami",5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Matheus",4000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
