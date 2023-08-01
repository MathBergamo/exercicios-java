package com.exerciciosjava.devdojo.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created? " + isCreated);
            System.out.println("Path: " + file.getPath());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Is directory? " + file.isDirectory());
            System.out.println("Is File? " + file.isFile());
            System.out.println("Is Hidden? " + file.isHidden());
            System.out.println("last modified: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDate());
            boolean exists = file.exists();
            if (exists){
                System.out.println("Deleted? " + file.delete());//file.delete irá executar mesmo que esteja dentro do sout
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
