package com.exerciciosjava.devdojo.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }
    public void subtraiDoisNumeros(){
        System.out.println(21- 2);
    }
    public void multiplicaDoisNumeros(int num, float num2){
        System.out.println(num * num2);
    }
    public double divideDoisNumeros(double num1, double num2){
        if(num2 != 0){
            return num1/num2;
        }else{
            return 0;
        }
    }

    public void imprimeDoisNumeros(double num1, double num2){
        if(num2 == 0){
            System.out.println("Não existe divisão por zero");
            //Não é possível parar o programa colocando um break nessa linha (24) de método void, apenas return. (sem nenhum valor nesse caso)
        }else{//Essa é a forma de parar o programa caso alguma condicional aconteça. não é possivel usar o break nessa situação
            System.out.println(num1/num2);
        }
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("num1: " +num1);
        System.out.println("num2: " +num2);
    }

}
