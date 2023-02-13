package com.exerciciosjava.Outros.PythonBrasil.ArraysUnidimensionais;

import java.util.ArrayList;
import java.util.Scanner;

/*
Utilize uma lista para resolver o problema a seguir. Uma empresa paga seus vendedores com base em comissões.
O vendedor recebe $200 por semana mais 9 por cento de suas vendas brutas daquela semana.
Por exemplo, um vendedor que teve vendas brutas de $3000 em uma semana recebe $200 mais 9 por cento de $3000,
ou seja, um total de $470.
Escreva um programa (usando um array de contadores) que determine quantos vendedores receberam salários
nos seguintes intervalos de valores:
$200 - $299
$300 - $399
$400 - $499
$500 - $599
$600 - $699
$700 - $799
$800 - $899
$900 - $999
$1000 em diante
 */
public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> valores = new ArrayList();
        String resposta = "";

        boolean sair = false;
        int venA = 0,venB = 0 ,venC = 0,venE = 0,venD = 0,venF = 0,venG = 0,venH = 0,venI = 0;

        while (!sair) {
            System.out.print("Valor da venda: R$");
            float venda = scanner.nextFloat();
            valores.add(venda * 0.09 + 200);

            while (!resposta.equalsIgnoreCase("sim") && !resposta.equalsIgnoreCase("não")) {
                System.out.println("Deseja continuar? [sim/não]");
                resposta = scanner.next();
                if (resposta.equalsIgnoreCase("não")) {
                    System.out.println("Finalizando..");
                    sair = true;
                } else if (resposta.equalsIgnoreCase("sim")) {
                    System.out.println("Continuando...");
                    resposta = "";
                    break;
                } else {
                    System.out.println("ERRO!");
                }
            }
        }



        for (Double valor: valores) {
            if (valor <= 299)
                venA++;
            else if (valor <= 399)
                venB++;
            else if (valor <= 499)
                venC++;
            else if (valor <= 599)
                venD++;
            else if (valor <= 699)
                venE++;
            else if (valor <= 799)
                venF++;
            else if (valor <= 899)
                venG++;
            else if (valor <= 999)
                venH++;
            else if (valor > 1000)
                venI++;
        }

        System.out.println(valores);

        System.out.println("Vendedores que renderam até $299 > " + venA);
        System.out.println("Vendedores que renderam até $399 > " + venB);
        System.out.println("Vendedores que renderam até $499 > " + venC);
        System.out.println("Vendedores que renderam até $599 > " + venD);
        System.out.println("Vendedores que renderam até $699 > " + venE);
        System.out.println("Vendedores que renderam até $799 > " + venF);
        System.out.println("Vendedores que renderam até $899 > " + venG);
        System.out.println("Vendedores que renderam até $999 > " + venH);
        System.out.println("Vendedores que renderam acima de $1000 > " + venI);
    }
}
