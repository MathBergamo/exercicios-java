package com.exerciciosjava.DIO.OrangeBackEndInter.smartTv;

public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void ligar(){
        ligada=true;
        System.out.println("\nA TV ligou!");
    }
    public void desligar(){
        ligada=false;
        System.out.println("\nA TV desligou");
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("\nAumentando volume - "+volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("\nDiminuindo volume - "+volume);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("\nAumentando canal - "+canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("\nDiminuindo canal - "+canal);
    }
}
