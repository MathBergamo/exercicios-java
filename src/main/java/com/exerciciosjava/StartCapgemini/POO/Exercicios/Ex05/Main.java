package com.exerciciosjava.StartCapgemini.POO.Exercicios.Ex05;

public class Main {
    public static void main(String[] args) {
        Aluno alunoA = new Aluno("Augusto",100,2.5f,2f,1f);
        Aluno alunoB = new Aluno("Bruno",101,2.5f,2.5f,1.5f);
        Aluno alunoC = new Aluno("Cassio",102,0.5f,1f,2f);

        System.out.println("-------- Calculando médias e nota final --------\n");

        System.out.println("Calculando média de: " + alunoA.getNome() + "/ Matricula: " + alunoA.getMatricula());
        System.out.format("%.2f\n",alunoA.Media());
        System.out.format("Nota necessária para prova final: %.2f\n\n",alunoA.Final(alunoA.Media()));

        System.out.println("Calculando média de: " + alunoB.getNome()+ "/ Matricula: " + alunoB.getMatricula());
        System.out.format("%.2f\n",alunoB.Media());
        System.out.format("Nota necessária para prova final: %.2f\n\n",alunoB.Final(alunoB.Media()));

        System.out.println("Calculando média de: " + alunoC.getNome()+ "/ Matricula: " + alunoC.getMatricula());
        System.out.format("%.2f\n",alunoC.Media());
        System.out.format("Nota necessária para prova final: %.2f",alunoC.Final(alunoC.Media()));
    }
}
