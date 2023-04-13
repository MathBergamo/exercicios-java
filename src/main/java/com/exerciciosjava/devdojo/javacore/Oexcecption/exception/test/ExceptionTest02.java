package com.exerciciosjava.devdojo.javacore.Oexcecption.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt");
        //Manter o try/catch aqui, pois é um método privado, e o tratamento pode ser mais direcionado, já que não é publico
        //E nem qualquer classe irá chama-lo.
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e) {//A variável "e" é a variável que irá receber o objeto que a excption ira lançar
            e.printStackTrace();
            throw e; //Jogar a exceção novamente faz com que seja obrigatório o "throws IOException" na assinatura do método.(checked)
        }

    }
}
