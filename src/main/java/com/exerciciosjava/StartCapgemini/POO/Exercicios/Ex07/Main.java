package com.exerciciosjava.StartCapgemini.POO.Exercicios.Ex07;

public class Main {
    public static void main(String[] args) {
        Funcionario faxineiro = new Funcionario("Aldaberto"," Ferreira",1950);
        Funcionario vendedor = new Funcionario("Carlos"," Capucchi",2327);

        System.out.println("APRESENTANDO OS FUNCIONÁRIOS\n");

        System.out.println("NOME:" + faxineiro.nome + faxineiro.sobrenome);
        System.out.println("Salário mensal: R$" + faxineiro.salarioMensal);
        System.out.println("Salário anual: R$" + faxineiro.salarioMensal * 12);

        System.out.println();

        System.out.println("NOME:" + vendedor.nome + vendedor.sobrenome);
        System.out.println("Salário mensal: R$" + vendedor.salarioMensal);
        System.out.println("Salário anual: R$" + vendedor.salarioMensal * 12);

        System.out.println();
        System.out.println("AUMENTO PERCENTUAL (10%) ANUAL");
        System.out.println("------novos salários anuais -----");
        faxineiro.setSalarioMensal(faxineiro.salarioMensal += faxineiro.salarioMensal * 0.1);
        vendedor.setSalarioMensal(vendedor.salarioMensal += vendedor.salarioMensal * 0.1);

        System.out.println(faxineiro.getNome()+ ": R$" + faxineiro.salarioMensal * 12);
        System.out.println(vendedor.getNome()+ ": R$" + vendedor.salarioMensal * 12);
    }
}
