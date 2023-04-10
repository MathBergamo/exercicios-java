package com.exerciciosjava.devdojo.javacore.Kenum.dominio;

public enum TipoPagamento{
        DEBITO{ //Foi utilizado o control + O para sobrescrever o calcularDesconto
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.1;
            }
        },CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calcularDesconto(double valor);
}