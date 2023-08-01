package com.exerciciosjava.StartCapgemini.POO.Heranca;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Vendedor v = new Vendedor();
        Motorista m = new Motorista();

        v.setNome("Marcio");
        v.setSalario(1000.0f);
        v.setCpf("23152563");
        v.setDaatANascimento(new Date());
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(10);
        v.calcularSalario();

        System.out.println("O salário do vendedor é: "+ v.calcularSalario());


    }
}
