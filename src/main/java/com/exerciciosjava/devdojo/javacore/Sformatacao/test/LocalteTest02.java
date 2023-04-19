package com.exerciciosjava.devdojo.javacore.Sformatacao.test;

import java.util.Locale;

public class LocalteTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());//Mostra a configuração do sistema
        String[] isoCountries = Locale.getISOCountries();//ISO dos países
        String[] isoLanguages = Locale.getISOLanguages();//ISO das línguas
        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " ");
        }

        System.out.println();

        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry + " ");
        }

    }
}
