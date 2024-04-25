package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern2 = "'Amsterdam' dd 'de' MMMM 'de' yyyy";//palavras em aspas simples são "ignoradas" na hora
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println(simpleDateFormat.format(new Date()));
        SimpleDateFormat simpleDateFormatAms = new SimpleDateFormat(pattern2);
        System.out.println(simpleDateFormatAms.format(new Date()));
    }
}
