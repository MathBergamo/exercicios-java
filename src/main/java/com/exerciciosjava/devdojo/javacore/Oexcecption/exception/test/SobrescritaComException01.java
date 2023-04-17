package com.exerciciosjava.devdojo.javacore.Oexcecption.exception.test;

import com.exerciciosjava.devdojo.javacore.Oexcecption.exception.dominio.Funcionario;
import com.exerciciosjava.devdojo.javacore.Oexcecption.exception.dominio.LoginInvalidoException;
import com.exerciciosjava.devdojo.javacore.Oexcecption.exception.dominio.Pessoa;

public class SobrescritaComException01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
}
