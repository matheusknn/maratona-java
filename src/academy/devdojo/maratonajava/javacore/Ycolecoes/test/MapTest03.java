package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Cleiton");
        Consumidor c2 = new Consumidor("Kenji");

        Manga manga1 = new Manga(5L, "Hellsing", 18.9);
        Manga manga2 = new Manga(2L, "Bersek", 20);
        Manga manga3 = new Manga(3L, "Pokemon", 40);
        Manga manga4 = new Manga(1L, "One Punch", 50.91);
        Manga manga5 = new Manga(7L, "Katekyo Hitman", 18.32);

        List<Manga> mangaConsumidor1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidor2List = List.of(manga3, manga4);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(c1, mangaConsumidor1List);
        consumidorMangaMap.put(c2, mangaConsumidor2List);

        for(Map.Entry<Consumidor, List<Manga>> entry: consumidorMangaMap.entrySet()) {
            System.out.println("\n" + entry.getKey().getNome() + "-------------");
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getNome() + " ");
            }
        }
    }
}
