package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);
        Period p1 = Period.between(now, nowAfterTwoYears);
        System.out.println(p1);
        Period p2 = Period.ofDays(10);
        System.out.println(p2);
        Period p3 = Period.ofWeeks(58); //58 semanas são 406 dias
        System.out.println(p3);
    }
}
