package com.exerciciosjava.DIO.OrangeBackEndInter.Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon",18,"preto"));
            add(new Gato("Simba",6,"tigrado"));
            add(new Gato("Jon",12,"amarelo"));
        }};

        System.out.println("Por ordem de inserção: ");
        System.out.println(meusGatos);

        System.out.println();

        System.out.println("Por ordem aleatória: ");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println();

        System.out.println("Ordem Natural");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println();

        System.out.println("Ordem de Idade: ");
        Collections.sort(meusGatos,new  ComparatorIdade());
        //meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println();

        System.out.println("Ordem de cor: ");
        Collections.sort(meusGatos,new ComparatorCor());
        //meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println();

        System.out.println("Ordem Nome/Cor/Idade");
        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        //meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}
