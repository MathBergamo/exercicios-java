package com.exerciciosjava.devdojo.javacore.Vio.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file)){//Try with resources
            char[] in = new char[34];
            fr.read(in);//fr.read está alocando os valores lidos em um array de caractéres
            for (char c : in) {
                System.out.print(c);
            }
            int i;
            while ((i = fr.read()) != -1){//fr.read retorna -1 quando não há mais valores para serem lidos.
                System.out.print((char) i);// utilizando cast para converter o valor retornado em ASCII do fr.read para caractéres.
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
