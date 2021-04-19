package br.com.thiago.javacore.Tdatas.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDataFormatTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        String mascara = "yyy.MM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat formatador = new SimpleDateFormat(mascara);
        System.out.println(formatador.format(c.getTime()));

    }
}
