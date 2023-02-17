package com.exerciciosjava.DIO.OrangeBackEndInter.Exercicios.Metodos;

public class Mensagem {
    public String mensagem(int hr) {
        if (hr >= 1 && hr <= 12) {
            return "bom dia";
        }else if (hr >= 13 && hr <= 17){
            return "boa tarde";
        }else if (hr >= 18 && hr <= 24){
            return "boa noite";
        }else {
            return "Valor inválido";
        }
    }

}
