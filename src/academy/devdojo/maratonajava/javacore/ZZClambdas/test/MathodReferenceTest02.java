package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MathodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Bersek", 360), new Anime("Helssing", 20)));

        animes.sort(animeComparators::compareByEpisodesNonStatic);
        //ou
//      animes.sort((a1, a2) -> animeComparators.compareByEpisodesNonStatic(a1, a2));
        System.out.println(animes);
    }
}
