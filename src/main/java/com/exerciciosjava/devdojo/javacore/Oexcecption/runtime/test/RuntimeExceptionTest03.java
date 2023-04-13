package com.exerciciosjava.devdojo.javacore.Oexcecption.runtime.test;

public class RuntimeExceptionTest03 {

    public static void main(String[] args) {
        abreConexao2();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "conexão aberta"; //Antes de dar o retorno, o finally foi executado.
        } catch (Exception e) {
            e.printStackTrace();
        } finally { //o bloco finally SEMPRE será executado, independente da exceção ou não.
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }

    private static void abreConexao2() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
