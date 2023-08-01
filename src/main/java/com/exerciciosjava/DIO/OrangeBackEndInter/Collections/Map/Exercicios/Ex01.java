package com.exerciciosjava.DIO.OrangeBackEndInter.Collections.Map.Exercicios;

import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        Map<String,Estados> estadosMap = new HashMap<>(){{
            put("PE", new Estados(9.616621));
            put("AL", new Estados(3.351543));
            put("CE", new Estados(9.187103));
            put("RN", new Estados(3.534265));
        }};

        System.out.println(estadosMap+"\n");

        System.out.println("Substitua a população do estado do RN por 3.534.165");
        estadosMap.put("RN",new Estados(3.534165));
        System.out.println(estadosMap+"\n");

        System.out.print("Confira se o estado PB está no dicionário, caso não, adicione: PB - 4.039.277 -- ");
        System.out.println(estadosMap.containsKey("PB"));
        estadosMap.put("PB",new Estados(4.039277));
        System.out.println(estadosMap+"\n");

        System.out.println("Exiba a população de PE: ");
        System.out.println(estadosMap.get("PE")+"\n");

        System.out.println("Exiba todos os estados e suas populações na ordem que foi informado");
        Map<String,Estados> estadosMap2 = new LinkedHashMap<>(){{
            put("PE", new Estados(9.616621));
            put("AL", new Estados(3.351543));
            put("CE", new Estados(9.187103));
            put("RN", new Estados(3.534265));
        }};

        System.out.println(estadosMap2+"\n");

        System.out.println("Exiba os estados e suas populações em ordem alfabética");
        Map<String, Estados> estadosMap3 = new TreeMap<>(estadosMap);
        System.out.println(estadosMap3);
    }
}

class Estados {
    private double populacao;

    public Estados(double populacao) {
        this.populacao = populacao;
    }

    public double getPopulacao() {
        return populacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estados estados = (Estados) o;
        return Double.compare(estados.populacao, populacao) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(populacao);
    }

    @Override
    public String toString() {
        return "{" +
                "populacao=" + populacao +
                '}';
    }
}