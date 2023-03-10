package com.exerciciosjava.Outros.Testes;
// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.
// - O método .split() quebra uma String em várias substrings a partir de um caracter definido por você e coloca em um array.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;
        for(int i=0; i<=tamanhoDaFila; i++){
            if(i % 2 != 0){
                pessoasNoCamarote++;
            }
        }
        System.out.println(pessoasNoCamarote + " pessoas no camarote");
    }
}
