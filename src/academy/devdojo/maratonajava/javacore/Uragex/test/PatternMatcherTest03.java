package academy.devdojo.maratonajava.javacore.Uragex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
       // \d = todos os dígitos
       // \D = tudo o que não é dígito
        // \s = Espaços em branco \t \n \f \n
        // \S = todos os caracteres excluindo os brancos
        // \w = a-Z A-Z, dígitos, _
        // \W = tudos que não for dígito ou _
        // [] = ou
        String regex = "[abcABC]"; //procura por a, b, c, A, B, C em um texto
        String regex2 = "[a-zA-C]";//retorna de a-z ou de A-C
        String regexHexadecimal = "0[xX][0-9a-fA-F]";
        String texto = "cafeBABE";
        String textpHexadecimal = "12 0x 0x 0xFFABC 0X109 0x1";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "  "); //retorna o começo das posições em índice  onde o regex foi encontrado na String
        }//matcher.start retorna o primeiro índice onde o que o regex procura foi encontrado
        //matcher.group retorna a string que o ragex encontrou

        int numeroHex = 0x59F86A; //0x serve para representar número hexadecimal no java
        System.out.println(numeroHex);


    }
}
