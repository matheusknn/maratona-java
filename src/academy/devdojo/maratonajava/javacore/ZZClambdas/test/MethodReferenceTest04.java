package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Bersek", 360), new Anime("Helssing", 20)));

        animes.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeComparators);

        System.out.println("-------------------------------------");
        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;
//        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes);
    }
}
