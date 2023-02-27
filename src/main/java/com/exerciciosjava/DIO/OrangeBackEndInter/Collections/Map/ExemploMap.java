package com.exerciciosjava.DIO.OrangeBackEndInter.Collections.Map;

import java.util.*;

/*
modelo = gol - consumo = 14,4km/l
modelo = uno - consumo = 15,6km/l
modelo = mobi - consumo = 16,1km/l
modelo = hb20 - consumo = 14,5km/l
modelo = kwid - consumo = 15,6km/l

- As linhas comentadas no corpo do psvm não são possíveis de realiza-las usando o Map.
 */
public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares);

        System.out.println("\nSustitua o consumoMaisEficiente do gol por 15,2km/l");
        carrosPopulares.put("gol",15.2);
        System.out.println(carrosPopulares);

        System.out.println("\nConfira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        System.out.println("\nExiba o consumoMaisEficiente do uno: " + carrosPopulares.get("uno"));

        //System.out.println("\nExiba o terceiro modelo adicionado: " + );

        System.out.println("\nExiba os modelos: " + carrosPopulares.keySet());//Aqui ele retorna um set

        System.out.println("\nExiba os consumoMaisEficiente dos carros: " + carrosPopulares.values());//Aqui ele retorna uma Collection

        System.out.println("\nExiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());//Aqui ele retorna o maior valor dos valores de do Map carrosPopulares por meio do método max da Collections
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();//A interface entry tem o getKey e o getValue. Se torna um set, sendo cada Entries do tipo Map.Entry<String, double>
        String modeloMaisEficiente = "";
        for (Map.Entry<String,Double> entry: entries) {
            if (entry.getValue().equals(consumoMaisEficiente)){//Se o valor da entrada do set for igual ao Collections.max do valor de carros populares..
                modeloMaisEficiente = entry.getKey(); //Essa lógica é usada para ver se existe 1 ou mais chaves com o mesmo valor de Collections.max
                System.out.println(modeloMaisEficiente);
            }
        }
        System.out.format("\nModelo: %s / Cosumo: %s", modeloMaisEficiente, consumoMaisEficiente);

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String,Double> entry: carrosPopulares.entrySet())
            if (entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
            }
        System.out.format("\n\nExiba o modelo menos econômico e seu consumo: %s / %s",modeloMenosEficiente,consumoMenosEficiente);

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double somaConsumo = 0d;
        while (iterator.hasNext()){
            somaConsumo += iterator.next();
        }
        System.out.println("\n\nExiba a soma dos consumos: " + somaConsumo);

        double mediaConsumo = somaConsumo / carrosPopulares.size();
        System.out.println("\nExiba a média de consumo dos carros: " + mediaConsumo);

        Iterator<Double> iterator2 = carrosPopulares.values().iterator();
        while (iterator2.hasNext()){
            if (iterator2.next().equals(15.6)){
                iterator2.remove();
            }
        }
        System.out.println("\nRemova os modelos com consumo igual a 15,6km/l: " + carrosPopulares);

        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println("\nExiba todos os carros na ordem em que foram informados: " + carrosPopulares2);

        Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);
        System.out.println("\nExiba o dicionário ordenado pelo modelo: " + carrosPopulares3);

        carrosPopulares3.clear();
        System.out.println("\nApague o dicionário de carros: " + carrosPopulares3);

        System.out.println("\nConfira se o dicionário está vazio: " + carrosPopulares3.isEmpty());
    }
}
