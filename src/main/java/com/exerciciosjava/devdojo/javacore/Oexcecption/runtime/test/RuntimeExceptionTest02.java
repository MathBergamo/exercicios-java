package com.exerciciosjava.devdojo.javacore.Oexcecption.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(1,0);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Código finalizado");
    }

    private static int divisao(int a, int b) {
        if (b == 0){//Se essa linha for executada, o restante do código será ignorado
            //Esse código foi simplificado para usar o try/catch no psvm.
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");//Sempre tentar utilizar as excções mais específicas possíveis.
        }//Quando for RuntimeException, não há necessidade de colocar o throws na assinatura do método, se for checked, ai sim.
        return a/b;
    }
}
