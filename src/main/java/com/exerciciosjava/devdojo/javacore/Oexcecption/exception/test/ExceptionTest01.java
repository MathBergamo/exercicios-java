package com.exerciciosjava.devdojo.javacore.Oexcecption.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException ex){//A variável "e" é a variável que irá receber o objeto que a excption ira lançar
            ex.printStackTrace();
        }

    }
}
