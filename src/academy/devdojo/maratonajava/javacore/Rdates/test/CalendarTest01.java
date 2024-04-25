package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.nio.file.StandardOpenOption;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.getFirstDayOfWeek());

        c.add(Calendar.DAY_OF_MONTH, 2); //adicionando 2 dias
        Date date = c.getTime();
        System.out.println(date);
    }
}
