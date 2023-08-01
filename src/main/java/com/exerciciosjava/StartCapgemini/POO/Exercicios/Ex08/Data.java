package com.exerciciosjava.StartCapgemini.POO.Exercicios.Ex08;

public class Data {
    int dia;
    int mes;
    int ano;

    public Data(int dia, int mes, int ano) {
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia < 0 || dia > 30){
            this.dia = 1;
        } else {
            this.dia = dia;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes < 0 || mes > 12){
            this.mes = 1;
        } else {
            this.mes = mes;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano < 0 || ano > 2023){
            this.ano = 1;
        } else {
            this.ano = ano;
        }
    }
}
