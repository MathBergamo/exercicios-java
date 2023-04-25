package com.exerciciosjava.devdojo.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("E:\\Estudos\\Cursos\\Github\\Exercicios\\Java\\exercicios-java\\file.txt");//A implementação da interface Path também é baseada no SO
        Path p2 = Paths.get("E:\\Estudos\\Cursos\\Github\\Exercicios\\Java\\exercicios-java", "file.txt");//Path é sobrecarregada, logo, pode receber parâmetros de outras formas.
        Path p3 = Paths.get("E","Estudos\\Cursos\\Github\\Exercicios\\Java\\exercicios-java","file.txt");
        Path p4 = Paths.get("E","Estudos","Cursos","Github","Exercicios","Java","exercicios-java","file.txt");

        System.out.println(p1.getFileName().toFile().toPath());//pegou o nome, transformou em File, depois em um Path.
        System.out.println(p2.getFileName().toFile());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());


    }
}
