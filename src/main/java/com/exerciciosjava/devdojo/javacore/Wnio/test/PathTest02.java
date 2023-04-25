package com.exerciciosjava.devdojo.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta");
        if (Files.notExists(pastaPath)){//O "if" está impedindo uma exceção caso a pasta já exista.
            Path pastaDirectory = Files.createDirectory(pastaPath);//Será utilizado quando não houver subpastas/subdiretórios
        }

        Path subpastaPath = Paths.get("pasta/subpasta/subpasta");
        Path subPastaDirectories = Files.createDirectories(subpastaPath);
        Path filePath = Paths.get(subpastaPath.toString(),"file.txt");//Criando caminho do file e planejamento do mesmo.

        if (Files.notExists(filePath)){//Impedindo exceção caso o arquivo já exista.
            Path filePathCreated = Files.createFile(filePath);//Criando o arquivo.
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(),"file_renamed.txt");
        Files.copy(source,target);
    }
}
