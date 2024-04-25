package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(23,10,11);//off cria uma data específica
        LocalTime localTimeNow = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTimeNow);
        System.out.println(localTimeNow.getHour());
        System.out.println(localTimeNow.getMinute());
        System.out.println(localTimeNow.getSecond());
        System.out.println(localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
