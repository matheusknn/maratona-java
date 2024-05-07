package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Bersek", 360), new Anime("Helssing", 20)));
//        Collections.sort(animes, (a1,a2) -> a1.getTitle().compareTo(a2.getTitle())); //por sort
        Collections.sort(animes,(a1,a2) -> AnimeComparators.compareByTitle(a1,a2));
        System.out.println(animes);
    }
}
