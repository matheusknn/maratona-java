package academy.devdojo.maratonajava.javacore.Rdates.test;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS; //retorna todas as zonas que o java ofderece suporte
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());//retorna zona do S.O
        ZoneId phoenixZone = ZoneId.of("America/Phoenix");
        System.out.println(phoenixZone);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime zonedDateTime = now.atZone(phoenixZone);
        System.out.println(zonedDateTime);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTimeManaus = now.atOffset(offsetManaus);
        System.out.println(offsetDateTimeManaus);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
    }
}
