package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.List;

public class WildcardTest03 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

//        printConsulta(cachorros);
//        printConsulta(gatos);
    }

    //Type erasure
    private static void printConsulta(List<Animal> animals) { //Com List devemos passar exatamente o que está no <> para não ocorrer erro
        for (Animal animal : animals) {
            animal.consulta();
        }

        animals.add(new Cachorro());
//        animals[1] = new Gato();

    }

}
