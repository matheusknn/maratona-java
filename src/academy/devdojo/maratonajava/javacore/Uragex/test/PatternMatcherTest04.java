package academy.devdojo.maratonajava.javacore.Uragex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
       // \d = todos os dígitos
       // \D = tudo o que não é dígito
        // \s = Espaços em branco \t \n \f \n
        // \S = todos os caracteres excluindo os brancos
        // \w = a-Z A-Z, dígitos, _
        // \W = tudos que não for dígito ou _
        // [] = ou
        // ? Zero ou uma ocorrencia
        // * Zero ou mais ocorrência
        // + uma ou mais ocorrências
        //{n, m} de m até n ocorrências
        //()
        //| = ou
        //$ //final da String
        // . 1.3 = 123. 133, 1@3, 1A3  //procura tudo que estiver entre uma expressão e outra
        String regexHexadecimal = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String textoHexadecimal = "12 0x 0x 0xFFABC 0X10G 0x1";


        Pattern pattern = Pattern.compile(regexHexadecimal);
        Matcher matcher = pattern.matcher(textoHexadecimal);

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "  "); //retorna o começo das posições em índice  onde o regex foi encontrado na String
        }//matcher.start retorna o primeiro índice onde o que o regex procura foi encontrado
        //matcher.group retorna a string que o ragex encontrou


    }
}
