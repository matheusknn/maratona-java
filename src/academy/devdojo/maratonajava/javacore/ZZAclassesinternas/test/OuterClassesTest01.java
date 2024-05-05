package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest01 {
    private String name = "Zedão";

    class InnerClass {
        public void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println(this); //faz referência ao objeto criado por InnerClass
            System.out.println(OuterClassesTest01.this);//this faz ref. a objetos instanciados por OuterClassTest01
        }
    }
    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        InnerClass innerClass = outerClass.new InnerClass();
        InnerClass innerClass2 = new OuterClassesTest01().new InnerClass();
        innerClass.printOuterClassAttribute();
    }
}
