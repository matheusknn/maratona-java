package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest03 {
    public String name = "Calos";
    static class Nested {//só pode acessar atributos estáticos da classe externa
        private String lastName = "Kataki";
        void print () {
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
