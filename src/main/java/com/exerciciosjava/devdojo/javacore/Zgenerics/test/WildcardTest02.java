package com.exerciciosjava.devdojo.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

        printConsulta(cachorros);
        printConsulta(gatos);
        List<Animal> animals = new ArrayList<>();
        printConsulta(animals);
        printConsulta(cachorros);
        printConsultaAnimal(animals);
    }

    //Uma vez que o código é compilado, o Java não sabe que tipo de lista é passado.
    //Type erasure: ignorar o tipo de valor do generics em tempo de compilação
    private static void printConsulta(List<? extends Animal> animals){//só funciona extends no caso de parâmetros do métodos aqui, classes filho
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    private static void printConsultaAnimal(List<? super Cachorro> animals) {//Lista que pode receber "pai" ao in´ves de filho
        for (Object o : animals){//Utilizar object por conta da hierarquia conforme o parâmetro recebido
            if (o instanceof Cachorro){
                System.out.println(o);
            }
        }
    }
}