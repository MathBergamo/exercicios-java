package com.exerciciosjava.devdojo.javacore.Xserializacao.dominio;

import java.io.Serial;
import java.io.Serializable;

public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = 604365806559686746L;//Objeto precisa receber Serializable para ser serializavel
    private Long id;
    private String nome;
    private transient String password;//transient impede que o atributo seja serializado
    private static String nomeEscola = "DevDojo Viradão no Jiraya";//Atributos statics não são serializados
    private Turma turma;

    public Aluno(Long id, String nome, String password) {
        System.out.println("Dentro do construtor");
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String getNomeEscola() {
        return nomeEscola;
    }

    public static void setNomeEscola(String nomeEscola) {
        Aluno.nomeEscola = nomeEscola;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", nomeescola='" + nomeEscola +
                '}';
    }
}
