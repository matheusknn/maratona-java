package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest02 {
    private String nome = "Kenji";

    void print() {
        String ultimoNome = "Nishimura";
        class LocalClass{
            public void printLocal() {
                System.out.println(nome + " " + ultimoNome);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocal();
        //ou
        //new LocalClass().printLocal();
    }
    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();
    }
}
