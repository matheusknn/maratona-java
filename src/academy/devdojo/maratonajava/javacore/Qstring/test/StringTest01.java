package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Cleitu";//String constant pool
        String nome2 = "Cleitu";
        nome = nome.concat(" Biriba"); //cria uma string nova na pool de strings
        System.out.println(nome);
        System.out.println(nome == nome2); //as duas variáveis fazem referência a mesma String
        String nome3 = new String("Cleitu"); //1-variavel de ref, 2 objeto do tipo string, 3 uma string no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
