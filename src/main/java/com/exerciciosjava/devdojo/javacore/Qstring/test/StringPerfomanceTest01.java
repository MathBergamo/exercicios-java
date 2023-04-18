package com.exerciciosjava.devdojo.javacore.Qstring.test;

public class StringPerfomanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100_000); //Muito tempo de execução dependendo do tamanho que a string tem.
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para string: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100_000); //Melhor ganho de desempenho
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para stringBuilder: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100_000); //Melhor ganho de desempenho utilizando multi-threads
        System.out.println("Tempo gasto para stringBuffer: " + (fim - inicio) + "ms");
    }

    private static void concatString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho){
        StringBuffer sbuf = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sbuf.append(i);
        }
    }
}
