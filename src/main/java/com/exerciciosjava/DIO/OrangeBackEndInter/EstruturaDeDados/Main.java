package com.exerciciosjava.DIO.OrangeBackEndInter.EstruturaDeDados;

public class Main {
    public static void main(String[] args) {
        no no1 = new no("Conteúdo nó1");

        no no2 = new no("Conteúdo no2");

        no1.setProximoNo(no2);

        no no3 = new no("Conteúdo no3");

        no2.setProximoNo(no3);

        no no4 = new no("Conteúdo no4");

        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2.getProximoNo());
        System.out.println(no3.getProximoNo());

        System.out.println("--------------------------------------------------------");

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
        //no1 > no2 > no3 > no4 > null
    }
}
