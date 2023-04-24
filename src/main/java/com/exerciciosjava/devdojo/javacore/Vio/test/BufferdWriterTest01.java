package com.exerciciosjava.devdojo.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferdWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw)) {//Encapsular a FileWriter no Buffer para ganhar otimização
            bw.write("O devDojo está me ajudando muito! Quero trabalhar na escócia como Desenvolvedor, esse é meu maior sonho!");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
