package com.exerciciosjava.DIO.OrangeBackEndInter.POO.Polimorfismo.Cast;

public class Main {
    public static void main(String[] args) {
        //INSTÂNCIAMENTO
        Funcionario funcionario = new Funcionario();

        //UPCAST
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //DOWNCAST
        //Ocorrerá o erro de ClassCastException se a linha de baixo não for comentada. (Evitar usar downcast, muito propício a erro)
        //Vendedor vendedor1 = (Vendedor) new Funcionario();
    }
}
