package com.exerciciosjava.devdojo.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Levi,Eren,Mikasa,true,200";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");//Aqui definimos o delimitador da Scanner, trocando seu padrão que é um espaço em branco (" ")
        while (scanner.hasNext()){ //No while, ele já converte o valor em String para o valor que ele pode representar ( true = boolean, 200 = int)
            if (scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println("int = " + i);
            } else if (scanner.hasNextBoolean()){
                boolean bool = scanner.nextBoolean();
                System.out.println("boolean = " + bool);
            } else {
                System.out.println("String = " + scanner.next());
            }
        }

    }
}
