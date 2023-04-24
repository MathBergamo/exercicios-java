package com.exerciciosjava.devdojo.javacore.Vio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file)){//Try with resources
            BufferedReader br = new BufferedReader(fr);
            String linha;
            while ((linha = br.readLine()) != null){//Ler uma linha inteira é melhor do que a leitura por caractér em termos de performace.
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
