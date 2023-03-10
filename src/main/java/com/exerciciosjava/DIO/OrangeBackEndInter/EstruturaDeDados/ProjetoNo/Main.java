package com.exerciciosjava.DIO.OrangeBackEndInter.EstruturaDeDados.ProjetoNo;

public class Main {
    public static void main(String[] args) {
        No no1 = new No("Conteúdo nó1");
        No no2 = new No("Conteúdo nó2");
        No no3 = new No("Conteúdo no3");
        No no4 = new No("Conteúdo no4");

        no1.setProximoNo(no2);
        no2.setProximoNo(no3);
        no3.setProximoNo(no4);

        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no4.getProximoNo());
    }
}
