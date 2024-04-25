package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2024, Month.DECEMBER, 3);
        LocalDate dateParse = LocalDate.parse("2024-08-06");
        LocalTime localTime = LocalTime.of(9, 45, 21);
        System.out.println(localDateTime);
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(dateParse);
        LocalDateTime dt1 = date.atTime(localTime);
        System.out.println(dt1);
    }
}
