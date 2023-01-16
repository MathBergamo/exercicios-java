package com.exerciciosjava.smartTv;

public class usuario {
    public static void main (String[]args) throws Exception{

        SmartTv smartTv = new SmartTv();

        if (!smartTv.ligada){
            System.out.println("A TV está desligada");
        }else{
            System.out.println("A TV está ligada");
        }
        System.out.println("Canal: " +smartTv.canal);
        System.out.println("Volume: " +smartTv.volume);

        smartTv.ligar();
        smartTv.diminuirCanal();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

    }
}
