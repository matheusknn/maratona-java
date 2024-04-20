package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void multiplicaDoisNumeros(int a, int b) {
        System.out.println(a * b);
    }

    public double multiplicarDoisNumerosComRetorno(int a, int b) {
        return a * b;
    }

    public void alteraDoisNumeros(int a, int b) {
        a = 99;
        b = 33;

        System.out.println("Dentro da função altera");
        System.out.println("Num1: " + a);
        System.out.println("Num2: " + b);
    }
}
