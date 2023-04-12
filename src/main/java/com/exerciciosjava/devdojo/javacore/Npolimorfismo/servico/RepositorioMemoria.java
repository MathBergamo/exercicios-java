package com.exerciciosjava.devdojo.javacore.Npolimorfismo.servico;

import com.exerciciosjava.devdojo.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em Memória");
    }
}
