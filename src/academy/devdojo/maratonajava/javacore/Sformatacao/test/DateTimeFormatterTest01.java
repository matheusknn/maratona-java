package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("---------------------parse de string em objeto-------------------------------------");
        LocalDate parse1 = LocalDate.parse("20240426", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2024-04-26", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2024-04-26", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);

        LocalDateTime localDateTimeParse = LocalDateTime.parse("2024-04-26T20:41:13.6427024", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(localDateTimeParse);

        System.out.println("------------criando um formato de data----------------");
        DateTimeFormatter brazilFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormadatadaEmEstiloBrasileiro = LocalDate.now().format(brazilFormatter);
        System.out.println(dataFormadatadaEmEstiloBrasileiro);

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR);
    }
}
