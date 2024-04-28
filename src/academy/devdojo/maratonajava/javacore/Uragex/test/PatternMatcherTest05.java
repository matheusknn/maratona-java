package academy.devdojo.maratonajava.javacore.Uragex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        String regexHexadecimal = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        System.out.println("luffy@gmail.com".matches(regexHexadecimal));
        System.out.println("#@zoro@mail.br".matches(regexHexadecimal)); //verifica se a string bate com a expressão regular
        String textoHexadecimal = "luffy@gmail.com, 123jotaro@gmail.com, #@zoro@mail.br ";

        Pattern pattern = Pattern.compile(regexHexadecimal);
        Matcher matcher = pattern.matcher(textoHexadecimal);

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "  "); //retorna o começo das posições em índice  onde o regex foi encontrado na String
        }//matcher.start retorna o primeiro índice onde o que o regex procura foi encontrado
        //matcher.group retorna a string que o ragex encontrou

        System.out.println(Arrays.toString(textoHexadecimal.split(",")));
        String[] emails = textoHexadecimal.split(","); //retorna uma string com elementos cortados pelo regex ou argumento
        for (String email: emails) {
            System.out.println(email);
        }

    }
}
