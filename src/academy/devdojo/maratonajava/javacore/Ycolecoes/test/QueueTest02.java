package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(); //podemos definir a prioridade implementando a interface Comparable
        mangas.add(new Manga(5L, "Hellsing", 18.9));
        mangas.add(new Manga(2L, "Bersek", 20));
        mangas.add(new Manga(3L, "Pokemon", 40));
        mangas.add(new Manga(1L, "One Punch", 50.91));
        mangas.add(new Manga(7L, "Katekyo Hitman", 18.32));
        mangas.add(new Manga(7L, "Katekyo Hitman", 18.32));

       while (!mangas.isEmpty()) {
           System.out.println(mangas.poll());
       }

    }
}
