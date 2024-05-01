package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(); //1.5
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Kenji");
        nomes.add("Breno");
        nomes2.add("Carlos");
        nomes2.add("Henrique");
//        nomes.add(123); //erro pois é uma lista de String
        nomes.remove(1);//removendo pelo índice
        nomes.remove("Breno"); //removendo pelo objeto

        nomes.addAll(nomes2);
        for (String nome: nomes) {
            System.out.println(nome);
        }

        /////////////////////////////////////////////
        List<Integer> inteiros = new ArrayList<>();
        inteiros.add(1);//umboxing e autoboxing
    }
}
