package academy.devdojo.maratonajava.javacore.ZZClambdas.service;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;

public class AnimeComparators {
    public static int compareByTitle(Anime anime1, Anime anime2) {
        return anime1.getTitle().compareTo(anime2.getTitle());
    }

    public int compareByEpisodesNonStatic(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }

}
