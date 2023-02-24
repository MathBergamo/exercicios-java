package com.exerciciosjava.DIO.OrangeBackEndInter.Collections.Set.Exercicios;

import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        Set<String> arco = new HashSet<>(){{
            add("Vermelho");
            add("Verde");
            add("Violeta");
            add("Azul");
            add("Amarelo");
            add("Laranja");
            add("Índigo");
        }};

        for (String cor: arco) {
            System.out.println(cor);
        }

        System.out.println();
        int quantidadeCores = 0;
        Iterator<String> iterator = arco.iterator();

        while (iterator.hasNext()){
            iterator.next(); //Essa linha de código faz o while ter um limite até a quantidade de valores que o iterator irá.
            quantidadeCores += 1;
        }
        System.out.format("Temos o total de %d cores\n", quantidadeCores);

        System.out.println();
        TreeSet<String> arco2 = new TreeSet<>(){{
            add("Vermelho");
            add("Verde");
            add("Violeta");
            add("Azul");
            add("Amarelo");
            add("Laranja");
            add("Indigo");
        }};

        System.out.println("Ordem alfabética: ");
        for (String cor: arco2) {
            System.out.print(cor+ " / ");
        }

        System.out.println();

        System.out.println("\nExiba as cores na ordem inversa da que foi informada ");
        Set<String> coresArcoIris3 = new LinkedHashSet<>(Arrays.asList("Vermelho", "Verde", "Violeta", "Azul", "Amarelo", "Laranja", "Indigo"));
        System.out.println(coresArcoIris3);

        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println();

        System.out.println("Exiba todas as cores que começam com a letra (V) ");

        for (String cor: coresArcoIris3) {
            if (cor.startsWith("V")){
                System.out.println(cor);
            }
        }

        System.out.println();

        System.out.println("Remova todas as cores que não começam com a letra (V)");

        Iterator<String> iterator2 = coresArcoIris3.iterator();
        while (iterator2.hasNext()){
            if (!iterator2.next().startsWith("V")){
                iterator2.remove();
            }
        }

        System.out.println(coresArcoIris3);

        System.out.println("Limpe o conjunto");
        coresArcoIris3.clear();

        System.out.println();
        boolean vazio = coresArcoIris3.isEmpty();

        System.out.println("Confira se o conjunto está vázio: " + vazio);
    }
}
