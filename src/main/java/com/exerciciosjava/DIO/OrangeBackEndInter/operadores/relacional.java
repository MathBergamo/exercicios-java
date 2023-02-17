package com.exerciciosjava.DIO.OrangeBackEndInter.operadores;

public class relacional {
    public static void main(String[]args){
        String nome1 = "JAVA";
        String nome2 = "JAVA";

        System.out.println(nome1 == nome2); //true

        String nome3 = new String("JAVA");

        System.out.println(nome1 == nome3); //false

        String nome4 = nome3;//nome4 está recebendo o valor de nome3, não a alocação "new String" (Verificar melhor posteriomente para melhor explicação)
        //Java trata os valores como objetos, lembrar!

        System.out.println(nome3 == nome4); //true

        //equals na parada
        System.out.println(nome1.equals(nome2)); //??
        System.out.println(nome2.equals(nome3)); //??
        System.out.println(nome3.equals(nome4)); //??

        String nomeUm = "Gleyson";
        String nomeDois = new String ("Gleyson");

        System.out.println(nomeUm == nomeDois);//Isso não funciona (se aprofundar no conceito de espaço em memória Stack versus Heap posteriormente)
        System.out.println(nomeUm.equals(nomeDois)); //Quando se tratar de objetos e textos, é necessário utillizar essa
        //nomenclatura para comparar os conteúdos dentro dos objetos, caso contrário, não irá fazer o comparativo.

        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2)
            System.out.print("Numero 1 maior que numero 2");

        else if(numero1 < numero2)
            System.out.print("Numero 1 menor que numero 2");

        else if(numero1 >= numero2)
            System.out.print("Numero 1 maior ou igual que numero 2");

        else if(numero1 <= numero2)
            System.out.print("Numero 1 menor ou igual que numero 2");

        else if(numero1 != numero2)
            System.out.print("Numero 1 é diferente de numero 2");
    }
}
