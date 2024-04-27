package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        now = now.withDayOfMonth(20); //troca o dia dessa data para a data de argumento
        System.out.println(now);
        now = now.with(ChronoField.DAY_OF_MONTH, 20); //trocar o dia do mês da data por 20
        System.out.println(now);

        System.out.println("----------------------------");
        LocalDate now2 = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
        System.out.println(now2);

        System.out.println("----------------------------");
        LocalDate now3 = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        System.out.println(now3);
    }
}
