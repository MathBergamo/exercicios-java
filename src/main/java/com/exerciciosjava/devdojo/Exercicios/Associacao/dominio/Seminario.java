package com.exerciciosjava.devdojo.Exercicios.Associacao.dominio;

public class Seminario {
    private String titulo;
    private Estudante[] estudante;
    private Local local;

    public void imprime(){
        System.out.println("Seminário: " + this.titulo);
        System.out.println("Local: " + local.getEndereco());
        System.out.println("Estudantes no seminário:");
        if (estudante != null){
            for (Estudante estudante : estudante) {
                System.out.print(estudante.getNome() + " //");
            }
        }else {
            System.out.println("Não há estudantes no seminário");
        }
    }

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Estudante[] estudante, Local local) {
        this.titulo = titulo;
        this.estudante = estudante;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Estudante[] getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante[] estudante) {
        this.estudante = estudante;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
