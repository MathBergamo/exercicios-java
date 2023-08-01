package com.exerciciosjava.devdojo.javacore.Minterface.test;

import com.exerciciosjava.devdojo.javacore.Minterface.dominio.DataBaseLoader;
import com.exerciciosjava.devdojo.javacore.Minterface.dominio.DataLoader;
import com.exerciciosjava.devdojo.javacore.Minterface.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();
    }
}
