package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Cleiton");
        Consumidor c2 = new Consumidor("Kenji");
        NavigableMap<String, Consumidor> map = new TreeMap<>(); //ordena pela chave, usando o compareTo, ou seja, a classe pasadade chave precisa implementar a interface Comparable
        map.put("A", c1);
//        map.put("A - ", "Letra A");
//        map.put("D - ", "Letra D");
//        map.put("B - ", "Letra B");
//        map.put("C - ", "Letra C");

        for (Map.Entry<String, Consumidor> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println(map.headMap("C", true)); //retorna todos abaixo do argumento passado usando a chave na comparação
                                                                    //true inclui o argumento no retorno
     }
}
