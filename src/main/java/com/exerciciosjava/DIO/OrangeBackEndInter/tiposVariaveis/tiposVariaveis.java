package com.exerciciosjava.DIO.OrangeBackEndInter.tiposVariaveis;

public class tiposVariaveis {
    public static void main (String[] args) throws Exception {
        double salarioMinimo = 2500;
        int cep = 21070333; //Se o CEP começar com Zero, é necessário usar outro tipo primitivo (string)
        long cpf = 98765432109L; //Se começar com Zero, é necessário usar outro tipo primitivo (string) necessitar ter o L no final do valor da variável
        float pi = 3.14F; //Float necessita terminar com F no final do valor da variável.
        double salario = 1275.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //Não é possível realizar essa alteração, o tipo primitivo só pode ser alterado caso ele comporte mais bytes.
        // é possível realizar um casting (como foi feito para corrigir) para adaptar essa situação, não é recomendável fazer com frequência.

        final double PI = 3.14; //O valor de Pi é uma constante, logo, não está suscetível a alterações. Constantes precisam ser declaradas sempre em CAIXA ALTA.
    }
}
