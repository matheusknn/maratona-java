package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.*;

public class SetTest01 {
    public static void main(String[] args) {//set não permite itens repetidos dentro dele
//        Set<Manga> mangas = new HashSet<>(); //HashSet - lista única organizada pelo HashCode
        Set<Manga>  mangas= new LinkedHashSet<>(); //LinkedHashSet - mantém a ordem de inserção

        mangas.add(new Manga(5L, "Hellsing", 18.9));
        mangas.add(new Manga(2L, "Bersek", 20));
        mangas.add(new Manga(3L, "Pokemon", 40));
        mangas.add(new Manga(1L, "One Punch", 50.91));
        mangas.add(new Manga(7L, "Katekyo Hitman", 18.32));
        mangas.add(new Manga(7L, "Katekyo Hitman", 18.32));//não insere na lista elementos repetidos, isso é chacado pelo equals

        for (Manga manga: mangas) {
            System.out.println(manga);
        }
    }
}
