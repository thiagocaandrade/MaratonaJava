package br.com.thiago.javacore.Tdatas.test;

import javax.sound.midi.Soundbank;
import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDeDatasTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);


        Calendar c = Calendar.getInstance();
        c.setTime(date);
        if (Calendar.SUNDAY == c.getFirstDayOfWeek()){
            System.out.println("DOMINGO É O PRIMEIRO DIA DA SEMANA");
        }
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));

        c.add(Calendar.HOUR, 2);
        c.roll(Calendar.MONTH, 9);
        Date date2 = c.getTime();
        System.out.println(date2);




    }
}
