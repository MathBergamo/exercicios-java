package com.exerciciosjava.devdojo.javacore.Oexcecption.exception.test;

import com.exerciciosjava.devdojo.javacore.Oexcecption.exception.dominio.Leitor1;
import com.exerciciosjava.devdojo.javacore.Oexcecption.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1(); //As variáveis precisam implementar Closeable
             Leitor2 leitor2 = new Leitor2()) {//São fechados na ordem inversa em que foram declarados

        } catch (IOException e) {

        }
    }

    public static void lerArquivo2() {//Esse é o método feio para ler arquivo
        Reader reader = null; //Declarar fora do try para poder usar no finally também.

        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
