package com.exerciciosjava.Outros.PythonBrasil.ArraysUnidimensionais;

import java.util.ArrayList;
import java.util.Scanner;

/*
Faça um programa que receba a temperatura média de cada mês do ano e armazene-as em uma lista.
Após isto, calcule a média anual das temperaturas e mostre todas as temperaturas acima da média anual,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro, . . . ).
 */
public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Float> temperaturasMes = new ArrayList<>();
        String[] mes = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto",
                "Setembro","Outubro","Novembro","Dezembro",};
        float temperatura = 0, somaTemperatura = 0, mediaAnualTemperatura = 0;

        for (int i = 0; i < mes.length; i++) {
            System.out.print("Temperatura média de "+ mes[i] + ": ");
            temperatura = scanner.nextFloat();
            somaTemperatura += temperatura;
            temperaturasMes.add(temperatura);
        }

        mediaAnualTemperatura = somaTemperatura / mes.length;

        System.out.println("----- MÉDIA ANUAL:"+ mediaAnualTemperatura + " ---------");
        System.out.println("::::  TEMPERATURAS ACIMA DA MÉDIA  ::::");
        for (int i = 0; i < mes.length; i++) {
            if(temperaturasMes.get(i) > mediaAnualTemperatura){
                System.out.println(mes[i]+ ": " + temperaturasMes.get(i)+ "ºC");
            }
        }
    }
}
