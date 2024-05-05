package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;


import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;

//class BarcoNameComparator implements Comparator<Barco> {
//    @Override
//    public int compare(Barco o1, Barco o2) {
//        return o1.getNome().compareTo(o2.getNome());
//    }
//}
public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Barco> barcos = new ArrayList<>();
        barcos.add(new Barco("Lancha"));
        barcos.add(new Barco("Caiaque"));

        barcos.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        System.out.println(barcos);
    }
}
