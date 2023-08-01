package com.exerciciosjava.devdojo.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest03 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/Matheus");//Caminho relativo, pois não tem uma barra inicial antes do "home", Caminho abosoluto: /home/Matheus
        Path arquivo = Paths.get("dev/arquivo.txt");//Esse não funcionará, pois não existe "dev" depois da root do projeto.
        Path resolve = dir.resolve(arquivo);//Aqui ele resolve o problema do "arquivo"
        System.out.println(resolve);

        Path absoluto = Paths.get("/home/Matheus");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");

        System.out.println("1 " + absoluto.resolve(relativo));
        System.out.println("2 " + absoluto.resolve(file));
        System.out.println("3 " + relativo.resolve(absoluto));//Não tem como resolver caminho relativo para absoluto
        System.out.println("4 " + relativo.resolve(file));
        System.out.println("5 " + file.resolve(absoluto));//Mesma situação, não há como resovler caminho absoluto
        System.out.println("6 " + file.resolve(relativo));
    }
}
