package com.exerciciosjava.devdojo.javacore.Oexcecption.runtime.test;
import java.io.FileNotFoundException;
import java.sql.SQLException;
public class RuntimeExceptionTest04 {

    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {//Não fazem parte da mesma linha de herança
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Dentro da RuntimeException");
        }

        try {
            talvezLanceException();
            //Poderia colocar uma exceção mais genérica aqui para tratar as duas exceções desse método.
        }catch (SQLException | FileNotFoundException e){//Só é possível colocar duas exception aqui, pois elas não estão na mesma linha de herança.
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException,FileNotFoundException{

    }
}