package com.exerciciosjava.devdojo.javacore.Minterface.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;//todos os atributos em uma interface são constantes (final)
    void load(); //Métodos em interface são "public abstract" por padrão.

    default void checkPermission(){ //método default para ser utilizado sem necessariamente precisar ser implementado, diferente do abstract
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize(){//Todos metodos statics não podem ser re-escritos.
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
