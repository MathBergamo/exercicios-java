package com.exerciciosjava.devdojo.javacore.Xserializacao.test;

import com.exerciciosjava.devdojo.javacore.Xserializacao.dominio.Aluno;
import com.exerciciosjava.devdojo.javacore.Xserializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L,"Matheus Bergamo", "12344321");//O construtor não é executado no momento da deserialização
        Turma turma = new Turma("Maratona Java Virado no Jiraya em Breve ricos");
        aluno.setTurma(turma);//Não é possível serializar Turma, pois Turma não é serializável.
        serializar(aluno);
        deserializar();
    }

    private static void serializar(Aluno aluno){
        Path path = Paths.get("pasta/aluno.ser");//Arquivo que irá receber o OutputStream
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {//ObjectOutputStream usada para serializar objetos em uma sequência de bytes converter objetos em representação binária
            oos.writeObject(aluno);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void deserializar(){
        Path path = Paths.get("pasta/aluno.ser");//O arquivo já está aqui, logo, o método não precisa receber parâmetro para cria-lo
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {//ObjectInputStream irá deserializar o objeto da linguagem de máquina para nossa linguagem.
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);//Aqui ele irá mostrar apenas o arquivo que foi salvo em aluno, é possível mudar os valores da classe aluno, mas por conta da persistência, não irá ter alterações nessa classe salva.
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
