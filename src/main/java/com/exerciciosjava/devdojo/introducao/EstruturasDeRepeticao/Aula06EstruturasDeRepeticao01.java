package com.exerciciosjava.devdojo.introducao.EstruturasDeRepeticao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        int count = 0;
        while(count <= 10){
            count++;
            System.out.println(count);
        }
        count = 0;
        do {//do realiza o primeiro laço, ainda que a condição para realizar o laço while seja falsa.
            System.out.println("Dentro do do-while"+ count++);
        } while (count < 10);

        for(int i=0; i<10; i++){
            System.out.println("For: "+ i);
        }
    }
}
