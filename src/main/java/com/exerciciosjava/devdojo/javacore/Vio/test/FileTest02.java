package com.exerciciosjava.devdojo.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDirectoryCreated = fileDiretorio.mkdir();
        System.out.println(isDirectoryCreated);
        //File fileArquivoDiretorio = new File("E:\\Estudos\\Cursos\\Github\\Exercicios\\Java\\exercicios-java\\pasta\\arquivo.txt"); -- Colocar o nome do arquivo no final do path para cria-lo
        File fileArquivoDiretorio = new File(fileDiretorio,"arquivo.txt");//utilizar a referência do path "pasta" como argumento para definir onde será criado o arquivo.txt

        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println(isFileCreated);

        File fileRenamed = new File(fileDiretorio,"arquivo_renomeado.txt");//Se não colocar diretório, o arquivo irá para a raiz do projeto.
        boolean renameTo = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(renameTo);

        File directoryRename = new File("pasta_renomeada");
        boolean renameDirectory = fileDiretorio.renameTo(directoryRename);
        System.out.println(renameDirectory);
    }
}
