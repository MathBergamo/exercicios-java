package com.exerciciosjava.devdojo.javacore.Zgenerics.test;

import com.exerciciosjava.devdojo.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> canoaMarota = criarArrayComUmObjeto(new Barco("Canoa Marota"));
        System.out.println(canoaMarota);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t){
        List<T> list = List.of(t); //List.of(t) tb pode ser o retorno
        return list;
    }
}

//class DoisAtributos<T,X,I> { }   pode ser feito quantos generics vc quiser no método
