package com.exerciciosjava.devdojo.javacore.Npolimorfismo.test;

import com.exerciciosjava.devdojo.javacore.Npolimorfismo.repositorio.Repositorio;
import com.exerciciosjava.devdojo.javacore.Npolimorfismo.servico.RepositorioArquivo;
import com.exerciciosjava.devdojo.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import com.exerciciosjava.devdojo.javacore.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
    }
}
