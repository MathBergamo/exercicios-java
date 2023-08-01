package com.exerciciosjava.devdojo.javacore.Ratas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        //uso de ISO (pt-BR)
        Locale localItaly = new Locale("it","IT");
        Locale localCH = new Locale("it","CH");
        Locale localIndia = new Locale("hi","IN");
        Locale localHolanda = new Locale("nl","NL");
        Locale localJapao = new Locale("ja","JP");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localHolanda);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localJapao);

        System.out.println("Itália: " + df1.format(calendar.getTime()));
        System.out.println("Suiça: " + df2.format(calendar.getTime()));
        System.out.println("India: " + df3.format(calendar.getTime()));
        System.out.println("Holanda: " + df4.format(calendar.getTime()));
        System.out.println("Japão: " + df5.format(calendar.getTime()));
    }
}
