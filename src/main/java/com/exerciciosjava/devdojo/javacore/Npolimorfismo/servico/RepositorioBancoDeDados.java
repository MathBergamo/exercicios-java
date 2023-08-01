package com.exerciciosjava.devdojo.javacore.Npolimorfismo.servico;

import com.exerciciosjava.devdojo.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um Banco de Dados");
    }
}
