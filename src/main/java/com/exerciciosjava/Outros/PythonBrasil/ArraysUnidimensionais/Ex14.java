package com.exerciciosjava.Outros.PythonBrasil.ArraysUnidimensionais;
/*
Utilizando listas faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?" O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice"
e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> pontuacao = new ArrayList<String>();

        while(true){
            System.out.println("Você telefonou para a vítima? [sim/não]");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("sim")){
                pontuacao.add(resposta);
                break;
            }else if(!resposta.equalsIgnoreCase("sim") && !resposta.equalsIgnoreCase("não")){
                System.out.println("Digite SIM ou NÃO.");
            }else{
                break;
            }
        }

        while(true){
            System.out.println("Você estava no local do crime? [sim/não]");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("sim")){
                pontuacao.add(resposta);
                break;
            }else if(!resposta.equalsIgnoreCase("sim") && !resposta.equalsIgnoreCase("não")){
                System.out.println("Digite SIM ou NÃO.");
            }else{
                break;
            }
        }

        while(true){
            System.out.println("Você mora próximo a vítima?? [sim/não]");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("sim")){
                pontuacao.add(resposta);
                break;
            }else if(!resposta.equalsIgnoreCase("sim") && !resposta.equalsIgnoreCase("não")){
                System.out.println("Digite SIM ou NÃO.");
            }else{
                break;
            }
        }

        while(true){
            System.out.println("Você devia para a vítima? [sim/não]");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("sim")){
                pontuacao.add(resposta);
                break;
            }else if(!resposta.equalsIgnoreCase("sim") && !resposta.equalsIgnoreCase("não")){
                System.out.println("Digite SIM ou NÃO.");
            }else{
                break;
            }
        }

        while(true){
            System.out.println("Você já trabalhou com a vítima? [sim/não]");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("sim")){
                pontuacao.add(resposta);
                break;
            }else if(!resposta.equalsIgnoreCase("sim") && !resposta.equalsIgnoreCase("não")){
                System.out.println("Digite SIM ou NÃO.");
            }else{
                break;
            }
        }

        int pontos = pontuacao.size();

        switch (pontos){
            case 0, 1:
                System.out.println("Inocente");
                break;
            case 2:
                System.out.println("Suspeito!");
                break;
            case 3, 4:
                System.out.println("Cúmplice!");
                break;
            case 5:
                System.out.println("ASSASINO!");
                break;
        }
    }
}

