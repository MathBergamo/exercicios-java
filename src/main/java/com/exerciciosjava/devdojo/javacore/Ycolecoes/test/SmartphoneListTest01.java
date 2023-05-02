package com.exerciciosjava.devdojo.javacore.Ycolecoes.test;

import com.exerciciosjava.devdojo.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC","Iphone");
        Smartphone s2 = new Smartphone("22222","Pixel");
        Smartphone s3 = new Smartphone("33333","Samsung");
        List<Smartphone> smartphones = new ArrayList<>(6);

        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);


        for (Smartphone smartphone: smartphones) {
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("22222","Pixel");
        smartphones.add(0,s4);//Adicionar objeto s4 no indíce 0

        System.out.println(smartphones.contains(s4));//O contains irá verificar pelo equals e pelo valor do objeto.
        System.out.println(smartphones.indexOf(s4));
    }
}
