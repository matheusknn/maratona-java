package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Kenji";
        String numeros = "012345";
        System.out.println(nome.charAt(0));//K
        System.out.println(nome.length());//retorna quantidade de caracteres da string
        System.out.println(nome.replace("e", "a"));//retorna uma nova string e não altera original
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.substring(0, 3)); //retorna string cortada pelos indices
        System.out.println(numeros.trim()); //tira espaços em branco no começo e fim da string
    }
}
