package com.exerciciosjava.devdojo.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjet = "home/Matheus/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjet, arquivoTxt);

        System.out.println(path1);
        System.out.println(path1.normalize());//Quando utilizamos o normalize, validamos o uso do "../", assim, retrocedendo 2 pastas.

        Path path2 = Paths.get("home/./Matheus/./dev");//Normalizando em casos desse tipo de sintaxe no Linux.
        System.out.println(path2);
        System.out.println(path2.normalize());

    }
}
