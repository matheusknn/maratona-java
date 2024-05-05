package academy.devdojo.maratonajava.javacore.Zgenerics.test;

abstract class Animal  {
    public abstract void consulta();
}

class Cachorro extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando dogo");
    }
}

class Gato extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando gato");
    }
}
public class WildcardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = { new Cachorro(), new Cachorro()};
        Gato[] gatos = { new Gato(), new Gato()};
        Animal[] animals = {new Gato(), new Cachorro()};
        Animal animal = new Gato();

        printConsulta(cachorros);
        printConsulta(gatos);
        printConsulta(animals);
    }

    private static void printConsulta(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
//        animals[1] = new Gato();

    }

}
