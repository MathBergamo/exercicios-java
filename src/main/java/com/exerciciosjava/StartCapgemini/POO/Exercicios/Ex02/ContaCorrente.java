package com.exerciciosjava.StartCapgemini.POO.Exercicios.Ex02;

public class ContaCorrente {
    private int numeroConta;
    private String nomeCorrentista;
    private float saldo;

    public ContaCorrente(int numeroConta, String nomeCorrentista, float saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }

    public void alterarNome(String nome){
        nomeCorrentista = nome;
    }

    public void deposito(float dinheiro){
        if (dinheiro > 0) {
            saldo += dinheiro;
            System.out.println("Depósito realizado com sucesso!\nSaldo atual: R$" + saldo);
        }
    }

    public void saque(float dinheiro){
        if (saldo > 0 && dinheiro <= saldo && dinheiro > 0){
            saldo -= dinheiro;
            System.out.println("Saque realizado com sucesso!\nSaldo atual: R$" + saldo);
        } else {
            System.out.println("Não foi possível realizar o saque, valor inadequado\nSaldo atual: R$" + saldo);
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
