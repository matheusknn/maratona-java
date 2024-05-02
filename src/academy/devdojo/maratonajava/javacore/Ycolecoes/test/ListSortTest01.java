package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(8);
        nomes.add("Matheus");
        nomes.add("Kenji");
        nomes.add("Nishimura");
        nomes.add("Alvin");
        nomes.add("Beto");

        Collections.sort(nomes); //Array é ordenado por ordem alfabética

        for (String nome: nomes) {
            System.out.println(nome);
        }

        List<Double> salarios = new ArrayList<>();
        salarios.add(23.67);
        salarios.add(20D);
        salarios.add(67.29);
        salarios.add(10.01);

        Collections.sort(salarios);

        for (Double salario: salarios) {
            System.out.println(salario);
        }
    }
}
