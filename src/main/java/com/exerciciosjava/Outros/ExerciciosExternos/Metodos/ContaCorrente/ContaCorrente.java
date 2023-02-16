package com.exerciciosjava.Outros.ExerciciosExternos.Metodos.ContaCorrente;

public class ContaCorrente {
    float saldo;

    void definirSaldoInicial(float num){
        saldo = num;
        System.out.format("Valor atual: %.2f\n", saldo);
    }

    void depositar(float num){
        saldo += num;
        System.out.format("Deposito de %.2f feito, Valor atual: %.2f\n", num, saldo);
    }

    boolean sacar(float num){
        if (saldo >= num){
            saldo -= num;
            System.out.format("Saque de %.2f feito, Valor atual: %.2f\n",num, saldo);
            return true;
        } else {
            System.out.format("Não foi possivel realizar o saque. Valor atual: %.2f\n",saldo);
            return false;
        }
    }
}
