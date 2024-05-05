package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

        printConsulta(cachorros);
        printConsulta(gatos);

        List<Animal> animals = new ArrayList<>();
        printConsultaAnimal(animals);
    }

    //Type erasure
    private static void printConsulta(List<? extends Animal> animals) { //aceitar qualquer List que extenda Animal
        for (Animal animal : animals) {
            animal.consulta();
        }

//        animals[1] = new Gato();

    }

    private static void printConsultaAnimal(List<? super Animal> animals) { //aceita qualquer um que seja Animal ou pai de animal, nesse caso Object
        animals.add(new Cachorro());
        animals.add(new Gato());
    }

}
