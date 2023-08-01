package com.exerciciosjava.devdojo.Exercicios.Associacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminario;

    public void imprime() {
        System.out.println("Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("------ Seminários ------");
        if (this.seminario != null) {
            for (Seminario seminario : seminario) {
                System.out.println(seminario.getTitulo());
                System.out.println(seminario.getLocal().getEndereco());
                System.out.println("** Alunos **");
                if (seminario.getEstudante() == null || seminario.getEstudante().length == 0) { //Pode ser null e vazio, mas nesse caso, é vázio, por isso da verifricação "dupla"
                    System.out.println("Não há alunos nesse seminário");
                    continue;
                }
                for (Estudante estudante : seminario.getEstudante()) {
                    System.out.println(estudante.getNome() + " Idade:" + estudante.getIdade());
                }
            }
        } else {
            return;
        }
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminario) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }
}
