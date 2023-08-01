package com.exerciciosjava.devdojo.javacore.Gassociacao.test;

import com.exerciciosjava.devdojo.javacore.Gassociacao.dominio.Escola;
import com.exerciciosjava.devdojo.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        //Faz mais sentido trazer a classe que não tem nenhuma classe dentro, Já que nesse exemplo, será necessário trazer professor posteriormente
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Kakashi Sensei");
        Professor[] professores = {professor1,professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
