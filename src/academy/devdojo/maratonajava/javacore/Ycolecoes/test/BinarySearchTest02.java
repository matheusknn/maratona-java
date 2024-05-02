package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(8);
        mangas.add(new Manga(5L, "Hellsing", 18.9));
        mangas.add(new Manga(2L, "Bersek", 20));
        mangas.add(new Manga(3L, "Pokemon", 40));
        mangas.add(new Manga(1L, "One Punch", 50.91));
        mangas.add(new Manga(7L, "Katekyo Hitman", 18.32));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("----------------ordenado-------------------");

        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(7L, "Katekyo Hitman", 18.32);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch));
    }
}
