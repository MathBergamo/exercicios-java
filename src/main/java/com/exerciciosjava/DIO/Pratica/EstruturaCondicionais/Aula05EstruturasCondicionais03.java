package com.exerciciosjava.DIO.Pratica.EstruturaCondicionais;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 3000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Eu não tenho condições de doar até agora";
        //(condição)? verdadeiro : falso
        String resultado = salario > 5000? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
