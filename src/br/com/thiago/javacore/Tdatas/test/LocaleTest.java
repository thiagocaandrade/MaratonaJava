package br.com.thiago.javacore.Tdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        //ISO 639 pt= portugues, BR = Brasil, en - ingles, US - Estados Unidos

        Locale locale = new Locale("pt", "BR");
        Locale locale2 = new Locale("en", "US");

        Calendar c = Calendar.getInstance();
        c.set(2020, Calendar.DECEMBER, 23);
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locale2);

        System.out.println(df.format(c.getTime()));
        System.out.println(locale.getDisplayCountry());

        System.out.println(df2.format(c.getTime()));
        System.out.println(locale2.getDisplayCountry());



    }
}
