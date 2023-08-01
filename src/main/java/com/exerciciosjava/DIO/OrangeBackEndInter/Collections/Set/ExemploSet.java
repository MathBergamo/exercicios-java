package com.exerciciosjava.DIO.OrangeBackEndInter.Collections.Set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        //Criou um set e colocou um array de valores como lista dentro do set
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5 ,9.3 ,5d ,7d ,0d ,3.6));
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5.0d));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;

        while (iterator.hasNext()){
            soma += iterator.next();
        }

        System.out.format("Exiba a soma dos valores: %.2f\n", soma);

        System.out.format("Exiba a média dos valores: %.2f\n", soma / notas.size());

        System.out.print("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        Iterator<Double> iterator1 = notas.iterator();

        while (iterator1.hasNext()){
            if (iterator1.next() < 7){
                iterator1.remove();
            }
        }

        System.out.println("Remova as notas menores que 7: " + notas);

        Set<Double> notas1 = new LinkedHashSet<>(Arrays.asList(7d, 8.5 ,9.3 ,5d ,7d ,0d ,3.6));
        System.out.println("Exiba todas as notas por ordem de inserção: " + notas1);

        Set<Double> notas2 = new TreeSet<>(notas1); //Só é possivel colocar o notas1 por conta da classe Comparable
        System.out.println("Exia todas as notas por ordem crescente: " + notas2);

        System.out.println("Apague todo o conjunto: ");
        notas2.clear();
        System.out.println(notas2);

        System.out.println("O conjunto está vázio? " + notas2.isEmpty());
    }
}
