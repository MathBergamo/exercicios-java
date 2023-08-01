package com.exerciciosjava.devdojo.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {//NumberFormat é uma classe abstrata
        Locale localeBR = new Locale("pt","BR"); //Formatação para números de acordo com o país.
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();//Pegar valor monetário
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[2] = NumberFormat.getCurrencyInstance(localeBR);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);
        double valor = 10_000.2130;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }

    }
}
