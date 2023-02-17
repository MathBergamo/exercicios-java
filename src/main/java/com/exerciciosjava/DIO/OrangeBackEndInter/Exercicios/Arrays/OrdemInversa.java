package com.exerciciosjava.DIO.OrangeBackEndInter.Exercicios.Arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class OrdemInversa {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6};
        int count = array.length-1;

        System.out.print("Array com for: ");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\nArray com while: ");
        while (count > -1){
            System.out.print(array[count] + " ");
            count--;
        }
    }
}
