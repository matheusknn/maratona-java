package academy.devdojo.maratonajava.javacore.Uragex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
       // \d = todos os dígitos
       // \D = tudo o que não é dígito
        // \s = Espaços em branco \t \n \f \n
        // \S = todos os caracteres excluindo os brancos
        // \w = a-Z A-Z, dígitos, _
        // \W = tudos que não for dígito ou _
        String regex = "\\d"; //procura todos os dígitos da String;
        String texto = "hh67asdasda2   324 5sd";

        String regexNaoDigito = "\\D";

        String regexEspacoEmBranco = "\\s";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "  "); //retorna o começo das posições em índice  onde o regex foi encontrado na String
        }//matcher.start retorna o primeiro índice onde o que o regex procura foi encontrado
        //matcher.group retorna a string que o ragex encontrou

        System.out.println();
        Pattern pattern1 = Pattern.compile(regexNaoDigito);
        Matcher matcher1 = pattern1.matcher(texto);

        while (matcher1.find()) {
            System.out.print(matcher1.start() + " " + matcher1.group() + " ");
        }

        System.out.println("---------");
        Pattern pattern2 = Pattern.compile(regexEspacoEmBranco);
        Matcher matcher2 = pattern2.matcher(texto);

        while (matcher2.find()) {
            System.out.print(matcher2.start() + " " + matcher2.group() + " ");
        }
    }
}
