package br.com.thiago.javacore.Tdatas.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest {
    public static void main(String[] args) {
        Calendar s = Calendar.getInstance();
        DateFormat[] dateFormats = new DateFormat[6];
        dateFormats[0] = DateFormat.getInstance();
        dateFormats[1] = DateFormat.getDateInstance(DateFormat.SHORT);
        dateFormats[2] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dateFormats[3] = DateFormat.getDateInstance(DateFormat.LONG);
        dateFormats[4] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat dateFormat : dateFormats){
            System.out.println(dateFormat.format(s.getTime()));
        }
    }

}
