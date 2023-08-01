package com.exerciciosjava.DIO.OrangeBackEndInter.operadores;

public class unario {
    public static void main(String[]args){
        int numero = 5;

        numero = -numero;
        System.out.println(numero);

        numero = +numero; //Nessa situação, positivo com negativo resulta em negativo, logo, o valor da variável continua negativo.
        System.out.println(numero);

        numero = numero * -1; //Essa é a forma para alterar o valor do número negativo para positivo.
        System.out.println(numero);

        numero = --numero;//A variável passa a ter o valor de 4
        System.out.println(numero);

        numero++;//A variável volta a ter o valor de 5
        System.out.println(++numero);//Aqui há necessidade do operador "++" estar antes, pois é necessário incrementar
        //o valor antes de mostrar na tela.

        boolean variavel = true;
        System.out.println(!variavel);//Operador que inverte o valor boolean

        variavel = !variavel;
        System.out.println(!variavel);
    }
}
