package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(); //1.5
        nomes.add("Kenji");
        nomes.add("Breno");
//        nomes.add(123); //erro pois é uma lista de String

        for (String nome: nomes) {
            System.out.println(nome);
        }
    }
}
