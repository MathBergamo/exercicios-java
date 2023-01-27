package com.exerciciosjava.devdojo.javacore.Bintroducaometodos.test;

import com.exerciciosjava.devdojo.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);
        pessoa.imprime();//Não é recomendável fazer dessa forma
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}