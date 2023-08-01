package com.exerciciosjava.DIO.OrangeBackEndInter.Exceptions;

import javax.swing.*;
public class UncheckedExceptions {
    public static void main(String[] args) {
        //fazer a divisão de 2 valores inteiros
        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: "); //input
            String b = JOptionPane.showInputDialog("Denominador: "); //input

            try{
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
                //NumberFormatException está herdando os métodos de Throwbable
            } catch (NumberFormatException e) {//Essa linha é escrita automaticamente pela IDE, ela identificca a exception que possivelmente pode acontecer.
                // "e" é um objeto, portanto, está herdando os métodos da exception que está ao seu lado
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro! " + e.getMessage());//e.getMessage() irá mostrar para o usuário o que realmente aconteceu.
            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Impossível dividir um número por 0.");
            }
            finally {
                System.out.println("Chegou no finally!");
            }
        } while(continueLooping);


        System.out.println("O código continua...");
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
