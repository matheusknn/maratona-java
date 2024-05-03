package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Cleiton");
        Consumidor c2 = new Consumidor("Kenji");

        Manga manga1 = new Manga(5L, "Hellsing", 18.9);
        Manga manga2 = new Manga(2L, "Bersek", 20);
        Manga manga3 = new Manga(3L, "Pokemon", 40);
        Manga manga4 = new Manga(1L, "One Punch", 50.91);
        Manga manga5 = new Manga(7L, "Katekyo Hitman", 18.32);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(c1, manga1);
        consumidorManga.put(c2, manga4);
        for (Map.Entry<Consumidor, Manga> entry: consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + " -" + entry.getValue().getNome()); //get key retorna objeto consumidor e getValue retorna o objeto manga
        }
    }
}
