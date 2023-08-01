package com.exerciciosjava.devdojo.javacore.Minterface.dominio;

public class DataBaseLoader implements DataLoader, DataRemover{
    //ordem de acesso: private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("Carregando dados de banco de dados...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados...");
    }

    public static void retrieveMaxDataSize(){//Sendo re-utilizado na classe ao invés da interface.
        System.out.println("Dentro do retrieveMaxDataSize na classe");
    }
}
