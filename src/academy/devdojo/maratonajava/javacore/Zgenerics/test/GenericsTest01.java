package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        //type erasor - apagar o tipo depois que o programa é compilado
        List<String> list = new ArrayList<>();
        list.add("Hamada");
        list.add("Uryu");

        for (String s : list) {
            System.out.println(s);
        }

//        add(list, new Consumidor("Zed"));

        for (String s : list) {
            System.out.println(s);
        }

    }

    private static void add(List list, Consumidor consumidor) { //sem generics jvm não indica erro
        list.add(consumidor);
    }
}
