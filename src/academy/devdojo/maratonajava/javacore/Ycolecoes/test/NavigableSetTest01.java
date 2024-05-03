package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator()); //automaticamente organiza a coleção baseado no método compareTo caso não seja passado nenhuma classe que implementa a interface Compare e não no equals como no List
        mangas.add(new Manga(5L, "Hellsing", 18.9));
        mangas.add(new Manga(2L, "Bersek", 20));
        mangas.add(new Manga(3L, "Pokemon", 40));
        mangas.add(new Manga(1L, "One Punch", 50.91));
        mangas.add(new Manga(7L, "Katekyo Hitman", 18.32));
        mangas.add(new Manga(7L, "Katekyo Hitman", 18.32));

        for (Manga manga : mangas.descendingSet()) { //pegar lista ao começando de trás e indo para frente
            System.out.println(manga);
        }

        //lower -  trás o menor da coleção baseado no comparator da lista e objeto passado
        //floor - trás o mesmo elemento ou um abaixo caso não exista
        //higher  >
        //ceiling >=

        System.out.println("------------------------------");
        Manga yuyu = new Manga(21L, "Yuyu", 20.00, 4);
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst()); //retorna e remove o primeiro elemento da lista
        System.out.println(mangas.pollLast()); //retorna e remove o último elemento da lista
    }
}
