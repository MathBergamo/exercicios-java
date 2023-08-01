package com.exerciciosjava.devdojo.javacore.Oexcecption.exception.dominio;

public class Funcionario extends Pessoa{
    public void salvar() throws LoginInvalidoException, ArithmeticException{//Quando você está sobrescrevendo um método com exceção, você não precisa trazer as exceções também.
        System.out.println("salvando funcionário");//Não pode declarar exceções do tipo checked aqui, só se fosse declarado antes na classe mãe (Pessoa)
    }
}
