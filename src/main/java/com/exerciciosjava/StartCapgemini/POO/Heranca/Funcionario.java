package com.exerciciosjava.StartCapgemini.POO.Heranca;

import java.util.Date;

public class Funcionario {
    private String nome;
    private String cpf;
    private Date daatANascimento;
    private float salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDaatANascimento() {
        return daatANascimento;
    }

    public void setDaatANascimento(Date daatANascimento) {
        this.daatANascimento = daatANascimento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
