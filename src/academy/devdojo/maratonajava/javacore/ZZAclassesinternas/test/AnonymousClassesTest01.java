package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

class Animal {
    public void walk() {
        System.out.println("Animal walking");
    }
}

//class Cachorro extends Animal {
//    @Override
//    public void walk() {
//        System.out.println("Cachorro walking");
//    }
//}
public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal() { //criando uma subclasse de animal sem nome que sobrescreve o método walk

            @Override
            public void walk() {
                System.out.println("walking in the shadow");
            }
        };

        animal.walk();
    }
}
