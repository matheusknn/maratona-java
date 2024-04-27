package academy.devdojo.maratonajava.javacore.Uragex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // matheuskenji5@gmail.com
        String regex = "ab"; //procura ab
        String regex2 = "aba";
        String texto = "abaaab";
        String texto2 = "abababa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "  "); //retorna o começo das posições em índice  onde o regex foi encontrado na String
        }

        System.out.println("------------------");

        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(texto2);


        while (matcher2.find()) {
            System.out.print(matcher2.start() + " "); //retorna o começo das posições em índice  onde o regex foi encontrado na String
        }
    }
}
