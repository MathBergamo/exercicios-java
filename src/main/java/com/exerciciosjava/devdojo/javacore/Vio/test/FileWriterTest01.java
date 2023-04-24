package com.exerciciosjava.devdojo.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");//true permite a concatenação do que for escrito no write
        try(FileWriter fw = new FileWriter(file,true)) { //Esse try utiliza o fw.close() automaticamente (try with resources, precisa ser Closeable)
            //FileWirter recebe um file por conta do encadeamento que essas clases irão ter.
            fw.write("O devDojo está me ajudando muito!\nQuero trabalhar na escócia como Desenvolvedor, esse é meu maior sonho!");
            fw.flush();// "Cospe" tudo que sobrou no buffer do recurso utilizado pelo sistema operacional, necessário utiliza-lo no final.

            //fw.close(); -- Escrita de arquivo utilizar recursos do Sistema Operacional, então é necessário utilizar o fw.close()
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
